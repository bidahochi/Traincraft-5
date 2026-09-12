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

public class ModelUSST20WL_On extends ModelConverter //Same as Filename
{
    int textureX = 128;
    int textureY = 32;

    public ModelUSST20WL_On() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[48];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[2] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 34 rod extendus
        bodyModel[3] = new ModelRendererTurbo(this, 32, 6, textureX, textureY); // Box 34 rod extendus
        bodyModel[4] = new ModelRendererTurbo(this, 53, 6, textureX, textureY); // Box 23 rod grippy
        bodyModel[5] = new ModelRendererTurbo(this, 53, 6, textureX, textureY); // Box 24 rod grippy
        bodyModel[6] = new ModelRendererTurbo(this, 23, 26, textureX, textureY); // Box 31 shaft rotatus connectos
        bodyModel[7] = new ModelRendererTurbo(this, 55, 21, textureX, textureY); // Box 41 handle
        bodyModel[8] = new ModelRendererTurbo(this, 61, 21, textureX, textureY); // Box 42 handle
        bodyModel[9] = new ModelRendererTurbo(this, 69, 12, textureX, textureY); // Box 43 handle
        bodyModel[10] = new ModelRendererTurbo(this, 73, 19, textureX, textureY); // Box 44 handle
        bodyModel[11] = new ModelRendererTurbo(this, 75, 22, textureX, textureY); // Box 45 handle
        bodyModel[12] = new ModelRendererTurbo(this, 75, 22, textureX, textureY); // Box 46 handle
        bodyModel[13] = new ModelRendererTurbo(this, 9, 12, textureX, textureY); // Box 30
        bodyModel[14] = new ModelRendererTurbo(this, 15, 12, textureX, textureY); // Box 31
        bodyModel[15] = new ModelRendererTurbo(this, 77, 24, textureX, textureY); // Box 38
        bodyModel[16] = new ModelRendererTurbo(this, 87, 3, textureX, textureY); // Box 33
        bodyModel[17] = new ModelRendererTurbo(this, 87, 3, textureX, textureY); // Box 40
        bodyModel[18] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 41
        bodyModel[19] = new ModelRendererTurbo(this, 94, 17, textureX, textureY); // Box 42
        bodyModel[20] = new ModelRendererTurbo(this, 107, 23, textureX, textureY); // Box 43
        bodyModel[21] = new ModelRendererTurbo(this, 107, 23, textureX, textureY); // Box 44
        bodyModel[22] = new ModelRendererTurbo(this, 106, 19, textureX, textureY); // Box 45
        bodyModel[23] = new ModelRendererTurbo(this, 106, 19, textureX, textureY); // Box 46
        bodyModel[24] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 57 Fiber/Codeline Tube
        bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 58 Fiber/Codeline Tube
        bodyModel[26] = new ModelRendererTurbo(this, 7, 24, textureX, textureY); // Box 59  fiber/codeline inlet box top
        bodyModel[27] = new ModelRendererTurbo(this, 7, 28, textureX, textureY); // Box 60 fiber/codeline inlet box
        bodyModel[28] = new ModelRendererTurbo(this, 8, 18, textureX, textureY); // Box 61 Fiber/Codeline Tube tall
        bodyModel[29] = new ModelRendererTurbo(this, 93, 2, textureX, textureY); // Box 55
        bodyModel[30] = new ModelRendererTurbo(this, 61, 16, textureX, textureY); // Box 40 handle
        bodyModel[31] = new ModelRendererTurbo(this, 52, 13, textureX, textureY); // Box 57
        bodyModel[32] = new ModelRendererTurbo(this, 53, 10, textureX, textureY); // Box 58
        bodyModel[33] = new ModelRendererTurbo(this, 53, 10, textureX, textureY); // Box 59
        bodyModel[34] = new ModelRendererTurbo(this, 86, 19, textureX, textureY); // Box 60
        bodyModel[35] = new ModelRendererTurbo(this, 41, 23, textureX, textureY); // Box 61 Connector thingy for switchlocks
        bodyModel[36] = new ModelRendererTurbo(this, 103, 13, textureX, textureY); // Box 62 Cover plate for switch target connections
        bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39
        bodyModel[38] = new ModelRendererTurbo(this, 87, 3, textureX, textureY); // Box 40
        bodyModel[39] = new ModelRendererTurbo(this, 87, 3, textureX, textureY); // Box 41
        bodyModel[40] = new ModelRendererTurbo(this, 77, 9, textureX, textureY); // Box 42
        bodyModel[41] = new ModelRendererTurbo(this, 38, 10, textureX, textureY); // Box 43
        bodyModel[42] = new ModelRendererTurbo(this, 26, 10, textureX, textureY); // Box 44
        bodyModel[43] = new ModelRendererTurbo(this, 21, 10, textureX, textureY); // Box 45
        bodyModel[44] = new ModelRendererTurbo(this, 32, 16, textureX, textureY); // Box 31
        bodyModel[45] = new ModelRendererTurbo(this, 41, 16, textureX, textureY); // Box 53 Thingy for padlock
        bodyModel[46] = new ModelRendererTurbo(this, 42, 25, textureX, textureY); // Box 48
        bodyModel[47] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 50

