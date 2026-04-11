// Model: EMD GP20
// Model Creator: cubedr
// Created on: 02.01.2025 - 09:19:22
// Last changed on: 02.01.2025 - 09:19:22

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
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

public class ModelGP20 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP20() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[475];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 7, 184, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 9, 34, textureX, textureY); // Box 271
		bodyModel[2] = new ModelRendererTurbo(this, 0, 42, textureX, textureY); // Box 272
		bodyModel[3] = new ModelRendererTurbo(this, 11, 44, textureX, textureY); // Box 273
		bodyModel[4] = new ModelRendererTurbo(this, 6, 24, textureX, textureY, "cull"); // Box cull step backplate
		bodyModel[5] = new ModelRendererTurbo(this, 32, 27, textureX, textureY, "cull"); // Box cull step backplate
		bodyModel[6] = new ModelRendererTurbo(this, 9, 37, textureX, textureY); // Box 271
		bodyModel[7] = new ModelRendererTurbo(this, 120, 236, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 115, 242, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 33, 174, textureX, textureY); // Box 266
		bodyModel[10] = new ModelRendererTurbo(this, 120, 236, textureX, textureY); // Box 5
		bodyModel[11] = new ModelRendererTurbo(this, 127, 242, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 52, 219, textureX, textureY); // Box 209
		bodyModel[13] = new ModelRendererTurbo(this, 22, 46, textureX, textureY); // Box 210
		bodyModel[14] = new ModelRendererTurbo(this, 52, 212, textureX, textureY); // Box 211
		bodyModel[15] = new ModelRendererTurbo(this, 148, 198, textureX, textureY); // Box 364
		bodyModel[16] = new ModelRendererTurbo(this, 159, 208, textureX, textureY); // Box 365
		bodyModel[17] = new ModelRendererTurbo(this, 171, 208, textureX, textureY); // Box 366
		bodyModel[18] = new ModelRendererTurbo(this, 52, 209, textureX, textureY); // Box 143
		bodyModel[19] = new ModelRendererTurbo(this, 55, 209, textureX, textureY); // Box 143
		bodyModel[20] = new ModelRendererTurbo(this, 156, 212, textureX, textureY); // Box 143
		bodyModel[21] = new ModelRendererTurbo(this, 182, 212, textureX, textureY); // Box 143
		bodyModel[22] = new ModelRendererTurbo(this, 48, 165, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 48, 156, textureX, textureY); // Box 47
		bodyModel[24] = new ModelRendererTurbo(this, 53, 172, textureX, textureY); // Box 48
		bodyModel[25] = new ModelRendererTurbo(this, 53, 163, textureX, textureY); // Box 49
		bodyModel[26] = new ModelRendererTurbo(this, 310, 231, textureX, textureY); // Box 486
		bodyModel[27] = new ModelRendererTurbo(this, 263, 217, textureX, textureY); // Box 487
		bodyModel[28] = new ModelRendererTurbo(this, 251, 236, textureX, textureY); // Box 488
		bodyModel[29] = new ModelRendererTurbo(this, 326, 247, textureX, textureY); // Box 489
		bodyModel[30] = new ModelRendererTurbo(this, 263, 212, textureX, textureY); // Box 805
		bodyModel[31] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 60
		bodyModel[32] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 61
		bodyModel[33] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 62
		bodyModel[34] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 64
		bodyModel[36] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 72
		bodyModel[37] = new ModelRendererTurbo(this, 257, 200, textureX, textureY); // Box 78
		bodyModel[38] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 69
		bodyModel[39] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 143
		bodyModel[40] = new ModelRendererTurbo(this, 32, 189, textureX, textureY); // Box 63
		bodyModel[41] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 129
		bodyModel[42] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 130
		bodyModel[43] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 133
		bodyModel[44] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 134
		bodyModel[45] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 322
		bodyModel[46] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 323
		bodyModel[47] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 324
		bodyModel[48] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 325
		bodyModel[49] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 4
		bodyModel[50] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 327
		bodyModel[51] = new ModelRendererTurbo(this, 406, 211, textureX, textureY); // Box 347 side air tank standard
		bodyModel[52] = new ModelRendererTurbo(this, 406, 211, textureX, textureY); // Box 347 side air tank standard
		bodyModel[53] = new ModelRendererTurbo(this, 227, 140, textureX, textureY); // Box batbox+cabfloor
		bodyModel[54] = new ModelRendererTurbo(this, 349, 40, textureX, textureY); // Box 132
		bodyModel[55] = new ModelRendererTurbo(this, 349, 24, textureX, textureY); // Box 136
		bodyModel[56] = new ModelRendererTurbo(this, 199, 161, textureX, textureY); // Box 139
		bodyModel[57] = new ModelRendererTurbo(this, 202, 161, textureX, textureY); // Box 140
		bodyModel[58] = new ModelRendererTurbo(this, 202, 149, textureX, textureY); // Box 141
		bodyModel[59] = new ModelRendererTurbo(this, 199, 149, textureX, textureY); // Box 142
		bodyModel[60] = new ModelRendererTurbo(this, 103, 120, textureX, textureY); // Box 216
		bodyModel[61] = new ModelRendererTurbo(this, 73, 120, textureX, textureY); // Box 217
		bodyModel[62] = new ModelRendererTurbo(this, 92, 124, textureX, textureY); // Box 218
		bodyModel[63] = new ModelRendererTurbo(this, 130, 112, textureX, textureY); // Box 215
		bodyModel[64] = new ModelRendererTurbo(this, 205, 145, textureX, textureY); // Box 370
		bodyModel[65] = new ModelRendererTurbo(this, 333, 28, textureX, textureY); // Box 372
		bodyModel[66] = new ModelRendererTurbo(this, 333, 44, textureX, textureY); // Box 373
		bodyModel[67] = new ModelRendererTurbo(this, 205, 157, textureX, textureY); // Box 374
		bodyModel[68] = new ModelRendererTurbo(this, 125, 89, textureX, textureY); // Box 350
		bodyModel[69] = new ModelRendererTurbo(this, 103, 97, textureX, textureY); // Box 351
		bodyModel[70] = new ModelRendererTurbo(this, 92, 101, textureX, textureY); // Box 352
		bodyModel[71] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 353
		bodyModel[72] = new ModelRendererTurbo(this, 91, 93, textureX, textureY, "lamp"); // Box 117 numberboard front high
		bodyModel[73] = new ModelRendererTurbo(this, 91, 93, textureX, textureY, "lamp"); // Box 118 numberboard front high
		bodyModel[74] = new ModelRendererTurbo(this, 32, 120, textureX, textureY, "lamp"); // Box 215 headlight front 1
		bodyModel[75] = new ModelRendererTurbo(this, 25, 120, textureX, textureY); // Box 216
		bodyModel[76] = new ModelRendererTurbo(this, 32, 125, textureX, textureY, "lamp"); // Box 217 headlight front 2
		bodyModel[77] = new ModelRendererTurbo(this, 25, 125, textureX, textureY); // Box 311
		bodyModel[78] = new ModelRendererTurbo(this, 168, 132, textureX, textureY); // Box 137 front step
		bodyModel[79] = new ModelRendererTurbo(this, 2, 97, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[80] = new ModelRendererTurbo(this, 2, 91, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[81] = new ModelRendererTurbo(this, 229, 76, textureX, textureY); // Box 119
		bodyModel[82] = new ModelRendererTurbo(this, 218, 45, textureX, textureY); // Box 125
		bodyModel[83] = new ModelRendererTurbo(this, 308, 89, textureX, textureY); // Box 9
		bodyModel[84] = new ModelRendererTurbo(this, 235, 89, textureX, textureY); // Box 10
		bodyModel[85] = new ModelRendererTurbo(this, 185, 72, textureX, textureY); // Box 15
		bodyModel[86] = new ModelRendererTurbo(this, 258, 72, textureX, textureY); // Box 21
		bodyModel[87] = new ModelRendererTurbo(this, 297, 86, textureX, textureY); // Box 314 door swing right
		bodyModel[88] = new ModelRendererTurbo(this, 224, 86, textureX, textureY); // Box 315 door swing right
		bodyModel[89] = new ModelRendererTurbo(this, 258, 45, textureX, textureY); // Box 371
		bodyModel[90] = new ModelRendererTurbo(this, 218, 76, textureX, textureY); // Box 372
		bodyModel[91] = new ModelRendererTurbo(this, 258, 76, textureX, textureY); // Box 373
		bodyModel[92] = new ModelRendererTurbo(this, 229, 45, textureX, textureY); // Box 374
		bodyModel[93] = new ModelRendererTurbo(this, 152, 54, textureX, textureY); // Box 411
		bodyModel[94] = new ModelRendererTurbo(this, 189, 54, textureX, textureY); // Box 412
		bodyModel[95] = new ModelRendererTurbo(this, 226, 68, textureX, textureY); // Box 39
		bodyModel[96] = new ModelRendererTurbo(this, 227, 61, textureX, textureY); // Box 347
		bodyModel[97] = new ModelRendererTurbo(this, 226, 53, textureX, textureY); // Box 348
		bodyModel[98] = new ModelRendererTurbo(this, 346, 113, textureX, textureY); // Box 219
		bodyModel[99] = new ModelRendererTurbo(this, 365, 117, textureX, textureY); // Box 220
		bodyModel[100] = new ModelRendererTurbo(this, 376, 113, textureX, textureY); // Box 221
		bodyModel[101] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 223
		bodyModel[102] = new ModelRendererTurbo(this, 398, 130, textureX, textureY); // Box 43
		bodyModel[103] = new ModelRendererTurbo(this, 399, 133, textureX, textureY); // Box 43
		bodyModel[104] = new ModelRendererTurbo(this, 398, 58, textureX, textureY); // Box 89 dynamic fan
		bodyModel[105] = new ModelRendererTurbo(this, 340, 85, textureX, textureY); // Box 91
		bodyModel[106] = new ModelRendererTurbo(this, 352, 75, textureX, textureY); // Box 101
		bodyModel[107] = new ModelRendererTurbo(this, 338, 75, textureX, textureY); // Box 105
		bodyModel[108] = new ModelRendererTurbo(this, 374, 75, textureX, textureY); // Box 172
		bodyModel[109] = new ModelRendererTurbo(this, 352, 80, textureX, textureY); // Box 173
		bodyModel[110] = new ModelRendererTurbo(this, 338, 80, textureX, textureY); // Box 176
		bodyModel[111] = new ModelRendererTurbo(this, 374, 80, textureX, textureY); // Box 177
		bodyModel[112] = new ModelRendererTurbo(this, 352, 101, textureX, textureY); // Box 178
		bodyModel[113] = new ModelRendererTurbo(this, 374, 101, textureX, textureY); // Box 179
		bodyModel[114] = new ModelRendererTurbo(this, 374, 106, textureX, textureY); // Box 180
		bodyModel[115] = new ModelRendererTurbo(this, 352, 106, textureX, textureY); // Box 181
		bodyModel[116] = new ModelRendererTurbo(this, 338, 106, textureX, textureY); // Box 182
		bodyModel[117] = new ModelRendererTurbo(this, 338, 101, textureX, textureY); // Box 183
		bodyModel[118] = new ModelRendererTurbo(this, 366, 113, textureX, textureY); // Box 191
		bodyModel[119] = new ModelRendererTurbo(this, 93, 89, textureX, textureY); // Box 190
		bodyModel[120] = new ModelRendererTurbo(this, 388, 40, textureX, textureY); // Box 176
		bodyModel[121] = new ModelRendererTurbo(this, 368, 40, textureX, textureY); // Box 500
		bodyModel[122] = new ModelRendererTurbo(this, 379, 40, textureX, textureY); // Box 313
		bodyModel[123] = new ModelRendererTurbo(this, 469, 40, textureX, textureY); // Box 462
		bodyModel[124] = new ModelRendererTurbo(this, 469, 24, textureX, textureY); // Box 463
		bodyModel[125] = new ModelRendererTurbo(this, 324, 158, textureX, textureY); // Box 362
		bodyModel[126] = new ModelRendererTurbo(this, 345, 162, textureX, textureY); // Box 237
		bodyModel[127] = new ModelRendererTurbo(this, 308, 158, textureX, textureY, "cull"); // Box cull stepper
		bodyModel[128] = new ModelRendererTurbo(this, 313, 168, textureX, textureY); // Box 238
		bodyModel[129] = new ModelRendererTurbo(this, 388, 24, textureX, textureY); // Box 38R
		bodyModel[130] = new ModelRendererTurbo(this, 379, 26, textureX, textureY); // Box 314
		bodyModel[131] = new ModelRendererTurbo(this, 433, 160, textureX, textureY, "lamp"); // Box 359 headlight rear 1
		bodyModel[132] = new ModelRendererTurbo(this, 426, 160, textureX, textureY); // Box 360
		bodyModel[133] = new ModelRendererTurbo(this, 426, 165, textureX, textureY); // Box 222
		bodyModel[134] = new ModelRendererTurbo(this, 433, 165, textureX, textureY, "lamp"); // Box 223 headlight rear 2
		bodyModel[135] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[136] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[137] = new ModelRendererTurbo(this, 62, 77, textureX, textureY); // Box 74
		bodyModel[138] = new ModelRendererTurbo(this, 71, 75, textureX, textureY); // Box 644
		bodyModel[139] = new ModelRendererTurbo(this, 72, 66, textureX, textureY); // Box 645
		bodyModel[140] = new ModelRendererTurbo(this, 61, 71, textureX, textureY); // Box 646
		bodyModel[141] = new ModelRendererTurbo(this, 44, 66, textureX, textureY); // Box 647
		bodyModel[142] = new ModelRendererTurbo(this, 45, 75, textureX, textureY); // Box 648
		bodyModel[143] = new ModelRendererTurbo(this, 67, 71, textureX, textureY); // Box 649
		bodyModel[144] = new ModelRendererTurbo(this, 73, 84, textureX, textureY, "lamp"); // Box 363 numberboard chop A
		bodyModel[145] = new ModelRendererTurbo(this, 73, 84, textureX, textureY, "lamp"); // Box 364 numberboard chop A
		bodyModel[146] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 256
		bodyModel[147] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 257
		bodyModel[148] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 583
		bodyModel[149] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 584
		bodyModel[150] = new ModelRendererTurbo(this, 334, 40, textureX, textureY); // Box 261
		bodyModel[151] = new ModelRendererTurbo(this, 329, 40, textureX, textureY); // Box 341
		bodyModel[152] = new ModelRendererTurbo(this, 330, 42, textureX, textureY); // Box 342
		bodyModel[153] = new ModelRendererTurbo(this, 334, 24, textureX, textureY); // Box 343
		bodyModel[154] = new ModelRendererTurbo(this, 330, 26, textureX, textureY); // Box 344
		bodyModel[155] = new ModelRendererTurbo(this, 329, 24, textureX, textureY); // Box 345
		bodyModel[156] = new ModelRendererTurbo(this, 254, 186, textureX, textureY); // Box 114
		bodyModel[157] = new ModelRendererTurbo(this, 254, 183, textureX, textureY); // Box 74
		bodyModel[158] = new ModelRendererTurbo(this, 254, 189, textureX, textureY); // Box 78
		bodyModel[159] = new ModelRendererTurbo(this, 310, 242, textureX, textureY); // Box 19 front fuel fill
		bodyModel[160] = new ModelRendererTurbo(this, 310, 242, textureX, textureY); // Box 19 front fuel fill
		bodyModel[161] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 78
		bodyModel[162] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 188
		bodyModel[163] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front
		bodyModel[164] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front
		bodyModel[165] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 239
		bodyModel[166] = new ModelRendererTurbo(this, 451, 175, textureX, textureY, BoxName.ditch); // Box 240 ditchlight rear
		bodyModel[167] = new ModelRendererTurbo(this, 451, 175, textureX, textureY, BoxName.ditch); // Box 241 ditchlight rear
		bodyModel[168] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 242
		bodyModel[169] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 188
		bodyModel[170] = new ModelRendererTurbo(this, 8, 112, textureX, textureY); // Box 190
		bodyModel[171] = new ModelRendererTurbo(this, 8, 117, textureX, textureY); // Box 190
		bodyModel[172] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 188
		bodyModel[173] = new ModelRendererTurbo(this, 8, 122, textureX, textureY); // Box 190
		bodyModel[174] = new ModelRendererTurbo(this, 8, 127, textureX, textureY); // Box 190
		bodyModel[175] = new ModelRendererTurbo(this, 458, 173, textureX, textureY); // Box 188
		bodyModel[176] = new ModelRendererTurbo(this, 465, 170, textureX, textureY); // Box 190
		bodyModel[177] = new ModelRendererTurbo(this, 465, 175, textureX, textureY); // Box 190
		bodyModel[178] = new ModelRendererTurbo(this, 458, 163, textureX, textureY); // Box 188
		bodyModel[179] = new ModelRendererTurbo(this, 465, 160, textureX, textureY); // Box 190
		bodyModel[180] = new ModelRendererTurbo(this, 465, 165, textureX, textureY); // Box 190
		bodyModel[181] = new ModelRendererTurbo(this, 444, 170, textureX, textureY); // Box 392
		bodyModel[182] = new ModelRendererTurbo(this, 444, 165, textureX, textureY); // Box 393
		bodyModel[183] = new ModelRendererTurbo(this, 451, 170, textureX, textureY); // Box 394
		bodyModel[184] = new ModelRendererTurbo(this, 451, 165, textureX, textureY); // Box 395
		bodyModel[185] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 396
		bodyModel[186] = new ModelRendererTurbo(this, 1, 132, textureX, textureY); // Box 397
		bodyModel[187] = new ModelRendererTurbo(this, 8, 137, textureX, textureY); // Box 398
		bodyModel[188] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 399
		bodyModel[189] = new ModelRendererTurbo(this, 51, 240, textureX, textureY); // Box 132
		bodyModel[190] = new ModelRendererTurbo(this, 30, 240, textureX, textureY); // Box 133
		bodyModel[191] = new ModelRendererTurbo(this, 62, 242, textureX, textureY); // Box 22
		bodyModel[192] = new ModelRendererTurbo(this, 85, 242, textureX, textureY); // Box 23
		bodyModel[193] = new ModelRendererTurbo(this, 65, 230, textureX, textureY); // Box 24
		bodyModel[194] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Box 25
		bodyModel[195] = new ModelRendererTurbo(this, 221, 242, textureX, textureY); // Box 431
		bodyModel[196] = new ModelRendererTurbo(this, 198, 242, textureX, textureY); // Box 432
		bodyModel[197] = new ModelRendererTurbo(this, 201, 230, textureX, textureY); // Box 433
		bodyModel[198] = new ModelRendererTurbo(this, 224, 230, textureX, textureY); // Box 434
		bodyModel[199] = new ModelRendererTurbo(this, 68, 218, textureX, textureY); // Box 4
		bodyModel[200] = new ModelRendererTurbo(this, 91, 218, textureX, textureY); // Box 322
		bodyModel[201] = new ModelRendererTurbo(this, 71, 206, textureX, textureY); // Box 438
		bodyModel[202] = new ModelRendererTurbo(this, 94, 206, textureX, textureY); // Box 439
		bodyModel[203] = new ModelRendererTurbo(this, 204, 218, textureX, textureY); // Box 441
		bodyModel[204] = new ModelRendererTurbo(this, 230, 206, textureX, textureY); // Box 442
		bodyModel[205] = new ModelRendererTurbo(this, 207, 206, textureX, textureY); // Box 443
		bodyModel[206] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[207] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[208] = new ModelRendererTurbo(this, 283, 73, textureX, textureY,"cull"); // Box 3 cull aww
		bodyModel[209] = new ModelRendererTurbo(this, 283, 62, textureX, textureY, "cull"); // Box 306 cull aww
		bodyModel[210] = new ModelRendererTurbo(this, 457, 203, textureX, textureY); // Box 50
		bodyModel[211] = new ModelRendererTurbo(this, 7, 233, textureX, textureY, "cull"); // Box 456 cull
		bodyModel[212] = new ModelRendererTurbo(this, 456, 225, textureX, textureY, "cull"); // Box 475
		bodyModel[213] = new ModelRendererTurbo(this, 432, 195, textureX, textureY,"cull"); // Box 476 cull
		bodyModel[214] = new ModelRendererTurbo(this, 203, 21, textureX, textureY, "cull"); // Box cull GN step backplate
		bodyModel[215] = new ModelRendererTurbo(this, 226, 26, textureX, textureY); // Box 481
		bodyModel[216] = new ModelRendererTurbo(this, 227, 21, textureX, textureY, "cull"); // Box cull GN step backplate
		bodyModel[217] = new ModelRendererTurbo(this, 199, 1, textureX, textureY); // Box gn stepoids
		bodyModel[218] = new ModelRendererTurbo(this, 209, 2, textureX, textureY); // Box gn stepoids
		bodyModel[219] = new ModelRendererTurbo(this, 57, 30, textureX, textureY, "cull"); // Box cull step backplate
		bodyModel[220] = new ModelRendererTurbo(this, 171, 59, textureX, textureY); // Box 559
		bodyModel[221] = new ModelRendererTurbo(this, 187, 240, textureX, textureY); // Box 552
		bodyModel[222] = new ModelRendererTurbo(this, 166, 240, textureX, textureY); // Box 553
		bodyModel[223] = new ModelRendererTurbo(this, 227, 218, textureX, textureY); // Box 554
		bodyModel[224] = new ModelRendererTurbo(this, 335, 196, textureX, textureY); // Box milw gp20 tank
		bodyModel[225] = new ModelRendererTurbo(this, 295, 237, textureX, textureY); // Box 582
		bodyModel[226] = new ModelRendererTurbo(this, 93, 112, textureX, textureY); // Box sandcap chopnose
		bodyModel[227] = new ModelRendererTurbo(this, 39, 135, textureX, textureY); // Box 113 stock low nose
		bodyModel[228] = new ModelRendererTurbo(this, 86, 143, textureX, textureY); // Box 113 stock low nose
		bodyModel[229] = new ModelRendererTurbo(this, 92, 141, textureX, textureY); // Box 113 stock low nose
		bodyModel[230] = new ModelRendererTurbo(this, 72, 141, textureX, textureY); // Box 113 stock low nose
		bodyModel[231] = new ModelRendererTurbo(this, 105, 143, textureX, textureY); // Box 202 sandcap low nose
		bodyModel[232] = new ModelRendererTurbo(this, 493, 166, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[233] = new ModelRendererTurbo(this, 472, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[234] = new ModelRendererTurbo(this, 493, 75, textureX, textureY, "lamp"); // Box 591 speedoooo
		bodyModel[235] = new ModelRendererTurbo(this, 75, 242, textureX, textureY); // Box 448
		bodyModel[236] = new ModelRendererTurbo(this, 81, 218, textureX, textureY); // Box 323
		bodyModel[237] = new ModelRendererTurbo(this, 78, 230, textureX, textureY); // Box 280
		bodyModel[238] = new ModelRendererTurbo(this, 84, 206, textureX, textureY); // Box 285
		bodyModel[239] = new ModelRendererTurbo(this, 220, 206, textureX, textureY); // Box 517
		bodyModel[240] = new ModelRendererTurbo(this, 217, 218, textureX, textureY); // Box 518
		bodyModel[241] = new ModelRendererTurbo(this, 211, 242, textureX, textureY); // Box 519
		bodyModel[242] = new ModelRendererTurbo(this, 214, 230, textureX, textureY); // Box 520
		bodyModel[243] = new ModelRendererTurbo(this, 403, 131, textureX, textureY); // Box 43
		bodyModel[244] = new ModelRendererTurbo(this, 402, 129, textureX, textureY); // Box 355 brakewheel
		bodyModel[245] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, BoxName.ditch); // Box 621 low ditchlight f
		bodyModel[246] = new ModelRendererTurbo(this, 1, 147, textureX, textureY,"cull"); // Box 622 cull
		bodyModel[247] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, BoxName.ditch); // Box 623 low ditchlight f
		bodyModel[248] = new ModelRendererTurbo(this, 1, 147, textureX, textureY, "cull"); // Box 624 cull
		bodyModel[249] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, BoxName.ditch); // Box 625 low ditchlight r
		bodyModel[250] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, BoxName.ditch); // Box 626 low ditchlight r
		bodyModel[251] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 627 cull
		bodyModel[252] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 628 cull
		bodyModel[253] = new ModelRendererTurbo(this, 225, 110, textureX, textureY); // Box 123 sunshade
		bodyModel[254] = new ModelRendererTurbo(this, 225, 107, textureX, textureY); // Box 311 sunshade
		bodyModel[255] = new ModelRendererTurbo(this, 194, 167, textureX, textureY); // Box 635 locomotive plate
		bodyModel[256] = new ModelRendererTurbo(this, 194, 167, textureX, textureY); // Box 636 locomotive plate
		bodyModel[257] = new ModelRendererTurbo(this, 304, 169, textureX, textureY); // Box 631
		bodyModel[258] = new ModelRendererTurbo(this, 141, 41, textureX, textureY); // Box 300 marker box
		bodyModel[259] = new ModelRendererTurbo(this, 146, 40, textureX, textureY, "lamp"); // Box 301 sd9 markerlight
		bodyModel[260] = new ModelRendererTurbo(this, 149, 41, textureX, textureY); // Box 302 marker box
		bodyModel[261] = new ModelRendererTurbo(this, 146, 40, textureX, textureY, "lamp"); // Box 303 sd9 markerlight
		bodyModel[262] = new ModelRendererTurbo(this, 149, 53, textureX, textureY); // Box chop markers 
		bodyModel[263] = new ModelRendererTurbo(this, 156, 52, textureX, textureY,"lamp"); // Box chop markers glow
		bodyModel[264] = new ModelRendererTurbo(this, 141, 53, textureX, textureY); // Box chop markers 
		bodyModel[265] = new ModelRendererTurbo(this, 156, 55, textureX, textureY, "lamp"); // Box chop markers glow
		bodyModel[266] = new ModelRendererTurbo(this, 147, 34, textureX, textureY, "lamp"); // Box lownose markers glow
		bodyModel[267] = new ModelRendererTurbo(this, 147, 34, textureX, textureY, "lamp"); // Box lownose markers glow
		bodyModel[268] = new ModelRendererTurbo(this, 150, 35, textureX, textureY); // Box lownose markers
		bodyModel[269] = new ModelRendererTurbo(this, 141, 35, textureX, textureY); // Box lownose markers
		bodyModel[270] = new ModelRendererTurbo(this, 146, 51, textureX, textureY, "lamp"); // Box 644
		bodyModel[271] = new ModelRendererTurbo(this, 149, 46, textureX, textureY); // Box 645
		bodyModel[272] = new ModelRendererTurbo(this, 146, 51, textureX, textureY, "lamp"); // Box 646
		bodyModel[273] = new ModelRendererTurbo(this, 141, 46, textureX, textureY); // Box 647
		bodyModel[274] = new ModelRendererTurbo(this, 326, 242, textureX, textureY); // Box milw gp20 tank
		bodyModel[275] = new ModelRendererTurbo(this, 345, 231, textureX, textureY); // Box milw gp20 tank
		bodyModel[276] = new ModelRendererTurbo(this, 323, 175, textureX, textureY); // Box milw gp20 tank
		bodyModel[277] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box milw gp20 tank
		bodyModel[278] = new ModelRendererTurbo(this, 313, 212, textureX, textureY); // Box milw gp20 tank
		bodyModel[279] = new ModelRendererTurbo(this, 429, 227, textureX, textureY); // Box gn gp20 tanks + omaha gp20 rear tank
		bodyModel[280] = new ModelRendererTurbo(this, 402, 232, textureX, textureY); // Box gn gp20 tanks + omaha gp20 rear tank
		bodyModel[281] = new ModelRendererTurbo(this, 316, 200, textureX, textureY); // Box omaha gp20 tank
		bodyModel[282] = new ModelRendererTurbo(this, 299, 180, textureX, textureY); // Box omaha gp20 tank
		bodyModel[283] = new ModelRendererTurbo(this, 347, 242, textureX, textureY); // Box omaha gp20 tank
		bodyModel[284] = new ModelRendererTurbo(this, 366, 231, textureX, textureY); // Box omaha gp20 tank
		bodyModel[285] = new ModelRendererTurbo(this, 298, 212, textureX, textureY); // Box omaha gp20 tank
		bodyModel[286] = new ModelRendererTurbo(this, 298, 217, textureX, textureY); // Box omaha gp20 tank
		bodyModel[287] = new ModelRendererTurbo(this, 328, 61, textureX, textureY); // Box 304
		bodyModel[288] = new ModelRendererTurbo(this, 376, 55, textureX, textureY); // Box 665
		bodyModel[289] = new ModelRendererTurbo(this, 354, 58, textureX, textureY); // Box 666
		bodyModel[290] = new ModelRendererTurbo(this, 346, 40, textureX, textureY); // Box 131
		bodyModel[291] = new ModelRendererTurbo(this, 343, 40, textureX, textureY); // Box 133
		bodyModel[292] = new ModelRendererTurbo(this, 343, 24, textureX, textureY); // Box 134
		bodyModel[293] = new ModelRendererTurbo(this, 346, 24, textureX, textureY); // Box 135
		bodyModel[294] = new ModelRendererTurbo(this, 63, 84, textureX, textureY, "lamp"); // Box 186 headlight f chop 1
		bodyModel[295] = new ModelRendererTurbo(this, 63, 89, textureX, textureY, "lamp"); // Box 187 headlight f chop 2
		bodyModel[296] = new ModelRendererTurbo(this, 371, 90, textureX, textureY); // Box exhaust standard
		bodyModel[297] = new ModelRendererTurbo(this, 163, 8, textureX, textureY, "cull"); // Box 151 lownose housing cull
		bodyModel[298] = new ModelRendererTurbo(this, 32, 130, textureX, textureY, "lamp"); // Box 151 headlight front lows
		bodyModel[299] = new ModelRendererTurbo(this, 32, 135, textureX, textureY, "lamp"); // Box 151 headlight front lows
		bodyModel[300] = new ModelRendererTurbo(this, 385, 95, textureX, textureY); // Box atsf exhaust
		bodyModel[301] = new ModelRendererTurbo(this, 314, 81, textureX, textureY); // Box SP/CR/PC rebuild exhaust
		bodyModel[302] = new ModelRendererTurbo(this, 325, 81, textureX, textureY); // Box SP/CR/PC rebuild exhaust
		bodyModel[303] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Box SP/CR/PC rebuild exhaust
		bodyModel[304] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Box SP/CR/PC rebuild exhaust
		bodyModel[305] = new ModelRendererTurbo(this, 334, 53, textureX, textureY); // Box SP/CR/PC rebuild
		bodyModel[306] = new ModelRendererTurbo(this, 345, 224, textureX, textureY); // Box omaha gp20 tank extensions
		bodyModel[307] = new ModelRendererTurbo(this, 302, 224, textureX, textureY); // Box omaha gp20 tank extensions
		bodyModel[308] = new ModelRendererTurbo(this, 286, 140, textureX, textureY); // Box 388
		bodyModel[309] = new ModelRendererTurbo(this, 305, 140, textureX, textureY); // Box 389
		bodyModel[310] = new ModelRendererTurbo(this, 126, 7, textureX, textureY); // box hh 20 chop
		bodyModel[311] = new ModelRendererTurbo(this, 93, 1, textureX, textureY); // box hh 20 chop
		bodyModel[312] = new ModelRendererTurbo(this, 139, 5, textureX, textureY); // box hh 20 chop
		bodyModel[313] = new ModelRendererTurbo(this, 152, 7, textureX, textureY); // box hh 20 chop
		bodyModel[314] = new ModelRendererTurbo(this, 261, 186, textureX, textureY); // Box omaha gp20 pipes
		bodyModel[315] = new ModelRendererTurbo(this, 263, 193, textureX, textureY); // Box 395 omaha gp20 pipes
		bodyModel[316] = new ModelRendererTurbo(this, 379, 181, textureX, textureY); // Box gn gp20 tanks
		bodyModel[317] = new ModelRendererTurbo(this, 406, 185, textureX, textureY); // Box gn gp20 tanks
		bodyModel[318] = new ModelRendererTurbo(this, 450, 51, textureX, textureY); // Box 360 ssw/sp economy gyra
		bodyModel[319] = new ModelRendererTurbo(this, 459, 51, textureX, textureY, BoxName.prime3); // Box 364 gyra glow
		bodyModel[320] = new ModelRendererTurbo(this, 163, 4, textureX, textureY); // Box lownose housing
		bodyModel[321] = new ModelRendererTurbo(this, 11, 44, textureX, textureY); // Box 344
		bodyModel[322] = new ModelRendererTurbo(this, 32, 27, textureX, textureY,"cull"); // Box cull step backplate
		bodyModel[323] = new ModelRendererTurbo(this, 57, 30, textureX, textureY,"cull"); // Box cull step backplate
		bodyModel[324] = new ModelRendererTurbo(this, 22, 46, textureX, textureY); // Box 347
		bodyModel[325] = new ModelRendererTurbo(this, 0, 42, textureX, textureY); // Box 348
		bodyModel[326] = new ModelRendererTurbo(this, 6, 24, textureX, textureY,"cull"); // Box cull step backplate
		bodyModel[327] = new ModelRendererTurbo(this, 9, 34, textureX, textureY); // Box 350
		bodyModel[328] = new ModelRendererTurbo(this, 9, 37, textureX, textureY); // Box 351
		bodyModel[329] = new ModelRendererTurbo(this, 267, 183, textureX, textureY); // Box 342
		bodyModel[330] = new ModelRendererTurbo(this, 260, 183, textureX, textureY); // Box 343
		bodyModel[331] = new ModelRendererTurbo(this, 261, 176, textureX, textureY); // Box 344
		bodyModel[332] = new ModelRendererTurbo(this, 260, 178, textureX, textureY); // Box 490
		bodyModel[333] = new ModelRendererTurbo(this, 267, 178, textureX, textureY); // Box 330
		bodyModel[334] = new ModelRendererTurbo(this, 268, 176, textureX, textureY); // Box 338
		bodyModel[335] = new ModelRendererTurbo(this, 261, 181, textureX, textureY); // Box 460
		bodyModel[336] = new ModelRendererTurbo(this, 266, 181, textureX, textureY); // Box 461
		bodyModel[337] = new ModelRendererTurbo(this, 413, 86, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[338] = new ModelRendererTurbo(this, 132, 54, textureX, textureY); // Box 361
		bodyModel[339] = new ModelRendererTurbo(this, 98, 3, textureX, textureY); // Box 362
		bodyModel[340] = new ModelRendererTurbo(this, 132, 51, textureX, textureY); // Box 363
		bodyModel[341] = new ModelRendererTurbo(this, 132, 48, textureX, textureY); // Box 364
		bodyModel[342] = new ModelRendererTurbo(this, 85, 37, textureX, textureY); // Box 409 commander base
		bodyModel[343] = new ModelRendererTurbo(this, 85, 40, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[344] = new ModelRendererTurbo(this, 88, 46, textureX, textureY); // Box 356
		bodyModel[345] = new ModelRendererTurbo(this, 93, 6, textureX, textureY, "cull"); // Box 355 cull
		bodyModel[346] = new ModelRendererTurbo(this, 88, 49, textureX, textureY); // Box 278
		bodyModel[347] = new ModelRendererTurbo(this, 87, 29, textureX, textureY); // Box 280
		bodyModel[348] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // lowhood plate thinguy
		bodyModel[349] = new ModelRendererTurbo(this, 132, 22, textureX, textureY); // lowhood plate thinguy
		bodyModel[350] = new ModelRendererTurbo(this, 74, 9, textureX, textureY); // Box 184 o2 generator
		bodyModel[351] = new ModelRendererTurbo(this, 58, 17, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[352] = new ModelRendererTurbo(this, 91, 32, textureX, textureY); // Box 450
		bodyModel[353] = new ModelRendererTurbo(this, 123, 35, textureX, textureY, "cull"); // Box 271 cull
		bodyModel[354] = new ModelRendererTurbo(this, 123, 32, textureX, textureY); // Box 272
		bodyModel[355] = new ModelRendererTurbo(this, 89, 26, textureX, textureY); // Box 273
		bodyModel[356] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 274
		bodyModel[357] = new ModelRendererTurbo(this, 105, 40, textureX, textureY); // Box 364 prime base
		bodyModel[358] = new ModelRendererTurbo(this, 114, 40, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[359] = new ModelRendererTurbo(this, 114, 40, textureX, textureY, BoxName.prime2); // Box 7 PRIME3-3
		bodyModel[360] = new ModelRendererTurbo(this, 114, 40, textureX, textureY, BoxName.prime3); // Box 8 PRIME3-2
		bodyModel[361] = new ModelRendererTurbo(this, 114, 40, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[362] = new ModelRendererTurbo(this, 167, 26, textureX, textureY); // Box 114
		bodyModel[363] = new ModelRendererTurbo(this, 167, 29, textureX, textureY); // Box 74
		bodyModel[364] = new ModelRendererTurbo(this, 167, 32, textureX, textureY); // Box 78
		bodyModel[365] = new ModelRendererTurbo(this, 99, 49, textureX, textureY); // Box 245
		bodyModel[366] = new ModelRendererTurbo(this, 162, 26, textureX, textureY); // Box stock bell
		bodyModel[367] = new ModelRendererTurbo(this, 162, 29, textureX, textureY); // Box stock bell
		bodyModel[368] = new ModelRendererTurbo(this, 162, 32, textureX, textureY); // Box stock bell
		bodyModel[369] = new ModelRendererTurbo(this, 132, 26, textureX, textureY); // Box stock bell
		bodyModel[370] = new ModelRendererTurbo(this, 108, 50, textureX, textureY); // Box 471 sp e gyra HOLDER /bell holder
		bodyModel[371] = new ModelRendererTurbo(this, 157, 32, textureX, textureY); // Box 352
		bodyModel[372] = new ModelRendererTurbo(this, 157, 29, textureX, textureY); // Box 353
		bodyModel[373] = new ModelRendererTurbo(this, 157, 26, textureX, textureY); // Box 354
		bodyModel[374] = new ModelRendererTurbo(this, 166, 35, textureX, textureY, BoxName.cull); // Box cull bellholder
		bodyModel[375] = new ModelRendererTurbo(this, 170, 41, textureX, textureY, BoxName.prime3); // Box 469 sp e gyra REAR
		bodyModel[376] = new ModelRendererTurbo(this, 157, 35, textureX, textureY); // Box 440 sp e gyra BOX
		bodyModel[377] = new ModelRendererTurbo(this, 163, 46, textureX, textureY, BoxName.prime1); // Box 218 headligh trear 1 gyra
		bodyModel[378] = new ModelRendererTurbo(this, 148, 27, textureX, textureY); // Box 219 sp lightkit
		bodyModel[379] = new ModelRendererTurbo(this, 163, 41, textureX, textureY, BoxName.prime1); // Box 220 headlight rear 2 gyra
		bodyModel[380] = new ModelRendererTurbo(this, 141, 27, textureX, textureY); // Box 194 sp lightkit
		bodyModel[381] = new ModelRendererTurbo(this, 156, 46, textureX, textureY, "lamp"); // Box 195 headlight rear sp
		bodyModel[382] = new ModelRendererTurbo(this, 156, 41, textureX, textureY, "lamp"); // Box 196 headlight rear sp
		bodyModel[383] = new ModelRendererTurbo(this, 147, 24, textureX, textureY); // Box 374
		bodyModel[384] = new ModelRendererTurbo(this, 98, 38, textureX, textureY); // Box 410
		bodyModel[385] = new ModelRendererTurbo(this, 98, 35, textureX, textureY); // Box 411
		bodyModel[386] = new ModelRendererTurbo(this, 98, 32, textureX, textureY); // Box 412
		bodyModel[387] = new ModelRendererTurbo(this, 98, 9, textureX, textureY); // Box 413
		bodyModel[388] = new ModelRendererTurbo(this, 117, 50, textureX, textureY, BoxName.prime1); // Box 219 upper gyra glow
		bodyModel[389] = new ModelRendererTurbo(this, 124, 53, textureX, textureY); // Box 219 upper gyra
		bodyModel[390] = new ModelRendererTurbo(this, 117, 55, textureX, textureY, BoxName.prime1); // Box 219 upper gyra glow
		bodyModel[391] = new ModelRendererTurbo(this, 100, 23, textureX, textureY); // Box 417
		bodyModel[392] = new ModelRendererTurbo(this, 100, 26, textureX, textureY); // Box 418
		bodyModel[393] = new ModelRendererTurbo(this, 98, 29, textureX, textureY); // Box 419
		bodyModel[394] = new ModelRendererTurbo(this, 93, 9, textureX, textureY); // Box 420
		bodyModel[395] = new ModelRendererTurbo(this, 111, 26, textureX, textureY); // Box 354
		bodyModel[396] = new ModelRendererTurbo(this, 98, 12, textureX, textureY); // Box 355
		bodyModel[397] = new ModelRendererTurbo(this, 109, 29, textureX, textureY); // Box 356
		bodyModel[398] = new ModelRendererTurbo(this, 111, 23, textureX, textureY); // Box 357
		bodyModel[399] = new ModelRendererTurbo(this, 113, 32, textureX, textureY); // Box 358
		bodyModel[400] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Box 359
		bodyModel[401] = new ModelRendererTurbo(this, 144, 24, textureX, textureY); // Box 427
		bodyModel[402] = new ModelRendererTurbo(this, 139, 24, textureX, textureY); // Box 428
		bodyModel[403] = new ModelRendererTurbo(this, 122, 23, textureX, textureY); // Box 286
		bodyModel[404] = new ModelRendererTurbo(this, 93, 12, textureX, textureY); // Box 287
		bodyModel[405] = new ModelRendererTurbo(this, 122, 26, textureX, textureY); // Box 288
		bodyModel[406] = new ModelRendererTurbo(this, 120, 29, textureX, textureY); // Box 289
		bodyModel[407] = new ModelRendererTurbo(this, 105, 44, textureX, textureY); // Box 433
		bodyModel[408] = new ModelRendererTurbo(this, 114, 44, textureX, textureY, BoxName.prime1); // Box PRIME1-1
		bodyModel[409] = new ModelRendererTurbo(this, 114, 44, textureX, textureY, BoxName.prime2); // Box PRIME1-2
		bodyModel[410] = new ModelRendererTurbo(this, 114, 44, textureX, textureY, BoxName.prime3); // Box PRIME1-3
		bodyModel[411] = new ModelRendererTurbo(this, 114, 44, textureX, textureY, BoxName.prime4); // Box PRIME1-4
		bodyModel[412] = new ModelRendererTurbo(this, 80, 37, textureX, textureY); // Box 438
		bodyModel[413] = new ModelRendererTurbo(this, 80, 40, textureX, textureY, BoxName.commander); // Box commander beacon
		bodyModel[414] = new ModelRendererTurbo(this, 123, 44, textureX, textureY, BoxName.prime1); // Box PRIME2-1
		bodyModel[415] = new ModelRendererTurbo(this, 123, 44, textureX, textureY, BoxName.prime2); // Box PRIME2-2
		bodyModel[416] = new ModelRendererTurbo(this, 123, 44, textureX, textureY, BoxName.prime3); // Box PRIME2-3
		bodyModel[417] = new ModelRendererTurbo(this, 123, 44, textureX, textureY, BoxName.prime4); // Box PRIME2-4
		bodyModel[418] = new ModelRendererTurbo(this, 132, 44, textureX, textureY); // Box 444
		bodyModel[419] = new ModelRendererTurbo(this, 130, 112, textureX, textureY, "cull"); // Box cull nose step
		bodyModel[420] = new ModelRendererTurbo(this, 392, 79, textureX, textureY, "cull"); // Box cull sparkarrest
		bodyModel[421] = new ModelRendererTurbo(this, 226, 22, textureX, textureY); // Box gn stepoids
		bodyModel[422] = new ModelRendererTurbo(this, 209, 2, textureX, textureY); // Box gn stepoids
		bodyModel[423] = new ModelRendererTurbo(this, 227, 21, textureX, textureY, "cull"); // Box gn stepoids cull
		bodyModel[424] = new ModelRendererTurbo(this, 199, 1, textureX, textureY); // Box gn stepoids
		bodyModel[425] = new ModelRendererTurbo(this, 226, 26, textureX, textureY); // Box gn stepoids
		bodyModel[426] = new ModelRendererTurbo(this, 203, 21, textureX, textureY, "cull"); // Box gn stepoids cull
		bodyModel[427] = new ModelRendererTurbo(this, 226, 22, textureX, textureY); // Box gn stepoids
		bodyModel[428] = new ModelRendererTurbo(this, 144, 22, textureX, textureY); // Box 454
		bodyModel[429] = new ModelRendererTurbo(this, 178, 17, textureX, textureY); // Box 339
		bodyModel[430] = new ModelRendererTurbo(this, 179, 20, textureX, textureY, "cull"); // Box cull rerailer
		bodyModel[431] = new ModelRendererTurbo(this, 171, 17, textureX, textureY); // Box 459
		bodyModel[432] = new ModelRendererTurbo(this, 170, 20, textureX, textureY, "cull"); // Box cull rerailer
		bodyModel[433] = new ModelRendererTurbo(this, 84, 23, textureX, textureY); // Box 104
		bodyModel[434] = new ModelRendererTurbo(this, 136, 4, textureX, textureY); // Box 462
		bodyModel[435] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 463
		bodyModel[436] = new ModelRendererTurbo(this, 146, 1, textureX, textureY); // Box 464
		bodyModel[437] = new ModelRendererTurbo(this, 126, 1, textureX, textureY); // Box 465
		bodyModel[438] = new ModelRendererTurbo(this, 478, 122, textureX, textureY); // Box 412 cs
		bodyModel[439] = new ModelRendererTurbo(this, 450, 121, textureX, textureY); // Box 413 cs
		bodyModel[440] = new ModelRendererTurbo(this, 473, 114, textureX, textureY); // Box 86 cs
		bodyModel[441] = new ModelRendererTurbo(this, 456, 114, textureX, textureY); // Box 531 cs
		bodyModel[442] = new ModelRendererTurbo(this, 471, 109, textureX, textureY); // Box 542 cs2
		bodyModel[443] = new ModelRendererTurbo(this, 487, 121, textureX, textureY); // Box 131 cs2
		bodyModel[444] = new ModelRendererTurbo(this, 469, 122, textureX, textureY); // Box 131 cs2
		bodyModel[445] = new ModelRendererTurbo(this, 420, 141, textureX, textureY); // Box 211 wp large headlight
		bodyModel[446] = new ModelRendererTurbo(this, 19, 100, textureX, textureY); // Box 213 wp large headlight
		bodyModel[447] = new ModelRendererTurbo(this, 32, 100, textureX, textureY, "lamp"); // Box 169 headlight front big
		bodyModel[448] = new ModelRendererTurbo(this, 433, 141, textureX, textureY, "lamp"); // Box 170 headlight rear big
		bodyModel[449] = new ModelRendererTurbo(this, 150, 24, textureX, textureY); // Box 449
		bodyModel[450] = new ModelRendererTurbo(this, 44, 10, textureX, textureY, "cull"); // Box 335 cull rerailer
		bodyModel[451] = new ModelRendererTurbo(this, 44, 5, textureX, textureY, "cull"); // Box 336 cull rerailer
		bodyModel[452] = new ModelRendererTurbo(this, 37, 10, textureX, textureY, "cull"); // Box 337 rerailer holder
		bodyModel[453] = new ModelRendererTurbo(this, 37, 5, textureX, textureY); // Box 339
		bodyModel[454] = new ModelRendererTurbo(this, 229, 141, textureX, textureY); // Box mysterious atsf box
		bodyModel[455] = new ModelRendererTurbo(this, 262, 172, textureX, textureY); // Box 329
		bodyModel[456] = new ModelRendererTurbo(this, 262, 172, textureX, textureY); // Box 456
		bodyModel[457] = new ModelRendererTurbo(this, 410, 97, textureX, textureY,"cull"); // Box 196 winterization hatch EXTRA THICC
		bodyModel[458] = new ModelRendererTurbo(this, 132, 66, textureX, textureY); // Box 458
		bodyModel[459] = new ModelRendererTurbo(this, 132, 63, textureX, textureY); // Box 459
		bodyModel[460] = new ModelRendererTurbo(this, 132, 60, textureX, textureY); // Box 460
		bodyModel[461] = new ModelRendererTurbo(this, 132, 57, textureX, textureY); // Box 461
		bodyModel[462] = new ModelRendererTurbo(this, 406, 110, textureX, textureY); // Box 186
		bodyModel[463] = new ModelRendererTurbo(this, 390, 112, textureX, textureY); // Box 187
		bodyModel[464] = new ModelRendererTurbo(this, 422, 115, textureX, textureY); // Box 188
		bodyModel[465] = new ModelRendererTurbo(this, 422, 108, textureX, textureY); // Box 189
		bodyModel[466] = new ModelRendererTurbo(this, 25, 130, textureX, textureY); // Box 265
		bodyModel[467] = new ModelRendererTurbo(this, 39, 130, textureX, textureY, "lamp"); // Box 247 headlight front 3
		bodyModel[468] = new ModelRendererTurbo(this, 39, 135, textureX, textureY, "lamp"); // Box 151 headlight front 4
		bodyModel[469] = new ModelRendererTurbo(this, 25, 135, textureX, textureY); // Box 393
		bodyModel[470] = new ModelRendererTurbo(this, 39, 114, textureX, textureY, BoxName.commander); // Box 218 headlight front 1 gyra
		bodyModel[471] = new ModelRendererTurbo(this, 23, 112, textureX, textureY); // Box 219
		bodyModel[472] = new ModelRendererTurbo(this, 32, 114, textureX, textureY, BoxName.commander); // Box 220 headlight front 2 gyra
		bodyModel[473] = new ModelRendererTurbo(this, 203, 167, textureX, textureY); // Box 473
		bodyModel[474] = new ModelRendererTurbo(this, 203, 167, textureX, textureY); // Box 474

		bodyModel[0].addBox(0F, 0F, 0F, 0, 16, 22, 0F); // Box 3
		bodyModel[0].setRotationPoint(-37.01F, -7F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 271
		bodyModel[1].setRotationPoint(-37F, 1F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 0, 22, 0F); // Box 272
		bodyModel[2].setRotationPoint(-37F, 8F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 0, 20, 0F); // Box 273
		bodyModel[3].setRotationPoint(-37F, 5F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box cull step backplate
		bodyModel[4].setRotationPoint(-37F, 7F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box cull step backplate
		bodyModel[5].setRotationPoint(-37F, 4F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 271
		bodyModel[6].setRotationPoint(-37F, 1F, 6F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[7].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[8].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 75, 2, 12, 0F); // Box 266
		bodyModel[9].setRotationPoint(-37F, 1F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[10].setRotationPoint(39F, 3F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(38F, 2.5F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[12].setRotationPoint(-33F, 2F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 0, 18, 0F); // Box 210
		bodyModel[13].setRotationPoint(-37F, 3F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[14].setRotationPoint(-33F, 2F, 6F);

		bodyModel[15].addBox(0F, 0F, 0F, 0, 16, 22, 0F); // Box 364
		bodyModel[15].setRotationPoint(38.01F, -7F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 365
		bodyModel[16].setRotationPoint(34F, 2F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[17].setRotationPoint(34F, 2F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[18].setRotationPoint(-37.01F, -7F, -10F);
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[19].setRotationPoint(-37.01F, -7F, 11F);
		bodyModel[19].rotateAngleY = -3.14159265F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[20].setRotationPoint(38.01F, -7F, -10F);
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[21].setRotationPoint(38.01F, -7F, 11F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addBox(0F, 0F, 0F, 67, 1, 5, 0F); // Box 1
		bodyModel[22].setRotationPoint(-33F, 1F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 67, 1, 5, 0F); // Box 47
		bodyModel[23].setRotationPoint(-33F, 1F, 6F);

		bodyModel[24].addBox(0F, 0F, 0F, 67, 1, 0, 0F); // Box 48
		bodyModel[24].setRotationPoint(-33F, 2F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 67, 1, 0, 0F); // Box 49
		bodyModel[25].setRotationPoint(-33F, 2F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[26].setRotationPoint(-10F, 6F, -10.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 487
		bodyModel[27].setRotationPoint(-10F, 6F, 7.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 14, 4, 15, 0F); // Box 488
		bodyModel[28].setRotationPoint(-10F, 5F, -7.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 489
		bodyModel[29].setRotationPoint(-10F, 5F, -10.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 805
		bodyModel[30].setRotationPoint(-10F, 5F, 7.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 60
		bodyModel[31].setRotationPoint(-10F, 3F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 61
		bodyModel[32].setRotationPoint(-14F, 3F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 62
		bodyModel[33].setRotationPoint(-14F, 3F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[34].setRotationPoint(11F, 3F, 5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[35].setRotationPoint(11F, 3F, -6F);

		bodyModel[36].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 72
		bodyModel[36].setRotationPoint(-10F, 3F, 5F);

		bodyModel[37].addBox(0F, 0F, 0F, 14, 2, 9, 0F); // Box 78
		bodyModel[37].setRotationPoint(-10F, 3F, -4.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[38].setRotationPoint(-24F, 2.75F, -2F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[39].setRotationPoint(20F, 2.75F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 75, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[40].setRotationPoint(-37F, 3F, -6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[41].setRotationPoint(-23.5F, 2F, -10.6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[42].setRotationPoint(-23.5F, 2F, 6.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 133
		bodyModel[43].setRotationPoint(-22.5F, 2F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 134
		bodyModel[44].setRotationPoint(-22.5F, 2F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 322
		bodyModel[45].setRotationPoint(20.5F, 2F, -10.6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 323
		bodyModel[46].setRotationPoint(21.5F, 2F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 324
		bodyModel[47].setRotationPoint(20.5F, 2F, 6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 325
		bodyModel[48].setRotationPoint(21.5F, 2F, 9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[49].setRotationPoint(-37F, 2.5F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 327
		bodyModel[50].setRotationPoint(33F, 2.5F, -3F);

		bodyModel[51].addBox(-1.5F, -1.5F, 0F, 3, 3, 16, 0F); // Box 347 side air tank standard
		bodyModel[51].setRotationPoint(9.5F, 3.5F, -9F);
		bodyModel[51].rotateAngleY = 1.57079633F;
		bodyModel[51].rotateAngleZ = 0.78539816F;

		bodyModel[52].addBox(-1.5F, -1.5F, 0F, 3, 3, 16, 0F); // Box 347 side air tank standard
		bodyModel[52].setRotationPoint(9.5F, 3.5F, 9F);
		bodyModel[52].rotateAngleY = 1.57079633F;
		bodyModel[52].rotateAngleZ = 0.78539816F;

		bodyModel[53].addBox(0F, 0F, 0F, 18, 5, 22, 0F); // Box batbox+cabfloor
		bodyModel[53].setRotationPoint(-28F, -4F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 132
		bodyModel[54].setRotationPoint(-31F, -12F, -11.01F);

		bodyModel[55].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 136
		bodyModel[55].setRotationPoint(-31F, -12F, 11.01F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[56].setRotationPoint(-32F, -4F, -11.01F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 140
		bodyModel[57].setRotationPoint(-31F, -4F, -11.01F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 141
		bodyModel[58].setRotationPoint(-31F, -4F, 11.01F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[59].setRotationPoint(-32F, -4F, 11.01F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[60].setRotationPoint(-34F, -11F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[61].setRotationPoint(-34F, -11F, 1F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 12, 2, 0F); // Box 218
		bodyModel[62].setRotationPoint(-34F, -11F, -1F);

		bodyModel[63].addBox(0F, 0F, 0F, 9, 12, 14, 0F); // Box 215
		bodyModel[63].setRotationPoint(-31F, -11F, -7F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 370
		bodyModel[64].setRotationPoint(-30F, -4F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[65].setRotationPoint(-29F, -4F, 11.01F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[66].setRotationPoint(-29F, -4F, -11.01F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 374
		bodyModel[67].setRotationPoint(-30F, -4F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 9, 8, 14, 0F); // Box 350
		bodyModel[68].setRotationPoint(-31F, -19F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 8, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[69].setRotationPoint(-34F, -19F, -7F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 352
		bodyModel[70].setRotationPoint(-34F, -19F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353
		bodyModel[71].setRotationPoint(-34F, -19F, 1F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 numberboard front high
		bodyModel[72].setRotationPoint(-31.55F, -16.5F, -6F);
		bodyModel[72].rotateAngleY = 0.46687557F;

		bodyModel[73].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 numberboard front high
		bodyModel[73].setRotationPoint(-31.55F, -16.5F, 6F);
		bodyModel[73].rotateAngleY = -0.46687557F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 headlight front 1
		bodyModel[74].setRotationPoint(-35.2F, -18F, -1F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 216
		bodyModel[75].setRotationPoint(-34.5F, -18F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 headlight front 2
		bodyModel[76].setRotationPoint(-35.2F, -16F, -1F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 311
		bodyModel[77].setRotationPoint(-34.5F, -16F, -1F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 0, 22, 0F); // Box 137 front step
		bodyModel[78].setRotationPoint(-32F, -1F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[79].setRotationPoint(-37.5F, -2F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[80].setRotationPoint(-37.5F, -3F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[81].setRotationPoint(-21F, -19F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[82].setRotationPoint(-22F, -19F, 7F);

		bodyModel[83].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 9
		bodyModel[83].setRotationPoint(-21F, -16F, 10F);

		bodyModel[84].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 10
		bodyModel[84].setRotationPoint(-21F, -16F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 15
		bodyModel[85].setRotationPoint(-22F, -16F, -7F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 21
		bodyModel[86].setRotationPoint(-11F, -16F, -11F);

		bodyModel[87].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 314 door swing right
		bodyModel[87].setRotationPoint(-10.5F, -16F, 10.5F);

		bodyModel[88].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[88].setRotationPoint(-21.5F, -16F, -10.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[89].setRotationPoint(-11F, -19F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[90].setRotationPoint(-22F, -19F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[91].setRotationPoint(-11F, -19F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 374
		bodyModel[92].setRotationPoint(-21F, -19F, 7F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 411
		bodyModel[93].setRotationPoint(-22F, -19F, -7F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 412
		bodyModel[94].setRotationPoint(-11F, -19F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[95].setRotationPoint(-22F, -21F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 2F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[96].setRotationPoint(-22F, -21F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 348
		bodyModel[97].setRotationPoint(-22F, -21F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[98].setRotationPoint(32F, -19F, -7F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 20, 2, 0F); // Box 220
		bodyModel[99].setRotationPoint(32F, -19F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[100].setRotationPoint(32F, -19F, 1F);

		bodyModel[101].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 223
		bodyModel[101].setRotationPoint(-10F, -19F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[102].setRotationPoint(33.2F, -6F, 4.5F);
		bodyModel[102].rotateAngleY = -1.11701072F;

		bodyModel[103].addBox(0.5F, 0F, 0F, 0, 5, 1, 0F); // Box 43
		bodyModel[103].setRotationPoint(33.2F, -4F, 4.5F);
		bodyModel[103].rotateAngleY = -1.11701072F;

		bodyModel[104].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 dynamic fan
		bodyModel[104].setRotationPoint(7F, -20.5F, -3.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 91
		bodyModel[105].setRotationPoint(6.5F, -20F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[106].setRotationPoint(6.5F, -18F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[107].setRotationPoint(2.5F, -18F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[108].setRotationPoint(14.5F, -18F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[109].setRotationPoint(6.5F, -20F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[110].setRotationPoint(2.5F, -20F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[111].setRotationPoint(14.5F, -20F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[112].setRotationPoint(6.5F, -20F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[113].setRotationPoint(14.5F, -20F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[114].setRotationPoint(14.5F, -18F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[115].setRotationPoint(6.5F, -18F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[116].setRotationPoint(2.5F, -18F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[117].setRotationPoint(2.5F, -20F, -9F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[118].setRotationPoint(31F, -19.5F, -1F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[119].setRotationPoint(-32F, -19.5F, -1F);

		bodyModel[120].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 176
		bodyModel[120].setRotationPoint(-6F, -7F, -11.01F);

		bodyModel[121].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 500
		bodyModel[121].setRotationPoint(-10F, -12F, -11.01F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[122].setRotationPoint(-5F, -12F, -11.01F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 462
		bodyModel[123].setRotationPoint(34F, -7F, -11.01F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 463
		bodyModel[124].setRotationPoint(34F, -7F, 11.01F);

		bodyModel[125].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 362
		bodyModel[125].setRotationPoint(-10F, -4F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[126].setRotationPoint(-4F, -4F, -11.01F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box cull stepper
		bodyModel[127].setRotationPoint(-10F, -4F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[128].setRotationPoint(-8F, -4F, 11.01F);

		bodyModel[129].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 38R
		bodyModel[129].setRotationPoint(-6F, -7F, 11.01F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[130].setRotationPoint(-10F, -12F, 11.01F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 359 headlight rear 1
		bodyModel[131].setRotationPoint(34.7F, -18F, -1F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360
		bodyModel[132].setRotationPoint(34.5F, -18F, -1F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 222
		bodyModel[133].setRotationPoint(34.5F, -16F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 headlight rear 2
		bodyModel[134].setRotationPoint(34.7F, -16F, -1F);

		bodyModel[135].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 115 numberboard rear
		bodyModel[135].setRotationPoint(32.55F, -16.5F, -6F);
		bodyModel[135].rotateAngleY = -0.46687557F;

		bodyModel[136].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 116 numberboard rear
		bodyModel[136].setRotationPoint(32.55F, -16.5F, 6F);
		bodyModel[136].rotateAngleY = 0.46687557F;

		bodyModel[137].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 74
		bodyModel[137].setRotationPoint(-24F, -20.5F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[138].setRotationPoint(-24F, -18.5F, -7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 645
		bodyModel[139].setRotationPoint(-24F, -20.5F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 646
		bodyModel[140].setRotationPoint(-23F, -20.5F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 647
		bodyModel[141].setRotationPoint(-24F, -20.5F, 1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 648
		bodyModel[142].setRotationPoint(-24F, -18.5F, 1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 649
		bodyModel[143].setRotationPoint(-23F, -20.5F, 1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 363 numberboard chop A
		bodyModel[144].setRotationPoint(-22.4F, -18.55F, -6F);
		bodyModel[144].rotateAngleY = 0.32288591F;

		bodyModel[145].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 364 numberboard chop A
		bodyModel[145].setRotationPoint(-22.4F, -18.55F, 6F);
		bodyModel[145].rotateAngleY = -0.32288591F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[146].setRotationPoint(19F, -17.5F, -7.05F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[147].setRotationPoint(-9.5F, -17.5F, -7.05F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 583
		bodyModel[148].setRotationPoint(19F, -17.5F, 6.05F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 584
		bodyModel[149].setRotationPoint(-9.5F, -17.5F, 6.05F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[150].setRotationPoint(-31F, -7F, -11.01F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 341
		bodyModel[151].setRotationPoint(-33F, -7F, -11.01F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 342
		bodyModel[152].setRotationPoint(-32.5F, -6F, -11.01F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[153].setRotationPoint(-31F, -7F, 11.01F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 344
		bodyModel[154].setRotationPoint(-32.5F, -6F, 11.01F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 345
		bodyModel[155].setRotationPoint(-33F, -7F, 11.01F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[156].setRotationPoint(-11.5F, 3F, -10.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[157].setRotationPoint(-11.5F, 2F, -10.25F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[158].setRotationPoint(-11.25F, 3.5F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F); // Box 19 front fuel fill
		bodyModel[159].setRotationPoint(-10F, 3F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 19 front fuel fill
		bodyModel[160].setRotationPoint(-10F, 3F, 6F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[161].setRotationPoint(-37F, -1F, 4.75F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[162].setRotationPoint(-37F, -1F, -6.75F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[163].setRotationPoint(-37.25F, -1F, 4.75F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[164].setRotationPoint(-37.25F, -1F, -6.75F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[165].setRotationPoint(37F, -1F, -6.75F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear
		bodyModel[166].setRotationPoint(37.25F, -1F, -6.75F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear
		bodyModel[167].setRotationPoint(37.25F, -1F, 4.75F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[168].setRotationPoint(37F, -1F, 4.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[169].setRotationPoint(-37F, -5F, -4.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[170].setRotationPoint(-37.25F, -5F, -4.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[171].setRotationPoint(-37.25F, -3F, -4.75F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[172].setRotationPoint(-37F, -5F, 2.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[173].setRotationPoint(-37.25F, -5F, 2.75F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[174].setRotationPoint(-37.25F, -3F, 2.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[175].setRotationPoint(37F, -5F, -4.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[176].setRotationPoint(37.25F, -5F, -4.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[177].setRotationPoint(37.25F, -3F, -4.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[178].setRotationPoint(37F, -5F, 2.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[179].setRotationPoint(37.25F, -5F, 2.75F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[180].setRotationPoint(37.25F, -3F, 2.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[181].setRotationPoint(37F, -1F, -4.75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[182].setRotationPoint(37F, -1F, 2.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394
		bodyModel[183].setRotationPoint(37.25F, -1F, -4.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395
		bodyModel[184].setRotationPoint(37.25F, -1F, 2.75F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[185].setRotationPoint(-37F, -1F, -4.75F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[186].setRotationPoint(-37F, -1F, 2.75F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398
		bodyModel[187].setRotationPoint(-37.25F, -1F, -4.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399
		bodyModel[188].setRotationPoint(-37.25F, -1F, 2.75F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[189].setRotationPoint(-39.01F, 6F, -8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[190].setRotationPoint(-39.01F, 6F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[191].setRotationPoint(-41F, 7F, 0F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[192].setRotationPoint(-41F, 7F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[193].setRotationPoint(-40F, 6F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[194].setRotationPoint(-40F, 6F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[195].setRotationPoint(41F, 7F, 0F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[196].setRotationPoint(41F, 7F, -10F);

		bodyModel[197].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 433
		bodyModel[197].setRotationPoint(41F, 6F, -10F);

		bodyModel[198].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 434
		bodyModel[198].setRotationPoint(41F, 6F, 0F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[199].setRotationPoint(-40F, 6F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[200].setRotationPoint(-40F, 6F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 438
		bodyModel[201].setRotationPoint(-40F, 5F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[202].setRotationPoint(-40F, 5F, -10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 441
		bodyModel[203].setRotationPoint(40F, 6F, -10F);

		bodyModel[204].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 442
		bodyModel[204].setRotationPoint(41F, 5F, 0F);

		bodyModel[205].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 443
		bodyModel[205].setRotationPoint(41F, 5F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -8F, -0.5F, -0.75F, -8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443 hd funky dynamic radiator
		bodyModel[206].setRotationPoint(6.5F, -18.5F, -9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 443 hd funky dynamic radiator
		bodyModel[207].setRotationPoint(6.5F, -18.5F, 8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[208].setRotationPoint(-19F, -16F, 10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 306 cull aww
		bodyModel[209].setRotationPoint(-19F, -16F, -12.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 50
		bodyModel[210].setRotationPoint(-40F, 9F, -10F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 456 cull
		bodyModel[211].setRotationPoint(-38F, 7F, -10F);

		bodyModel[212].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 475
		bodyModel[212].setRotationPoint(38F, 9F, -10F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 476 cull
		bodyModel[213].setRotationPoint(38F, 7F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box cull GN step backplate
		bodyModel[214].setRotationPoint(-37F, 5.25F, -7.25F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 481
		bodyModel[215].setRotationPoint(-37F, 6.25F, -10.25F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 1, 13, 0F); // Box cull GN step backplate
		bodyModel[216].setRotationPoint(-37F, 3.5F, -6.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 4, 0, 19, 0F); // Box gn stepoids
		bodyModel[217].setRotationPoint(-37F, 4.5F, -9.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 4, 0, 18, 0F); // Box gn stepoids
		bodyModel[218].setRotationPoint(-37F, 2.75F, -9F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box cull step backplate
		bodyModel[219].setRotationPoint(-37F, 2F, -7F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 559
		bodyModel[220].setRotationPoint(-12F, -19F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[221].setRotationPoint(38.01F, 6F, 0F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[222].setRotationPoint(38.01F, 6F, -8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 554
		bodyModel[223].setRotationPoint(40F, 6F, 0F);

		bodyModel[224].addBox(0F, 0F, 0F, 7, 2, 9, 0F); // Box milw gp20 tank
		bodyModel[224].setRotationPoint(4F, 3F, -4.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 582
		bodyModel[225].setRotationPoint(-10F, 5F, -6F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box sandcap chopnose
		bodyModel[226].setRotationPoint(-32F, -12.5F, -1F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 9, 1, 14, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113 stock low nose
		bodyModel[227].setRotationPoint(-31F, -12F, -7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113 stock low nose
		bodyModel[228].setRotationPoint(-34F, -12F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-3F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113 stock low nose
		bodyModel[229].setRotationPoint(-34F, -12F, -7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -3F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 113 stock low nose
		bodyModel[230].setRotationPoint(-34F, -12F, 1F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 202 sandcap low nose
		bodyModel[231].setRotationPoint(-32F, -11.6F, -1F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[232].setRotationPoint(37.5F, -2F, -2F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[233].setRotationPoint(37.5F, -3F, -2F);

		bodyModel[234].addShapeBox(0F, 0F, 1F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 591 speedoooo
		bodyModel[234].setRotationPoint(-22.1F, -17F, 4F);
		bodyModel[234].rotateAngleY = -1.11701072F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[235].setRotationPoint(-40F, 5F, 2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[236].setRotationPoint(-40F, 5F, -10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[237].setRotationPoint(-40F, 4F, 2F);

		bodyModel[238].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[238].setRotationPoint(-40F, 4F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[239].setRotationPoint(40F, 4F, 2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 518
		bodyModel[240].setRotationPoint(40F, 5F, 2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[241].setRotationPoint(40F, 5F, -10F);

		bodyModel[242].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[242].setRotationPoint(40F, 4F, -8F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[243].setRotationPoint(33.65F, -5F, 3.6F);
		bodyModel[243].rotateAngleY = 0.45378561F;

		bodyModel[244].addShapeBox(1F, -1.25F, -1.25F, 0, 5, 5, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 355 brakewheel
		bodyModel[244].setRotationPoint(34F, -5.75F, 2.95F);
		bodyModel[244].rotateAngleY = 0.45378561F;

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 621 low ditchlight f
		bodyModel[245].setRotationPoint(-37.75F, 1F, -6.75F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622 cull
		bodyModel[246].setRotationPoint(-37.5F, 1F, -6.75F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 623 low ditchlight f
		bodyModel[247].setRotationPoint(-37.75F, 1F, 4.75F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 624 cull
		bodyModel[248].setRotationPoint(-37.5F, 1F, 4.75F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 625 low ditchlight r
		bodyModel[249].setRotationPoint(37.75F, 1F, -6.75F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 626 low ditchlight r
		bodyModel[250].setRotationPoint(37.75F, 1F, 4.75F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 627 cull
		bodyModel[251].setRotationPoint(37.5F, 1F, 4.75F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 628 cull
		bodyModel[252].setRotationPoint(37.5F, 1F, -6.75F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123 sunshade
		bodyModel[253].setRotationPoint(-20.5F, -16F, -11F);
		bodyModel[253].rotateAngleX = -0.78539816F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311 sunshade
		bodyModel[254].setRotationPoint(-20.5F, -16F, 11F);
		bodyModel[254].rotateAngleX = 0.78539816F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 0F, 0F, -3.125F, 0F); // Box 635 locomotive plate
		bodyModel[255].setRotationPoint(-32F, -2F, -11.02F);

		bodyModel[256].addShapeBox(-2F, 0F, 0F, 4, 6, 0, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 0F, 0F, -3.125F, 0F); // Box 636 locomotive plate
		bodyModel[256].setRotationPoint(-32F, -2F, 11.02F);
		bodyModel[256].rotateAngleY = -3.14159265F;

		bodyModel[257].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 631
		bodyModel[257].setRotationPoint(-9F, -1.5F, 7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F); // Box 300 marker box
		bodyModel[258].setRotationPoint(-32F, -18.5F, 5.25F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, -0.1F, -0.25F, -0.15F, -0.35F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.1F, 0.25F, -0.15F); // Box 301 sd9 markerlight
		bodyModel[259].setRotationPoint(-32F, -18.25F, 5.76F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F); // Box 302 marker box
		bodyModel[260].setRotationPoint(-32F, -18.5F, -7.25F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.25F, -0.15F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, 0.25F, -0.1F, 0.25F, -0.15F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, -0.35F, 0.25F, 0.25F); // Box 303 sd9 markerlight
		bodyModel[261].setRotationPoint(-32F, -18.25F, -6.76F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F); // Box chop markers 
		bodyModel[262].setRotationPoint(-32F, -11.5F, -7.25F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.25F, -0.15F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, 0.25F, -0.1F, 0.25F, -0.15F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, -0.35F, 0.25F, 0.25F); // Box chop markers glow
		bodyModel[263].setRotationPoint(-32F, -11.25F, -6.76F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F); // Box chop markers 
		bodyModel[264].setRotationPoint(-32F, -11.5F, 5.25F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, -0.1F, -0.25F, -0.15F, -0.35F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.1F, 0.25F, -0.15F); // Box chop markers glow
		bodyModel[265].setRotationPoint(-32F, -11.25F, 5.76F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.25F, -0.15F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, 0.25F, -0.1F, 0.25F, -0.15F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, -0.35F, 0.25F, 0.25F); // Box lownose markers glow
		bodyModel[266].setRotationPoint(-32F, -10.25F, -6.76F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, -0.1F, -0.25F, -0.15F, -0.35F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.1F, 0.25F, -0.15F); // Box lownose markers glow
		bodyModel[267].setRotationPoint(-32F, -10.25F, 5.76F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F); // Box lownose markers
		bodyModel[268].setRotationPoint(-32F, -10.5F, -7.25F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F); // Box lownose markers
		bodyModel[269].setRotationPoint(-32F, -10.5F, 5.25F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0.25F, -0.1F, -0.25F, -0.15F, -0.35F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.1F, 0.25F, -0.15F, -0.35F, 0.25F, 0.25F, 0F, 0.25F, -0.25F); // Box 644
		bodyModel[270].setRotationPoint(32F, -18.25F, -6.76F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F); // Box 645
		bodyModel[271].setRotationPoint(32F, -18.5F, -7.25F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.35F, -0.25F, 0.25F, -0.1F, -0.25F, -0.15F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.25F, -0.35F, 0.25F, 0.25F, -0.1F, 0.25F, -0.15F, 0F, 0.25F, 0.25F); // Box 646
		bodyModel[272].setRotationPoint(32F, -18.25F, 5.76F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F); // Box 647
		bodyModel[273].setRotationPoint(32F, -18.5F, 5.25F);

		bodyModel[274].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box milw gp20 tank
		bodyModel[274].setRotationPoint(4F, 5F, -10.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box milw gp20 tank
		bodyModel[275].setRotationPoint(4F, 6F, -10.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 7, 4, 15, 0F); // Box milw gp20 tank
		bodyModel[276].setRotationPoint(4F, 5F, -7.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box milw gp20 tank
		bodyModel[277].setRotationPoint(4F, 6F, 7.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box milw gp20 tank
		bodyModel[278].setRotationPoint(4F, 5F, 7.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 4, 20, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box gn gp20 tanks + omaha gp20 rear tank
		bodyModel[279].setRotationPoint(9F, 4F, -10F);

		bodyModel[280].addBox(-1.5F, -1.5F, 0F, 3, 3, 20, 0F); // Box gn gp20 tanks + omaha gp20 rear tank
		bodyModel[280].setRotationPoint(9.5F, 7.5F, -10F);

		bodyModel[281].addBox(0F, 0F, 0F, 4, 2, 9, 0F); // Box omaha gp20 tank
		bodyModel[281].setRotationPoint(4F, 3F, -4.5F);

		bodyModel[282].addBox(0F, 0F, 0F, 4, 4, 15, 0F); // Box omaha gp20 tank
		bodyModel[282].setRotationPoint(4F, 5F, -7.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box omaha gp20 tank
		bodyModel[283].setRotationPoint(4F, 5F, -10.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box omaha gp20 tank
		bodyModel[284].setRotationPoint(4F, 6F, -10.5F);

		bodyModel[285].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box omaha gp20 tank
		bodyModel[285].setRotationPoint(4F, 5F, 7.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box omaha gp20 tank
		bodyModel[286].setRotationPoint(4F, 6F, 7.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 304
		bodyModel[287].setRotationPoint(18F, -19.75F, -2.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 665
		bodyModel[288].setRotationPoint(23.5F, -20.78F, -3.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 666
		bodyModel[289].setRotationPoint(-9F, -20.78F, -3.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 131
		bodyModel[290].setRotationPoint(-31.01F, -12F, -11.01F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 133
		bodyModel[291].setRotationPoint(-34F, -6F, -11.01F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[292].setRotationPoint(-34F, -6F, 11.01F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,2F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[293].setRotationPoint(-33.01F, -12F, 11.02F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight f chop 1
		bodyModel[294].setRotationPoint(-24.2F, -20.5F, -1F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight f chop 2
		bodyModel[295].setRotationPoint(-24.2F, -18.5F, -1F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box exhaust standard
		bodyModel[296].setRotationPoint(0F, -20.5F, -2.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 151 lownose housing cull
		bodyModel[297].setRotationPoint(-34F, -11F, -1F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 151 headlight front lows
		bodyModel[298].setRotationPoint(-34F, -10.65F, -1F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 151 headlight front lows
		bodyModel[299].setRotationPoint(-34F, -8.95F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box atsf exhaust
		bodyModel[300].setRotationPoint(0F, -20.5F, -2.5F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box SP/CR/PC rebuild exhaust
		bodyModel[301].setRotationPoint(3.5F, -21F, -1.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box SP/CR/PC rebuild exhaust
		bodyModel[302].setRotationPoint(15.5F, -21F, -1.5F);

		bodyModel[303].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box SP/CR/PC rebuild exhaust
		bodyModel[303].setRotationPoint(7.5F, -21F, -1.5F);

		bodyModel[304].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box SP/CR/PC rebuild exhaust
		bodyModel[304].setRotationPoint(11.5F, -21F, -1.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box SP/CR/PC rebuild
		bodyModel[305].setRotationPoint(0F, -21F, -7.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box omaha gp20 tank extensions
		bodyModel[306].setRotationPoint(-10F, 2F, -10.25F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box omaha gp20 tank extensions
		bodyModel[307].setRotationPoint(-10F, 2F, 7.25F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 7, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 388
		bodyModel[308].setRotationPoint(-7F, -14F, -8.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 7, 15, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[309].setRotationPoint(-7F, -14F, 6.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box hh 20 chop
		bodyModel[310].setRotationPoint(-34F, -12F, -7F);

		bodyModel[311].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // box hh 20 chop
		bodyModel[311].setRotationPoint(-31F, -12F, -7F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // box hh 20 chop
		bodyModel[312].setRotationPoint(-34F, -12F, 1F);

		bodyModel[313].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // box hh 20 chop
		bodyModel[313].setRotationPoint(-34F, -12F, -1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 18, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box omaha gp20 pipes
		bodyModel[314].setRotationPoint(-8F, 2F, -10.3F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 18, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 395 omaha gp20 pipes
		bodyModel[315].setRotationPoint(-8F, 2F, 10.3F);

		bodyModel[316].addBox(-1.5F, -1.5F, 0F, 3, 3, 20, 0F); // Box gn gp20 tanks
		bodyModel[316].setRotationPoint(6F, 7.5F, -10F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 4, 20, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box gn gp20 tanks
		bodyModel[317].setRotationPoint(5.5F, 4F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F); // Box 360 ssw/sp economy gyra
		bodyModel[318].setRotationPoint(-34.73F, -12.62F, -1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 364 gyra glow
		bodyModel[319].setRotationPoint(-34.38F, -12.62F, -1F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box lownose housing
		bodyModel[320].setRotationPoint(-34F, -11F, -1F);

		bodyModel[321].addBox(0F, 0F, 0F, 4, 0, 20, 0F); // Box 344
		bodyModel[321].setRotationPoint(34F, 5F, -10F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box cull step backplate
		bodyModel[322].setRotationPoint(34F, 4F, -7F);

		bodyModel[323].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box cull step backplate
		bodyModel[323].setRotationPoint(34F, 2F, -7F);

		bodyModel[324].addBox(0F, 0F, 0F, 4, 0, 18, 0F); // Box 347
		bodyModel[324].setRotationPoint(34F, 3F, -9F);

		bodyModel[325].addBox(0F, 0F, 0F, 4, 0, 22, 0F); // Box 348
		bodyModel[325].setRotationPoint(34F, 8F, -11F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box cull step backplate
		bodyModel[326].setRotationPoint(34F, 7F, -8F);

		bodyModel[327].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 350
		bodyModel[327].setRotationPoint(34F, 1F, -8F);

		bodyModel[328].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 351
		bodyModel[328].setRotationPoint(34F, 1F, 6F);

		bodyModel[329].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 342
		bodyModel[329].setRotationPoint(-11F, 3F, -11F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 343
		bodyModel[330].setRotationPoint(-14F, 3F, -11F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[331].setRotationPoint(12F, 3F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 490
		bodyModel[332].setRotationPoint(-14F, 3F, 11F);

		bodyModel[333].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 330
		bodyModel[333].setRotationPoint(-11F, 3F, 11F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[334].setRotationPoint(12F, 3F, 11F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[335].setRotationPoint(-8F, 4F, -11F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[336].setRotationPoint(-8F, 4F, 11F);

		bodyModel[337].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // Box 196 winterization hatch 
		bodyModel[337].setRotationPoint(15.25F, -21F, -4F);

		bodyModel[338].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 361
		bodyModel[338].setRotationPoint(-1.5F, -21F, -6F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 362
		bodyModel[339].setRotationPoint(-1F, -20F, -6F);

		bodyModel[340].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[340].setRotationPoint(-2.5F, -21F, -5F);

		bodyModel[341].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 364
		bodyModel[341].setRotationPoint(-3F, -21F, -7F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[342].setRotationPoint(-12F, -21.5F, -0.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[343].setRotationPoint(-12F, -22.5F, -0.5F);

		bodyModel[344].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[344].setRotationPoint(-18.5F, -22.25F, -0.5F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355 cull
		bodyModel[345].setRotationPoint(-18F, -21.25F, -0.5F);

		bodyModel[346].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[346].setRotationPoint(-19F, -22F, -1.5F);

		bodyModel[347].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[347].setRotationPoint(-20F, -22F, 0.5F);

		bodyModel[348].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // lowhood plate thinguy
		bodyModel[348].setRotationPoint(-24F, -20.51F, -2F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // lowhood plate thinguy
		bodyModel[349].setRotationPoint(-25F, -20.51F, -1F);

		bodyModel[350].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[350].setRotationPoint(-20.5F, -21.75F, -4F);

		bodyModel[351].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[351].setRotationPoint(-15F, -22F, -2.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[352].setRotationPoint(-14F, -23F, 0F);

		bodyModel[353].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271 cull
		bodyModel[353].setRotationPoint(-23F, -21F, 5F);

		bodyModel[354].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[354].setRotationPoint(-21F, -21F, 6F);

		bodyModel[355].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273
		bodyModel[355].setRotationPoint(-22.5F, -20.5F, 7F);

		bodyModel[356].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
		bodyModel[356].setRotationPoint(-21F, -20F, 6F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[357].setRotationPoint(-23F, -21.5F, -1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[358].setRotationPoint(-23F, -22F, -1F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[359].setRotationPoint(-23F, -22F, -1F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[360].setRotationPoint(-23F, -22F, -1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[361].setRotationPoint(-23F, -22F, -1F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[362].setRotationPoint(-1.5F, -17.25F, -9F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[363].setRotationPoint(-1.5F, -18.25F, -9F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[364].setRotationPoint(-1.25F, -16.75F, -8.75F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[365].setRotationPoint(-1.5F, -19.25F, -8.8F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box stock bell
		bodyModel[366].setRotationPoint(-8F, -21.75F, -5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box stock bell
		bodyModel[367].setRotationPoint(-8F, -20.75F, -5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box stock bell
		bodyModel[368].setRotationPoint(-7.75F, -20.25F, -4.75F);

		bodyModel[369].addShapeBox(0F, 0F, -0.5F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box stock bell
		bodyModel[369].setRotationPoint(-7.5F, -22.5F, -4.5F);
		bodyModel[369].rotateAngleY = 2.35619449F;

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 471 sp e gyra HOLDER /bell holder
		bodyModel[370].setRotationPoint(33F, -21F, -1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 352
		bodyModel[371].setRotationPoint(35.5F, -19.9F, -0.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 353
		bodyModel[372].setRotationPoint(35.25F, -19.4F, -0.75F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[373].setRotationPoint(35.5F, -20.9F, -0.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.1F, 0F); // Box cull bellholder
		bodyModel[374].setRotationPoint(35F, -20.9F, -1F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 469 sp e gyra REAR
		bodyModel[375].setRotationPoint(36.15F, -21F, -1F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F); // Box 440 sp e gyra BOX
		bodyModel[376].setRotationPoint(34.5F, -21F, -1F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 218 headligh trear 1 gyra
		bodyModel[377].setRotationPoint(36.15F, -19F, -1F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 219 sp lightkit
		bodyModel[378].setRotationPoint(34.5F, -19F, -1F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 220 headlight rear 2 gyra
		bodyModel[379].setRotationPoint(36.15F, -17F, -1F);

		bodyModel[380].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 194 sp lightkit
		bodyModel[380].setRotationPoint(34.5F, -14.5F, -1F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 195 headlight rear sp
		bodyModel[381].setRotationPoint(35.25F, -14.5F, -1F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 196 headlight rear sp
		bodyModel[382].setRotationPoint(35.25F, -12.5F, -1F);

		bodyModel[383].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 374
		bodyModel[383].setRotationPoint(-23F, -22.5F, 0F);

		bodyModel[384].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 410
		bodyModel[384].setRotationPoint(-13.5F, -20.75F, 5F);

		bodyModel[385].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 411
		bodyModel[385].setRotationPoint(-15F, -21.25F, 4F);

		bodyModel[386].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 412
		bodyModel[386].setRotationPoint(-14F, -21.25F, 3F);

		bodyModel[387].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 413
		bodyModel[387].setRotationPoint(-13F, -20.25F, 4F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 219 upper gyra glow
		bodyModel[388].setRotationPoint(-24.95F, -20.5F, -1F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 219 upper gyra
		bodyModel[389].setRotationPoint(-24.3F, -20.5F, -1F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 219 upper gyra glow
		bodyModel[390].setRotationPoint(-24.95F, -18.5F, -1F);

		bodyModel[391].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 417
		bodyModel[391].setRotationPoint(-13F, -22F, -1.5F);

		bodyModel[392].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 418
		bodyModel[392].setRotationPoint(-12.5F, -22.25F, -2.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 419
		bodyModel[393].setRotationPoint(-14F, -22F, -3.5F);

		bodyModel[394].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 420
		bodyModel[394].setRotationPoint(-12F, -21.25F, -2.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[395].setRotationPoint(-17.5F, -21.25F, 2.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[396].setRotationPoint(-16F, -20.5F, 3.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[397].setRotationPoint(-18.5F, -21.5F, 3.5F);

		bodyModel[398].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[398].setRotationPoint(-18F, -21.25F, 4.5F);

		bodyModel[399].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[399].setRotationPoint(-17F, -22.5F, 3F);

		bodyModel[400].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[400].setRotationPoint(-17F, -22.5F, 4.25F);

		bodyModel[401].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 427
		bodyModel[401].setRotationPoint(-19F, -22F, -3.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[402].setRotationPoint(-23F, -21.5F, -0.5F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[403].setRotationPoint(31F, -20.5F, 3.5F);

		bodyModel[404].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[404].setRotationPoint(32.5F, -19.75F, 2.5F);

		bodyModel[405].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[405].setRotationPoint(31.5F, -20.5F, 1.5F);

		bodyModel[406].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[406].setRotationPoint(31F, -20.75F, 2.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[407].setRotationPoint(-28F, -20F, -1F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box PRIME1-1
		bodyModel[408].setRotationPoint(-28F, -20.5F, -1F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box PRIME1-2
		bodyModel[409].setRotationPoint(-28F, -20.5F, -1F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box PRIME1-3
		bodyModel[410].setRotationPoint(-28F, -20.5F, -1F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box PRIME1-4
		bodyModel[411].setRotationPoint(-28F, -20.5F, -1F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 438
		bodyModel[412].setRotationPoint(-26F, -20F, -0.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box commander beacon
		bodyModel[413].setRotationPoint(-26F, -21F, -0.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box PRIME2-1
		bodyModel[414].setRotationPoint(-18F, -22F, -1F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box PRIME2-2
		bodyModel[415].setRotationPoint(-18F, -22F, -1F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box PRIME2-3
		bodyModel[416].setRotationPoint(-18F, -22F, -1F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box PRIME2-4
		bodyModel[417].setRotationPoint(-18F, -22F, -1F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[418].setRotationPoint(-18F, -21.5F, -1F);

		bodyModel[419].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box cull nose step
		bodyModel[419].setRotationPoint(-26F, -10F, 6F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, -5F, 0F, -2F, -5F); // Box cull sparkarrest
		bodyModel[420].setRotationPoint(0F, -22.5F, -2.5F);

		bodyModel[421].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box gn stepoids
		bodyModel[421].setRotationPoint(-37F, 6.25F, 7.25F);

		bodyModel[422].addBox(0F, 0F, 0F, 4, 0, 18, 0F); // Box gn stepoids
		bodyModel[422].setRotationPoint(34F, 2.75F, -9F);

		bodyModel[423].addBox(0F, 0F, 0F, 4, 1, 13, 0F); // Box gn stepoids cull
		bodyModel[423].setRotationPoint(34F, 3.5F, -6.5F);

		bodyModel[424].addBox(0F, 0F, 0F, 4, 0, 19, 0F); // Box gn stepoids
		bodyModel[424].setRotationPoint(34F, 4.5F, -9.5F);

		bodyModel[425].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box gn stepoids
		bodyModel[425].setRotationPoint(34F, 6.25F, -10.25F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box gn stepoids cull
		bodyModel[426].setRotationPoint(34F, 5.25F, -7.25F);

		bodyModel[427].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box gn stepoids
		bodyModel[427].setRotationPoint(34F, 6.25F, 7.25F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 454
		bodyModel[428].setRotationPoint(-20F, -21.5F, 0F);

		bodyModel[429].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 339
		bodyModel[429].setRotationPoint(12F, 2F, 9.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box cull rerailer
		bodyModel[430].setRotationPoint(11.5F, 2.75F, 9.7F);

		bodyModel[431].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 459
		bodyModel[431].setRotationPoint(12F, 2F, -10.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box cull rerailer
		bodyModel[432].setRotationPoint(11.5F, 2.75F, -10.7F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104
		bodyModel[433].setRotationPoint(-22F, -30F, 0F);

		bodyModel[434].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 462
		bodyModel[434].setRotationPoint(17F, -21F, -5.5F);

		bodyModel[435].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 463
		bodyModel[435].setRotationPoint(17.5F, -21.25F, -6.5F);

		bodyModel[436].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 464
		bodyModel[436].setRotationPoint(18F, -20.25F, -6.5F);

		bodyModel[437].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 465
		bodyModel[437].setRotationPoint(16F, -21F, -7.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[438].setRotationPoint(-14.7F, -14F, 1F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[439].setRotationPoint(-21.4F, -12F, 3F);
		bodyModel[439].rotateAngleY = -0.45378561F;

		bodyModel[440].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 86 cs
		bodyModel[440].setRotationPoint(-21.4F, -14F, 3F);
		bodyModel[440].rotateAngleY = -0.45378561F;

		bodyModel[441].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[441].setRotationPoint(-21.4F, -8F, 3F);
		bodyModel[441].rotateAngleY = -0.45378561F;

		bodyModel[442].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 542 cs2
		bodyModel[442].setRotationPoint(-21.4F, -12F, 3F);
		bodyModel[442].rotateAngleY = -0.45378561F;

		bodyModel[443].addShapeBox(-1.5F, 0F, -1.5F, 3, 6, 3, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 131 cs2
		bodyModel[443].setRotationPoint(-20F, -10F, 7F);
		bodyModel[443].rotateAngleY = -0.64577182F;

		bodyModel[444].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,-0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Box 131 cs2
		bodyModel[444].setRotationPoint(-20F, -12F, 7F);

		bodyModel[445].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 211 wp large headlight
		bodyModel[445].setRotationPoint(34F, -18F, -1.5F);

		bodyModel[446].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 213 wp large headlight
		bodyModel[446].setRotationPoint(-36F, -18F, -1.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big
		bodyModel[447].setRotationPoint(-36.25F, -17.75F, -1.25F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 170 headlight rear big
		bodyModel[448].setRotationPoint(36.75F, -17.75F, -1.25F);

		bodyModel[449].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 449
		bodyModel[449].setRotationPoint(-27F, -21F, 0F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 335 cull rerailer
		bodyModel[450].setRotationPoint(23F, 4F, -10.7F);
		bodyModel[450].rotateAngleZ = 0.2268928F;

		bodyModel[451].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 336 cull rerailer
		bodyModel[451].setRotationPoint(23F, 4F, 9.7F);
		bodyModel[451].rotateAngleZ = 0.2268928F;

		bodyModel[452].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 337 rerailer holder
		bodyModel[452].setRotationPoint(24F, 3F, 10F);

		bodyModel[453].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 339
		bodyModel[453].setRotationPoint(24F, 3F, -11F);

		bodyModel[454].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box mysterious atsf box
		bodyModel[454].setRotationPoint(-27F, -8F, 7F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[455].setRotationPoint(-9F, 3F, 11F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[456].setRotationPoint(-9F, 3F, -11F);

		bodyModel[457].addBox(0F, 0F, 0F, 13, 2, 8, 0F); // Box 196 winterization hatch EXTRA THICC
		bodyModel[457].setRotationPoint(17.75F, -21F, -4F);

		bodyModel[458].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 458
		bodyModel[458].setRotationPoint(3F, -21F, -2F);

		bodyModel[459].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 459
		bodyModel[459].setRotationPoint(4.5F, -21F, -1F);

		bodyModel[460].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 460
		bodyModel[460].setRotationPoint(3.5F, -21F, 0F);

		bodyModel[461].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 461
		bodyModel[461].setRotationPoint(5F, -20F, -1F);

		bodyModel[462].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[462].setRotationPoint(-4F, -20F, -2.5F);

		bodyModel[463].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 187
		bodyModel[463].setRotationPoint(-10F, -20F, -2.5F);

		bodyModel[464].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 188
		bodyModel[464].setRotationPoint(25.5F, -20F, -2.5F);

		bodyModel[465].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 189
		bodyModel[465].setRotationPoint(19.5F, -20F, -2.5F);

		bodyModel[466].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 265
		bodyModel[466].setRotationPoint(-34.5F, -14F, -1F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight front 3
		bodyModel[467].setRotationPoint(-35.25F, -14F, -1F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 151 headlight front 4
		bodyModel[468].setRotationPoint(-35.25F, -12F, -1F);

		bodyModel[469].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 393
		bodyModel[469].setRotationPoint(-34.5F, -12F, -1F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 218 headlight front 1 gyra
		bodyModel[470].setRotationPoint(-36.25F, -18F, -1F);

		bodyModel[471].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 219
		bodyModel[471].setRotationPoint(-35.5F, -18F, -1F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 220 headlight front 2 gyra
		bodyModel[472].setRotationPoint(-36.25F, -16F, -1F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 0F, 0F, -3.125F, 0F); // Box 473
		bodyModel[473].setRotationPoint(-25F, -2F, -11.02F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 0F, 0F, -3.125F, 0F); // Box 474
		bodyModel[474].setRotationPoint(-23F, -2F, 11.02F);
		bodyModel[474].rotateAngleY = 3.14159265F;
	}
	ModelBlombergBnew theBlombi = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 333) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_MPBlue.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 212){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 7 || GetColor(entity) == 18  || GetColor(entity) == 11 || GetColor(entity) == 25){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1 || GetColor(entity) == 24){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Espee.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}