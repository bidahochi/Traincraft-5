//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Racor36H
// Model Creator: bida
// Created on: 26.02.2022 - 09:03:20
// Last changed on: 26.02.2022 - 09:03:20

package com.jcirmodelsquad.tcjcir.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelRacor36D_3_On extends ModelConverter //Same as Filename
{
    int textureX = 128;
    int textureY = 32;

    public ModelRacor36D_3_On() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[38];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[2] = new ModelRendererTurbo(this, 25, 20, textureX, textureY); // Box 2 shaft rotatis
        bodyModel[3] = new ModelRendererTurbo(this, 40, 14, textureX, textureY); // Box 4
        bodyModel[4] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 34 rod extendus
        bodyModel[5] = new ModelRendererTurbo(this, 32, 6, textureX, textureY); // Box 34 rod extendus
        bodyModel[6] = new ModelRendererTurbo(this, 53, 6, textureX, textureY); // Box 23 rod grippy
        bodyModel[7] = new ModelRendererTurbo(this, 53, 6, textureX, textureY); // Box 24 rod grippy
        bodyModel[8] = new ModelRendererTurbo(this, 23, 26, textureX, textureY); // Box 31 shaft rotatus connectos
        bodyModel[9] = new ModelRendererTurbo(this, 42, 21, textureX, textureY); // Box 32
        bodyModel[10] = new ModelRendererTurbo(this, 41, 24, textureX, textureY); // Box 33
        bodyModel[11] = new ModelRendererTurbo(this, 42, 21, textureX, textureY); // Box 34
        bodyModel[12] = new ModelRendererTurbo(this, 41, 24, textureX, textureY); // Box 35
        bodyModel[13] = new ModelRendererTurbo(this, 25, 14, textureX, textureY); // Box 37 shaft rotatis
        bodyModel[14] = new ModelRendererTurbo(this, 43, 10, textureX, textureY); // Box 39
        bodyModel[15] = new ModelRendererTurbo(this, 54, 17, textureX, textureY); // Box 40 handle
        bodyModel[16] = new ModelRendererTurbo(this, 53, 10, textureX, textureY); // Box 30
        bodyModel[17] = new ModelRendererTurbo(this, 52, 13, textureX, textureY); // Box 31
        bodyModel[18] = new ModelRendererTurbo(this, 53, 10, textureX, textureY); // Box 32
        bodyModel[19] = new ModelRendererTurbo(this, 12, 17, textureX, textureY); // Box 26 target b
        bodyModel[20] = new ModelRendererTurbo(this, 12, 9, textureX, textureY); // Box 47 target a
        bodyModel[21] = new ModelRendererTurbo(this, 54, 17, textureX, textureY); // Box 40 handle
        bodyModel[22] = new ModelRendererTurbo(this, 55, 21, textureX, textureY); // Box 41 handle
        bodyModel[23] = new ModelRendererTurbo(this, 61, 21, textureX, textureY); // Box 42 handle
        bodyModel[24] = new ModelRendererTurbo(this, 69, 12, textureX, textureY); // Box 43 handle
        bodyModel[25] = new ModelRendererTurbo(this, 73, 19, textureX, textureY); // Box 44 handle
        bodyModel[26] = new ModelRendererTurbo(this, 75, 22, textureX, textureY); // Box 45 handle
        bodyModel[27] = new ModelRendererTurbo(this, 75, 22, textureX, textureY); // Box 46 handle
        bodyModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 27
        bodyModel[29] = new ModelRendererTurbo(this, 3, 28, textureX, textureY); // Box 29
        bodyModel[30] = new ModelRendererTurbo(this, 2, 11, textureX, textureY); // Box 30
        bodyModel[31] = new ModelRendererTurbo(this, 2, 22, textureX, textureY); // Box 31
        bodyModel[32] = new ModelRendererTurbo(this, 3, 25, textureX, textureY); // Box 53 Thingy for padlock
        bodyModel[33] = new ModelRendererTurbo(this, 38, 28, textureX, textureY); // Box 57 Fiber/Codeline Tube
        bodyModel[34] = new ModelRendererTurbo(this, 45, 29, textureX, textureY); // Box 58 Fiber/Codeline Tube
        bodyModel[35] = new ModelRendererTurbo(this, 55, 28, textureX, textureY); // Box 59  fiber/codeline inlet box top
        bodyModel[36] = new ModelRendererTurbo(this, 60, 26, textureX, textureY); // Box 60 fiber/codeline inlet box
        bodyModel[37] = new ModelRendererTurbo(this, 50, 28, textureX, textureY); // Box 61 Fiber/Codeline Tube tall

        bodyModel[0].addBox(0F, 0F, 0F, 32, 2, 2, 0F); // Box 0
        bodyModel[0].setRotationPoint(-27F, 9F, -4F);

        bodyModel[1].addBox(0F, 0F, 0F, 32, 2, 2, 0F); // Box 0
        bodyModel[1].setRotationPoint(-27F, 9F, 2F);

        bodyModel[2].addBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F); // Box 2 shaft rotatis
        bodyModel[2].setRotationPoint(-1.5F, 4.5F, 0F);
        bodyModel[2].rotateAngleY = -0.78539816F;

        bodyModel[3].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 4
        bodyModel[3].setRotationPoint(-3F, 5.5F, -1.5F);

        bodyModel[4].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 34 rod extendus
        bodyModel[4].setRotationPoint(-24F, 9F, 0.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 34 rod extendus
        bodyModel[5].setRotationPoint(-10F, 9F, 0.5F);

        bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 23 rod grippy
        bodyModel[6].setRotationPoint(-16.25F, 8.75F, 0F);

        bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 24 rod grippy
        bodyModel[7].setRotationPoint(-23.75F, 8.75F, 0F);

        bodyModel[8].addBox(-0.5F, 0F, -1.5F, 1, 1, 3, 0F); // Box 31 shaft rotatus connectos
        bodyModel[8].setRotationPoint(-1.5F, 8.5F, 0F);
        bodyModel[8].rotateAngleY = -0.78539816F;

        bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 32
        bodyModel[9].setRotationPoint(-3F, 8F, -2F);

        bodyModel[10].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 33
        bodyModel[10].setRotationPoint(-3F, 8F, -4F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
        bodyModel[11].setRotationPoint(-3F, 8F, 1F);

        bodyModel[12].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 35
        bodyModel[12].setRotationPoint(-3F, 8F, 2F);

        bodyModel[13].addBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F); // Box 37 shaft rotatis
        bodyModel[13].setRotationPoint(-1.5F, 0.5F, 0F);
        bodyModel[13].rotateAngleY = -1.57079633F;

        bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 39
        bodyModel[14].setRotationPoint(-0.5F, 6.45F, -1F);

        bodyModel[15].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 40 handle
        bodyModel[15].setRotationPoint(0F, 7F, 0F);
        bodyModel[15].rotateAngleX = 3.14159265F;

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[16].setRotationPoint(2.1F, 6.5F, -3.5F);

        bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 31
        bodyModel[17].setRotationPoint(0.75F, 7.5F, -3.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
        bodyModel[18].setRotationPoint(0.9F, 6.5F, -3.5F);

        bodyModel[19].addShapeBox(-0.75F, 0F, -2.5F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 26 target b
        bodyModel[19].setRotationPoint(-1.5F, 2F, 0F);
        bodyModel[19].rotateAngleY = -1.57079633F;

        bodyModel[20].addShapeBox(-0.75F, 0F, -2.5F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 47 target a
        bodyModel[20].setRotationPoint(-1.5F, 2F, 0F);
        bodyModel[20].rotateAngleY = -3.14159265F;

        bodyModel[21].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 40 handle
        bodyModel[21].setRotationPoint(0F, 7F, 0F);

        bodyModel[22].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41 handle
        bodyModel[22].setRotationPoint(1F, 7F, 0F);
        bodyModel[22].rotateAngleX = 3.14159265F;

        bodyModel[23].addShapeBox(0F, -0.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42 handle
        bodyModel[23].setRotationPoint(1F, 7F, 0F);
        bodyModel[23].rotateAngleX = 3.14159265F;

        bodyModel[24].addShapeBox(0F, -0.5F, 1.5F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 43 handle
        bodyModel[24].setRotationPoint(1F, 7F, 0F);
        bodyModel[24].rotateAngleX = 3.14159265F;

        bodyModel[25].addShapeBox(0F, -0.5F, 6.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44 handle
        bodyModel[25].setRotationPoint(1F, 7F, 0F);
        bodyModel[25].rotateAngleX = 3.14159265F;

        bodyModel[26].addShapeBox(0F, -1.5F, 6.5F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45 handle
        bodyModel[26].setRotationPoint(1F, 7F, 0F);
        bodyModel[26].rotateAngleX = 3.14159265F;

        bodyModel[27].addShapeBox(0F, 0.5F, 6.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46 handle
        bodyModel[27].setRotationPoint(1F, 7F, 0F);
        bodyModel[27].rotateAngleX = 3.14159265F;

        bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
        bodyModel[28].setRotationPoint(0.25F, 7.5F, 2F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
        bodyModel[29].setRotationPoint(2.1F, 6.25F, 2.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 30
        bodyModel[30].setRotationPoint(0.25F, 5.75F, 2F);

        bodyModel[31].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 31
        bodyModel[31].setRotationPoint(2.1F, 7.25F, 2.5F);
        bodyModel[31].rotateAngleZ = -0.87266463F;

        bodyModel[32].addShapeBox(0.5F, -1F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 53 Thingy for padlock
        bodyModel[32].setRotationPoint(2.1F, 7.25F, 2.5F);
        bodyModel[32].rotateAngleZ = -0.87266463F;

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 57 Fiber/Codeline Tube
        bodyModel[33].setRotationPoint(-0.5F, 8F, 3.75F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 58 Fiber/Codeline Tube
        bodyModel[34].setRotationPoint(-0.5F, 8F, 5.75F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59  fiber/codeline inlet box top
        bodyModel[35].setRotationPoint(-0.5F, 7.25F, 6.75F);

        bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 60 fiber/codeline inlet box
        bodyModel[36].setRotationPoint(-0.5F, 8.25F, 6.75F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 61 Fiber/Codeline Tube tall
        bodyModel[37].setRotationPoint(-0.5F, 9F, 7.5F);
    }
}