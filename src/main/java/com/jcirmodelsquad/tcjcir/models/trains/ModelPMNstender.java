//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PM N series tender
// Model Creator: Prof_Binky
// Created on: 11.12.2024 - 20:30:13
// Last changed on: 11.12.2024 - 20:30:13

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBuckeye3Axle1;
import com.jcirmodelsquad.tcjcir.models.trucks.Modelbuckeye_3axle;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.enums.BoxName;
import train.common.library.Info;

public class ModelPMNstender extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelPMNstender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[95];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1() {
		bodyModel[0] = new ModelRendererTurbo(this, 18, 114, textureX, textureY); // Box 83
		bodyModel[1] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 83
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 83
		bodyModel[3] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 83
		bodyModel[4] = new ModelRendererTurbo(this, 86, 42, textureX, textureY); // Box 83
		bodyModel[5] = new ModelRendererTurbo(this, 1, 60, textureX, textureY); // Box 83
		bodyModel[6] = new ModelRendererTurbo(this, 148, 82, textureX, textureY); // Box 83
		bodyModel[7] = new ModelRendererTurbo(this, 6, 45, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 60, 45, textureX, textureY); // Box 63
		bodyModel[9] = new ModelRendererTurbo(this, 33, 37, textureX, textureY); // Box 83
		bodyModel[10] = new ModelRendererTurbo(this, 2, 45, textureX, textureY); // Box 83
		bodyModel[11] = new ModelRendererTurbo(this, 56, 45, textureX, textureY); // Box 83
		bodyModel[12] = new ModelRendererTurbo(this, 83, 15, textureX, textureY); // Screw you coal
		bodyModel[13] = new ModelRendererTurbo(this, 80, 5, textureX, textureY, "cull"); // Cab platform cull
		bodyModel[14] = new ModelRendererTurbo(this, 83, 2, textureX, textureY); // Cab platform step
		bodyModel[15] = new ModelRendererTurbo(this, 175, 89, textureX, textureY, "cull"); // More cull bullshit
		bodyModel[16] = new ModelRendererTurbo(this, 207, 86, textureX, textureY, "cull"); // More cull bullshit
		bodyModel[17] = new ModelRendererTurbo(this, 78, 27, textureX, textureY); // Box 83
		bodyModel[18] = new ModelRendererTurbo(this, 2, 27, textureX, textureY); // Box 83
		bodyModel[19] = new ModelRendererTurbo(this, 108, 82, textureX, textureY); // Box 83
		bodyModel[20] = new ModelRendererTurbo(this, 108, 82, textureX, textureY); // Box 83
		bodyModel[21] = new ModelRendererTurbo(this, 123, 26, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 123, 23, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 118, 30, textureX, textureY); // Box 83
		bodyModel[24] = new ModelRendererTurbo(this, 123, 26, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 123, 23, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 118, 30, textureX, textureY); // Box 83
		bodyModel[27] = new ModelRendererTurbo(this, 116, 26, textureX, textureY); // Box 26
		bodyModel[28] = new ModelRendererTurbo(this, 109, 30, textureX, textureY); // Box 83
		bodyModel[29] = new ModelRendererTurbo(this, 116, 26, textureX, textureY); // Box 26
		bodyModel[30] = new ModelRendererTurbo(this, 109, 30, textureX, textureY); // Box 83
		bodyModel[31] = new ModelRendererTurbo(this, 178, 26, textureX, textureY); // Box 26
		bodyModel[32] = new ModelRendererTurbo(this, 183, 30, textureX, textureY); // Box 83
		bodyModel[33] = new ModelRendererTurbo(this, 178, 26, textureX, textureY); // Box 26
		bodyModel[34] = new ModelRendererTurbo(this, 183, 30, textureX, textureY); // Box 83
		bodyModel[35] = new ModelRendererTurbo(this, 34, 9, textureX, textureY); // Box 83
		bodyModel[36] = new ModelRendererTurbo(this, 61, 24, textureX, textureY); // Box 22
		bodyModel[37] = new ModelRendererTurbo(this, 68, 25, textureX, textureY); // Box 22
		bodyModel[38] = new ModelRendererTurbo(this, 41, 24, textureX, textureY); // Box 22
		bodyModel[39] = new ModelRendererTurbo(this, 36, 25, textureX, textureY); // Box 22
		bodyModel[40] = new ModelRendererTurbo(this, 48, 21, textureX, textureY); // Box 83
		bodyModel[41] = new ModelRendererTurbo(this, 130, -6, textureX, textureY); // Box 83
		bodyModel[42] = new ModelRendererTurbo(this, 157, 9, textureX, textureY); // Box 22
		bodyModel[43] = new ModelRendererTurbo(this, 164, 10, textureX, textureY); // Box 22
		bodyModel[44] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 22
		bodyModel[45] = new ModelRendererTurbo(this, 132, 10, textureX, textureY); // Box 22
		bodyModel[46] = new ModelRendererTurbo(this, 144, 6, textureX, textureY); // Box 83
		bodyModel[47] = new ModelRendererTurbo(this, 171, 12, textureX, textureY); // Box 83
		bodyModel[48] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 83
		bodyModel[49] = new ModelRendererTurbo(this, 171, 44, textureX, textureY, "cull"); // Ladder cull
		bodyModel[50] = new ModelRendererTurbo(this, 178, 43, textureX, textureY, "cull"); // ladder cull
		bodyModel[51] = new ModelRendererTurbo(this, 151, 117, textureX, textureY); // Box 83
		bodyModel[52] = new ModelRendererTurbo(this, 208, 62, textureX, textureY, "cull"); // More cull bullshit
		bodyModel[53] = new ModelRendererTurbo(this, 238, 97, textureX, textureY, "cull"); // Ladder cull
		bodyModel[54] = new ModelRendererTurbo(this, 237, 100, textureX, textureY, "cull"); // Ladder cull
		bodyModel[55] = new ModelRendererTurbo(this, 234, 99, textureX, textureY); // Ladder suport
		bodyModel[56] = new ModelRendererTurbo(this, 238, 97, textureX, textureY, "cull"); // Ladder cull
		bodyModel[57] = new ModelRendererTurbo(this, 237, 100, textureX, textureY, "cull"); // Ladder cull
		bodyModel[58] = new ModelRendererTurbo(this, 237, 104, textureX, textureY, "cull"); // Ladder cull
		bodyModel[59] = new ModelRendererTurbo(this, 237, 104, textureX, textureY, "cull"); // Ladder cull
		bodyModel[60] = new ModelRendererTurbo(this, 234, 99, textureX, textureY); // Ladder suport
		bodyModel[61] = new ModelRendererTurbo(this, 203, 97, textureX, textureY, "cull"); // Ladder cull
		bodyModel[62] = new ModelRendererTurbo(this, 202, 100, textureX, textureY, "cull"); // Ladder cull
		bodyModel[63] = new ModelRendererTurbo(this, 211, 99, textureX, textureY); // Ladder suport
		bodyModel[64] = new ModelRendererTurbo(this, 203, 97, textureX, textureY, "cull"); // Ladder cull
		bodyModel[65] = new ModelRendererTurbo(this, 202, 100, textureX, textureY, "cull"); // Ladder cull
		bodyModel[66] = new ModelRendererTurbo(this, 202, 104, textureX, textureY, "cull"); // Ladder cull
		bodyModel[67] = new ModelRendererTurbo(this, 202, 104, textureX, textureY, "cull"); // Ladder cull
		bodyModel[68] = new ModelRendererTurbo(this, 211, 99, textureX, textureY); // Ladder suport
		bodyModel[69] = new ModelRendererTurbo(this, 7, 116, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Box 83
		bodyModel[71] = new ModelRendererTurbo(this, 3, 71, textureX, textureY); // Box 83
		bodyModel[72] = new ModelRendererTurbo(this, 3, 71, textureX, textureY); // Box 83
		bodyModel[73] = new ModelRendererTurbo(this, 3, 71, textureX, textureY); // Box 83
		bodyModel[74] = new ModelRendererTurbo(this, 3, 71, textureX, textureY); // Box 83
		bodyModel[75] = new ModelRendererTurbo(this, 106, 2, textureX, textureY); // Box 83
		bodyModel[76] = new ModelRendererTurbo(this, 106, 2, textureX, textureY); // Box 83
		bodyModel[77] = new ModelRendererTurbo(this, 106, 2, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 106, 2, textureX, textureY); // Box 83
		bodyModel[79] = new ModelRendererTurbo(this, 186, 8, textureX, textureY); // Box 83
		bodyModel[80] = new ModelRendererTurbo(this, 229, 17, textureX, textureY); // Box 83
		bodyModel[81] = new ModelRendererTurbo(this, 229, 4, textureX, textureY); // Box 83
		bodyModel[82] = new ModelRendererTurbo(this, 182, 58, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 182, 53, textureX, textureY, "lamp"); // Rear headlight glow
		bodyModel[84] = new ModelRendererTurbo(this, 188, 48, textureX, textureY); // Box 2 headlight 3
		bodyModel[85] = new ModelRendererTurbo(this, 189, 45, textureX, textureY); // Box 2 headlight 3
		bodyModel[86] = new ModelRendererTurbo(this, 189, 59, textureX, textureY); // Box 2 headlight 2
		bodyModel[87] = new ModelRendererTurbo(this, 189, 53, textureX, textureY, "cull"); // Box 2 headlight 3 support cull
		bodyModel[88] = new ModelRendererTurbo(this, 188, 40, textureX, textureY, "lamp"); // Box 2 headlight 3 glow
		bodyModel[89] = new ModelRendererTurbo(this, 195, 49, textureX, textureY); // Box 2 headlight 2
		bodyModel[90] = new ModelRendererTurbo(this, 195, 54, textureX, textureY, "cull"); // Box 2 headlight 2 support cull
		bodyModel[91] = new ModelRendererTurbo(this, 196, 44, textureX, textureY, "lamp"); // Box 2 headlight 2 glow
		bodyModel[92] = new ModelRendererTurbo(this, 0, 102, textureX, textureY); // Box 134
		bodyModel[93] = new ModelRendererTurbo(this, 6, 97, textureX, textureY); // Box 134
		bodyModel[94] = new ModelRendererTurbo(this, 8, 94, textureX, textureY); // Box 134

		bodyModel[0].addBox(0F, 0F, 0F, 64, 2, 3, 0F); // Box 83
		bodyModel[0].setRotationPoint(-32.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 83
		bodyModel[1].setRotationPoint(32.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 83
		bodyModel[2].setRotationPoint(-35.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 62, 1, 22, 0F); // Box 83
		bodyModel[3].setRotationPoint(-32.5F, 2F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 31, 17, 22, 0F); // Box 83
		bodyModel[4].setRotationPoint(-1.5F, -15F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 31, 7, 22, 0F); // Box 83
		bodyModel[5].setRotationPoint(-32.5F, -5F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 8, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 83
		bodyModel[6].setRotationPoint(-5.5F, -15F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 63
		bodyModel[7].setRotationPoint(-25.5F, -15F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[8].setRotationPoint(-25.5F, -15F, 9F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 83
		bodyModel[9].setRotationPoint(-14.5F, -7F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 24, 10, 1, 0F); // Box 83
		bodyModel[10].setRotationPoint(-25.5F, -15F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 24, 10, 1, 0F); // Box 83
		bodyModel[11].setRotationPoint(-25.5F, -15F, 10F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Screw you coal
		bodyModel[12].setRotationPoint(-35.5F, -2F, -1.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 5, 16, 0F); // Cab platform cull
		bodyModel[13].setRotationPoint(-34.5F, -5F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Cab platform step
		bodyModel[14].setRotationPoint(-34.5F, -1F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // More cull bullshit
		bodyModel[15].setRotationPoint(-34.5F, 0.99F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // More cull bullshit
		bodyModel[16].setRotationPoint(29.5F, 1F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 7, 10, 7, 0F); // Box 83
		bodyModel[17].setRotationPoint(-32.5F, -15F, 4F);

		bodyModel[18].addBox(0F, 0F, 0F, 7, 10, 7, 0F); // Box 83
		bodyModel[18].setRotationPoint(-32.5F, -15F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 11, 2, 5, 0F); // Box 83
		bodyModel[19].setRotationPoint(-25.5F, -7F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 11, 2, 5, 0F); // Box 83
		bodyModel[20].setRotationPoint(-25.5F, -7F, 5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 26, 2, 1, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[21].setRotationPoint(-26.5F, -18.5F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 0F, -2F, 0.75F, 0F, -2F, 0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 26
		bodyModel[22].setRotationPoint(-26.5F, -21F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[23].setRotationPoint(-28.5F, -16F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 26, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[24].setRotationPoint(-26.5F, -18.5F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0.75F, 0F, -2F, 0.75F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 26
		bodyModel[25].setRotationPoint(-26.5F, -21F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[26].setRotationPoint(-28.5F, -16F, 10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -2F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, 1.25F, -2F, 0.5F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[27].setRotationPoint(-28.5F, -18.5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[28].setRotationPoint(-31.5F, -16F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -2F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, -1.25F, -2F, 0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[29].setRotationPoint(-28.5F, -18.5F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[30].setRotationPoint(-31.5F, -16F, 10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.5F, -1.25F, -3F, 0.5F, -1.25F, -3F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[31].setRotationPoint(-0.5F, -18.5F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[32].setRotationPoint(2.5F, -16F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.5F, 1.25F, -3F, 0.5F, 1.25F, -3F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[33].setRotationPoint(-0.5F, -18.5F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[34].setRotationPoint(2.5F, -16F, 10F);

		bodyModel[35].addShapeBox(0F, -6F, 0F, 0, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 83
		bodyModel[35].setRotationPoint(-27.4F, -15.15F, -10F);
		bodyModel[35].rotateAngleZ = -0.26179939F;

		bodyModel[36].addShapeBox(0F, -6.5F, 0F, 0, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[36].setRotationPoint(-27.41F, -15.15F, -6F);
		bodyModel[36].rotateAngleZ = -0.26179939F;

		bodyModel[37].addShapeBox(0F, -6F, 0F, 0, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[37].setRotationPoint(-27.41F, -15.15F, -8F);
		bodyModel[37].rotateAngleZ = -0.26179939F;

		bodyModel[38].addShapeBox(0F, -6.5F, 0F, 0, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[38].setRotationPoint(-27.41F, -15.15F, 3F);
		bodyModel[38].rotateAngleZ = -0.26179939F;

		bodyModel[39].addShapeBox(0F, -6F, 0F, 0, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[39].setRotationPoint(-27.41F, -15.15F, 6F);
		bodyModel[39].rotateAngleZ = -0.26179939F;

		bodyModel[40].addShapeBox(0F, -6.5F, 0F, 0, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 83
		bodyModel[40].setRotationPoint(-27.41F, -15.15F, -3F);
		bodyModel[40].rotateAngleZ = -0.26179939F;

		bodyModel[41].addBox(0F, -7.5F, 0F, 0, 8, 20, 0F); // Box 83
		bodyModel[41].setRotationPoint(-5.49F, -15F, -10F);
		bodyModel[41].rotateAngleZ = -0.76794487F;

		bodyModel[42].addShapeBox(0F, -8F, 0F, 0, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[42].setRotationPoint(-5.49F, -15F, -6F);
		bodyModel[42].rotateAngleZ = -0.76794487F;

		bodyModel[43].addShapeBox(0F, -7.5F, 0F, 0, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[43].setRotationPoint(-5.49F, -15F, -8F);
		bodyModel[43].rotateAngleZ = -0.76794487F;

		bodyModel[44].addShapeBox(0F, -8F, 0F, 0, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[44].setRotationPoint(-5.49F, -15F, 3F);
		bodyModel[44].rotateAngleZ = -0.76794487F;

		bodyModel[45].addShapeBox(0F, -7.5F, 0F, 0, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[45].setRotationPoint(-5.49F, -15F, 6F);
		bodyModel[45].rotateAngleZ = -0.76794487F;

		bodyModel[46].addShapeBox(0F, -8F, 0F, 0, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 83
		bodyModel[46].setRotationPoint(-5.49F, -15F, -3F);
		bodyModel[46].rotateAngleZ = -0.76794487F;

		bodyModel[47].addBox(0F, 0F, 0F, 0, 6, 4, 0F); // Box 83
		bodyModel[47].setRotationPoint(-0.25F, -20.4F, -5F);
		bodyModel[47].rotateAngleZ = 0.43633231F;

		bodyModel[48].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 83
		bodyModel[48].setRotationPoint(1.5F, -18F, 4F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 15, 4, 0F); // Ladder cull
		bodyModel[49].setRotationPoint(29.5F, -15F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // ladder cull
		bodyModel[50].setRotationPoint(27.5F, -19F, -3F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 83
		bodyModel[51].setRotationPoint(31.5F, 1F, -1.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 21, 0F); // More cull bullshit
		bodyModel[52].setRotationPoint(30.5F, 0F, -10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Ladder cull
		bodyModel[53].setRotationPoint(29.5F, 3F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Ladder cull
		bodyModel[54].setRotationPoint(29F, 4F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Ladder suport
		bodyModel[55].setRotationPoint(30F, 1F, -6.1F);
		bodyModel[55].rotateAngleX = -0.50614548F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Ladder cull
		bodyModel[56].setRotationPoint(29.5F, 3F, 10F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Ladder cull
		bodyModel[57].setRotationPoint(29F, 4F, 10F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Ladder cull
		bodyModel[58].setRotationPoint(29F, 6F, 10F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Ladder cull
		bodyModel[59].setRotationPoint(29F, 6F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Ladder suport
		bodyModel[60].setRotationPoint(30F, 1F, 6.1F);
		bodyModel[60].rotateAngleX = 0.50614548F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Ladder cull
		bodyModel[61].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Ladder cull
		bodyModel[62].setRotationPoint(-35F, 4F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Ladder suport
		bodyModel[63].setRotationPoint(-34F, 1F, -6.1F);
		bodyModel[63].rotateAngleX = -0.50614548F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Ladder cull
		bodyModel[64].setRotationPoint(-34.5F, 3F, 10F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Ladder cull
		bodyModel[65].setRotationPoint(-35F, 4F, 10F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Ladder cull
		bodyModel[66].setRotationPoint(-35F, 6F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Ladder cull
		bodyModel[67].setRotationPoint(-35F, 6F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Ladder suport
		bodyModel[68].setRotationPoint(-34F, 1F, 6.1F);
		bodyModel[68].rotateAngleX = 0.50614548F;

		bodyModel[69].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 69
		bodyModel[69].setRotationPoint(-35.5F, 0.99F, -2F);

		bodyModel[70].addBox(0F, 0F, 0F, 18, 1, 4, 0F); // Box 83
		bodyModel[70].setRotationPoint(6.5F, -15.5F, -2F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 83
		bodyModel[71].setRotationPoint(-27.5F, -15F, -4F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 83
		bodyModel[72].setRotationPoint(-27.5F, -13F, -4F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 83
		bodyModel[73].setRotationPoint(-27.5F, -11F, -4F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 83
		bodyModel[74].setRotationPoint(-27.5F, -9F, -4F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 83
		bodyModel[75].setRotationPoint(-32.5F, -15F, 11F);
		bodyModel[75].rotateAngleY = 0.78539816F;

		bodyModel[76].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 83
		bodyModel[76].setRotationPoint(29.5F, -15F, 11F);
		bodyModel[76].rotateAngleY = -0.78539816F;

		bodyModel[77].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 83
		bodyModel[77].setRotationPoint(-32.5F, -15F, -11F);
		bodyModel[77].rotateAngleY = 2.35619449F;

		bodyModel[78].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 83
		bodyModel[78].setRotationPoint(29.5F, -15F, -11F);
		bodyModel[78].rotateAngleY = -2.35619449F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 17, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 4F, 0F, 6F); // Box 83
		bodyModel[79].setRotationPoint(-22.5F, -23F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 8, 8, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -5F, 0F, 6F, -5F, 0F, 6F, 0F, 0F, 6F); // Box 83
		bodyModel[80].setRotationPoint(-5.5F, -23F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 83
		bodyModel[81].setRotationPoint(-26.5F, -7F, -4F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 83
		bodyModel[82].setRotationPoint(29F, -13F, -1F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Rear headlight glow
		bodyModel[83].setRotationPoint(30F, -12.5F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.5F, -0.5F); // Box 2 headlight 3
		bodyModel[84].setRotationPoint(28.5F, -19.75F, -1F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 2 headlight 3
		bodyModel[85].setRotationPoint(27.5F, -19.25F, -0.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 2 headlight 2
		bodyModel[86].setRotationPoint(26.5F, -15.25F, -1.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0.025F); // Box 2 headlight 3 support cull
		bodyModel[87].setRotationPoint(27.5F, -18.75F, -0.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 2 headlight 3 glow
		bodyModel[88].setRotationPoint(29.51F, -19.75F, -1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 2 headlight 2
		bodyModel[89].setRotationPoint(28.5F, -17.4F, -1F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 2 headlight 2 support cull
		bodyModel[90].setRotationPoint(27.5F, -17F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 2 headlight 2 glow
		bodyModel[91].setRotationPoint(29.51F, -17.4F, -1F);

		bodyModel[92].addBox(0F, 0F, 0F, 6, 4, 5, 0F); // Box 134
		bodyModel[92].setRotationPoint(-4.5F, 3F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 134
		bodyModel[93].setRotationPoint(-1.5F, 3F, 4F);
		bodyModel[93].rotateAngleX = -0.78539816F;

		bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 134
		bodyModel[94].setRotationPoint(-2.5F, 4F, 3.5F);
	}

	ModelBuckeye3Axle1 bogie = new ModelBuckeye3Axle1();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 95; i++) {
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
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/Buckeye_3_axle_early_black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1, 1, 1f);
		GL11.glTranslated(-1.2, -0.0, -0.0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(2.2, -0.0, 0.00);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

	}

	public float[] getTrans() {
		return new float[]{0.15F, 0.155F, 0F};
	}
}