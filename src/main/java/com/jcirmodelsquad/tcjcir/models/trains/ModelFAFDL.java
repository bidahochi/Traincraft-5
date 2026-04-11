//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FAFDL
// Model Creator: Binky, Dominik, & Bida
// Created on: 02.06.2022 - 22:57:18
// Last changed on: 02.06.2022 - 22:57:18

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelFAFDL extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelFAFDL() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[459];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 425, 140, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 439, 134, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 127, 140, textureX, textureY); // Box 120
		bodyModel[3] = new ModelRendererTurbo(this, 105, 134, textureX, textureY); // Box 121
		bodyModel[4] = new ModelRendererTurbo(this, 125, 34, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 436, 128, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 422, 128, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 138, 128, textureX, textureY); // Box 79
		bodyModel[9] = new ModelRendererTurbo(this, 119, 125, textureX, textureY); // Box 122
		bodyModel[10] = new ModelRendererTurbo(this, 110, 125, textureX, textureY); // Box 122
		bodyModel[11] = new ModelRendererTurbo(this, 438, 122, textureX, textureY); // Box 193
		bodyModel[12] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 195
		bodyModel[13] = new ModelRendererTurbo(this, 439, 125, textureX, textureY); // Box 197
		bodyModel[14] = new ModelRendererTurbo(this, 304, 53, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 86, 134, textureX, textureY); // Box 121
		bodyModel[16] = new ModelRendererTurbo(this, 458, 134, textureX, textureY); // Box 216
		bodyModel[17] = new ModelRendererTurbo(this, 287, 55, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 76, 87, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 1, 82, textureX, textureY); // Box 219
		bodyModel[20] = new ModelRendererTurbo(this, 35, 137, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 10, 82, textureX, textureY); // Box 224
		bodyModel[22] = new ModelRendererTurbo(this, 24, 104, textureX, textureY); // Box 0 schnoz front
		bodyModel[23] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 315
		bodyModel[24] = new ModelRendererTurbo(this, 63, 106, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 77, 102, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[26] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 1
		bodyModel[27] = new ModelRendererTurbo(this, 34, 128, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 65, 118, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 10, 106, textureX, textureY); // Box 324
		bodyModel[30] = new ModelRendererTurbo(this, 2, 97, textureX, textureY, "cull"); // Box 325 cull
		bodyModel[31] = new ModelRendererTurbo(this, 12, 118, textureX, textureY); // Box 327
		bodyModel[32] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // Box 335
		bodyModel[33] = new ModelRendererTurbo(this, 104, 6, textureX, textureY); // Box 337
		bodyModel[34] = new ModelRendererTurbo(this, 15, 33, textureX, textureY); // Box 338
		bodyModel[35] = new ModelRendererTurbo(this, 47, 33, textureX, textureY); // Box 339
		bodyModel[36] = new ModelRendererTurbo(this, 75, 22, textureX, textureY); // Box 343
		bodyModel[37] = new ModelRendererTurbo(this, 75, 2, textureX, textureY); // Box 344
		bodyModel[38] = new ModelRendererTurbo(this, 108, 18, textureX, textureY); // Box 346
		bodyModel[39] = new ModelRendererTurbo(this, 108, 14, textureX, textureY); // Box 347
		bodyModel[40] = new ModelRendererTurbo(this, 88, 4, textureX, textureY); // Box 342
		bodyModel[41] = new ModelRendererTurbo(this, 124, 4, textureX, textureY); // Box 344
		bodyModel[42] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 345
		bodyModel[43] = new ModelRendererTurbo(this, 108, 22, textureX, textureY); // Box 346
		bodyModel[44] = new ModelRendererTurbo(this, 103, 26, textureX, textureY); // Box 347
		bodyModel[45] = new ModelRendererTurbo(this, 88, 24, textureX, textureY); // Box 348
		bodyModel[46] = new ModelRendererTurbo(this, 119, 22, textureX, textureY); // Box 349
		bodyModel[47] = new ModelRendererTurbo(this, 124, 30, textureX, textureY); // Box 350
		bodyModel[48] = new ModelRendererTurbo(this, 97, 34, textureX, textureY); // Box 351
		bodyModel[49] = new ModelRendererTurbo(this, 43, 60, textureX, textureY); // Box 354
		bodyModel[50] = new ModelRendererTurbo(this, 47, 50, textureX, textureY); // Box 355
		bodyModel[51] = new ModelRendererTurbo(this, 44, 86, textureX, textureY); // Box 361
		bodyModel[52] = new ModelRendererTurbo(this, 15, 50, textureX, textureY); // Box 364
		bodyModel[53] = new ModelRendererTurbo(this, 11, 60, textureX, textureY); // Box 370
		bodyModel[54] = new ModelRendererTurbo(this, 111, 131, textureX, textureY); // Box 121
		bodyModel[55] = new ModelRendererTurbo(this, 80, 53, textureX, textureY); // Box 131
		bodyModel[56] = new ModelRendererTurbo(this, 125, 1, textureX, textureY); // Box 404
		bodyModel[57] = new ModelRendererTurbo(this, 88, 1, textureX, textureY); // Box 405
		bodyModel[58] = new ModelRendererTurbo(this, 439, 131, textureX, textureY); // Box 406
		bodyModel[59] = new ModelRendererTurbo(this, 0, 53, textureX, textureY); // Box 410
		bodyModel[60] = new ModelRendererTurbo(this, 62, 48, textureX, textureY); // Box 398
		bodyModel[61] = new ModelRendererTurbo(this, 4, 48, textureX, textureY); // Box 403
		bodyModel[62] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 471
		bodyModel[63] = new ModelRendererTurbo(this, 33, 60, textureX, textureY, "lamp"); // Numberboard L type 2
		bodyModel[64] = new ModelRendererTurbo(this, 78, 71, textureX, textureY, "lamp"); // Markerlight L type 2
		bodyModel[65] = new ModelRendererTurbo(this, 3, 71, textureX, textureY, "lamp"); // Markerlight R type 2
		bodyModel[66] = new ModelRendererTurbo(this, 91, 13, textureX, textureY); // Box 343
		bodyModel[67] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Box 626
		bodyModel[68] = new ModelRendererTurbo(this, 425, 127, textureX, textureY); // Right side door
		bodyModel[69] = new ModelRendererTurbo(this, 127, 127, textureX, textureY); // Left side door
		bodyModel[70] = new ModelRendererTurbo(this, 103, 125, textureX, textureY); // Box 123
		bodyModel[71] = new ModelRendererTurbo(this, 80, 47, textureX, textureY); // Box 131
		bodyModel[72] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 409
		bodyModel[73] = new ModelRendererTurbo(this, 108, 122, textureX, textureY); // Box 122
		bodyModel[74] = new ModelRendererTurbo(this, 453, 125, textureX, textureY); // Box 322
		bodyModel[75] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Box 408
		bodyModel[76] = new ModelRendererTurbo(this, 59, 131, textureX, textureY); // Box 0 headlight rear back plate
		bodyModel[77] = new ModelRendererTurbo(this, 50, 118, textureX, textureY); // Box 247
		bodyModel[78] = new ModelRendererTurbo(this, 63, 82, textureX, textureY); // Box 0
		bodyModel[79] = new ModelRendererTurbo(this, 70, 69, textureX, textureY); // Box 228
		bodyModel[80] = new ModelRendererTurbo(this, 33, 60, textureX, textureY, "lamp"); // Numberboard R type 2
		bodyModel[81] = new ModelRendererTurbo(this, 121, 16, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 339, 53, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 389, 128, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 141, 128, textureX, textureY); // Box 6
		bodyModel[85] = new ModelRendererTurbo(this, 260, 109, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 487, 121, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 487, 153, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 490, 144, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 498, 144, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 503, 143, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 485, 163, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 485, 131, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 142, 16, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 140, 8, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 144, 4, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 140, 22, textureX, textureY); // Box 32
		bodyModel[98] = new ModelRendererTurbo(this, 144, 30, textureX, textureY); // Box 33
		bodyModel[99] = new ModelRendererTurbo(this, 145, 34, textureX, textureY); // Box 34
		bodyModel[100] = new ModelRendererTurbo(this, 276, 85, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 264, 91, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 283, 99, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 292, 101, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 265, 99, textureX, textureY); // Box 32
		bodyModel[105] = new ModelRendererTurbo(this, 264, 101, textureX, textureY); // Box 33
		bodyModel[106] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 2
		bodyModel[107] = new ModelRendererTurbo(this, 491, 63, textureX, textureY); // Box 2
		bodyModel[108] = new ModelRendererTurbo(this, 124, 128, textureX, textureY); // Box 80
		bodyModel[109] = new ModelRendererTurbo(this, 375, 146, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 120
		bodyModel[111] = new ModelRendererTurbo(this, 375, 131, textureX, textureY); // Right side door
		bodyModel[112] = new ModelRendererTurbo(this, 177, 131, textureX, textureY); // Left side door
		bodyModel[113] = new ModelRendererTurbo(this, 303, 128, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 191, 128, textureX, textureY); // Box 6
		bodyModel[115] = new ModelRendererTurbo(this, 375, 128, textureX, textureY); // Box 193
		bodyModel[116] = new ModelRendererTurbo(this, 177, 128, textureX, textureY); // Box 122
		bodyModel[117] = new ModelRendererTurbo(this, 80, 44, textureX, textureY); // Box 198
		bodyModel[118] = new ModelRendererTurbo(this, 372, 128, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 386, 128, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 188, 128, textureX, textureY); // Box 79
		bodyModel[121] = new ModelRendererTurbo(this, 174, 128, textureX, textureY); // Box 80
		bodyModel[122] = new ModelRendererTurbo(this, 340, 78, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 388, 35, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 444, 33, textureX, textureY); // Box 2
		bodyModel[125] = new ModelRendererTurbo(this, 361, 29, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 441, 28, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 444, 41, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 468, 41, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 364, 42, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 388, 42, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 8, 215, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 43, 211, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 31, 217, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 32, 225, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 31, 227, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 50, 225, textureX, textureY); // Box 32
		bodyModel[137] = new ModelRendererTurbo(this, 59, 227, textureX, textureY); // Box 33
		bodyModel[138] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 406
		bodyModel[139] = new ModelRendererTurbo(this, 6, 33, textureX, textureY); // Box 401
		bodyModel[140] = new ModelRendererTurbo(this, 5, 52, textureX, textureY); // Box 402
		bodyModel[141] = new ModelRendererTurbo(this, 59, 167, textureX, textureY); // Box 402
		bodyModel[142] = new ModelRendererTurbo(this, 49, 155, textureX, textureY); // Box 401
		bodyModel[143] = new ModelRendererTurbo(this, 59, 164, textureX, textureY); // Box 402
		bodyModel[144] = new ModelRendererTurbo(this, 49, 164, textureX, textureY); // Box 401
		bodyModel[145] = new ModelRendererTurbo(this, 60, 33, textureX, textureY); // Box 663
		bodyModel[146] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Box 664
		bodyModel[147] = new ModelRendererTurbo(this, 27, 155, textureX, textureY); // Box 665
		bodyModel[148] = new ModelRendererTurbo(this, 31, 164, textureX, textureY); // Box 666
		bodyModel[149] = new ModelRendererTurbo(this, 29, 164, textureX, textureY); // Box 667
		bodyModel[150] = new ModelRendererTurbo(this, 73, 52, textureX, textureY); // Box 668
		bodyModel[151] = new ModelRendererTurbo(this, 59, 182, textureX, textureY); // Box 197
		bodyModel[152] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 678
		bodyModel[153] = new ModelRendererTurbo(this, 56, 225, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 16, 182, textureX, textureY); // Box 120
		bodyModel[155] = new ModelRendererTurbo(this, 26, 155, textureX, textureY); // Box 120
		bodyModel[156] = new ModelRendererTurbo(this, 59, 191, textureX, textureY); // Box 197
		bodyModel[157] = new ModelRendererTurbo(this, 11, 193, textureX, textureY); // Box 674
		bodyModel[158] = new ModelRendererTurbo(this, 260, 145, textureX, textureY); // Box 54
		bodyModel[159] = new ModelRendererTurbo(this, 260, 150, textureX, textureY); // Box 54
		bodyModel[160] = new ModelRendererTurbo(this, 263, 150, textureX, textureY); // Box 54
		bodyModel[161] = new ModelRendererTurbo(this, 298, 145, textureX, textureY); // Box 150
		bodyModel[162] = new ModelRendererTurbo(this, 300, 150, textureX, textureY); // Box 151
		bodyModel[163] = new ModelRendererTurbo(this, 297, 150, textureX, textureY); // Box 152
		bodyModel[164] = new ModelRendererTurbo(this, 360, 7, textureX, textureY); // Box 0 alco cooling
		bodyModel[165] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0 alco cooling
		bodyModel[166] = new ModelRendererTurbo(this, 369, 13, textureX, textureY); // Box 0 alco cooling
		bodyModel[167] = new ModelRendererTurbo(this, 352, 1, textureX, textureY); // Box 0 alco cooling
		bodyModel[168] = new ModelRendererTurbo(this, 386, 1, textureX, textureY); // Box 0 alco cooling
		bodyModel[169] = new ModelRendererTurbo(this, 352, 13, textureX, textureY); // Box 102 alco cooling
		bodyModel[170] = new ModelRendererTurbo(this, 386, 13, textureX, textureY); // Box 103 alco cooling
		bodyModel[171] = new ModelRendererTurbo(this, 340, 19, textureX, textureY); // Box 0 alco cooling
		bodyModel[172] = new ModelRendererTurbo(this, 267, 4, textureX, textureY); // Box 0 Dynamics
		bodyModel[173] = new ModelRendererTurbo(this, 280, 2, textureX, textureY); // Box 0 Dynamics
		bodyModel[174] = new ModelRendererTurbo(this, 293, 4, textureX, textureY); // Box 0 Dynamics
		bodyModel[175] = new ModelRendererTurbo(this, 253, 1, textureX, textureY); // Box 0 Dynamics
		bodyModel[176] = new ModelRendererTurbo(this, 189, 148, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 342, 178, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[178] = new ModelRendererTurbo(this, 282, 178, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[179] = new ModelRendererTurbo(this, 295, 165, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[180] = new ModelRendererTurbo(this, 299, 169, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[181] = new ModelRendererTurbo(this, 251, 240, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[182] = new ModelRendererTurbo(this, 472, 127, textureX, textureY, "lamp"); // Markerlight R type 1
		bodyModel[183] = new ModelRendererTurbo(this, 462, 130, textureX, textureY); // Box 216
		bodyModel[184] = new ModelRendererTurbo(this, 86, 130, textureX, textureY); // Box 228
		bodyModel[185] = new ModelRendererTurbo(this, 86, 127, textureX, textureY, "lamp"); // Markerlight L type 1
		bodyModel[186] = new ModelRendererTurbo(this, 92, 126, textureX, textureY, "lamp"); // Numberboard L type 1
		bodyModel[187] = new ModelRendererTurbo(this, 465, 126, textureX, textureY, "lamp"); // Numberboard R type 1
		bodyModel[188] = new ModelRendererTurbo(this, 142, 48, textureX, textureY); // Box 301
		bodyModel[189] = new ModelRendererTurbo(this, 142, 51, textureX, textureY); // Box 644
		bodyModel[190] = new ModelRendererTurbo(this, 153, 48, textureX, textureY); // Box 302
		bodyModel[191] = new ModelRendererTurbo(this, 153, 51, textureX, textureY); // Box 643
		bodyModel[192] = new ModelRendererTurbo(this, 134, 46, textureX, textureY); // Box 114
		bodyModel[193] = new ModelRendererTurbo(this, 134, 43, textureX, textureY); // Box 74
		bodyModel[194] = new ModelRendererTurbo(this, 134, 49, textureX, textureY); // Box 78
		bodyModel[195] = new ModelRendererTurbo(this, 133, 36, textureX, textureY, "cull"); // Box 472 cull bell holder
		bodyModel[196] = new ModelRendererTurbo(this, 137, 103, textureX, textureY, "cull"); // Box 6 Front Vent Cull
		bodyModel[197] = new ModelRendererTurbo(this, 137, 93, textureX, textureY); // Box 6 FA-2 and after
		bodyModel[198] = new ModelRendererTurbo(this, 184, 93, textureX, textureY); // Box 6 FA2 and after
		bodyModel[199] = new ModelRendererTurbo(this, 135, 55, textureX, textureY); // Box 644
		bodyModel[200] = new ModelRendererTurbo(this, 132, 54, textureX, textureY); // Box 644
		bodyModel[201] = new ModelRendererTurbo(this, 308, 26, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[202] = new ModelRendererTurbo(this, 310, 16, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[203] = new ModelRendererTurbo(this, 297, 19, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[204] = new ModelRendererTurbo(this, 329, 19, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[205] = new ModelRendererTurbo(this, 128, 150, textureX, textureY); // Box 120
		bodyModel[206] = new ModelRendererTurbo(this, 178, 151, textureX, textureY); // Box 120
		bodyModel[207] = new ModelRendererTurbo(this, 128, 152, textureX, textureY); // Box 120
		bodyModel[208] = new ModelRendererTurbo(this, 128, 147, textureX, textureY); // Box 120
		bodyModel[209] = new ModelRendererTurbo(this, 251, 147, textureX, textureY); // Box 120
		bodyModel[210] = new ModelRendererTurbo(this, 251, 152, textureX, textureY); // Box 120
		bodyModel[211] = new ModelRendererTurbo(this, 251, 150, textureX, textureY); // Box 120
		bodyModel[212] = new ModelRendererTurbo(this, 426, 150, textureX, textureY); // Box 120
		bodyModel[213] = new ModelRendererTurbo(this, 376, 151, textureX, textureY); // Box 120
		bodyModel[214] = new ModelRendererTurbo(this, 426, 152, textureX, textureY); // Box 120
		bodyModel[215] = new ModelRendererTurbo(this, 426, 147, textureX, textureY); // Box 120
		bodyModel[216] = new ModelRendererTurbo(this, 303, 147, textureX, textureY); // Box 120
		bodyModel[217] = new ModelRendererTurbo(this, 303, 152, textureX, textureY); // Box 120
		bodyModel[218] = new ModelRendererTurbo(this, 303, 150, textureX, textureY); // Box 120
		bodyModel[219] = new ModelRendererTurbo(this, 483, 143, textureX, textureY); // Box 128
		bodyModel[220] = new ModelRendererTurbo(this, 485, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[221] = new ModelRendererTurbo(this, 490, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[222] = new ModelRendererTurbo(this, 503, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[223] = new ModelRendererTurbo(this, 498, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[224] = new ModelRendererTurbo(this, 290, 123, textureX, textureY, "lamp"); // backing light type 1
		bodyModel[225] = new ModelRendererTurbo(this, 283, 123, textureX, textureY); // backing light type 1 socket
		bodyModel[226] = new ModelRendererTurbo(this, 144, 38, textureX, textureY); // Box 296
		bodyModel[227] = new ModelRendererTurbo(this, 142, 41, textureX, textureY); // Box 295
		bodyModel[228] = new ModelRendererTurbo(this, 144, 44, textureX, textureY); // Box 294
		bodyModel[229] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 293
		bodyModel[230] = new ModelRendererTurbo(this, 194, 53, textureX, textureY); // Box 364 prime base
		bodyModel[231] = new ModelRendererTurbo(this, 203, 53, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[232] = new ModelRendererTurbo(this, 203, 53, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[233] = new ModelRendererTurbo(this, 203, 53, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[234] = new ModelRendererTurbo(this, 203, 53, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[235] = new ModelRendererTurbo(this, 185, 53, textureX, textureY, "cull"); // Box 495 c ull
		bodyModel[236] = new ModelRendererTurbo(this, 142, 61, textureX, textureY); // Box 327
		bodyModel[237] = new ModelRendererTurbo(this, 144, 55, textureX, textureY); // Box 328
		bodyModel[238] = new ModelRendererTurbo(this, 144, 67, textureX, textureY); // Box 329
		bodyModel[239] = new ModelRendererTurbo(this, 153, 61, textureX, textureY); // Box 330
		bodyModel[240] = new ModelRendererTurbo(this, 312, 146, textureX, textureY); // Box 0
		bodyModel[241] = new ModelRendererTurbo(this, 315, 146, textureX, textureY); // Box 0
		bodyModel[242] = new ModelRendererTurbo(this, 248, 146, textureX, textureY); // Box 79
		bodyModel[243] = new ModelRendererTurbo(this, 245, 146, textureX, textureY); // Box 80
		bodyModel[244] = new ModelRendererTurbo(this, 137, 103, textureX, textureY, "cull"); // Box 6 Front Vent Cull
		bodyModel[245] = new ModelRendererTurbo(this, 137, 93, textureX, textureY); // Box 6 FA-2 and after
		bodyModel[246] = new ModelRendererTurbo(this, 184, 93, textureX, textureY); // Box 6 FA2 and after
		bodyModel[247] = new ModelRendererTurbo(this, 214, 113, textureX, textureY); // Box 6 FA/FPA-2 and 4 vent
		bodyModel[248] = new ModelRendererTurbo(this, 214, 113, textureX, textureY); // Box 6 FA/FPA-2 and 4 vent
		bodyModel[249] = new ModelRendererTurbo(this, 29, 128, textureX, textureY, "ditch"); // Box 445 ditchlight front b
		bodyModel[250] = new ModelRendererTurbo(this, 20, 128, textureX, textureY); // Ditchlight box
		bodyModel[251] = new ModelRendererTurbo(this, 29, 128, textureX, textureY, "ditch"); // Box 445 ditchlight front b
		bodyModel[252] = new ModelRendererTurbo(this, 20, 128, textureX, textureY); // Ditchlight box
		bodyModel[253] = new ModelRendererTurbo(this, 27, 102, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[254] = new ModelRendererTurbo(this, 27, 102, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[255] = new ModelRendererTurbo(this, 86, 150, textureX, textureY); // Box 121
		bodyModel[256] = new ModelRendererTurbo(this, 468, 150, textureX, textureY); // Box 326
		bodyModel[257] = new ModelRendererTurbo(this, 463, 150, textureX, textureY); // Box 328
		bodyModel[258] = new ModelRendererTurbo(this, 95, 150, textureX, textureY); // Box 328
		bodyModel[259] = new ModelRendererTurbo(this, 158, 57, textureX, textureY); // Box 364 prime base
		bodyModel[260] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[261] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[262] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[263] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[264] = new ModelRendererTurbo(this, 282, 236, textureX, textureY); // Box 0 alco cooling
		bodyModel[265] = new ModelRendererTurbo(this, 256, 233, textureX, textureY); // Box 0
		bodyModel[266] = new ModelRendererTurbo(this, 55, 76, textureX, textureY); // Box 356
		bodyModel[267] = new ModelRendererTurbo(this, 45, 75, textureX, textureY); // Box 358
		bodyModel[268] = new ModelRendererTurbo(this, 16, 76, textureX, textureY); // Box 368
		bodyModel[269] = new ModelRendererTurbo(this, 34, 75, textureX, textureY); // Box 390
		bodyModel[270] = new ModelRendererTurbo(this, 100, 125, textureX, textureY); // Box 122
		bodyModel[271] = new ModelRendererTurbo(this, 460, 125, textureX, textureY); // Box 442
		bodyModel[272] = new ModelRendererTurbo(this, 100, 123, textureX, textureY); // Box 122
		bodyModel[273] = new ModelRendererTurbo(this, 454, 123, textureX, textureY); // Box 544
		bodyModel[274] = new ModelRendererTurbo(this, 326, 216, textureX, textureY); // Box 2
		bodyModel[275] = new ModelRendererTurbo(this, 320, 190, textureX, textureY); // Box 10
		bodyModel[276] = new ModelRendererTurbo(this, 339, 245, textureX, textureY); // Box 157
		bodyModel[277] = new ModelRendererTurbo(this, 339, 237, textureX, textureY); // Box 158
		bodyModel[278] = new ModelRendererTurbo(this, 336, 206, textureX, textureY); // Box 382
		bodyModel[279] = new ModelRendererTurbo(this, 336, 206, textureX, textureY); // Box 383
		bodyModel[280] = new ModelRendererTurbo(this, 161, 187, textureX, textureY); // Box 21 exhaust FDL
		bodyModel[281] = new ModelRendererTurbo(this, 110, 200, textureX, textureY); // Box 413 cs
		bodyModel[282] = new ModelRendererTurbo(this, 106, 193, textureX, textureY); // Box 86 cs
		bodyModel[283] = new ModelRendererTurbo(this, 111, 208, textureX, textureY); // Box 531 cs
		bodyModel[284] = new ModelRendererTurbo(this, 76, 196, textureX, textureY); // Box 106 cab backbox
		bodyModel[285] = new ModelRendererTurbo(this, 260, 137, textureX, textureY); // Box 602
		bodyModel[286] = new ModelRendererTurbo(this, 29, 70, textureX, textureY, "lamp"); // Box 186 headlight 2beam top A
		bodyModel[287] = new ModelRendererTurbo(this, 36, 70, textureX, textureY, "lamp"); // Box 187 headlight 2beam top A
		bodyModel[288] = new ModelRendererTurbo(this, 44, 70, textureX, textureY, "lamp"); // Box 186 headlight 2beam top B
		bodyModel[289] = new ModelRendererTurbo(this, 44, 70, textureX, textureY, "lamp"); // Box 187 headlight 2beam top B
		bodyModel[290] = new ModelRendererTurbo(this, 38, 75, textureX, textureY, "lamp"); // Box 169 headlight big top
		bodyModel[291] = new ModelRendererTurbo(this, 18, 79, textureX, textureY); // Box 413
		bodyModel[292] = new ModelRendererTurbo(this, 55, 79, textureX, textureY); // Box 414
		bodyModel[293] = new ModelRendererTurbo(this, 9, 77, textureX, textureY); // Box 415
		bodyModel[294] = new ModelRendererTurbo(this, 68, 77, textureX, textureY); // Box 416
		bodyModel[295] = new ModelRendererTurbo(this, 16, 70, textureX, textureY); // Box 417
		bodyModel[296] = new ModelRendererTurbo(this, 51, 70, textureX, textureY); // Box 418
		bodyModel[297] = new ModelRendererTurbo(this, 68, 59, textureX, textureY); // Box 419
		bodyModel[298] = new ModelRendererTurbo(this, 8, 59, textureX, textureY); // Box 420
		bodyModel[299] = new ModelRendererTurbo(this, 78, 62, textureX, textureY); // Box 421
		bodyModel[300] = new ModelRendererTurbo(this, 77, 62, textureX, textureY); // Box 422
		bodyModel[301] = new ModelRendererTurbo(this, 84, 70, textureX, textureY); // Box 423
		bodyModel[302] = new ModelRendererTurbo(this, 108, 75, textureX, textureY); // Box 424
		bodyModel[303] = new ModelRendererTurbo(this, 84, 75, textureX, textureY); // Box 425
		bodyModel[304] = new ModelRendererTurbo(this, 30, 95, textureX, textureY); // Box 103
		bodyModel[305] = new ModelRendererTurbo(this, 37, 91, textureX, textureY); // Box 103
		bodyModel[306] = new ModelRendererTurbo(this, 44, 91, textureX, textureY); // Box 103
		bodyModel[307] = new ModelRendererTurbo(this, 51, 95, textureX, textureY); // Box 103
		bodyModel[308] = new ModelRendererTurbo(this, 37, 95, textureX, textureY); // Box 103
		bodyModel[309] = new ModelRendererTurbo(this, 44, 95, textureX, textureY); // Box 103
		bodyModel[310] = new ModelRendererTurbo(this, 37, 100, textureX, textureY); // Box 103
		bodyModel[311] = new ModelRendererTurbo(this, 44, 100, textureX, textureY); // Box 103
		bodyModel[312] = new ModelRendererTurbo(this, 30, 100, textureX, textureY); // Box 433
		bodyModel[313] = new ModelRendererTurbo(this, 51, 100, textureX, textureY); // Box 434
		bodyModel[314] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 435
		bodyModel[315] = new ModelRendererTurbo(this, 30, 91, textureX, textureY); // Box 436
		bodyModel[316] = new ModelRendererTurbo(this, 44, 112, textureX, textureY); // Box 437
		bodyModel[317] = new ModelRendererTurbo(this, 39, 113, textureX, textureY); // Box 438
		bodyModel[318] = new ModelRendererTurbo(this, 44, 108, textureX, textureY); // Box 439
		bodyModel[319] = new ModelRendererTurbo(this, 39, 108, textureX, textureY); // Box 440
		bodyModel[320] = new ModelRendererTurbo(this, 39, 105, textureX, textureY); // Box 441
		bodyModel[321] = new ModelRendererTurbo(this, 44, 104, textureX, textureY); // Box 442
		bodyModel[322] = new ModelRendererTurbo(this, 51, 104, textureX, textureY); // Box 443
		bodyModel[323] = new ModelRendererTurbo(this, 58, 105, textureX, textureY); // Box 444
		bodyModel[324] = new ModelRendererTurbo(this, 58, 108, textureX, textureY); // Box 445
		bodyModel[325] = new ModelRendererTurbo(this, 51, 112, textureX, textureY); // Box 446
		bodyModel[326] = new ModelRendererTurbo(this, 58, 113, textureX, textureY); // Box 447
		bodyModel[327] = new ModelRendererTurbo(this, 53, 108, textureX, textureY); // Box 448
		bodyModel[328] = new ModelRendererTurbo(this, 43, 124, textureX, textureY, "lamp"); // Box 186 headlight 2beam bottom A
		bodyModel[329] = new ModelRendererTurbo(this, 43, 129, textureX, textureY, "lamp"); // Box 187 headlight 2beam bottom A
		bodyModel[330] = new ModelRendererTurbo(this, 48, 118, textureX, textureY, "lamp"); // Box 186 headlight 2beam bottom B
		bodyModel[331] = new ModelRendererTurbo(this, 48, 118, textureX, textureY, "lamp"); // Box 187 headlight 2beam bottom B
		bodyModel[332] = new ModelRendererTurbo(this, 39, 116, textureX, textureY, "lamp"); // Box 169 headlight big bottom
		bodyModel[333] = new ModelRendererTurbo(this, 480, 128, textureX, textureY); // Box 31
		bodyModel[334] = new ModelRendererTurbo(this, 482, 123, textureX, textureY, "lamp"); // Box 247 headlight rear 2 beam
		bodyModel[335] = new ModelRendererTurbo(this, 482, 123, textureX, textureY, "lamp"); // Box 248 headlight rear 2 beam
		bodyModel[336] = new ModelRendererTurbo(this, 127, 64, textureX, textureY); // Box 388
		bodyModel[337] = new ModelRendererTurbo(this, 136, 61, textureX, textureY); // Box 389
		bodyModel[338] = new ModelRendererTurbo(this, 125, 61, textureX, textureY); // Box 390
		bodyModel[339] = new ModelRendererTurbo(this, 127, 58, textureX, textureY); // Box 391
		bodyModel[340] = new ModelRendererTurbo(this, 267, 149, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[341] = new ModelRendererTurbo(this, 274, 149, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[342] = new ModelRendererTurbo(this, 127, 120, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[343] = new ModelRendererTurbo(this, 134, 120, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[344] = new ModelRendererTurbo(this, 414, 104, textureX, textureY); // Box 0 Steam/HEP gen
		bodyModel[345] = new ModelRendererTurbo(this, 414, 104, textureX, textureY); // Box 0 Steam/HEP gen
		bodyModel[346] = new ModelRendererTurbo(this, 404, 104, textureX, textureY); // Box 0 generator exhaust
		bodyModel[347] = new ModelRendererTurbo(this, 404, 104, textureX, textureY); // Box 0 generator exhaust
		bodyModel[348] = new ModelRendererTurbo(this, 77, 177, textureX, textureY); // Box 282
		bodyModel[349] = new ModelRendererTurbo(this, 123, 177, textureX, textureY); // Box 283
		bodyModel[350] = new ModelRendererTurbo(this, 90, 175, textureX, textureY); // Box 4
		bodyModel[351] = new ModelRendererTurbo(this, 103, 175, textureX, textureY); // Box 448
		bodyModel[352] = new ModelRendererTurbo(this, 136, 174, textureX, textureY); // Box 322
		bodyModel[353] = new ModelRendererTurbo(this, 149, 174, textureX, textureY); // Box 323
		bodyModel[354] = new ModelRendererTurbo(this, 114, 173, textureX, textureY); // Box 280
		bodyModel[355] = new ModelRendererTurbo(this, 160, 172, textureX, textureY); // Box 285
		bodyModel[356] = new ModelRendererTurbo(this, 175, 41, textureX, textureY, "cull"); // Box 270 cull
		bodyModel[357] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 271
		bodyModel[358] = new ModelRendererTurbo(this, 161, 44, textureX, textureY); // Box 83
		bodyModel[359] = new ModelRendererTurbo(this, 161, 38, textureX, textureY); // Box 84
		bodyModel[360] = new ModelRendererTurbo(this, 170, 41, textureX, textureY); // Box 482
		bodyModel[361] = new ModelRendererTurbo(this, 129, 54, textureX, textureY); // Box 413
		bodyModel[362] = new ModelRendererTurbo(this, 122, 46, textureX, textureY); // Box 414 fncc numberboard
		bodyModel[363] = new ModelRendererTurbo(this, 122, 49, textureX, textureY); // Box 414 fncc numberboard
		bodyModel[364] = new ModelRendererTurbo(this, 178, 38, textureX, textureY); // Box 184 o2 generator
		bodyModel[365] = new ModelRendererTurbo(this, 153, 71, textureX, textureY, "cull"); // Box 339 cull beacon holdy
		bodyModel[366] = new ModelRendererTurbo(this, 160, 71, textureX, textureY, "cull"); // Box 340 cull beacon holdy
		bodyModel[367] = new ModelRendererTurbo(this, 161, 67, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[368] = new ModelRendererTurbo(this, 154, 67, textureX, textureY, "commander"); // Box 342 commander beacon
		bodyModel[369] = new ModelRendererTurbo(this, 393, 240, textureX, textureY); // Box 639 late tank
		bodyModel[370] = new ModelRendererTurbo(this, 380, 211, textureX, textureY); // Box 640 late tank
		bodyModel[371] = new ModelRendererTurbo(this, 374, 185, textureX, textureY); // Box 641 late tank
		bodyModel[372] = new ModelRendererTurbo(this, 393, 232, textureX, textureY); // Box 642 late tank
		bodyModel[373] = new ModelRendererTurbo(this, 432, 215, textureX, textureY); // Box 19
		bodyModel[374] = new ModelRendererTurbo(this, 432, 215, textureX, textureY); // Box 19
		bodyModel[375] = new ModelRendererTurbo(this, 432, 215, textureX, textureY); // Box 548
		bodyModel[376] = new ModelRendererTurbo(this, 428, 185, textureX, textureY); // Box 646
		bodyModel[377] = new ModelRendererTurbo(this, 428, 185, textureX, textureY); // Box 647
		bodyModel[378] = new ModelRendererTurbo(this, 428, 185, textureX, textureY); // Box 648
		bodyModel[379] = new ModelRendererTurbo(this, 449, 194, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[380] = new ModelRendererTurbo(this, 431, 194, textureX, textureY, "cull"); // Box 650 cull piping
		bodyModel[381] = new ModelRendererTurbo(this, 438, 194, textureX, textureY, "cull"); // Box 650 cull piping
		bodyModel[382] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 369
		bodyModel[383] = new ModelRendererTurbo(this, 439, 98, textureX, textureY); // Box 370
		bodyModel[384] = new ModelRendererTurbo(this, 444, 107, textureX, textureY); // Box 371
		bodyModel[385] = new ModelRendererTurbo(this, 309, 92, textureX, textureY); // Box 547
		bodyModel[386] = new ModelRendererTurbo(this, 309, 107, textureX, textureY); // Box 548
		bodyModel[387] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534
		bodyModel[388] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535
		bodyModel[389] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536
		bodyModel[390] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[391] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293
		bodyModel[392] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[393] = new ModelRendererTurbo(this, 174, 225, textureX, textureY); // Box 242
		bodyModel[394] = new ModelRendererTurbo(this, 178, 246, textureX, textureY); // Box 243
		bodyModel[395] = new ModelRendererTurbo(this, 161, 213, textureX, textureY); // Box 244
		bodyModel[396] = new ModelRendererTurbo(this, 149, 194, textureX, textureY); // Box 245
		bodyModel[397] = new ModelRendererTurbo(this, 180, 194, textureX, textureY); // Box 246
		bodyModel[398] = new ModelRendererTurbo(this, 197, 194, textureX, textureY); // Box 247
		bodyModel[399] = new ModelRendererTurbo(this, 147, 202, textureX, textureY); // Box 248
		bodyModel[400] = new ModelRendererTurbo(this, 149, 198, textureX, textureY); // Box 249
		bodyModel[401] = new ModelRendererTurbo(this, 214, 201, textureX, textureY); // Box 250
		bodyModel[402] = new ModelRendererTurbo(this, 183, 211, textureX, textureY); // Box 252
		bodyModel[403] = new ModelRendererTurbo(this, 182, 206, textureX, textureY); // Box 253
		bodyModel[404] = new ModelRendererTurbo(this, 182, 206, textureX, textureY); // Box 253
		bodyModel[405] = new ModelRendererTurbo(this, 183, 211, textureX, textureY); // Box 254
		bodyModel[406] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 257
		bodyModel[407] = new ModelRendererTurbo(this, 214, 196, textureX, textureY); // Box 259
		bodyModel[408] = new ModelRendererTurbo(this, 225, 194, textureX, textureY); // Box 261
		bodyModel[409] = new ModelRendererTurbo(this, 245, 200, textureX, textureY); // Box 264
		bodyModel[410] = new ModelRendererTurbo(this, 233, 200, textureX, textureY); // Box 265
		bodyModel[411] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 267
		bodyModel[412] = new ModelRendererTurbo(this, 245, 193, textureX, textureY); // Box 268
		bodyModel[413] = new ModelRendererTurbo(this, 236, 241, textureX, textureY); // Box 270
		bodyModel[414] = new ModelRendererTurbo(this, 227, 208, textureX, textureY); // Box 271
		bodyModel[415] = new ModelRendererTurbo(this, 232, 221, textureX, textureY); // Box 272
		bodyModel[416] = new ModelRendererTurbo(this, 162, 234, textureX, textureY); // Box 273
		bodyModel[417] = new ModelRendererTurbo(this, 173, 230, textureX, textureY); // Box 274
		bodyModel[418] = new ModelRendererTurbo(this, 211, 210, textureX, textureY); // Box 275
		bodyModel[419] = new ModelRendererTurbo(this, 228, 239, textureX, textureY); // Box 276
		bodyModel[420] = new ModelRendererTurbo(this, 241, 242, textureX, textureY); // Box 277
		bodyModel[421] = new ModelRendererTurbo(this, 238, 239, textureX, textureY); // Box 278
		bodyModel[422] = new ModelRendererTurbo(this, 227, 214, textureX, textureY); // Box 279
		bodyModel[423] = new ModelRendererTurbo(this, 213, 209, textureX, textureY); // Box 280
		bodyModel[424] = new ModelRendererTurbo(this, 236, 246, textureX, textureY); // Box 281
		bodyModel[425] = new ModelRendererTurbo(this, 142, 233, textureX, textureY); // Box 282
		bodyModel[426] = new ModelRendererTurbo(this, 180, 214, textureX, textureY); // Box 283
		bodyModel[427] = new ModelRendererTurbo(this, 180, 214, textureX, textureY); // Box 284
		bodyModel[428] = new ModelRendererTurbo(this, 128, 250, textureX, textureY); // Box 285
		bodyModel[429] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 286
		bodyModel[430] = new ModelRendererTurbo(this, 174, 227, textureX, textureY, "cull"); // Box 287 cull
		bodyModel[431] = new ModelRendererTurbo(this, 174, 227, textureX, textureY, "cull"); // Box 288 cull
		bodyModel[432] = new ModelRendererTurbo(this, 174, 227, textureX, textureY, "cull"); // Box 289 cull
		bodyModel[433] = new ModelRendererTurbo(this, 174, 227, textureX, textureY, "cull"); // Box 290 cull
		bodyModel[434] = new ModelRendererTurbo(this, 97, 235, textureX, textureY); // Box 291
		bodyModel[435] = new ModelRendererTurbo(this, 97, 235, textureX, textureY); // Box 292
		bodyModel[436] = new ModelRendererTurbo(this, 81, 239, textureX, textureY, "cull"); // Box 294 cull thin bits between cylinders
		bodyModel[437] = new ModelRendererTurbo(this, 81, 239, textureX, textureY, "cull"); // Box 294 cull thin bits between cylinders
		bodyModel[438] = new ModelRendererTurbo(this, 236, 193, textureX, textureY); // Box 297
		bodyModel[439] = new ModelRendererTurbo(this, 236, 200, textureX, textureY); // Box 298
		bodyModel[440] = new ModelRendererTurbo(this, 161, 195, textureX, textureY); // Box 301 exhaust FDL
		bodyModel[441] = new ModelRendererTurbo(this, 161, 204, textureX, textureY); // Box 303 u can also get jiggy an shake your 7fdl
		bodyModel[442] = new ModelRendererTurbo(this, 143, 210, textureX, textureY); // Box 298
		bodyModel[443] = new ModelRendererTurbo(this, 137, 218, textureX, textureY); // Box 299
		bodyModel[444] = new ModelRendererTurbo(this, 143, 233, textureX, textureY); // Box 300
		bodyModel[445] = new ModelRendererTurbo(this, 215, 239, textureX, textureY); // Box 303
		bodyModel[446] = new ModelRendererTurbo(this, 237, 228, textureX, textureY); // Box 69
		bodyModel[447] = new ModelRendererTurbo(this, 224, 229, textureX, textureY); // Box 75
		bodyModel[448] = new ModelRendererTurbo(this, 219, 228, textureX, textureY); // Box 34
		bodyModel[449] = new ModelRendererTurbo(this, 210, 225, textureX, textureY); // Box 71
		bodyModel[450] = new ModelRendererTurbo(this, 124, 242, textureX, textureY); // Box 308
		bodyModel[451] = new ModelRendererTurbo(this, 130, 236, textureX, textureY); // Box 309
		bodyModel[452] = new ModelRendererTurbo(this, 130, 239, textureX, textureY); // Box 310
		bodyModel[453] = new ModelRendererTurbo(this, 29, 74, textureX, textureY, "lamp"); // Box 453 headlight GIANT
		bodyModel[454] = new ModelRendererTurbo(this, 38, 78, textureX, textureY, "lamp"); // Box 454 headlight GIANT low
		bodyModel[455] = new ModelRendererTurbo(this, 29, 134, textureX, textureY, "prime2"); // Box 455 NOCTA bottom red gyra
		bodyModel[456] = new ModelRendererTurbo(this, 307, 36, textureX, textureY, "cull"); // Box 456 fmsr winterization hatch CULL
		bodyModel[457] = new ModelRendererTurbo(this, 337, 6, textureX, textureY); // exhaust original
		bodyModel[458] = new ModelRendererTurbo(this, 127, 115, textureX, textureY); // Box 458 fmsr nose mu plug

		bodyModel[0].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-20.5F, -4F, 10F);

		bodyModel[1].addBox(0F, 0F, 0F, 8, 11, 1, 0F); // Box 0
		bodyModel[1].setRotationPoint(-28.5F, -10F, 10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 120
		bodyModel[2].setRotationPoint(-20.5F, -4F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 8, 11, 1, 0F); // Box 121
		bodyModel[3].setRotationPoint(-28.5F, -10F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[4].setRotationPoint(-20.5F, -17F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[5].setRotationPoint(-23.5F, -17F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 0
		bodyModel[6].setRotationPoint(-16F, -14F, 11F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 0
		bodyModel[7].setRotationPoint(-21F, -14F, 11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 79
		bodyModel[8].setRotationPoint(-16F, -14F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[9].setRotationPoint(-21.5F, -15F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[10].setRotationPoint(-23.9F, -15F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[11].setRotationPoint(-23.5F, -16F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[12].setRotationPoint(-23.9F, -15F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[13].setRotationPoint(-21.5F, -15F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 8, 1, 20, 0F); // Box 0
		bodyModel[14].setRotationPoint(-33.5F, 1F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 121
		bodyModel[15].setRotationPoint(-33.5F, -10F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 216
		bodyModel[16].setRotationPoint(-33.5F, -10F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 0
		bodyModel[17].setRotationPoint(-35.5F, 1F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-35.5F, -10F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 219
		bodyModel[19].setRotationPoint(-35.5F, -10F, 8F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Box 0
		bodyModel[20].setRotationPoint(-36.5F, 2F, -3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 224
		bodyModel[21].setRotationPoint(-36.5F, -10F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 schnoz front
		bodyModel[22].setRotationPoint(-36.5F, -12F, -3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.27F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 315
		bodyModel[23].setRotationPoint(-36.5F, -12.3F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-36.5F, 2F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,-2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[25].setRotationPoint(-35.5F, 2F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[26].setRotationPoint(-39F, 3F, -1.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-37F, 2F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-36.5F, 8F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 324
		bodyModel[29].setRotationPoint(-36.5F, 2F, 3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F); // Box 325 cull
		bodyModel[30].setRotationPoint(-35.5F, 2F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 327
		bodyModel[31].setRotationPoint(-36.5F, 8F, 3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1.5F, 0F); // Box 335
		bodyModel[32].setRotationPoint(-21.5F, -19F, 2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-0.4F, -1.2F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -5F, -1F, 0F, -0.4F, 0.7F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -5F, 1F, 0F); // Box 337
		bodyModel[33].setRotationPoint(-25.5F, -18.5F, 2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 1F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, -2.5F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 338
		bodyModel[34].setRotationPoint(-26.5F, -16F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 2F, -2.5F, 0F); // Box 339
		bodyModel[35].setRotationPoint(-26.5F, -16F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2F, -2F, 0F, 2F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[36].setRotationPoint(-26.5F, -18F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 2F, -1.5F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F); // Box 344
		bodyModel[37].setRotationPoint(-26.5F, -18F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F); // Box 346
		bodyModel[38].setRotationPoint(-25.5F, -18.5F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.4F, 0.7F, 0F); // Box 347
		bodyModel[39].setRotationPoint(-25.5F, -18.5F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-0.4F, -1.2F, 0F, -3.6F, -1.2F, 0F, 1F, -1F, 0F, -2F, -2F, 2F, -0.4F, 0.7F, 0F, -3.6F, 0.7F, 0F, 1F, 1F, 0F, -2F, 1.5F, 2F); // Box 342
		bodyModel[40].setRotationPoint(-25.5F, -18.5F, 2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 344
		bodyModel[41].setRotationPoint(-20.5F, -18F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -1F, 0F, 0.5F, 1F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[42].setRotationPoint(-23.5F, -17F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -0.4F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, 0F); // Box 346
		bodyModel[43].setRotationPoint(-25.5F, -18.5F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-5F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.4F, 0.7F, 0F); // Box 347
		bodyModel[44].setRotationPoint(-25.5F, -18.5F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-2F, -2F, 2F, 1F, -1F, 0F, -3.6F, -1.2F, 0F, -0.4F, -1.2F, 0F, -2F, 1.5F, 2F, 1F, 1F, 0F, -3.6F, 0.7F, 0F, -0.4F, 0.7F, 0F); // Box 348
		bodyModel[45].setRotationPoint(-25.5F, -18.5F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 349
		bodyModel[46].setRotationPoint(-21.5F, -19F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 350
		bodyModel[47].setRotationPoint(-20.5F, -18F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -1F); // Box 351
		bodyModel[48].setRotationPoint(-23.5F, -17F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F, 0.3F, 0F, 0F, -0.2F, 0F, 0F, 0.9F, 0F, 0F, 0.6F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F); // Box 354
		bodyModel[49].setRotationPoint(-34.5F, -12.5F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 355
		bodyModel[50].setRotationPoint(-30.5F, -12.5F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.3F, 0F, 0F, -0.27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 361
		bodyModel[51].setRotationPoint(-36.5F, -12.3F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 364
		bodyModel[52].setRotationPoint(-30.5F, -12.5F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.9F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0.6F, 0F, 0F, 0.9F, 0F); // Box 370
		bodyModel[53].setRotationPoint(-34.5F, -12.5F, 0F);

		bodyModel[54].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 121
		bodyModel[54].setRotationPoint(-25.5F, -11F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.225F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.625F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.85F, 0F, 0F); // Box 131
		bodyModel[55].setRotationPoint(-26.05F, -11F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[56].setRotationPoint(-20.5F, -17F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[57].setRotationPoint(-23.5F, -17F, 10F);

		bodyModel[58].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 406
		bodyModel[58].setRotationPoint(-25.5F, -11F, 10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.225F, 0F, 0F, 0.85F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.625F, 0F, 0F); // Box 410
		bodyModel[59].setRotationPoint(-26.05F, -11F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, -1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 398
		bodyModel[60].setRotationPoint(-27.5F, -12.5F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0.3F, 0F, -1F, 0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 403
		bodyModel[61].setRotationPoint(-27.5F, -12.5F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[62].setRotationPoint(-36.3F, -8.25F, 7.3F);
		bodyModel[62].rotateAngleY = -0.78539816F;

		bodyModel[63].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F); // Numberboard L type 2
		bodyModel[63].setRotationPoint(-36.31F, -8.25F, -7.3F);
		bodyModel[63].rotateAngleY = 0.78539816F;

		bodyModel[64].addShapeBox(-0.3F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight L type 2
		bodyModel[64].setRotationPoint(-34.45F, -9F, -8.95F);
		bodyModel[64].rotateAngleY = 0.78539816F;

		bodyModel[65].addShapeBox(-0.3F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight R type 2
		bodyModel[65].setRotationPoint(-34.45F, -9F, 8.95F);
		bodyModel[65].rotateAngleY = -0.78539816F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 9, 0F,-1.9F, -0.95F, 0F, 1.9F, -0.95F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.9F, 0.95F, 0F, 1.9F, 0.95F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 343
		bodyModel[66].setRotationPoint(-25.9F, -18.2F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 1, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.9F, -0.95F, 0F, -1.9F, -0.95F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.9F, 0.95F, 0F, -1.9F, 0.95F, 0F); // Box 626
		bodyModel[67].setRotationPoint(-25.9F, -18.2F, 1F);

		bodyModel[68].addBox(-3F, 0F, 0F, 4, 11, 1, 0F); // Right side door
		bodyModel[68].setRotationPoint(-17.5F, -15F, 10F);

		bodyModel[69].addBox(-3F, 0F, -1F, 4, 11, 1, 0F); // Left side door
		bodyModel[69].setRotationPoint(-17.5F, -15F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 123
		bodyModel[70].setRotationPoint(-25.9F, -15F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.975F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.625F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0.85F, 0F, 0F); // Box 131
		bodyModel[71].setRotationPoint(-25.65F, -15F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.975F, 0F, 0F, 0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0.625F, 0F, 0F); // Box 409
		bodyModel[72].setRotationPoint(-25.65F, -15F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[73].setRotationPoint(-23.5F, -16F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 322
		bodyModel[74].setRotationPoint(-25.9F, -15F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.175F, 0F, 0F); // Box 408
		bodyModel[75].setRotationPoint(-24.5F, -16F, 10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 headlight rear back plate
		bodyModel[76].setRotationPoint(-35.75F, -11.5F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[77].setRotationPoint(-35.5F, -10F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[78].setRotationPoint(-36.5F, -10F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[79].setRotationPoint(-36.3F, -8.25F, -7.3F);
		bodyModel[79].rotateAngleY = 0.78539816F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F); // Numberboard R type 2
		bodyModel[80].setRotationPoint(-36.31F, -8.25F, 7.3F);
		bodyModel[80].rotateAngleY = -0.78539816F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 0
		bodyModel[81].setRotationPoint(-21.5F, -19F, -2F);

		bodyModel[82].addBox(0F, 0F, 0F, 64, 1, 22, 0F); // Box 0
		bodyModel[82].setRotationPoint(-28.5F, 1F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 15, 17, 1, 0F); // Box 0
		bodyModel[83].setRotationPoint(-16.5F, -16F, 10F);

		bodyModel[84].addBox(0F, 0F, 0F, 15, 17, 1, 0F); // Box 6
		bodyModel[84].setRotationPoint(-16.5F, -16F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 0
		bodyModel[85].setRotationPoint(34.5F, -16F, -10F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[86].setRotationPoint(35.5F, -15F, -4F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[87].setRotationPoint(35.5F, 1F, -4F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[88].setRotationPoint(35.5F, -14F, -4F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[89].setRotationPoint(35.5F, -14F, 3F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[90].setRotationPoint(36.5F, -14F, 3F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[91].setRotationPoint(36.5F, 1F, -5F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[92].setRotationPoint(36.5F, -15F, -5F);

		bodyModel[93].addBox(0F, 0F, 0F, 53, 1, 4, 0F); // Box 0
		bodyModel[93].setRotationPoint(-17.5F, -19F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 53, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[94].setRotationPoint(-17.5F, -19F, 2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 53, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[95].setRotationPoint(-17.5F, -18F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[96].setRotationPoint(-17.5F, -17F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 53, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[97].setRotationPoint(-17.5F, -19F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 53, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[98].setRotationPoint(-17.5F, -18F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[99].setRotationPoint(-17.5F, -17F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		bodyModel[100].setRotationPoint(34.5F, -18F, -2F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 0
		bodyModel[101].setRotationPoint(34.5F, -17F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[102].setRotationPoint(34.5F, -18F, 2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[103].setRotationPoint(34.5F, -17F, 8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[104].setRotationPoint(34.5F, -18F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[105].setRotationPoint(34.5F, -17F, -10F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[106].setRotationPoint(35.5F, 3F, -1.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[107].setRotationPoint(32.5F, 2F, -3.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 80
		bodyModel[108].setRotationPoint(-21F, -14F, -12F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		bodyModel[109].setRotationPoint(-1.5F, -2F, 10F);

		bodyModel[110].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 120
		bodyModel[110].setRotationPoint(-1.5F, -2F, -11F);

		bodyModel[111].addBox(-3F, 0F, 0F, 4, 13, 1, 0F); // Right side door
		bodyModel[111].setRotationPoint(1.5F, -15F, 10F);

		bodyModel[112].addBox(-3F, 0F, -1F, 4, 13, 1, 0F); // Left side door
		bodyModel[112].setRotationPoint(1.5F, -15F, -10F);

		bodyModel[113].addBox(0F, 0F, 0F, 33, 17, 1, 0F); // Box 0
		bodyModel[113].setRotationPoint(2.5F, -16F, 10F);

		bodyModel[114].addBox(0F, 0F, 0F, 33, 17, 1, 0F); // Box 6
		bodyModel[114].setRotationPoint(2.5F, -16F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[115].setRotationPoint(-1.5F, -16F, 10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[116].setRotationPoint(-1.5F, -16F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.175F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 198
		bodyModel[117].setRotationPoint(-24.5F, -16F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 0
		bodyModel[118].setRotationPoint(3F, -14F, 11F);

		bodyModel[119].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 0
		bodyModel[119].setRotationPoint(-2F, -14F, 11F);

		bodyModel[120].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 79
		bodyModel[120].setRotationPoint(3F, -14F, -12F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 80
		bodyModel[121].setRotationPoint(-2F, -14F, -12F);

		bodyModel[122].addBox(0F, 0F, 0F, 70, 1, 12, 0F); // Box 0
		bodyModel[122].setRotationPoint(-35.5F, 2F, -6F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[123].setRotationPoint(-21.5F, 2.5F, -2F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[124].setRotationPoint(19F, 2.5F, -2F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 0
		bodyModel[125].setRotationPoint(-20.5F, 2F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 0
		bodyModel[126].setRotationPoint(20F, 2F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[127].setRotationPoint(20F, 3F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[128].setRotationPoint(20F, 3F, 2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[129].setRotationPoint(-20.5F, 3F, -9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[130].setRotationPoint(-20.5F, 3F, 2F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 0
		bodyModel[131].setRotationPoint(-16.5F, -16F, -10F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		bodyModel[132].setRotationPoint(-16.5F, -18F, -2F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 0
		bodyModel[133].setRotationPoint(-16.5F, -17F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[134].setRotationPoint(-16.5F, -18F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[135].setRotationPoint(-16.5F, -17F, 8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[136].setRotationPoint(-16.5F, -18F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[137].setRotationPoint(-16.5F, -17F, -10F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 406
		bodyModel[138].setRotationPoint(-27.5F, -11F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.6F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0.6F, 0F, -0.7F, 0.6F, 0F); // Box 401
		bodyModel[139].setRotationPoint(-27.5F, -12F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[140].setRotationPoint(-26.5F, -11F, 8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 402
		bodyModel[141].setRotationPoint(-26.5F, -11F, 8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.7F, 0F, -1.4F, -0.7F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.4F, 0F, 0F); // Box 401
		bodyModel[142].setRotationPoint(-27.5F, -12F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.2F, 0F, -0.4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.6F, -1F, 0F); // Box 402
		bodyModel[143].setRotationPoint(-26.5F, -11F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[144].setRotationPoint(-26.1F, -12F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.7F, -0.8F, 0F, 0.6F, -0.8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.6F, 0F, 0.6F, 0.6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 663
		bodyModel[145].setRotationPoint(-27.5F, -12F, -8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.6F, -1F, 0F); // Box 664
		bodyModel[146].setRotationPoint(-26.5F, -11F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1.4F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 665
		bodyModel[147].setRotationPoint(-27.5F, -12F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0.3F, 0F, -0.6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, -1F, 0F); // Box 666
		bodyModel[148].setRotationPoint(-26.5F, -11F, -8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.7F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[149].setRotationPoint(-26.1F, -12F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 668
		bodyModel[150].setRotationPoint(-26.5F, -11F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 197
		bodyModel[151].setRotationPoint(-26.5F, -10F, 3.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[152].setRotationPoint(-26.5F, -10F, -10.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 18, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[153].setRotationPoint(-15.5F, -17F, -5F);

		bodyModel[154].addBox(0F, 0F, 0F, 11, 5, 20, 0F); // Box 120
		bodyModel[154].setRotationPoint(-27.5F, -4F, -10F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 6, 20, 0F); // Box 120
		bodyModel[155].setRotationPoint(-27.5F, -10F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 197
		bodyModel[156].setRotationPoint(-26.5F, -5F, 1.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		bodyModel[157].setRotationPoint(-26.5F, -5F, -10.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 54
		bodyModel[158].setRotationPoint(35.5F, 2F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		bodyModel[159].setRotationPoint(35.5F, 4.5F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 54
		bodyModel[160].setRotationPoint(35.5F, 4.5F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 150
		bodyModel[161].setRotationPoint(35.5F, 2F, 9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[162].setRotationPoint(35.5F, 4.5F, 10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[163].setRotationPoint(35.5F, 4.5F, 9F);

		bodyModel[164].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 0 alco cooling
		bodyModel[164].setRotationPoint(14F, -19.5F, -2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 0 alco cooling
		bodyModel[165].setRotationPoint(18F, -19.5F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 alco cooling
		bodyModel[166].setRotationPoint(18F, -19.5F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 0 alco cooling
		bodyModel[167].setRotationPoint(14F, -19.5F, 2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 0 alco cooling
		bodyModel[168].setRotationPoint(22F, -19.5F, 2F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102 alco cooling
		bodyModel[169].setRotationPoint(14F, -19.5F, -6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103 alco cooling
		bodyModel[170].setRotationPoint(22F, -19.5F, -6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 12, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 alco cooling
		bodyModel[171].setRotationPoint(14F, -19.51F, -6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[172].setRotationPoint(-10F, -19.5F, -2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[173].setRotationPoint(-5.5F, -19.5F, -2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[174].setRotationPoint(-1F, -19.5F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F); // Box 0 Dynamics
		bodyModel[175].setRotationPoint(-12.5F, -19.5F, -2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0
		bodyModel[176].setRotationPoint(-12.5F, -18F, -2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 0 FA-2 & after
		bodyModel[177].setRotationPoint(13.5F, -14F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-2 & after
		bodyModel[178].setRotationPoint(13.5F, -14F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 13, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-2 & after
		bodyModel[179].setRotationPoint(13.5F, -17F, -10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 13, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-2 & after
		bodyModel[180].setRotationPoint(13.5F, -18F, -8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 11, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-2 & after
		bodyModel[181].setRotationPoint(11F, -5F, 0.5F);

		bodyModel[182].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight R type 1
		bodyModel[182].setRotationPoint(-32.2F, -8.25F, 10.7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 216
		bodyModel[183].setRotationPoint(-32.5F, -9F, 10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.1F); // Box 228
		bodyModel[184].setRotationPoint(-32.5F, -9F, -11F);

		bodyModel[185].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight L type 1
		bodyModel[185].setRotationPoint(-32.2F, -8.25F, -10.7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.05F, 0F, -1F, -0.05F, 0F, -1F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, 0F, -1F, -0.55F, 0F, -1F, -0.55F, 0F, 0F, -0.55F, 0F); // Numberboard L type 1
		bodyModel[186].setRotationPoint(-31.5F, -9F, -11.01F);

		bodyModel[187].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, -0.05F, 0F, -1F, -0.05F, 0F, -1F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, 0F, -1F, -0.55F, 0F, -1F, -0.55F, 0F, 0F, -0.55F, 0F); // Numberboard R type 1
		bodyModel[187].setRotationPoint(-31.5F, -9F, 11.01F);

		bodyModel[188].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 301
		bodyModel[188].setRotationPoint(-22F, -20F, 3.5F);

		bodyModel[189].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 644
		bodyModel[189].setRotationPoint(-19F, -20F, -4.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[190].setRotationPoint(-19F, -19F, 3.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		bodyModel[191].setRotationPoint(-19F, -19F, -4.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[192].setRotationPoint(-14.5F, -20.35F, -5.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[193].setRotationPoint(-14.5F, -21.35F, -5.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[194].setRotationPoint(-14.25F, -19.85F, -5.25F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 472 cull bell holder
		bodyModel[195].setRotationPoint(-14.5F, -21.35F, -6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 26, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 Front Vent Cull
		bodyModel[196].setRotationPoint(-15.5F, -15F, -11.02F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 22, 8, 1, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -11F, -4F, 0F, -11F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 FA-2 and after
		bodyModel[197].setRotationPoint(3.5F, -15F, -11.02F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 FA2 and after
		bodyModel[198].setRotationPoint(25.5F, -15F, -11.02F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[199].setRotationPoint(-17F, -20F, 1.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[200].setRotationPoint(-15.5F, -20.8F, 3F);

		bodyModel[201].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[201].setRotationPoint(10F, -19.65F, -4F);

		bodyModel[202].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[202].setRotationPoint(11F, -20.65F, -4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[203].setRotationPoint(10F, -20.65F, -4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[204].setRotationPoint(15F, -20.65F, -4F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 120
		bodyModel[205].setRotationPoint(-20.5F, 4F, -11.01F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[206].setRotationPoint(-1.5F, 2F, -11.01F);

		bodyModel[207].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[207].setRotationPoint(-20.5F, 5F, -10.76F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[208].setRotationPoint(-20.5F, 2F, -11.01F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[209].setRotationPoint(31.5F, 2F, -11.01F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[210].setRotationPoint(31.5F, 5F, -10.76F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 120
		bodyModel[211].setRotationPoint(31.5F, 4F, -11.01F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 120
		bodyModel[212].setRotationPoint(-20.5F, 4F, 11.01F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[213].setRotationPoint(-1.5F, 2F, 11.01F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[214].setRotationPoint(-20.5F, 5F, 10.76F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[215].setRotationPoint(-20.5F, 2F, 11.01F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[216].setRotationPoint(31.5F, 2F, 11.01F);

		bodyModel[217].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[217].setRotationPoint(31.5F, 5F, 10.76F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 120
		bodyModel[218].setRotationPoint(31.5F, 4F, 11.01F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[219].setRotationPoint(36.5F, -14F, -5F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[220].setRotationPoint(36.5F, -17F, -5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[221].setRotationPoint(36.5F, -17F, -4F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[222].setRotationPoint(36.5F, -17F, 4F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[223].setRotationPoint(36.5F, -17F, 3F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[224].setRotationPoint(36F, -8F, 5.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // backing light type 1 socket
		bodyModel[225].setRotationPoint(35.25F, -8F, 5.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[226].setRotationPoint(-18.25F, -19.25F, 8.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 295
		bodyModel[227].setRotationPoint(-17.25F, -19.5F, 7.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 294
		bodyModel[228].setRotationPoint(-18.75F, -19.25F, 6.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 293
		bodyModel[229].setRotationPoint(-16.75F, -18.5F, 7.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[230].setRotationPoint(-17F, -19.5F, 7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[231].setRotationPoint(-17F, -20F, 7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[232].setRotationPoint(-17F, -20F, 7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[233].setRotationPoint(-17F, -20F, 7F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[234].setRotationPoint(-17F, -20F, 7F);

		bodyModel[235].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 495 c ull
		bodyModel[235].setRotationPoint(-17F, -18.5F, 7F);

		bodyModel[236].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[236].setRotationPoint(-7.5F, -19.5F, -9F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[237].setRotationPoint(-6.5F, -19.25F, -8F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[238].setRotationPoint(-7F, -19.25F, -10F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[239].setRotationPoint(-5F, -18.5F, -9F);

		bodyModel[240].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[240].setRotationPoint(35F, -5F, 11F);

		bodyModel[241].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[241].setRotationPoint(32F, -5F, 11F);

		bodyModel[242].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 79
		bodyModel[242].setRotationPoint(35F, -5F, -12F);

		bodyModel[243].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 80
		bodyModel[243].setRotationPoint(32F, -5F, -12F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 26, 8, 1, 0F,0F, 0F, -0.75F, -13F, 0F, -0.75F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -13F, -4F, -0.75F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 6 Front Vent Cull
		bodyModel[244].setRotationPoint(-15.5F, -15F, 10.02F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 22, 8, 1, 0F,0F, 0F, -0.75F, -11F, 0F, -0.75F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -11F, -4F, -0.75F, -11F, -4F, 0F, 0F, -4F, 0F); // Box 6 FA-2 and after
		bodyModel[245].setRotationPoint(3.5F, -15F, 10.02F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, 0F, -0.75F, -9F, 0F, -0.75F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -9F, -4F, -0.75F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 6 FA2 and after
		bodyModel[246].setRotationPoint(25.5F, -15F, 10.02F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, -0.75F, -11F, 0F, -0.75F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -11F, 0F, -0.75F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 6 FA/FPA-2 and 4 vent
		bodyModel[247].setRotationPoint(14.5F, -15F, 10.02F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 6 FA/FPA-2 and 4 vent
		bodyModel[248].setRotationPoint(14.5F, -15F, -11.02F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 ditchlight front b
		bodyModel[249].setRotationPoint(-37.25F, -0.5F, -6.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Ditchlight box
		bodyModel[250].setRotationPoint(-36.5F, -0.5F, -6.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 ditchlight front b
		bodyModel[251].setRotationPoint(-37.25F, -0.5F, 4.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Ditchlight box
		bodyModel[252].setRotationPoint(-36.5F, -0.5F, 4.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[253].setRotationPoint(-37.25F, -7F, -3.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[254].setRotationPoint(-37.25F, -7F, 3.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, -0.35F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.35F); // Box 121
		bodyModel[255].setRotationPoint(-33.5F, 2F, -10.35F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0.35F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.35F); // Box 326
		bodyModel[256].setRotationPoint(-33.5F, 2F, 9.35F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.17F, 0F, 0F, -0.03F, 0F, 0F, 0.03F, 0F, 0F, -0.17F, 0F, 0F, 0.17F, -1F, 0F, 0.17F, -1F, 0F, -0.17F, 0F, 0F, -0.17F); // Box 328
		bodyModel[257].setRotationPoint(-30.5F, 2F, 9.77F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.17F, 0F, 0F, 0.03F, 0F, 0F, -0.03F, 0F, 0F, 0.17F, 0F, 0F, -0.17F, -1F, 0F, -0.17F, -1F, 0F, 0.17F, 0F, 0F, 0.17F); // Box 328
		bodyModel[258].setRotationPoint(-30.5F, 2F, -10.77F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[259].setRotationPoint(-17F, -20F, -1F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[260].setRotationPoint(-17F, -20.5F, -1F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[261].setRotationPoint(-17F, -20.5F, -1F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[262].setRotationPoint(-17F, -20.5F, -1F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[263].setRotationPoint(-17F, -20.5F, -1F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 alco cooling
		bodyModel[264].setRotationPoint(19.3F, -14F, 0F);
		bodyModel[264].rotateAngleY = -0.76794487F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[265].setRotationPoint(18F, -1F, -2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0.12F, 0F, 0F, 0.4F, 0F, 0F, 0.175F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.4F, 0F, 0F, -0.15F, 0F); // Box 356
		bodyModel[266].setRotationPoint(-33.5F, -11.5F, -9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.38F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.35F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 358
		bodyModel[267].setRotationPoint(-30.5F, -12F, -9F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.175F, 0F, 0F, 0.4F, 0F, 0F, 0.12F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.4F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[268].setRotationPoint(-33.5F, -11.5F, 8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.38F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.35F, 0F); // Box 390
		bodyModel[269].setRotationPoint(-30.5F, -12F, 8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[270].setRotationPoint(-23.9F, -15F, -12F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[271].setRotationPoint(-23.9F, -15F, 11F);

		bodyModel[272].addShapeBox(0F, 0F, -1F, 3, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[272].setRotationPoint(-23.9F, -14.99F, -11F);
		bodyModel[272].rotateAngleX = 0.52359878F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[273].setRotationPoint(-23.9F, -14.99F, 11F);
		bodyModel[273].rotateAngleX = -0.52359878F;

		bodyModel[274].addBox(0F, 0F, 0F, 15, 4, 16, 0F); // Box 2
		bodyModel[274].setRotationPoint(-6.5F, 5F, -8F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 15, 3, 22, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[275].setRotationPoint(-6.5F, 2F, -11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[276].setRotationPoint(-6.5F, 5F, -11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[277].setRotationPoint(-6.5F, 5F, 8F);

		bodyModel[278].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[278].setRotationPoint(-3.5F, 1.5F, -11.25F);
		bodyModel[278].rotateAngleX = 1.57079633F;

		bodyModel[279].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[279].setRotationPoint(-3.5F, 1.5F, 11.25F);
		bodyModel[279].rotateAngleX = -1.57079633F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 21 exhaust FDL
		bodyModel[280].setRotationPoint(5F, -19.5F, -3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[281].setRotationPoint(-26.5F, -12F, 1F);
		bodyModel[281].rotateAngleY = -0.45378561F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[282].setRotationPoint(-26.5F, -14F, 1F);
		bodyModel[282].rotateAngleY = -0.45378561F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[283].setRotationPoint(-26.5F, -8F, 1F);
		bodyModel[283].rotateAngleY = -0.45378561F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, -1F, -6F, 0F, -1F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[284].setRotationPoint(-17.25F, -18F, -6F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 0, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 602
		bodyModel[285].setRotationPoint(35.51F, 2F, -9F);

		bodyModel[286].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top A
		bodyModel[286].setRotationPoint(-36.25F, -10F, 0F);

		bodyModel[287].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top A
		bodyModel[287].setRotationPoint(-36.25F, -10F, 0F);

		bodyModel[288].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top B
		bodyModel[288].setRotationPoint(-36.25F, -10F, 0F);
		bodyModel[288].rotateAngleX = 1.57079633F;

		bodyModel[289].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top B
		bodyModel[289].setRotationPoint(-36.25F, -10F, 0F);
		bodyModel[289].rotateAngleX = 1.57079633F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big top
		bodyModel[290].setRotationPoint(-36.25F, -11.25F, -1.25F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0.03F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 413
		bodyModel[291].setRotationPoint(-35.5F, -12F, 3F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 414
		bodyModel[292].setRotationPoint(-35.5F, -12F, -8F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.175F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, -0.155F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 415
		bodyModel[293].setRotationPoint(-34.5F, -11.5F, 8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0.175F, 0F, 0F, 0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.155F, 0F, 1F, 0F, 0F); // Box 416
		bodyModel[294].setRotationPoint(-34.5F, -11.5F, -10F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 1F, 0F, 0.2F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 417
		bodyModel[295].setRotationPoint(-33.5F, -11.5F, 10F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0.2F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 418
		bodyModel[296].setRotationPoint(-33.5F, -11.5F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 1F, 0.03F, 0F, 1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 419
		bodyModel[297].setRotationPoint(-28.5F, -11.5F, -10F);

		bodyModel[298].addShapeBox(0F, 1.5F, 0F, 2, 1, 2, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.03F, 0F, 1F, 0F, 0F, 1F); // Box 420
		bodyModel[298].setRotationPoint(-28.5F, -13F, 8F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.18F, -0.5F, 0F, -0.18F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 421
		bodyModel[299].setRotationPoint(-28.5F, -10.5F, -11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 422
		bodyModel[300].setRotationPoint(-33.5F, -11F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 423
		bodyModel[301].setRotationPoint(-35.5F, -11F, -8F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[302].setRotationPoint(-36.5F, -11F, -8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 425
		bodyModel[303].setRotationPoint(-36.5F, -11F, 3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[304].setRotationPoint(-36.5F, -12F, 1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[305].setRotationPoint(-36.5F, -12F, 0F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[306].setRotationPoint(-36.5F, -12F, -2F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[307].setRotationPoint(-36.5F, -12F, -3F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 103
		bodyModel[308].setRotationPoint(-36.5F, -10F, 1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[309].setRotationPoint(-36.5F, -10F, -3F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 103
		bodyModel[310].setRotationPoint(-36.5F, -9F, 0F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[311].setRotationPoint(-36.5F, -9F, -2F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[312].setRotationPoint(-36.5F, -9F, 1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 434
		bodyModel[313].setRotationPoint(-36.5F, -9F, -3F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 435
		bodyModel[314].setRotationPoint(-36.5F, -12F, -3F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 436
		bodyModel[315].setRotationPoint(-36.5F, -12F, 1F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 437
		bodyModel[316].setRotationPoint(-36.5F, -4F, 0F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[317].setRotationPoint(-36.5F, -4F, 1F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 439
		bodyModel[318].setRotationPoint(-36.5F, -5F, 1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[319].setRotationPoint(-36.5F, -7F, 1F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 441
		bodyModel[320].setRotationPoint(-36.5F, -7F, 1F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 442
		bodyModel[321].setRotationPoint(-36.5F, -7F, 0F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 443
		bodyModel[322].setRotationPoint(-36.5F, -7F, -2F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 444
		bodyModel[323].setRotationPoint(-36.5F, -7F, -2F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 445
		bodyModel[324].setRotationPoint(-36.5F, -7F, -2F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[325].setRotationPoint(-36.5F, -4F, -2F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 447
		bodyModel[326].setRotationPoint(-36.5F, -4F, -2F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 448
		bodyModel[327].setRotationPoint(-36.5F, -5F, -2F);

		bodyModel[328].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom A
		bodyModel[328].setRotationPoint(-36.25F, -5F, 0F);

		bodyModel[329].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom A
		bodyModel[329].setRotationPoint(-36.25F, -5F, 0F);

		bodyModel[330].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom B
		bodyModel[330].setRotationPoint(-36.25F, -5F, 0F);
		bodyModel[330].rotateAngleX = 1.57079633F;

		bodyModel[331].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom B
		bodyModel[331].setRotationPoint(-36.25F, -5F, 0F);
		bodyModel[331].rotateAngleX = 1.57079633F;

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big bottom
		bodyModel[332].setRotationPoint(-36.25F, -6.25F, -1.25F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31
		bodyModel[333].setRotationPoint(35.25F, -17.25F, -2F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear 2 beam
		bodyModel[334].setRotationPoint(35.5F, -17.25F, -2F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear 2 beam
		bodyModel[335].setRotationPoint(35.5F, -17.25F, 0F);

		bodyModel[336].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 388
		bodyModel[336].setRotationPoint(-21F, -20.25F, -1.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 389
		bodyModel[337].setRotationPoint(-19F, -19.5F, -0.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 390
		bodyModel[338].setRotationPoint(-21.5F, -20.5F, -0.5F);

		bodyModel[339].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 391
		bodyModel[339].setRotationPoint(-20.5F, -20.25F, 0.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[340].setRotationPoint(35.25F, 0F, -7F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[341].setRotationPoint(35.25F, 0F, 5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[342].setRotationPoint(-37.25F, -1F, -2F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[343].setRotationPoint(-37.25F, -1F, 0F);

		bodyModel[344].addBox(0F, 0F, 0F, 6, 11, 5, 0F); // Box 0 Steam/HEP gen
		bodyModel[344].setRotationPoint(25.75F, -10F, 1F);

		bodyModel[345].addBox(0F, 0F, 0F, 6, 11, 5, 0F); // Box 0 Steam/HEP gen
		bodyModel[345].setRotationPoint(25.75F, -10F, -6F);

		bodyModel[346].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 0 generator exhaust
		bodyModel[346].setRotationPoint(30.25F, -19.5F, -4F);

		bodyModel[347].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 0 generator exhaust
		bodyModel[347].setRotationPoint(30.25F, -19.5F, 2F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[348].setRotationPoint(-39F, 7F, 0F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[349].setRotationPoint(-39F, 7F, -10F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[350].setRotationPoint(-38F, 6F, 0F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[351].setRotationPoint(-38F, 5F, 2F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[352].setRotationPoint(-38F, 6F, -10F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[353].setRotationPoint(-38F, 5F, -10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[354].setRotationPoint(-38F, 4F, 2F);

		bodyModel[355].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[355].setRotationPoint(-38F, 4F, -8F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F); // Box 270 cull
		bodyModel[356].setRotationPoint(-27.5F, -17.5F, -0.5F);

		bodyModel[357].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271
		bodyModel[357].setRotationPoint(-29.25F, -19F, -0.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[358].setRotationPoint(-29F, -19F, -1.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[359].setRotationPoint(-29F, -19F, 0.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[360].setRotationPoint(-27.5F, -18.5F, -0.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[361].setRotationPoint(-15.5F, -20.8F, -3F);

		bodyModel[362].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 414 fncc numberboard
		bodyModel[362].setRotationPoint(-1.5F, -17.5F, -11.01F);

		bodyModel[363].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 414 fncc numberboard
		bodyModel[363].setRotationPoint(-1.5F, -17.5F, 11.01F);

		bodyModel[364].addBox(0F, 0F, 0F, 5, 3, 8, 0F); // Box 184 o2 generator
		bodyModel[364].setRotationPoint(-22F, -20F, -4F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 339 cull beacon holdy
		bodyModel[365].setRotationPoint(-21F, -18F, 7F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 cull beacon holdy
		bodyModel[366].setRotationPoint(-21F, -18F, -9F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[367].setRotationPoint(-21F, -19.75F, -8.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 342 commander beacon
		bodyModel[368].setRotationPoint(-21F, -19.75F, 7.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639 late tank
		bodyModel[369].setRotationPoint(-4.75F, 5F, -11F);

		bodyModel[370].addBox(0F, 0F, 0F, 15, 4, 16, 0F); // Box 640 late tank
		bodyModel[370].setRotationPoint(-4.75F, 5F, -8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 15, 3, 22, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641 late tank
		bodyModel[371].setRotationPoint(-4.75F, 2F, -11F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 642 late tank
		bodyModel[372].setRotationPoint(-4.75F, 5F, 8F);

		bodyModel[373].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[373].setRotationPoint(-6.75F, 6F, -9F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[374].setRotationPoint(-7.75F, 7F, -9F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[375].setRotationPoint(-5.75F, 7F, -9F);

		bodyModel[376].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 646
		bodyModel[376].setRotationPoint(-6.75F, 2.5F, -9F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 647
		bodyModel[377].setRotationPoint(-7.75F, 3.5F, -9F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 648
		bodyModel[378].setRotationPoint(-5.75F, 3.5F, -9F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 527 why dont you filter some grass instead
		bodyModel[379].setRotationPoint(-7.5F, 1.5F, 9F);

		bodyModel[380].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 650 cull piping
		bodyModel[380].setRotationPoint(-7.75F, 2F, -10F);

		bodyModel[381].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 650 cull piping
		bodyModel[381].setRotationPoint(-7.75F, 2F, 9F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[382].setRotationPoint(9F, -19F, 1F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 370
		bodyModel[383].setRotationPoint(9F, -19F, -8F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 371
		bodyModel[384].setRotationPoint(9F, -19F, -1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1F, -7F, 0F, 1F, -7F); // Box 547
		bodyModel[385].setRotationPoint(10F, -19.51F, 1F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, -1F, -7F, -19F, -1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, -19F, 1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[386].setRotationPoint(10F, -19.51F, -15F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534
		bodyModel[387].setRotationPoint(16F, -15F, -11.1F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[388].setRotationPoint(18.75F, -15F, -11.35F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[389].setRotationPoint(13F, -15F, -11.1F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[390].setRotationPoint(18.75F, -15F, 10.35F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[391].setRotationPoint(16F, -15F, 10.1F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[392].setRotationPoint(13F, -15F, 10.1F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 13, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[393].setRotationPoint(-5.5F, -11F, -4.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[394].setRotationPoint(-5.5F, 0F, -2.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 244
		bodyModel[395].setRotationPoint(7.05F, -16.5F, -3F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 245
		bodyModel[396].setRotationPoint(10F, -14F, -1F);

		bodyModel[397].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 246
		bodyModel[397].setRotationPoint(6.5F, -16F, 3F);

		bodyModel[398].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 247
		bodyModel[398].setRotationPoint(6.5F, -16F, -7F);

		bodyModel[399].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 248
		bodyModel[399].setRotationPoint(10F, -13F, -2F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[400].setRotationPoint(10F, -11F, -1F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[401].setRotationPoint(10F, -13F, 4F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[402].setRotationPoint(-5.5F, -9F, -6F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[403].setRotationPoint(-5.5F, -11.5F, -7F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[404].setRotationPoint(-5.5F, -11.5F, 5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[405].setRotationPoint(-5.5F, -9F, 5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.5F, 3F, -0.5F, 0F, 3F, -0.5F, 0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F, -0.5F, -3F, -0.5F, 0F, -3F, -0.5F); // Box 257
		bodyModel[406].setRotationPoint(11.5F, -10F, 1.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[407].setRotationPoint(10F, -13F, -6F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -3F, -0.5F, -0.5F, -3F, -0.5F, -0.625F, -0.75F, -0.5F, 0.125F, -0.75F, -0.5F, 0F, 3F, -0.5F, -0.5F, 3F, -0.5F, -0.625F, 0F, 0F, 0.125F, 0F, 0F); // Box 261
		bodyModel[408].setRotationPoint(11.5F, -16F, -4.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 264
		bodyModel[409].setRotationPoint(10.5F, -13F, -3F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, -1F, -0.125F, 0F, -1F, -0.125F, -1F, 0.5F, -0.375F, -1F, 0.5F); // Box 265
		bodyModel[410].setRotationPoint(10.5F, -11F, -3F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.375F, -1F, 0.5F, -0.125F, -1F, 0.5F, -0.125F, 0F, -1F, -0.375F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F); // Box 267
		bodyModel[411].setRotationPoint(10.5F, -15F, 2F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 268
		bodyModel[412].setRotationPoint(10.5F, -13F, 2F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 270
		bodyModel[413].setRotationPoint(10.5F, -6.5F, -6F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[414].setRotationPoint(10.5F, -10.5F, -5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 272
		bodyModel[415].setRotationPoint(6.5F, -9F, -7F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[416].setRotationPoint(8.5F, -6.5F, -7F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[417].setRotationPoint(7.5F, -6.5F, 5.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275
		bodyModel[418].setRotationPoint(6.5F, -9F, 3.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[419].setRotationPoint(7.5F, -3F, 0.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 277
		bodyModel[420].setRotationPoint(9.5F, -5F, 1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[421].setRotationPoint(7.5F, -6F, 1F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 279
		bodyModel[422].setRotationPoint(9.5F, -8.5F, -3F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[423].setRotationPoint(7.5F, -13F, -4.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[424].setRotationPoint(7F, -3F, -3F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 1F, -0.05F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[425].setRotationPoint(7.5F, -7.5F, -7F);

		bodyModel[426].addShapeBox(0F, 0F, -2F, 12, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[426].setRotationPoint(-5.6F, -14F, -4.25F);
		bodyModel[426].rotateAngleX = 0.31415927F;

		bodyModel[427].addShapeBox(0F, 0F, -2F, 12, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[427].setRotationPoint(-5.6F, -14F, 4.25F);
		bodyModel[427].rotateAngleX = -0.31415927F;

		bodyModel[428].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[428].setRotationPoint(-5.5F, -13F, -1.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[429].setRotationPoint(-5.5F, -15.5F, -0.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Box 287 cull
		bodyModel[430].setRotationPoint(5F, -15.5F, -0.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Box 288 cull
		bodyModel[431].setRotationPoint(2F, -15.5F, -0.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Box 289 cull
		bodyModel[432].setRotationPoint(-1F, -15.5F, -0.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Box 290 cull
		bodyModel[433].setRotationPoint(-4F, -15.5F, -0.5F);

		bodyModel[434].addShapeBox(-1F, -0.5F, 2.5F, 13, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 291
		bodyModel[434].setRotationPoint(-5.6F, -14F, 4.25F);
		bodyModel[434].rotateAngleX = -0.52359878F;

		bodyModel[435].addShapeBox(-1F, -0.5F, -2.5F, 13, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 292
		bodyModel[435].setRotationPoint(-5.6F, -14F, -4.25F);
		bodyModel[435].rotateAngleX = 0.52359878F;

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 294 cull thin bits between cylinders
		bodyModel[436].setRotationPoint(1F, -14.25F, -6.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 294 cull thin bits between cylinders
		bodyModel[437].setRotationPoint(-5F, -14.25F, -6.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.375F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.625F, -1F, 0F, 0.125F, -1F, 0F, -0.375F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, 0.125F, 0F, -0.5F); // Box 297
		bodyModel[438].setRotationPoint(11F, -16F, -2F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0.125F, -1F, 0F, -0.625F, -1F, 0F, -0.125F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Box 298
		bodyModel[439].setRotationPoint(11F, -10F, -2F);

		bodyModel[440].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 301 exhaust FDL
		bodyModel[440].setRotationPoint(5.05F, -20.5F, -3F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 303 u can also get jiggy an shake your 7fdl
		bodyModel[441].setRotationPoint(6.05F, -18.5F, -3F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 298
		bodyModel[442].setRotationPoint(-13.5F, -10F, -2F);

		bodyModel[443].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Box 299
		bodyModel[443].setRotationPoint(-13.5F, -7F, -5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[444].setRotationPoint(-13.5F, -3F, -2F);

		bodyModel[445].addBox(0F, 0F, 0F, 2, 6, 8, 0F); // Box 303
		bodyModel[445].setRotationPoint(-7.5F, -6F, -4F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[446].setRotationPoint(-7.5F, -11F, -5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[447].setRotationPoint(-7.5F, -7F, -4F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[448].setRotationPoint(-7.5F, -11F, 1F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[449].setRotationPoint(-7.5F, -13F, -1F);

		bodyModel[450].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 308
		bodyModel[450].setRotationPoint(6.5F, -16.5F, -5.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 309
		bodyModel[451].setRotationPoint(5.5F, -16.5F, -4.5F);

		bodyModel[452].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 310
		bodyModel[452].setRotationPoint(6.5F, -16.5F, 4.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 453 headlight GIANT
		bodyModel[453].setRotationPoint(-36F, -12F, -2F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 454 headlight GIANT low
		bodyModel[454].setRotationPoint(-36F, -7F, -2F);

		bodyModel[455].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 455 NOCTA bottom red gyra
		bodyModel[455].setRotationPoint(-36.27F, -6F, 0F);

		bodyModel[456].addBox(0F, 0F, 0F, 7, 2, 8, 0F); // Box 456 fmsr winterization hatch CULL
		bodyModel[456].setRotationPoint(10F, -20.65F, -4F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.2F, 0F, 0.01F, 0.2F, 0F, 0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F); // exhaust original
		bodyModel[457].setRotationPoint(7F, -20.5F, -2F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 458 fmsr nose mu plug
		bodyModel[458].setRotationPoint(-36.5F, -2.5F, -6F);
	}
	ModelTypeBnew theBetterTrucks = new ModelTypeBnew();
	ModelFB2_new theF = new ModelFB2_new();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 621 ||GetColor(entity) == 954) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.19, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.53, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}else if (GetColor(entity) == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_b.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.19, -0.03, 0);
			theF.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.53, 0, 0);
			theF.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.19, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.53, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}