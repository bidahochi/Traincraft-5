//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.10.2020 - 15:34:54
// Last changed on: 21.10.2020 - 15:34:54

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergB;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.enums.BoxName;
import train.common.library.Info;

public class ModelMP15DCW9 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelMP15DCW9() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[192];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);
		//rotateAll(180F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 53
		bodyModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 146
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 246
		bodyModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 143
		bodyModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 62
		bodyModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 61
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 63
		bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 197
		bodyModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 144
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 226
		bodyModel[13] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 227
		bodyModel[14] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 45
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 46
		bodyModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 47
		bodyModel[18] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 48
		bodyModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 49
		bodyModel[20] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 50
		bodyModel[21] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 55
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 56
		bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 57
		bodyModel[24] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 58
		bodyModel[25] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 59
		bodyModel[26] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 60
		bodyModel[27] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 61
		bodyModel[28] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 62
		bodyModel[29] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 202
		bodyModel[30] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 204
		bodyModel[31] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 301
		bodyModel[32] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 66
		bodyModel[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 67
		bodyModel[34] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 68
		bodyModel[35] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 5
		bodyModel[36] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 19
		bodyModel[37] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 20
		bodyModel[38] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 138
		bodyModel[39] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 241
		bodyModel[40] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 242
		bodyModel[41] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 243
		bodyModel[42] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 244
		bodyModel[43] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 245
		bodyModel[44] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 246
		bodyModel[45] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 247
		bodyModel[46] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 248
		bodyModel[47] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 249
		bodyModel[48] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 250
		bodyModel[49] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 251
		bodyModel[50] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 252
		bodyModel[51] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 253
		bodyModel[52] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 254
		bodyModel[53] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 255
		bodyModel[54] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 256
		bodyModel[55] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 257
		bodyModel[56] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 258
		bodyModel[57] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 259
		bodyModel[58] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 260
		bodyModel[59] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 261
		bodyModel[60] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 262
		bodyModel[61] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 281
		bodyModel[62] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 293
		bodyModel[63] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 294
		bodyModel[64] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 295
		bodyModel[65] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 298
		bodyModel[66] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 299
		bodyModel[67] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 304
		bodyModel[68] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 305
		bodyModel[69] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 315
		bodyModel[70] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 316
		bodyModel[71] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 318
		bodyModel[72] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 319
		bodyModel[73] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 320
		bodyModel[74] = new ModelRendererTurbo(this, 433, 17, textureX, textureY, "lamp"); // Box 385 headlight rear
		bodyModel[75] = new ModelRendererTurbo(this, 441, 17, textureX, textureY, "lamp"); // Box 386 headlight rear
		bodyModel[76] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 387
		bodyModel[77] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 330
		bodyModel[78] = new ModelRendererTurbo(this, 449, 17, textureX, textureY, "lamp"); // Box 332 lamp
		bodyModel[79] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 335
		bodyModel[80] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 338
		bodyModel[81] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 339
		bodyModel[82] = new ModelRendererTurbo(this, 41, 9, textureX, textureY, "lamp"); // Box 341 liveryimg 2 glow
		bodyModel[83] = new ModelRendererTurbo(this, 65, 9, textureX, textureY, "lamp"); // Box 342 liveryimg 2 glow
		bodyModel[84] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 33
		bodyModel[85] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 89
		bodyModel[86] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 399
		bodyModel[87] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 287
		bodyModel[88] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 288
		bodyModel[89] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 289
		bodyModel[90] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 290
		bodyModel[91] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 78
		bodyModel[92] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 188
		bodyModel[93] = new ModelRendererTurbo(this, 449, 25, textureX, textureY, BoxName.ditch); // Box 189 ditchlight rear
		bodyModel[94] = new ModelRendererTurbo(this, 9, 33, textureX, textureY, BoxName.ditch); // Box 190 ditchlight rear
		bodyModel[95] = new ModelRendererTurbo(this, 25, 33, textureX, textureY, BoxName.ditch); // Box 182 ditchlight front
		bodyModel[96] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 183
		bodyModel[97] = new ModelRendererTurbo(this, 129, 33, textureX, textureY, BoxName.ditch); // Box 186 ditchlight front
		bodyModel[98] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 187
		bodyModel[99] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 195
		bodyModel[100] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 196
		bodyModel[101] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 197
		bodyModel[102] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 198
		bodyModel[103] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 199
		bodyModel[104] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 200
		bodyModel[105] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 201
		bodyModel[106] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 202
		bodyModel[107] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 203
		bodyModel[108] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 204
		bodyModel[109] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 205
		bodyModel[110] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 206
		bodyModel[111] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 207
		bodyModel[112] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 208
		bodyModel[113] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 209
		bodyModel[114] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 210
		bodyModel[115] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 367
		bodyModel[116] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 368
		bodyModel[117] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 335
		bodyModel[118] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 336
		bodyModel[119] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 338
		bodyModel[120] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 339
		bodyModel[121] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 86
		bodyModel[122] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 87
		bodyModel[123] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 375
		bodyModel[124] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 376
		bodyModel[125] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 377
		bodyModel[126] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 383
		bodyModel[127] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 364
		bodyModel[128] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 365
		bodyModel[129] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 366
		bodyModel[130] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 426
		bodyModel[131] = new ModelRendererTurbo(this, 409, 25, textureX, textureY, BoxName.commander); // Box 427 commander beacon
		bodyModel[132] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 19
		bodyModel[133] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 334
		bodyModel[134] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 462
		bodyModel[135] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 463
		bodyModel[136] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 299
		bodyModel[137] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 303
		bodyModel[138] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 306
		bodyModel[139] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 309
		bodyModel[140] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 94
		bodyModel[141] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 100
		bodyModel[142] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 112
		bodyModel[143] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 123
		bodyModel[144] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 120
		bodyModel[145] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 1
		bodyModel[146] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 99
		bodyModel[147] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 135
		bodyModel[148] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 190
		bodyModel[149] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 123
		bodyModel[150] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 153
		bodyModel[151] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 154
		bodyModel[152] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 119
		bodyModel[153] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 120
		bodyModel[154] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 121
		bodyModel[155] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 122
		bodyModel[156] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 127
		bodyModel[157] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 137
		bodyModel[158] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 69
		bodyModel[159] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 19
		bodyModel[160] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 20
		bodyModel[161] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 21
		bodyModel[162] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 22
		bodyModel[163] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 24
		bodyModel[164] = new ModelRendererTurbo(this, 457, 57, textureX, textureY, "lamp"); // Box 154 headlight front
		bodyModel[165] = new ModelRendererTurbo(this, 49, 65, textureX, textureY, "lamp"); // Box 155 headlight front
		bodyModel[166] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 177
		bodyModel[167] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 229
		bodyModel[168] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 230
		bodyModel[169] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 314 door swing right
		bodyModel[170] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 210
		bodyModel[171] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 211
		bodyModel[172] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 150
		bodyModel[173] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 152
		bodyModel[174] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 223
		bodyModel[175] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 355
		bodyModel[176] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 356
		bodyModel[177] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 357
		bodyModel[178] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 4
		bodyModel[179] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 4
		bodyModel[180] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 4
		bodyModel[181] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 4
		bodyModel[182] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 446
		bodyModel[183] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 447
		bodyModel[184] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 448
		bodyModel[185] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 449
		bodyModel[186] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 216
		bodyModel[187] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 217
		bodyModel[188] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 370
		bodyModel[189] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 131
		bodyModel[190] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 236
		bodyModel[191] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 86

		bodyModel[0].addBox(0F, 0F, 0F, 57, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-28.5F, -3F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 52
		bodyModel[1].setRotationPoint(-35.5F, 0F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
		bodyModel[2].setRotationPoint(33.5F, 0F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(-33.5F, -0.5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[4].setRotationPoint(32.5F, -0.5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 5, 20, 0F); // Box 246
		bodyModel[5].setRotationPoint(-32.51F, -1F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[6].setRotationPoint(-32.52F, -11F, -8F);
		bodyModel[6].rotateAngleY = -3.14159265F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[7].setRotationPoint(-32.52F, -11F, 8F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[8].setRotationPoint(-32.51F, -5F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[9].setRotationPoint(-32.51F, -5F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 65, 3, 14, 0F); // Box 197
		bodyModel[10].setRotationPoint(-32.5F, -3F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 10, 16, 0F); // Box 144
		bodyModel[11].setRotationPoint(-32.51F, -11F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[12].setRotationPoint(-32.51F, 5F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[13].setRotationPoint(-32.51F, 4F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 57, 1, 4, 0F); // Box 40
		bodyModel[14].setRotationPoint(-28.5F, -3F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 45
		bodyModel[15].setRotationPoint(28.5F, -2F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[16].setRotationPoint(28.5F, -3F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 47
		bodyModel[17].setRotationPoint(28.5F, 2F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 48
		bodyModel[18].setRotationPoint(28.5F, 5F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[19].setRotationPoint(29.5F, 0F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[20].setRotationPoint(29.5F, -2F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 5, 20, 0F); // Box 55
		bodyModel[21].setRotationPoint(32.51F, -1F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 56
		bodyModel[22].setRotationPoint(32.51F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 57
		bodyModel[23].setRotationPoint(32.51F, 5F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 10, 16, 0F); // Box 58
		bodyModel[24].setRotationPoint(32.51F, -11F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 59
		bodyModel[25].setRotationPoint(32.51F, -5F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[26].setRotationPoint(32.5F, -11F, 8F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[27].setRotationPoint(32.51F, -5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[28].setRotationPoint(32.5F, -11F, -8F);
		bodyModel[28].rotateAngleY = -3.14159265F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[29].setRotationPoint(32.5F, -3F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[30].setRotationPoint(32.5F, -3F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[31].setRotationPoint(32.5F, -3F, 4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[32].setRotationPoint(-33.5F, -3F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 67
		bodyModel[33].setRotationPoint(-33.5F, -3F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 68
		bodyModel[34].setRotationPoint(-33.5F, -3F, -5F);

		bodyModel[35].addBox(0F, 0F, 0F, 32, 15, 14, 0F); // Box 5
		bodyModel[35].setRotationPoint(-25.5F, -18F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 35, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[36].setRotationPoint(-28.5F, -20F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 35, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[37].setRotationPoint(-28.5F, -20F, 1F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 138
		bodyModel[38].setRotationPoint(-29.5F, -16F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 241
		bodyModel[39].setRotationPoint(28.5F, 0F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 242
		bodyModel[40].setRotationPoint(28.5F, 2F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[41].setRotationPoint(28.5F, 5F, 9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 244
		bodyModel[42].setRotationPoint(29.5F, 0F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 245
		bodyModel[43].setRotationPoint(29.5F, -2F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[44].setRotationPoint(28.5F, -3F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[45].setRotationPoint(28.5F, -2F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[46].setRotationPoint(28.5F, 0F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[47].setRotationPoint(-32.5F, 0F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[48].setRotationPoint(-32.5F, -2F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[49].setRotationPoint(-29.5F, -3F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[50].setRotationPoint(-29.5F, -2F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 253
		bodyModel[51].setRotationPoint(-29.5F, 0F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[52].setRotationPoint(-32.5F, 2F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[53].setRotationPoint(-32.5F, 5F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[54].setRotationPoint(-32.5F, 5F, 9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[55].setRotationPoint(-32.5F, 2F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[56].setRotationPoint(-32.5F, 0F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[57].setRotationPoint(-32.5F, -2F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
		bodyModel[58].setRotationPoint(-29.5F, -3F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 261
		bodyModel[59].setRotationPoint(-29.5F, -2F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[60].setRotationPoint(-29.5F, 0F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[61].setRotationPoint(-28.5F, -20F, -1F);

		bodyModel[62].addBox(0F, 0F, 0F, 35, 1, 12, 0F); // Box 293
		bodyModel[62].setRotationPoint(-28.5F, -19F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[63].setRotationPoint(-28.5F, -19F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[64].setRotationPoint(-28.5F, -19F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[65].setRotationPoint(-29.5F, -19F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[66].setRotationPoint(-29.5F, -19F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[67].setRotationPoint(-30.5F, -17.01F, -6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 305
		bodyModel[68].setRotationPoint(-30.5F, -17.01F, 1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[69].setRotationPoint(-30.5F, -20F, -1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[70].setRotationPoint(-29.5F, -20F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[71].setRotationPoint(-29.5F, -20F, 1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[72].setRotationPoint(-30.5F, -20F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 320
		bodyModel[73].setRotationPoint(-30.5F, -20F, 1F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight rear
		bodyModel[74].setRotationPoint(-31F, -19.25F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight rear
		bodyModel[75].setRotationPoint(-31F, -19.25F, -2F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 387
		bodyModel[76].setRotationPoint(-30.75F, -19.25F, -2F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 330
		bodyModel[77].setRotationPoint(-29.5F, -19F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 332 lamp
		bodyModel[78].setRotationPoint(-30F, -19.25F, -3.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 335
		bodyModel[79].setRotationPoint(-29.5F, -19F, 1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[80].setRotationPoint(-29.5F, -20F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[81].setRotationPoint(-29.5F, -20F, 1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341 liveryimg 2 glow
		bodyModel[82].setRotationPoint(-29.6F, -19F, -5.5F);
		bodyModel[82].rotateAngleY = 0.20943951F;

		bodyModel[83].addShapeBox(0F, 0F, -3F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 342 liveryimg 2 glow
		bodyModel[83].setRotationPoint(-29.6F, -19F, 5.5F);
		bodyModel[83].rotateAngleY = -0.20943951F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 33
		bodyModel[84].setRotationPoint(-3.5F, -25F, -1F);

		bodyModel[85].addBox(0F, 0F, 0F, 12, 5, 16, 0F); // Box 89
		bodyModel[85].setRotationPoint(-6F, 0F, -8F);

		bodyModel[86].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 399
		bodyModel[86].setRotationPoint(-29.5F, -11F, 11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[87].setRotationPoint(-29.5F, -9F, -11.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 12, 3, 0F); // Box 288
		bodyModel[88].setRotationPoint(-29.5F, -11F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[89].setRotationPoint(-29.5F, -9F, 10.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 12, 3, 0F); // Box 290
		bodyModel[90].setRotationPoint(-29.5F, -11F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[91].setRotationPoint(-32.5F, -5F, 4.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[92].setRotationPoint(-32.5F, -5F, -6.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight rear
		bodyModel[93].setRotationPoint(-32.75F, -5F, 4.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight rear
		bodyModel[94].setRotationPoint(-32.75F, -5F, -6.75F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 182 ditchlight front
		bodyModel[95].setRotationPoint(31.75F, -5F, -6.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 183
		bodyModel[96].setRotationPoint(31.5F, -5F, -6.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 186 ditchlight front
		bodyModel[97].setRotationPoint(31.75F, -5F, 4.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 187
		bodyModel[98].setRotationPoint(31.5F, -5F, 4.75F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 195
		bodyModel[99].setRotationPoint(-28.5F, -18F, -7F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 196
		bodyModel[100].setRotationPoint(-27.5F, -18F, -7F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 10, 14, 0F); // Box 197
		bodyModel[101].setRotationPoint(-27.5F, -13F, -7F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 198
		bodyModel[102].setRotationPoint(-27.5F, -16F, -5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[103].setRotationPoint(-27.5F, -14F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[104].setRotationPoint(-27.5F, -14F, 5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 201
		bodyModel[105].setRotationPoint(-27F, -14F, -6.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 202
		bodyModel[106].setRotationPoint(-27F, -14F, 5.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[107].setRotationPoint(-32.5F, 4F, 9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[108].setRotationPoint(-32.5F, 1F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[109].setRotationPoint(-32.5F, 1F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[110].setRotationPoint(-32.5F, 4F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 207
		bodyModel[111].setRotationPoint(29.5F, 4F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 208
		bodyModel[112].setRotationPoint(29.5F, 1F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 209
		bodyModel[113].setRotationPoint(29.5F, 1F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 210
		bodyModel[114].setRotationPoint(29.5F, 4F, 9F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 367
		bodyModel[115].setRotationPoint(-20.5F, 0F, -2F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 368
		bodyModel[116].setRotationPoint(15.5F, 0F, -2F);

		bodyModel[117].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Box 335
		bodyModel[117].setRotationPoint(-6F, 0F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[118].setRotationPoint(-6F, 3F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 338
		bodyModel[119].setRotationPoint(-6F, 3F, 8F);

		bodyModel[120].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Box 339
		bodyModel[120].setRotationPoint(-6F, 0F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[121].setRotationPoint(-11.5F, -2F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[122].setRotationPoint(-11.5F, -1F, 9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyModel[123].setRotationPoint(-11.5F, -1F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[124].setRotationPoint(-11.5F, -2F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 377
		bodyModel[125].setRotationPoint(-29.5F, -11F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 383
		bodyModel[126].setRotationPoint(-15.5F, -25F, -1F);

		bodyModel[127].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[127].setRotationPoint(8F, -28F, 2.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[128].setRotationPoint(14F, -28F, 2.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 366
		bodyModel[129].setRotationPoint(14F, -27F, 2.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 426
		bodyModel[130].setRotationPoint(16.18F, -27F, 5.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 427 commander beacon
		bodyModel[131].setRotationPoint(16F, -28F, 5.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[132].setRotationPoint(-5F, -1F, -11.5F);
		bodyModel[132].rotateAngleX = 0.87266463F;

		bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[133].setRotationPoint(-5F, 0.5F, 8.75F);
		bodyModel[133].rotateAngleX = 0.87266463F;

		bodyModel[134].addBox(0F, 0F, 0F, 2, 1, 23, 0F); // Box 462
		bodyModel[134].setRotationPoint(-19.5F, -2F, -11.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 23, 0F); // Box 463
		bodyModel[135].setRotationPoint(16.5F, -2F, -11.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 299
		bodyModel[136].setRotationPoint(29F, -5F, 10F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 303
		bodyModel[137].setRotationPoint(29F, -5F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[138].setRotationPoint(29F, -11F, 8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 309
		bodyModel[139].setRotationPoint(29F, -11F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 94
		bodyModel[140].setRotationPoint(19.5F, -19F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 15, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[141].setRotationPoint(6.5F, -23F, -7F);

		bodyModel[142].addShapeBox(3F, 0F, 0F, 12, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[142].setRotationPoint(4.5F, -18F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,4.5F, 0F, 0F, -4.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[143].setRotationPoint(21.5F, -23F, -11F);

		bodyModel[144].addBox(3F, 0F, 0F, 9, 5, 1, 0F); // Box 120
		bodyModel[144].setRotationPoint(4.5F, -23F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[145].setRotationPoint(27.5F, -16F, -11F);

		bodyModel[146].addShapeBox(3F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[146].setRotationPoint(13.5F, -19F, 10F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 135
		bodyModel[147].setRotationPoint(16.5F, -19F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[148].setRotationPoint(16.5F, -23F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 123
		bodyModel[149].setRotationPoint(21.5F, -23F, 0F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,0F, 0F, -10F, 3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[150].setRotationPoint(19.5F, -19F, 1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -10F); // Box 154
		bodyModel[151].setRotationPoint(19.5F, -19F, -11F);

		bodyModel[152].addBox(3F, 0F, 0F, 9, 5, 1, 0F); // Box 119
		bodyModel[152].setRotationPoint(4.5F, -23F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[153].setRotationPoint(27.5F, -16F, 1F);

		bodyModel[154].addShapeBox(3F, 0F, 0F, 12, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[154].setRotationPoint(4.5F, -18F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[155].setRotationPoint(19.5F, -18F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[156].setRotationPoint(16.5F, -23F, 10F);

		bodyModel[157].addBox(0F, 0F, 0F, 13, 5, 22, 0F); // Box 137
		bodyModel[157].setRotationPoint(6.5F, -8F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,-0.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 69
		bodyModel[158].setRotationPoint(29.75F, -17F, 1F);
		bodyModel[158].rotateAngleY = 0.29670597F;

		bodyModel[159].addBox(0F, 0F, 0F, 11, 3, 14, 0F); // Box 19
		bodyModel[159].setRotationPoint(6.5F, -26F, -7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[160].setRotationPoint(6.5F, -26F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[161].setRotationPoint(6.5F, -26F, 7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2.5F, 0F, 4F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[162].setRotationPoint(17.5F, -26F, -7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 4F, 0F, 0F, 4F); // Box 24
		bodyModel[163].setRotationPoint(17.5F, -26F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 154 headlight front
		bodyModel[164].setRotationPoint(29.25F, -18F, -1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 155 headlight front
		bodyModel[165].setRotationPoint(29.25F, -16F, -1F);

		bodyModel[166].addBox(0F, 0F, 0F, 11, 11, 2, 0F); // Box 177
		bodyModel[166].setRotationPoint(19.5F, -14F, -1F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 229
		bodyModel[167].setRotationPoint(24.5F, -19F, -8F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 230
		bodyModel[168].setRotationPoint(24.5F, -19F, 7F);

		bodyModel[169].addBox(-0.5F, 0F, -0.5F, 1, 15, 4, 0F); // Box 314 door swing right
		bodyModel[169].setRotationPoint(7F, -23F, -10.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 8, 13, 10, 0F); // Box 210
		bodyModel[170].setRotationPoint(19.5F, -16F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 8, 13, 10, 0F); // Box 211
		bodyModel[171].setRotationPoint(19.5F, -16F, 1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,0F, 0F, 0F, -8F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F); // Box 150
		bodyModel[172].setRotationPoint(19.5F, -19F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,-2F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[173].setRotationPoint(19.5F, -19F, 1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[174].setRotationPoint(8F, -27F, -4F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[175].setRotationPoint(15F, -27.5F, -4.75F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[176].setRotationPoint(15.5F, -27.5F, -6.25F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[177].setRotationPoint(15.5F, -27F, -5.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[178].setRotationPoint(32.5F, 3F, 0F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[179].setRotationPoint(32.5F, 5F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[180].setRotationPoint(32.5F, 3F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[181].setRotationPoint(32.5F, 5F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 446
		bodyModel[182].setRotationPoint(33F, 1F, -10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[183].setRotationPoint(32.5F, 1F, 2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[184].setRotationPoint(32.5F, 2F, 2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 449
		bodyModel[185].setRotationPoint(32.5F, 2F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[186].setRotationPoint(19.5F, -19F, 1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[187].setRotationPoint(19.5F, -19F, -8F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 11, 20, 0F); // Box 370
		bodyModel[188].setRotationPoint(18.5F, -19F, -10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[189].setRotationPoint(16.5F, -19F, -6F);

		bodyModel[190].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 236
		bodyModel[190].setRotationPoint(14.5F, -17F, -7F);

		bodyModel[191].addBox(-7F, 0F, -3F, 7, 10, 3, 0F); // Box 86
		bodyModel[191].setRotationPoint(19.4F, -18F, 7F);
		bodyModel[191].rotateAngleY = -0.38397244F;
	}
	ModelFlexicoil2 theTrucks1 = new ModelFlexicoil2();
	ModelBlombergB theTrucks2 = new ModelBlombergB();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 1345344) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeasmol_Green.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, 0.05, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (GetColor(entity) == 123454 || GetColor(entity) == 4) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.13, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.1, -0.19, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.23, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}

	public ModelRendererTurbo MP15DCW9Model[];
}