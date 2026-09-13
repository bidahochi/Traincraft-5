//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.03.2023 - 20:49:54
// Last changed on: 27.03.2023 - 20:49:54

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFrictionTruckTender;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelNP_13C_tender extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelNP_13C_tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[86];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 200, 54, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 238, 63, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 227, 62, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 9, 62, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 158, 125, textureX, textureY); // Box 63
		bodyModel[5] = new ModelRendererTurbo(this, 158, 112, textureX, textureY); // Box 63
		bodyModel[6] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // Box 63
		bodyModel[7] = new ModelRendererTurbo(this, 159, 107, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 97, 59, textureX, textureY); // Box 63
		bodyModel[9] = new ModelRendererTurbo(this, 10, 42, textureX, textureY); // Box 63
		bodyModel[10] = new ModelRendererTurbo(this, 154, 0, textureX, textureY); // Box 63
		bodyModel[11] = new ModelRendererTurbo(this, 111, 35, textureX, textureY); // Box 63
		bodyModel[12] = new ModelRendererTurbo(this, 108, 9, textureX, textureY); // Box 63
		bodyModel[13] = new ModelRendererTurbo(this, 96, 28, textureX, textureY); // Box 63
		bodyModel[14] = new ModelRendererTurbo(this, 160, 38, textureX, textureY); // Box 63
		bodyModel[15] = new ModelRendererTurbo(this, 92, 3, textureX, textureY); // Box 63
		bodyModel[16] = new ModelRendererTurbo(this, 183, 35, textureX, textureY); // Box 63
		bodyModel[17] = new ModelRendererTurbo(this, 213, 38, textureX, textureY); // Box 63
		bodyModel[18] = new ModelRendererTurbo(this, 222, 42, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 204, 42, textureX, textureY); // Box 63
		bodyModel[20] = new ModelRendererTurbo(this, 61, 65, textureX, textureY); // Box 63
		bodyModel[21] = new ModelRendererTurbo(this, 96, 58, textureX, textureY); // Box 63
		bodyModel[22] = new ModelRendererTurbo(this, 34, 76, textureX, textureY); // Box 63
		bodyModel[23] = new ModelRendererTurbo(this, 34, 70, textureX, textureY); // Box 63
		bodyModel[24] = new ModelRendererTurbo(this, 88, 30, textureX, textureY); // Box 63
		bodyModel[25] = new ModelRendererTurbo(this, 43, 86, textureX, textureY, "cull"); // Box 2 step cull
		bodyModel[26] = new ModelRendererTurbo(this, 9, 86, textureX, textureY, "cull"); // Box 2 step cull
		bodyModel[27] = new ModelRendererTurbo(this, 227, 63, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 234, 69, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 227, 63, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 234, 69, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 251, 82, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 216, 60, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 16, 74, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 158, 116, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 159, 120, textureX, textureY); // Box 63
		bodyModel[36] = new ModelRendererTurbo(this, 143, 83, textureX, textureY); // Box 63
		bodyModel[37] = new ModelRendererTurbo(this, 76, 52, textureX, textureY); // Box 63
		bodyModel[38] = new ModelRendererTurbo(this, 251, 82, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 160, 45, textureX, textureY); // Box 63
		bodyModel[40] = new ModelRendererTurbo(this, 130, 83, textureX, textureY); // Box 28
		bodyModel[41] = new ModelRendererTurbo(this, 130, 83, textureX, textureY); // Box 28
		bodyModel[42] = new ModelRendererTurbo(this, 52, 51, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 50, 54, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 98, 50, textureX, textureY); // Box 63
		bodyModel[45] = new ModelRendererTurbo(this, 86, 29, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 105, 8, textureX, textureY); // Box 63
		bodyModel[47] = new ModelRendererTurbo(this, 101, 35, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 139, 28, textureX, textureY); // Box 63
		bodyModel[49] = new ModelRendererTurbo(this, 89, 14, textureX, textureY); // Box 63
		bodyModel[50] = new ModelRendererTurbo(this, 100, 1, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 90, 2, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 143, 1, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 244, 26, textureX, textureY); // Box 63
		bodyModel[54] = new ModelRendererTurbo(this, 231, 38, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 240, 12, textureX, textureY); // Box 2 headlight 1
		bodyModel[56] = new ModelRendererTurbo(this, 242, 5, textureX, textureY); // Box 2 headlight 1
		bodyModel[57] = new ModelRendererTurbo(this, 244, 1, textureX, textureY); // Box 2 headlight 1
		bodyModel[58] = new ModelRendererTurbo(this, 240, 6, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_58"); // Box 2 headlight 1 number boards glow
		bodyModel[59] = new ModelRendererTurbo(this, 240, 6, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_59"); // Box 2 headlight 1 number boards glow
		bodyModel[60] = new ModelRendererTurbo(this, 235, 5, textureX, textureY, "lamp"); // Box 2 headlight 1 glow
		bodyModel[61] = new ModelRendererTurbo(this, 225, 3, textureX, textureY); // Box 2 headlight 2
		bodyModel[62] = new ModelRendererTurbo(this, 220, 4, textureX, textureY, "lamp"); // Box 2 headlight 2 glow
		bodyModel[63] = new ModelRendererTurbo(this, 225, 8, textureX, textureY); // Box 2 headlight 2
		bodyModel[64] = new ModelRendererTurbo(this, 218, 1, textureX, textureY); // Box 2 headlight 2
		bodyModel[65] = new ModelRendererTurbo(this, 221, 16, textureX, textureY); // Box 2 headlight 2
		bodyModel[66] = new ModelRendererTurbo(this, 224, 11, textureX, textureY, "cull"); // Box 2 headlight 2 suport cull
		bodyModel[67] = new ModelRendererTurbo(this, 220, 9, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_67"); // Box 2 headlight 2 number boards glow
		bodyModel[68] = new ModelRendererTurbo(this, 220, 11, textureX, textureY); // Box 2 headlight 2
		bodyModel[69] = new ModelRendererTurbo(this, 220, 9, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_69"); // Box 2 headlight 2 number boards glow
		bodyModel[70] = new ModelRendererTurbo(this, 220, 11, textureX, textureY); // Box 2 headlight 2
		bodyModel[71] = new ModelRendererTurbo(this, 241, 25, textureX, textureY, "cull"); // Box 63 ladder cull
		bodyModel[72] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 63
		bodyModel[73] = new ModelRendererTurbo(this, 240, 52, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 240, 45, textureX, textureY); // Box 2
		bodyModel[75] = new ModelRendererTurbo(this, 8, 12, textureX, textureY); // Box 63
		bodyModel[76] = new ModelRendererTurbo(this, 1, 18, textureX, textureY); // Box 63
		bodyModel[77] = new ModelRendererTurbo(this, 61, 98, textureX, textureY); // Box 63
		bodyModel[78] = new ModelRendererTurbo(this, 0, 106, textureX, textureY); // Box 63
		bodyModel[79] = new ModelRendererTurbo(this, 7, 120, textureX, textureY); // Box 63
		bodyModel[80] = new ModelRendererTurbo(this, 68, 51, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 66, 54, textureX, textureY); // Box 2
		bodyModel[82] = new ModelRendererTurbo(this, 76, 0, textureX, textureY); // Box 63 Doors
		bodyModel[83] = new ModelRendererTurbo(this, 63, 0, textureX, textureY); // Box 63 Doors
		bodyModel[84] = new ModelRendererTurbo(this, 76, 13, textureX, textureY); // Box 63 Doors
		bodyModel[85] = new ModelRendererTurbo(this, 63, 13, textureX, textureY); // Box 63 Doors

		bodyModel[0].addBox(0F, 0F, 0F, 2, 3, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(17F, 2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(20F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(19F, 3F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 3, 20, 0F); // Box 2
		bodyModel[3].setRotationPoint(-22F, 2F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[4].setRotationPoint(-20F, 4F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[5].setRotationPoint(-20F, 4F, 8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[6].setRotationPoint(-20F, 2F, 8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 37, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 63
		bodyModel[7].setRotationPoint(-20F, 2F, 8.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 37, 1, 22, 0F); // Box 63
		bodyModel[8].setRotationPoint(-20F, 1F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 63
		bodyModel[9].setRotationPoint(-23F, 1F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 21, 12, 22, 0F); // Box 63
		bodyModel[10].setRotationPoint(-4F, -11F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 16, 12, 6, 0F); // Box 63
		bodyModel[11].setRotationPoint(-20F, -11F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 16, 12, 6, 0F); // Box 63
		bodyModel[12].setRotationPoint(-20F, -11F, 5F);

		bodyModel[13].addBox(0F, 0F, 0F, 20, 5, 1, 0F); // Box 63
		bodyModel[13].setRotationPoint(-17F, -16F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 19, 5, 1, 0F); // Box 63
		bodyModel[14].setRotationPoint(-16F, -16F, 9F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 63
		bodyModel[15].setRotationPoint(-17F, -16F, 5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 5, 18, 0F); // Box 63
		bodyModel[16].setRotationPoint(2F, -16F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 63
		bodyModel[17].setRotationPoint(2F, -19F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[18].setRotationPoint(2F, -19F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[19].setRotationPoint(2F, -19F, 3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 1, 18, 0F,0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[20].setRotationPoint(-6F, -12F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 11, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 63
		bodyModel[21].setRotationPoint(-6F, -11F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 63
		bodyModel[22].setRotationPoint(-16F, -15F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[23].setRotationPoint(-16F, -15F, 5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 63
		bodyModel[24].setRotationPoint(-17F, -16F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 step cull
		bodyModel[25].setRotationPoint(-23F, 4.5F, -11.01F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 step cull
		bodyModel[26].setRotationPoint(-23F, 4.5F, 10.01F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 2
		bodyModel[27].setRotationPoint(19.01F, 3F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 2
		bodyModel[28].setRotationPoint(19.01F, 9F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 2
		bodyModel[29].setRotationPoint(19.01F, 3F, 3F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 2
		bodyModel[30].setRotationPoint(19.01F, 9F, 3F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 2
		bodyModel[31].setRotationPoint(17.02F, 0F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 2
		bodyModel[32].setRotationPoint(19.02F, 0F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 2
		bodyModel[33].setRotationPoint(-23F, 2F, -2.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[34].setRotationPoint(-20F, 2F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 37, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 63
		bodyModel[35].setRotationPoint(-20F, 2F, -9.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 37, 2, 17, 0F); // Box 63
		bodyModel[36].setRotationPoint(-20F, 2F, -8.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 63
		bodyModel[37].setRotationPoint(-16F, 0F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 2
		bodyModel[38].setRotationPoint(17.02F, 0F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 19, 5, 1, 0F); // Box 63
		bodyModel[39].setRotationPoint(-16F, -16F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[40].setRotationPoint(-12.5F, 3.75F, -1.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[41].setRotationPoint(6.5F, 3.75F, -1.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 2
		bodyModel[42].setRotationPoint(-23F, 5.5F, 8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 2
		bodyModel[43].setRotationPoint(-20F, 5.5F, 8.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 63
		bodyModel[44].setRotationPoint(-20F, -12F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[45].setRotationPoint(-19F, -16F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 63
		bodyModel[46].setRotationPoint(-20F, -16F, 5F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 63
		bodyModel[47].setRotationPoint(-20F, -16F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[48].setRotationPoint(3F, -16F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 63
		bodyModel[49].setRotationPoint(-20F, -12F, 5F);

		bodyModel[50].addBox(0F, 0F, 0F, 20, 5, 1, 0F); // Box 63
		bodyModel[50].setRotationPoint(-17F, -16F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[51].setRotationPoint(-19F, -16F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[52].setRotationPoint(3F, -16F, 10F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 63
		bodyModel[53].setRotationPoint(17F, -11F, 3F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 63
		bodyModel[54].setRotationPoint(10F, -12F, -2.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2 headlight 1
		bodyModel[55].setRotationPoint(13.5F, -13F, -2.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 headlight 1
		bodyModel[56].setRotationPoint(13.5F, -15.5F, -1.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 headlight 1
		bodyModel[57].setRotationPoint(14F, -16.5F, -1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 headlight 1 number boards glow
		bodyModel[58].setRotationPoint(14F, -14.5F, 1.51F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 headlight 1 number boards glow
		bodyModel[59].setRotationPoint(14F, -14.5F, -1.51F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 headlight 1 glow
		bodyModel[60].setRotationPoint(16.51F, -15.5F, -1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.5F, -0.5F); // Box 2 headlight 2
		bodyModel[61].setRotationPoint(15.5F, -13.75F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 2 headlight 2 glow
		bodyModel[62].setRotationPoint(16.51F, -13.75F, -1F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 2 headlight 2
		bodyModel[63].setRotationPoint(13.5F, -13.25F, -0.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 2 headlight 2
		bodyModel[64].setRotationPoint(16.5F, -13.88F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 2 headlight 2
		bodyModel[65].setRotationPoint(13.5F, -11.25F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2 headlight 2 suport cull
		bodyModel[66].setRotationPoint(14F, -12.75F, -1F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 2 headlight 2 number boards glow
		bodyModel[67].setRotationPoint(16.5F, -13.88F, 1.13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 2 headlight 2
		bodyModel[68].setRotationPoint(16F, -12.88F, 1.13F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 2 headlight 2 number boards glow
		bodyModel[69].setRotationPoint(16.5F, -13.88F, -1.13F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 2 headlight 2
		bodyModel[70].setRotationPoint(16F, -12.88F, -1.13F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 63 ladder cull
		bodyModel[71].setRotationPoint(15F, -15F, 3F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 63
		bodyModel[72].setRotationPoint(-18F, -1F, -5F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 2
		bodyModel[73].setRotationPoint(3F, -13F, -2.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[74].setRotationPoint(3F, -14F, -2.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,-7F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[75].setRotationPoint(-16F, -21F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 63
		bodyModel[76].setRotationPoint(-18F, -15F, -5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 17, 10, 0F); // Box 63
		bodyModel[77].setRotationPoint(-17F, -16F, -5F);

		bodyModel[78].addBox(0F, 0F, 0F, 20, 1, 20, 0F); // Box 63
		bodyModel[78].setRotationPoint(-17F, -17F, -10F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 63
		bodyModel[79].setRotationPoint(-10F, -19F, -1.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 2
		bodyModel[80].setRotationPoint(-23F, 5.5F, -9.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, 0F, 0F); // Box 2
		bodyModel[81].setRotationPoint(-20F, 5.5F, -9.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 63 Doors
		bodyModel[82].setRotationPoint(-19F, -17F, -5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 63 Doors
		bodyModel[83].setRotationPoint(-19F, -17F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 63 Doors
		bodyModel[84].setRotationPoint(-19F, -10F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63 Doors
		bodyModel[85].setRotationPoint(-19F, -10F, 0F);
	}
	ModelFrictionTruckTender wheel3 = new ModelFrictionTruckTender();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 86; i++) {
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
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish_small.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.8F, 0.0F, 0F);
		wheel3.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.425F, 0.0F, 0);
		wheel3.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}