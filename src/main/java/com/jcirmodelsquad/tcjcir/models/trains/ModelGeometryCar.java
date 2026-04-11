//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.05.2020 - 11:57:05
// Last changed on: 27.05.2020 - 11:57:05

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelGeometryCarBogie;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGeometryCar extends ModelConverter //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelGeometryCar() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[134];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);
        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
        bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
        bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
        bodyModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
        bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 70
        bodyModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 72
        bodyModel[7] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 76
        bodyModel[8] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 80
        bodyModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 163
        bodyModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 164
        bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 165
        bodyModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 166
        bodyModel[13] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 176
        bodyModel[14] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 193
        bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 194
        bodyModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 195
        bodyModel[17] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 197
        bodyModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 202
        bodyModel[19] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 203
        bodyModel[20] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 204
        bodyModel[21] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 102
        bodyModel[22] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 103
        bodyModel[23] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 99
        bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 99
        bodyModel[25] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 100
        bodyModel[26] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 99
        bodyModel[27] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 100
        bodyModel[28] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 101
        bodyModel[29] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 102
        bodyModel[30] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 103
        bodyModel[31] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 37 glow
        bodyModel[32] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 38
        bodyModel[33] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 39
        bodyModel[34] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 40
        bodyModel[35] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 41
        bodyModel[36] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 42
        bodyModel[37] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 43
        bodyModel[38] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 44
        bodyModel[39] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 45
        bodyModel[40] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 46
        bodyModel[41] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 47
        bodyModel[42] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 48
        bodyModel[43] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 49
        bodyModel[44] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 50
        bodyModel[45] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 51
        bodyModel[46] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 52
        bodyModel[47] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 53
        bodyModel[48] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 54
        bodyModel[49] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 55
        bodyModel[50] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 56
        bodyModel[51] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 57
        bodyModel[52] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 58
        bodyModel[53] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 59
        bodyModel[54] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 60
        bodyModel[55] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 61
        bodyModel[56] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 87
        bodyModel[57] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 63
        bodyModel[58] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 64
        bodyModel[59] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 65
        bodyModel[60] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 66
        bodyModel[61] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 67
        bodyModel[62] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 68
        bodyModel[63] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 69
        bodyModel[64] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 70
        bodyModel[65] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 71
        bodyModel[66] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 144
        bodyModel[67] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 145
        bodyModel[68] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 146
        bodyModel[69] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 147
        bodyModel[70] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 149
        bodyModel[71] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 150
        bodyModel[72] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 151
        bodyModel[73] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 224
        bodyModel[74] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 297
        bodyModel[75] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 298
        bodyModel[76] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 299
        bodyModel[77] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 300
        bodyModel[78] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 301
        bodyModel[79] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 302
        bodyModel[80] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 303
        bodyModel[81] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 304
        bodyModel[82] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 305
        bodyModel[83] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 306
        bodyModel[84] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 307
        bodyModel[85] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 308
        bodyModel[86] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 309
        bodyModel[87] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 310
        bodyModel[88] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 313
        bodyModel[89] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 314
        bodyModel[90] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 315
        bodyModel[91] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 316
        bodyModel[92] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 317
        bodyModel[93] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 318
        bodyModel[94] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 319
        bodyModel[95] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 320
        bodyModel[96] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 321
        bodyModel[97] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 322
        bodyModel[98] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 323
        bodyModel[99] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 324
        bodyModel[100] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 325
        bodyModel[101] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 326
        bodyModel[102] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 327
        bodyModel[103] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 328
        bodyModel[104] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 329
        bodyModel[105] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 330
        bodyModel[106] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 331
        bodyModel[107] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 332
        bodyModel[108] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 333
        bodyModel[109] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 334
        bodyModel[110] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 335
        bodyModel[111] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 336
        bodyModel[112] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 337
        bodyModel[113] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 338
        bodyModel[114] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 339
        bodyModel[115] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 340
        bodyModel[116] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 341
        bodyModel[117] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 342
        bodyModel[118] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 343
        bodyModel[119] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 344
        bodyModel[120] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 345
        bodyModel[121] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 346
        bodyModel[122] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 347
        bodyModel[123] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 348
        bodyModel[124] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 349
        bodyModel[125] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 350
        bodyModel[126] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 351
        bodyModel[127] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 352
        bodyModel[128] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 353
        bodyModel[129] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 354
        bodyModel[130] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 355
        bodyModel[131] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 356
        bodyModel[132] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 357
        bodyModel[133] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 358

        bodyModel[0].addBox(0F, 0F, 0F, 4, 22, 1, 0F); // Box 2
        bodyModel[0].setRotationPoint(55F, -22F, 10F);

        bodyModel[1].addBox(0F, 0F, 0F, 4, 22, 1, 0F); // Box 6
        bodyModel[1].setRotationPoint(55F, -22F, -11F);

        bodyModel[2].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 9
        bodyModel[2].setRotationPoint(-60F, -22F, -10F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 10
        bodyModel[3].setRotationPoint(48F, -22F, 10F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 11
        bodyModel[4].setRotationPoint(48F, -22F, -11F);

        bodyModel[5].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 70
        bodyModel[5].setRotationPoint(58F, -22F, -10F);

        bodyModel[6].addBox(0F, 0F, 0F, 119, 1, 22, 0F); // Box 72
        bodyModel[6].setRotationPoint(-60F, 0F, -11F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 43, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 76
        bodyModel[7].setRotationPoint(-27F, 1F, -11F);

        bodyModel[8].addBox(0F, 0F, 0F, 108, 22, 1, 0F); // Box 80
        bodyModel[8].setRotationPoint(-60F, -22F, 10F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        bodyModel[9].setRotationPoint(-46F, -10F, 2F);

        bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 164
        bodyModel[10].setRotationPoint(-45F, -10.2F, 3F);

        bodyModel[11].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 165
        bodyModel[11].setRotationPoint(-50F, -3F, 2F);

        bodyModel[12].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 166
        bodyModel[12].setRotationPoint(-49F, -1F, 2.5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
        bodyModel[13].setRotationPoint(-46F, -3F, 2F);

        bodyModel[14].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 193
        bodyModel[14].setRotationPoint(-61.5F, -20F, -5F);

        bodyModel[15].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 194
        bodyModel[15].setRotationPoint(-61.5F, -20F, 4F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 195
        bodyModel[16].setRotationPoint(-62F, -2F, -5F);

        bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 197
        bodyModel[17].setRotationPoint(-62F, -22F, -6F);

        bodyModel[18].addBox(0F, 0F, 0F, 11, 2, 3, 0F); // Box 202
        bodyModel[18].setRotationPoint(52F, 1F, -1.5F);

        bodyModel[19].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 203
        bodyModel[19].setRotationPoint(-64F, 1F, -1.5F);

        bodyModel[20].addBox(0F, 0F, 0F, 108, 22, 1, 0F); // Box 204
        bodyModel[20].setRotationPoint(-60F, -22F, -11F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 104, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        bodyModel[21].setRotationPoint(-59F, -18F, 6F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 104, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        bodyModel[22].setRotationPoint(-59F, -18F, -10F);

        bodyModel[23].addBox(0F, 0F, 0F, 119, 2, 16, 0F); // Box 99
        bodyModel[23].setRotationPoint(-60F, -24F, -8F);

        bodyModel[24].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 99
        bodyModel[24].setRotationPoint(-59F, 1F, -11F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 9, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 100
        bodyModel[25].setRotationPoint(43F, 1F, -11F);

        bodyModel[26].addBox(0F, 0F, 0F, 119, 2, 8, 0F); // Box 99
        bodyModel[26].setRotationPoint(-60F, -26F, -4F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 119, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        bodyModel[27].setRotationPoint(-60F, -26F, -8F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 119, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        bodyModel[28].setRotationPoint(-60F, -26F, 4F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 119, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        bodyModel[29].setRotationPoint(-60F, -24F, -11F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 119, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        bodyModel[30].setRotationPoint(-60F, -24F, 8F);

        bodyModel[31].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 37 glow
        bodyModel[31].setRotationPoint(-60.5F, -21F, 8F);

        bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 38
        bodyModel[32].setRotationPoint(-60.5F, -21F, -10F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 39
        bodyModel[33].setRotationPoint(-61F, -18F, 8.5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 40
        bodyModel[34].setRotationPoint(-61F, -16F, 8.5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 41
        bodyModel[35].setRotationPoint(-61F, -16F, 6F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 42
        bodyModel[36].setRotationPoint(-61F, -18F, 6F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 43
        bodyModel[37].setRotationPoint(-61F, -18F, -10.5F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 44
        bodyModel[38].setRotationPoint(-61F, -16F, -10.5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 45
        bodyModel[39].setRotationPoint(-61F, -16F, -8F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 46
        bodyModel[40].setRotationPoint(-61F, -18F, -8F);

        bodyModel[41].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 47
        bodyModel[41].setRotationPoint(-55F, 1F, -9F);

        bodyModel[42].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 48
        bodyModel[42].setRotationPoint(-58F, 5F, -11F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 49
        bodyModel[43].setRotationPoint(-58F, 2F, -8F);

        bodyModel[44].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 50
        bodyModel[44].setRotationPoint(-58F, 5F, 9F);

        bodyModel[45].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 51
        bodyModel[45].setRotationPoint(-61F, -9F, -10F);

        bodyModel[46].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 52
        bodyModel[46].setRotationPoint(-61F, -9F, 10F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
        bodyModel[47].setRotationPoint(-61F, -25F, -6F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 54
        bodyModel[48].setRotationPoint(-61F, -25F, 4F);

        bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 55
        bodyModel[49].setRotationPoint(-60.5F, -25F, -1F);

        bodyModel[50].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 56
        bodyModel[50].setRotationPoint(-59.5F, -27F, -1F);

        bodyModel[51].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 57
        bodyModel[51].setRotationPoint(-61F, 1F, -10F);

        bodyModel[52].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 58
        bodyModel[52].setRotationPoint(-61F, 1F, 6F);

        bodyModel[53].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 59
        bodyModel[53].setRotationPoint(-57.5F, 2.5F, -10F);

        bodyModel[54].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 60
        bodyModel[54].setRotationPoint(-59F, 2F, -7F);
        bodyModel[54].rotateAngleZ = -0.55850536F;

        bodyModel[55].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 61
        bodyModel[55].setRotationPoint(-59F, 2F, 5F);
        bodyModel[55].rotateAngleZ = -0.55850536F;

        bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 23, 0F); // Box 87
        bodyModel[56].setRotationPoint(-41F, 0.5F, -11.5F);

        bodyModel[57].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 63
        bodyModel[57].setRotationPoint(-49.55F, -5F, 1.5F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 64
        bodyModel[58].setRotationPoint(-46F, -3F, -10F);

        bodyModel[59].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 65
        bodyModel[59].setRotationPoint(-49.55F, -5F, -2.5F);

        bodyModel[60].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 66
        bodyModel[60].setRotationPoint(-50F, -3F, -10F);

        bodyModel[61].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 67
        bodyModel[61].setRotationPoint(-49F, -1F, -9.5F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        bodyModel[62].setRotationPoint(-46F, -10F, -10F);

        bodyModel[63].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 69
        bodyModel[63].setRotationPoint(-45F, -10.2F, -9F);

        bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 70
        bodyModel[64].setRotationPoint(-56F, -5F, -10F);

        bodyModel[65].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 71
        bodyModel[65].setRotationPoint(-56F, -5F, 2F);

        bodyModel[66].addBox(0F, 0F, 0F, 5, 4, 22, 0F); // Box 144
        bodyModel[66].setRotationPoint(-26F, 1F, -11F);

        bodyModel[67].addBox(0F, 0F, 0F, 5, 2, 20, 0F); // Box 145
        bodyModel[67].setRotationPoint(-20F, 1F, -10F);

        bodyModel[68].addBox(0F, 0F, 0F, 5, 3, 20, 0F); // Box 146
        bodyModel[68].setRotationPoint(-14F, 1F, -10F);

        bodyModel[69].addBox(0F, 0F, 0F, 7, 4, 22, 0F); // Box 147
        bodyModel[69].setRotationPoint(-8F, 1F, -11F);

        bodyModel[70].addBox(0F, 0F, 0F, 5, 3, 20, 0F); // Box 149
        bodyModel[70].setRotationPoint(12F, 1F, -10F);

        bodyModel[71].addBox(0F, 0F, 0F, 5, 2, 20, 0F); // Box 150
        bodyModel[71].setRotationPoint(6F, 1F, -10F);

        bodyModel[72].addBox(0F, 0F, 0F, 5, 4, 22, 0F); // Box 151
        bodyModel[72].setRotationPoint(0F, 1F, -11F);

        bodyModel[73].addBox(0F, 0F, 0F, 2, 1, 23, 0F); // Box 224
        bodyModel[73].setRotationPoint(30F, 0.5F, -11.5F);

        bodyModel[74].addBox(0F, 0F, 0F, 7, 5, 0, 0F); // Box 297
        bodyModel[74].setRotationPoint(48F, 1F, -11F);

        bodyModel[75].addBox(0F, 0F, 0F, 7, 5, 0, 0F); // Box 298
        bodyModel[75].setRotationPoint(48F, 1F, 11F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,1.5F, -0.2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
        bodyModel[76].setRotationPoint(-41F, -10F, -10F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 300
        bodyModel[77].setRotationPoint(-41F, -3F, -10F);

        bodyModel[78].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 301
        bodyModel[78].setRotationPoint(-40F, -3F, -10F);

        bodyModel[79].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 302
        bodyModel[79].setRotationPoint(-39F, -1F, -9.5F);

        bodyModel[80].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 303
        bodyModel[80].setRotationPoint(-40.55F, -5F, -2.5F);

        bodyModel[81].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 304
        bodyModel[81].setRotationPoint(-42F, -10.2F, -9F);

        bodyModel[82].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 305
        bodyModel[82].setRotationPoint(-40.55F, -5F, 1.5F);

        bodyModel[83].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 306
        bodyModel[83].setRotationPoint(-40F, -3F, 2F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,1.5F, -0.2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
        bodyModel[84].setRotationPoint(-41F, -10F, 2F);

        bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 308
        bodyModel[85].setRotationPoint(-42F, -10.2F, 3F);

        bodyModel[86].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 309
        bodyModel[86].setRotationPoint(-39F, -1F, 2.5F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 310
        bodyModel[87].setRotationPoint(-41F, -3F, 2F);

        bodyModel[88].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 313
        bodyModel[88].setRotationPoint(45F, -22F, -10F);

        bodyModel[89].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 314
        bodyModel[89].setRotationPoint(58.5F, -20F, -5F);

        bodyModel[90].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 315
        bodyModel[90].setRotationPoint(59F, -22F, -6F);

        bodyModel[91].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 316
        bodyModel[91].setRotationPoint(58.5F, -20F, 4F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 317
        bodyModel[92].setRotationPoint(59F, -2F, -5F);

        bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 318
        bodyModel[93].setRotationPoint(-34F, -5F, -10F);

        bodyModel[94].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 319
        bodyModel[94].setRotationPoint(-34F, -5F, 2F);

        bodyModel[95].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 320
        bodyModel[95].setRotationPoint(-28F, -3F, 2F);

        bodyModel[96].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 321
        bodyModel[96].setRotationPoint(-27.55F, -5F, 1.5F);

        bodyModel[97].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 322
        bodyModel[97].setRotationPoint(-27.55F, -5F, -2.5F);

        bodyModel[98].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 323
        bodyModel[98].setRotationPoint(-28F, -3F, -10F);

        bodyModel[99].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 324
        bodyModel[99].setRotationPoint(-27F, -1F, 2.5F);

        bodyModel[100].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 325
        bodyModel[100].setRotationPoint(-27F, -1F, -9.5F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 326
        bodyModel[101].setRotationPoint(-24F, -3F, -10F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
        bodyModel[102].setRotationPoint(-24F, -3F, 2F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        bodyModel[103].setRotationPoint(-24F, -10F, 2F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
        bodyModel[104].setRotationPoint(-24F, -10F, -10F);

        bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 330
        bodyModel[105].setRotationPoint(-23F, -10.2F, -9F);

        bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 331
        bodyModel[106].setRotationPoint(-23F, -10.2F, 3F);

        bodyModel[107].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 332
        bodyModel[107].setRotationPoint(-12F, -5F, -10F);

        bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 333
        bodyModel[108].setRotationPoint(-12F, -5F, 2F);

        bodyModel[109].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 334
        bodyModel[109].setRotationPoint(-6F, -3F, 2F);

        bodyModel[110].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 335
        bodyModel[110].setRotationPoint(-5.55F, -5F, 1.5F);

        bodyModel[111].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 336
        bodyModel[111].setRotationPoint(-5.55F, -5F, -2.5F);

        bodyModel[112].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 337
        bodyModel[112].setRotationPoint(-6F, -3F, -10F);

        bodyModel[113].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 338
        bodyModel[113].setRotationPoint(-5F, -1F, 2.5F);

        bodyModel[114].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 339
        bodyModel[114].setRotationPoint(-5F, -1F, -9.5F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 340
        bodyModel[115].setRotationPoint(-2F, -3F, -10F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 341
        bodyModel[116].setRotationPoint(-2F, -3F, 2F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
        bodyModel[117].setRotationPoint(-2F, -10F, 2F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
        bodyModel[118].setRotationPoint(-2F, -10F, -10F);

        bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 344
        bodyModel[119].setRotationPoint(-1F, -10.2F, -9F);

        bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 345
        bodyModel[120].setRotationPoint(-1F, -10.2F, 3F);

        bodyModel[121].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 346
        bodyModel[121].setRotationPoint(-18F, -3F, -10F);

        bodyModel[122].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 347
        bodyModel[122].setRotationPoint(-18.55F, -5F, -2.5F);

        bodyModel[123].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 348
        bodyModel[123].setRotationPoint(-18.55F, -5F, 1.5F);

        bodyModel[124].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 349
        bodyModel[124].setRotationPoint(-18F, -3F, 2F);

        bodyModel[125].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 350
        bodyModel[125].setRotationPoint(-17F, -1F, -9.5F);

        bodyModel[126].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 351
        bodyModel[126].setRotationPoint(-17F, -1F, 2.5F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 352
        bodyModel[127].setRotationPoint(-19F, -3F, 2F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,1.5F, -0.2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
        bodyModel[128].setRotationPoint(-19F, -10F, 2F);

        bodyModel[129].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 354
        bodyModel[129].setRotationPoint(-20F, -10.2F, 3F);

        bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 355
        bodyModel[130].setRotationPoint(-20F, -10.2F, -9F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,1.5F, -0.2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
        bodyModel[131].setRotationPoint(-19F, -10F, -10F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 357
        bodyModel[132].setRotationPoint(-19F, -3F, -10F);

        bodyModel[133].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 358
        bodyModel[133].setRotationPoint(2F, -22F, -10F);
    }
    private ModelGeometryCarBogie theTrucks = new ModelGeometryCarBogie();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 133; i++) {
            if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bodyModel[i].render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            } else {
                bodyModel[i].render(f5);
            }
        }
        if(!(GetColor(entity)==8)){
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/nxtrack_bogie_Grey.png"));
        } else {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/nxtrack_bogie_Black.png"));
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(-2.5F ,0.1F,0F);
        //GL11.glScalef(0.9f,0.9f,0.8f);
        theTrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslated(1.67F,0.1F,0);
        theTrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }
}