        bodyModel[0].addBox(0F, 0F, 0F, 32, 2, 2, 0F); // Box 0
        bodyModel[0].setRotationPoint(-27F, 9F, -4F);

        bodyModel[1].addBox(0F, 0F, 0F, 32, 2, 2, 0F); // Box 0
        bodyModel[1].setRotationPoint(-27F, 9F, 2F);

        bodyModel[2].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 34 rod extendus
        bodyModel[2].setRotationPoint(-24F, 9F, 0.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 34 rod extendus
        bodyModel[3].setRotationPoint(-10F, 9F, 0.5F);

        bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 23 rod grippy
        bodyModel[4].setRotationPoint(-16.25F, 8.75F, 0F);

        bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 24 rod grippy
        bodyModel[5].setRotationPoint(-23.75F, 8.75F, 0F);

        bodyModel[6].addBox(-0.5F, 0F, -1.5F, 1, 1, 3, 0F); // Box 31 shaft rotatus connectos
        bodyModel[6].setRotationPoint(-1.5F, 8.5F, 0F);
        bodyModel[6].rotateAngleY = -0.78539816F;

        bodyModel[7].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41 handle
        bodyModel[7].setRotationPoint(1F, 7.75F, 1.25F);
        bodyModel[7].rotateAngleX = 3.14159265F;

        bodyModel[8].addShapeBox(0F, -0.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42 handle
        bodyModel[8].setRotationPoint(1F, 7.75F, 1.25F);
        bodyModel[8].rotateAngleX = 3.14159265F;

        bodyModel[9].addShapeBox(0F, -0.5F, 1.5F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 43 handle
        bodyModel[9].setRotationPoint(1F, 7.75F, 1.25F);
        bodyModel[9].rotateAngleX = 3.14159265F;

        bodyModel[10].addShapeBox(0F, -0.5F, 6.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44 handle
        bodyModel[10].setRotationPoint(1F, 7.75F, 1.25F);
        bodyModel[10].rotateAngleX = 3.14159265F;

        bodyModel[11].addShapeBox(0F, -1.5F, 6.5F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45 handle
        bodyModel[11].setRotationPoint(1F, 7.75F, 1.25F);
        bodyModel[11].rotateAngleX = 3.14159265F;

        bodyModel[12].addShapeBox(0F, 0.5F, 6.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46 handle
        bodyModel[12].setRotationPoint(1F, 7.75F, 1.25F);
        bodyModel[12].rotateAngleX = 3.14159265F;

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[13].setRotationPoint(2.1F, 7.25F, 5.75F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 31
        bodyModel[14].setRotationPoint(0.75F, 8.25F, 5.75F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 38
        bodyModel[15].setRotationPoint(-2.25F, 7.5F, -6F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[16].setRotationPoint(-3.25F, 8F, -4F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        bodyModel[17].setRotationPoint(-3.25F, 8F, 2F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.15F, 0F, -0.55F, -0.15F, 0F, -0.55F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 41
        bodyModel[18].setRotationPoint(-2.25F, 7F, -6F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 42
        bodyModel[19].setRotationPoint(-2.25F, 7F, 0F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.15F, 0F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -1F, 0F, -0.15F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, 0F, -0.5F, -0.5F); // Box 43
        bodyModel[20].setRotationPoint(-0.25F, 7F, 0F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, -0.5F, -0.15F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -1F); // Box 44
        bodyModel[21].setRotationPoint(-3.25F, 7F, 0F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 45
        bodyModel[22].setRotationPoint(-3F, 7.75F, -2F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 46
        bodyModel[23].setRotationPoint(-0.5F, 7.75F, -2F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 57 Fiber/Codeline Tube
        bodyModel[24].setRotationPoint(-1F, 7.75F, 8.25F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 58 Fiber/Codeline Tube
        bodyModel[25].setRotationPoint(-1F, 7.75F, 10.25F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59  fiber/codeline inlet box top
        bodyModel[26].setRotationPoint(-1F, 7F, 11.25F);

        bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 60 fiber/codeline inlet box
        bodyModel[27].setRotationPoint(-1F, 8F, 11.25F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 61 Fiber/Codeline Tube tall
        bodyModel[28].setRotationPoint(-1F, 8F, 12.25F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 55
        bodyModel[29].setRotationPoint(0.75F, 8F, -4F);

        bodyModel[30].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 40 handle
        bodyModel[30].setRotationPoint(0F, 7.75F, 1.25F);

        bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 57
        bodyModel[31].setRotationPoint(0.75F, 8.25F, -3.5F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
        bodyModel[32].setRotationPoint(2.1F, 7.25F, -3.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
        bodyModel[33].setRotationPoint(0.9F, 7.25F, -3.5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 60
        bodyModel[34].setRotationPoint(-2.25F, 7F, 2.5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F); // Box 61 Connector thingy for switchlocks
        bodyModel[35].setRotationPoint(-1.75F, 7.5F, 2.9F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 62 Cover plate for switch target connections
        bodyModel[36].setRotationPoint(-2.25F, 6.25F, 0.25F);

        bodyModel[37].addBox(0F, 0F, 0F, 32, 2, 2, 0F); // Box 39
        bodyModel[37].setRotationPoint(-27F, 9F, 8F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        bodyModel[38].setRotationPoint(-3.25F, 8F, 2F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
        bodyModel[39].setRotationPoint(-3.25F, 8F, 2F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 42
        bodyModel[40].setRotationPoint(-1.25F, 8F, 4F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[41].setRotationPoint(-0.75F, 7.5F, 4F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 44
        bodyModel[42].setRotationPoint(-0.75F, 6.5F, 4F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 45
        bodyModel[43].setRotationPoint(-0.75F, 6.5F, 3.75F);

        bodyModel[44].addShapeBox(-1.5F, -1F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.4F, -0.75F, 0F); // Box 31
        bodyModel[44].setRotationPoint(2.1F, 8F, 5.75F);
        bodyModel[44].rotateAngleZ = -1.04719755F;

        bodyModel[45].addShapeBox(0.5F, -1F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 53 Thingy for padlock
        bodyModel[45].setRotationPoint(2.1F, 8F, 5.75F);
        bodyModel[45].rotateAngleZ = -1.04719755F;

        bodyModel[46].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F); // Box 48
        bodyModel[46].setRotationPoint(-0.5F, 7.5F, 4.75F);
        bodyModel[46].rotateAngleY = -0.50614548F;

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 50
        bodyModel[47].setRotationPoint(-0.25F, 7.75F, 6.25F);
    }
}