package com.jcirmodelsquad.tcjcir.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelUSSM22_On extends  ModelConverter //Same as Filename
{
    int textureX = 128;
    int textureY = 32;

    public ModelUSSM22_On() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[43];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[2] = new ModelRendererTurbo(this, 60, 7, textureX, textureY); // Box 31 shaft rotatus connectos
        bodyModel[3] = new ModelRendererTurbo(this, 2, 15, textureX, textureY); // Box 40 handle
        bodyModel[4] = new ModelRendererTurbo(this, 10, 14, textureX, textureY); // Box 41 handle
        bodyModel[5] = new ModelRendererTurbo(this, 19, 15, textureX, textureY); // Box 42 handle
        bodyModel[6] = new ModelRendererTurbo(this, 24, 14, textureX, textureY); // Box 43 handle
        bodyModel[7] = new ModelRendererTurbo(this, 45, 11, textureX, textureY); // Box 44 handle
        bodyModel[8] = new ModelRendererTurbo(this, 39, 17, textureX, textureY); // Box 45 handle
        bodyModel[9] = new ModelRendererTurbo(this, 39, 17, textureX, textureY); // Box 46 handle
        bodyModel[10] = new ModelRendererTurbo(this, 65, 11, textureX, textureY); // Box 30
        bodyModel[11] = new ModelRendererTurbo(this, 16, 27, textureX, textureY); // Box 31
        bodyModel[12] = new ModelRendererTurbo(this, 90, 8, textureX, textureY); // Box 30 Central Nexus
        bodyModel[13] = new ModelRendererTurbo(this, 108, 8, textureX, textureY); // Box 31
        bodyModel[14] = new ModelRendererTurbo(this, 108, 1, textureX, textureY); // Box 33
        bodyModel[15] = new ModelRendererTurbo(this, 90, 2, textureX, textureY); // Box 34
        bodyModel[16] = new ModelRendererTurbo(this, 72, 9, textureX, textureY); // Box 35
        bodyModel[17] = new ModelRendererTurbo(this, 72, 2, textureX, textureY); // Box 36
        bodyModel[18] = new ModelRendererTurbo(this, 56, 11, textureX, textureY); // Box 37 switch Condom
        bodyModel[19] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 38
        bodyModel[20] = new ModelRendererTurbo(this, 11, 9, textureX, textureY); // Box 39 Power Selector LEVER
        bodyModel[21] = new ModelRendererTurbo(this, 19, 10, textureX, textureY); // Box 40 Power Selector LEVER
        bodyModel[22] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 41 Power Selector LEVER
        bodyModel[23] = new ModelRendererTurbo(this, 35, 10, textureX, textureY); // Box 42 Power Selector LEVER doodad
        bodyModel[24] = new ModelRendererTurbo(this, 65, 11, textureX, textureY); // Box 43
        bodyModel[25] = new ModelRendererTurbo(this, 9, 19, textureX, textureY); // Box 48
        bodyModel[26] = new ModelRendererTurbo(this, 9, 19, textureX, textureY); // Box 49
        bodyModel[27] = new ModelRendererTurbo(this, 65, 11, textureX, textureY); // Box 50
        bodyModel[28] = new ModelRendererTurbo(this, 65, 11, textureX, textureY); // Box 51
        bodyModel[29] = new ModelRendererTurbo(this, 16, 27, textureX, textureY); // Box 52
        bodyModel[30] = new ModelRendererTurbo(this, 16, 19, textureX, textureY); // Box 53 Thingy for padlock
        bodyModel[31] = new ModelRendererTurbo(this, 16, 19, textureX, textureY); // Box 54 Thingy for padlock
        bodyModel[32] = new ModelRendererTurbo(this, 30, 25, textureX, textureY); // Box 55
        bodyModel[33] = new ModelRendererTurbo(this, 38, 24, textureX, textureY); // Box 56 Switch Dong extendus for showing state
        bodyModel[34] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 57 Fiber/Codeline Tube
        bodyModel[35] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 58 Fiber/Codeline Tube
        bodyModel[36] = new ModelRendererTurbo(this, 7, 24, textureX, textureY); // Box 59  fiber/codeline inlet box top
        bodyModel[37] = new ModelRendererTurbo(this, 7, 28, textureX, textureY); // Box 60 fiber/codeline inlet box
        bodyModel[38] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 61 Fiber/Codeline Tube tall
        bodyModel[39] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 34 rod extendus
        bodyModel[40] = new ModelRendererTurbo(this, 32, 6, textureX, textureY); // Box 34 rod extendus
        bodyModel[41] = new ModelRendererTurbo(this, 53, 6, textureX, textureY); // Box 23 rod grippy
        bodyModel[42] = new ModelRendererTurbo(this, 53, 6, textureX, textureY); // Box 24 rod grippy

        bodyModel[0].addBox(0F, 0F, 0F, 32, 2, 2, 0F); // Box 0
        bodyModel[0].setRotationPoint(-27F, 9F, -4F);

        bodyModel[1].addBox(0F, 0F, 0F, 32, 2, 2, 0F); // Box 0
        bodyModel[1].setRotationPoint(-27F, 9F, 2F);

        bodyModel[2].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 31 shaft rotatus connectos
        bodyModel[2].setRotationPoint(-2F, 8.5F, 0F);

        bodyModel[3].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 40 handle
        bodyModel[3].setRotationPoint(0F, 6.75F, 0F);

        bodyModel[4].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41 handle
        bodyModel[4].setRotationPoint(1F, 6.75F, 0F);

        bodyModel[5].addShapeBox(0F, -0.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42 handle
        bodyModel[5].setRotationPoint(1F, 6.75F, 0F);

        bodyModel[6].addShapeBox(0F, -0.5F, 2.5F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 43 handle
        bodyModel[6].setRotationPoint(1F, 6.75F, 0F);

        bodyModel[7].addShapeBox(0F, -0.5F, 7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44 handle
        bodyModel[7].setRotationPoint(1F, 6.75F, 0F);

        bodyModel[8].addShapeBox(0F, -1.5F, 7.5F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45 handle
        bodyModel[8].setRotationPoint(1F, 6.75F, 0F);

        bodyModel[9].addShapeBox(0F, 0.5F, 7.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46 handle
        bodyModel[9].setRotationPoint(1F, 6.75F, 0F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 30
        bodyModel[10].setRotationPoint(2.6F, 6F, 2.5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 31
        bodyModel[11].setRotationPoint(0.5F, 7F, 2.5F);

        bodyModel[12].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 30 Central Nexus
        bodyModel[12].setRotationPoint(-4F, 6F, -2F);

        bodyModel[13].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 31
        bodyModel[13].setRotationPoint(-4F, 7F, -7F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.25F, -0.85F, -0.25F, -0.25F, -0.85F, -0.25F, -0.25F, -0.85F, -0.25F, -0.25F, -0.85F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[14].setRotationPoint(-4F, 6F, -7F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
        bodyModel[15].setRotationPoint(-4F, 5F, -2F);

        bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 35
        bodyModel[16].setRotationPoint(-4F, 7F, 2F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
        bodyModel[17].setRotationPoint(-4F, 6F, 2F);

        bodyModel[18].addShapeBox(-0.5F, 0F, -1.5F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 37 switch Condom
        bodyModel[18].setRotationPoint(0.5F, 8.25F, 1F);

        bodyModel[19].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, 0F, -0.2F, -0.2F); // Box 38
        bodyModel[19].setRotationPoint(0F, 7.5F, -1F);

        bodyModel[20].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 39 Power Selector LEVER
        bodyModel[20].setRotationPoint(1.25F, 7.5F, -1F);

        bodyModel[21].addShapeBox(0F, -0.5F, 1.5F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 40 Power Selector LEVER
        bodyModel[21].setRotationPoint(1.5F, 7.5F, -1F);

        bodyModel[22].addShapeBox(0F, -0.5F, 2.5F, 1, 1, 3, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 41 Power Selector LEVER
        bodyModel[22].setRotationPoint(1.5F, 7.5F, -1F);

        bodyModel[23].addShapeBox(0F, -0.5F, 4.25F, 1, 1, 1, 0F,-0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F); // Box 42 Power Selector LEVER doodad
        bodyModel[23].setRotationPoint(2F, 7.5F, -1F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 43
        bodyModel[24].setRotationPoint(0.9F, 6F, 2.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F); // Box 48
        bodyModel[25].setRotationPoint(1.5F, 6F, 2.5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F); // Box 49
        bodyModel[26].setRotationPoint(1.5F, 6F, -3.5F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 50
        bodyModel[27].setRotationPoint(0.9F, 6F, -3.5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 51
        bodyModel[28].setRotationPoint(2.6F, 6F, -3.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 52
        bodyModel[29].setRotationPoint(0.5F, 7F, -3.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 53 Thingy for padlock
        bodyModel[30].setRotationPoint(3.1F, 6F, 2.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 54 Thingy for padlock
        bodyModel[31].setRotationPoint(3.1F, 6F, -3.5F);

        bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 55
        bodyModel[32].setRotationPoint(-2.5F, 8F, 6F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 56 Switch Dong extendus for showing state
        bodyModel[33].setRotationPoint(-2.5F, 8F, 7F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 57 Fiber/Codeline Tube
        bodyModel[34].setRotationPoint(-3F, 8F, -9F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 58 Fiber/Codeline Tube
        bodyModel[35].setRotationPoint(-3.75F, 8F, -10F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59  fiber/codeline inlet box top
        bodyModel[36].setRotationPoint(-3.75F, 7.25F, -12F);

        bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 60 fiber/codeline inlet box
        bodyModel[37].setRotationPoint(-3.75F, 8.25F, -12F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 61 Fiber/Codeline Tube tall
        bodyModel[38].setRotationPoint(-3.75F, 9F, -12F);

        bodyModel[39].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 34 rod extendus
        bodyModel[39].setRotationPoint(-24F, 9F, 0F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 34 rod extendus
        bodyModel[40].setRotationPoint(-10F, 9F, 0F);

        bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 23 rod grippy
        bodyModel[41].setRotationPoint(-16.25F, 8.75F, -0.5F);

        bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 24 rod grippy
        bodyModel[42].setRotationPoint(-23.75F, 8.75F, -0.5F);
    }
}