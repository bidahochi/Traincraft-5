//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.04.2020 - 23:08:36
// Last changed on: 29.04.2020 - 23:08:36

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.detailkits.Modelrs3_details;
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

public class ModelRS2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelRS2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[499];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 275, 90, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 11, 3, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 236, 115, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 123, 123, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 123, 117, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 123, 110, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 124, 104, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 259, 73, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 275, 66, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 387, 110, textureX, textureY); // Box 17
		bodyModel[11] = new ModelRendererTurbo(this, 263, 97, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 10, 11, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 282, 110, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 274, 115, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 399, 21, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 424, 29, textureX, textureY); // Box 36
		bodyModel[18] = new ModelRendererTurbo(this, 390, 29, textureX, textureY); // Box 37
		bodyModel[19] = new ModelRendererTurbo(this, 399, 8, textureX, textureY); // Box 38
		bodyModel[20] = new ModelRendererTurbo(this, 294, 32, textureX, textureY); // Box 41
		bodyModel[21] = new ModelRendererTurbo(this, 79, 115, textureX, textureY); // Box 43
		bodyModel[22] = new ModelRendererTurbo(this, 117, 115, textureX, textureY); // Box 44
		bodyModel[23] = new ModelRendererTurbo(this, 299, 13, textureX, textureY); // Box 45
		bodyModel[24] = new ModelRendererTurbo(this, 306, 27, textureX, textureY); // Box 46
		bodyModel[25] = new ModelRendererTurbo(this, 309, 6, textureX, textureY); // Box 47
		bodyModel[26] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 48
		bodyModel[27] = new ModelRendererTurbo(this, 93, 1, textureX, textureY); // Box 49
		bodyModel[28] = new ModelRendererTurbo(this, 23, 6, textureX, textureY); // Box 129
		bodyModel[29] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 130
		bodyModel[30] = new ModelRendererTurbo(this, 22, 11, textureX, textureY); // Box 132
		bodyModel[31] = new ModelRendererTurbo(this, 22, 17, textureX, textureY); // Box 135
		bodyModel[32] = new ModelRendererTurbo(this, 22, 25, textureX, textureY); // Box 57
		bodyModel[33] = new ModelRendererTurbo(this, 23, 31, textureX, textureY); // Box 58
		bodyModel[34] = new ModelRendererTurbo(this, 26, 36, textureX, textureY); // Box 59
		bodyModel[35] = new ModelRendererTurbo(this, 121, 47, textureX, textureY); // Box 315 door swing left
		bodyModel[36] = new ModelRendererTurbo(this, 87, 74, textureX, textureY); // Box 61
		bodyModel[37] = new ModelRendererTurbo(this, 258, 70, textureX, textureY); // Box 62
		bodyModel[38] = new ModelRendererTurbo(this, 73, 34, textureX, textureY); // Box 63
		bodyModel[39] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 64
		bodyModel[40] = new ModelRendererTurbo(this, 79, 9, textureX, textureY); // Box 68
		bodyModel[41] = new ModelRendererTurbo(this, 73, 12, textureX, textureY); // Box 69
		bodyModel[42] = new ModelRendererTurbo(this, 122, 8, textureX, textureY); // Box 71 
		bodyModel[43] = new ModelRendererTurbo(this, 67, 74, textureX, textureY, "lamp"); // short hood lamp
		bodyModel[44] = new ModelRendererTurbo(this, 121, 14, textureX, textureY); // Box 79 door swing right
		bodyModel[45] = new ModelRendererTurbo(this, 434, 29, textureX, textureY, "lamp"); // long hood lamp
		bodyModel[46] = new ModelRendererTurbo(this, 284, 7, textureX, textureY); // Box 94
		bodyModel[47] = new ModelRendererTurbo(this, 283, 31, textureX, textureY); // Box 95
		bodyModel[48] = new ModelRendererTurbo(this, 145, 123, textureX, textureY); // Box 102
		bodyModel[49] = new ModelRendererTurbo(this, 174, 135, textureX, textureY); // Box 105
		bodyModel[50] = new ModelRendererTurbo(this, 145, 114, textureX, textureY); // Box 107
		bodyModel[51] = new ModelRendererTurbo(this, 177, 112, textureX, textureY); // Box 108
		bodyModel[52] = new ModelRendererTurbo(this, 248, 108, textureX, textureY); // Box 120
		bodyModel[53] = new ModelRendererTurbo(this, 258, 108, textureX, textureY); // Box 121
		bodyModel[54] = new ModelRendererTurbo(this, 101, 108, textureX, textureY); // Box 133
		bodyModel[55] = new ModelRendererTurbo(this, 91, 108, textureX, textureY); // Box 136
		bodyModel[56] = new ModelRendererTurbo(this, 125, 120, textureX, textureY); // Box 137
		bodyModel[57] = new ModelRendererTurbo(this, 199, 41, textureX, textureY); // NP Bell 1
		bodyModel[58] = new ModelRendererTurbo(this, 199, 38, textureX, textureY); // NP Bell 1
		bodyModel[59] = new ModelRendererTurbo(this, 199, 44, textureX, textureY); // NP Bell 1
		bodyModel[60] = new ModelRendererTurbo(this, 205, 47, textureX, textureY); // NP Bell 1
		bodyModel[61] = new ModelRendererTurbo(this, 414, 15, textureX, textureY, "lamp"); // Box 149 glow
		bodyModel[62] = new ModelRendererTurbo(this, 402, 15, textureX, textureY, "lamp"); // Box 150 glow
		bodyModel[63] = new ModelRendererTurbo(this, 79, 3, textureX, textureY); // Box 167
		bodyModel[64] = new ModelRendererTurbo(this, 73, 45, textureX, textureY); // Box 172
		bodyModel[65] = new ModelRendererTurbo(this, 79, 36, textureX, textureY); // Box 173
		bodyModel[66] = new ModelRendererTurbo(this, 79, 42, textureX, textureY); // Box 175
		bodyModel[67] = new ModelRendererTurbo(this, 122, 41, textureX, textureY); // Box 177
		bodyModel[68] = new ModelRendererTurbo(this, 87, 84, textureX, textureY); // Control stand
		bodyModel[69] = new ModelRendererTurbo(this, 76, 82, textureX, textureY); // Control stand braking
		bodyModel[70] = new ModelRendererTurbo(this, 156, 53, textureX, textureY, BoxName.ditch); // Long hood ditchlight r
		bodyModel[71] = new ModelRendererTurbo(this, 156, 48, textureX, textureY); // Box 212
		bodyModel[72] = new ModelRendererTurbo(this, 156, 48, textureX, textureY); // Box 213
		bodyModel[73] = new ModelRendererTurbo(this, 156, 53, textureX, textureY, BoxName.ditch); // Long hood ditchlight l
		bodyModel[74] = new ModelRendererTurbo(this, 149, 53, textureX, textureY, BoxName.ditch); // ditchlight short hood l
		bodyModel[75] = new ModelRendererTurbo(this, 149, 48, textureX, textureY); // Box 161
		bodyModel[76] = new ModelRendererTurbo(this, 149, 48, textureX, textureY); // Box 162
		bodyModel[77] = new ModelRendererTurbo(this, 149, 53, textureX, textureY, BoxName.ditch); // ditchlight short hood r
		bodyModel[78] = new ModelRendererTurbo(this, 166, 10, textureX, textureY, BoxName.commander); // Commander beacon 1
		bodyModel[79] = new ModelRendererTurbo(this, 165, 14, textureX, textureY); // Box 400
		bodyModel[80] = new ModelRendererTurbo(this, 172, 10, textureX, textureY); // Box 215
		bodyModel[81] = new ModelRendererTurbo(this, 2, 36, textureX, textureY); // Box 216
		bodyModel[82] = new ModelRendererTurbo(this, 22, 36, textureX, textureY); // Box 217
		bodyModel[83] = new ModelRendererTurbo(this, 17, 43, textureX, textureY); // box64
		bodyModel[84] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // box65
		bodyModel[85] = new ModelRendererTurbo(this, 262, 45, textureX, textureY); // Exhast stack
		bodyModel[86] = new ModelRendererTurbo(this, 131, 123, textureX, textureY); // Box 227
		bodyModel[87] = new ModelRendererTurbo(this, 133, 120, textureX, textureY); // Box 228
		bodyModel[88] = new ModelRendererTurbo(this, 131, 117, textureX, textureY); // Box 229
		bodyModel[89] = new ModelRendererTurbo(this, 131, 110, textureX, textureY); // Box 231
		bodyModel[90] = new ModelRendererTurbo(this, 132, 104, textureX, textureY); // Box 232
		bodyModel[91] = new ModelRendererTurbo(this, 131, 123, textureX, textureY); // Box 236
		bodyModel[92] = new ModelRendererTurbo(this, 133, 120, textureX, textureY); // Box 237
		bodyModel[93] = new ModelRendererTurbo(this, 131, 117, textureX, textureY); // Box 238
		bodyModel[94] = new ModelRendererTurbo(this, 131, 110, textureX, textureY); // Box 240
		bodyModel[95] = new ModelRendererTurbo(this, 132, 104, textureX, textureY); // Box 242
		bodyModel[96] = new ModelRendererTurbo(this, 123, 123, textureX, textureY); // Box 243
		bodyModel[97] = new ModelRendererTurbo(this, 125, 120, textureX, textureY); // Box 244
		bodyModel[98] = new ModelRendererTurbo(this, 123, 117, textureX, textureY); // Box 245
		bodyModel[99] = new ModelRendererTurbo(this, 123, 110, textureX, textureY); // Box 247
		bodyModel[100] = new ModelRendererTurbo(this, 124, 104, textureX, textureY); // Box 249
		bodyModel[101] = new ModelRendererTurbo(this, 243, 106, textureX, textureY); // Box 250
		bodyModel[102] = new ModelRendererTurbo(this, 86, 106, textureX, textureY); // Box 251
		bodyModel[103] = new ModelRendererTurbo(this, 186, 41, textureX, textureY); // Box 114
		bodyModel[104] = new ModelRendererTurbo(this, 186, 38, textureX, textureY); // Box 74
		bodyModel[105] = new ModelRendererTurbo(this, 186, 44, textureX, textureY); // Box 78
		bodyModel[106] = new ModelRendererTurbo(this, 1, 138, textureX, textureY); // Box 34
		bodyModel[107] = new ModelRendererTurbo(this, 26, 135, textureX, textureY); // Box 41
		bodyModel[108] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 45
		bodyModel[109] = new ModelRendererTurbo(this, 145, 132, textureX, textureY); // Box 102
		bodyModel[110] = new ModelRendererTurbo(this, 145, 102, textureX, textureY); // Box 107
		bodyModel[111] = new ModelRendererTurbo(this, 168, 105, textureX, textureY); // Box 105
		bodyModel[112] = new ModelRendererTurbo(this, 177, 112, textureX, textureY); // Box 108
		bodyModel[113] = new ModelRendererTurbo(this, 0, 56, textureX, textureY, "lamp"); // Box 149 glow
		bodyModel[114] = new ModelRendererTurbo(this, 0, 56, textureX, textureY, "lamp"); // Box 150 glow
		bodyModel[115] = new ModelRendererTurbo(this, 323, 139, textureX, textureY); // Box 31
		bodyModel[116] = new ModelRendererTurbo(this, 190, 41, textureX, textureY); // Box 38
		bodyModel[117] = new ModelRendererTurbo(this, 191, 37, textureX, textureY); // Box 38
		bodyModel[118] = new ModelRendererTurbo(this, 258, 77, textureX, textureY); // Box 62
		bodyModel[119] = new ModelRendererTurbo(this, 56, 72, textureX, textureY); // Box 78 lamp socket
		bodyModel[120] = new ModelRendererTurbo(this, 8, 20, textureX, textureY); // Box 31 lamp
		bodyModel[121] = new ModelRendererTurbo(this, 5, 19, textureX, textureY, "lamp"); // Top short hood light l
		bodyModel[122] = new ModelRendererTurbo(this, 15, 19, textureX, textureY, "lamp"); // Top short hood light r
		bodyModel[123] = new ModelRendererTurbo(this, 63, 51, textureX, textureY, "lamp"); // short hood left lamp
		bodyModel[124] = new ModelRendererTurbo(this, 63, 56, textureX, textureY, "lamp"); // short hood right lamp
		bodyModel[125] = new ModelRendererTurbo(this, 65, 62, textureX, textureY, "lamp"); // short hood top lamp
		bodyModel[126] = new ModelRendererTurbo(this, 65, 67, textureX, textureY, "lamp"); // short hood bottom lamp
		bodyModel[127] = new ModelRendererTurbo(this, 434, 37, textureX, textureY); // long hood lamp socket
		bodyModel[128] = new ModelRendererTurbo(this, 444, 55, textureX, textureY, "lamp"); // long hood left lamp
		bodyModel[129] = new ModelRendererTurbo(this, 444, 55, textureX, textureY, "lamp"); // long hood right lamp
		bodyModel[130] = new ModelRendererTurbo(this, 442, 44, textureX, textureY, "lamp"); // long hood top lamp
		bodyModel[131] = new ModelRendererTurbo(this, 442, 49, textureX, textureY, "lamp"); // long hood bottom lamp
		bodyModel[132] = new ModelRendererTurbo(this, 56, 57, textureX, textureY); // Box 78 lamp socket
		bodyModel[133] = new ModelRendererTurbo(this, 58, 65, textureX, textureY); // Box 78 lamp socket
		bodyModel[134] = new ModelRendererTurbo(this, 433, 53, textureX, textureY); // Box 78 lamp socket
		bodyModel[135] = new ModelRendererTurbo(this, 435, 45, textureX, textureY); // Box 78 lamp socket
		bodyModel[136] = new ModelRendererTurbo(this, 213, 41, textureX, textureY); // Box 114
		bodyModel[137] = new ModelRendererTurbo(this, 213, 38, textureX, textureY); // Box 74
		bodyModel[138] = new ModelRendererTurbo(this, 213, 44, textureX, textureY); // Box 78
		bodyModel[139] = new ModelRendererTurbo(this, 434, 13, textureX, textureY); // long hood lamp socket
		bodyModel[140] = new ModelRendererTurbo(this, 432, 20, textureX, textureY); // Box 38
		bodyModel[141] = new ModelRendererTurbo(this, 441, 19, textureX, textureY, "lamp"); // long hood top lamp
		bodyModel[142] = new ModelRendererTurbo(this, 441, 19, textureX, textureY, "lamp"); // long hood bottom lamp
		bodyModel[143] = new ModelRendererTurbo(this, 51, 42, textureX, textureY); // Box 34
		bodyModel[144] = new ModelRendererTurbo(this, 56, 32, textureX, textureY); // Box 34
		bodyModel[145] = new ModelRendererTurbo(this, 95, 144, textureX, textureY); // Box 136
		bodyModel[146] = new ModelRendererTurbo(this, 101, 144, textureX, textureY); // Box 136
		bodyModel[147] = new ModelRendererTurbo(this, 258, 144, textureX, textureY); // Box 136
		bodyModel[148] = new ModelRendererTurbo(this, 252, 144, textureX, textureY); // Box 136
		bodyModel[149] = new ModelRendererTurbo(this, 95, 137, textureX, textureY); // Box 23
		bodyModel[150] = new ModelRendererTurbo(this, 148, 60, textureX, textureY, "lamp"); // Markerlight 2
		bodyModel[151] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 2
		bodyModel[152] = new ModelRendererTurbo(this, 148, 60, textureX, textureY, "lamp"); // Markerlight 2
		bodyModel[153] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 2
		bodyModel[154] = new ModelRendererTurbo(this, 252, 137, textureX, textureY); // Box 23
		bodyModel[155] = new ModelRendererTurbo(this, 1, 67, textureX, textureY); // Box 34
		bodyModel[156] = new ModelRendererTurbo(this, 16, 69, textureX, textureY); // Box 41
		bodyModel[157] = new ModelRendererTurbo(this, 7, 46, textureX, textureY); // Box 45
		bodyModel[158] = new ModelRendererTurbo(this, 90, 145, textureX, textureY); // Box 135 MU connection
		bodyModel[159] = new ModelRendererTurbo(this, 106, 145, textureX, textureY); // Box 135 MU connection
		bodyModel[160] = new ModelRendererTurbo(this, 263, 145, textureX, textureY); // Box 135 MU connection
		bodyModel[161] = new ModelRendererTurbo(this, 247, 145, textureX, textureY); // Box 135 MU connection
		bodyModel[162] = new ModelRendererTurbo(this, 255, 102, textureX, textureY); // Box 135 MU connection
		bodyModel[163] = new ModelRendererTurbo(this, 98, 105, textureX, textureY); // Box 135 MU connection
		bodyModel[164] = new ModelRendererTurbo(this, 172, 30, textureX, textureY); // Box 299
		bodyModel[165] = new ModelRendererTurbo(this, 181, 30, textureX, textureY); // Box 300
		bodyModel[166] = new ModelRendererTurbo(this, 172, 27, textureX, textureY); // Box 299
		bodyModel[167] = new ModelRendererTurbo(this, 181, 27, textureX, textureY); // Box 300
		bodyModel[168] = new ModelRendererTurbo(this, 172, 24, textureX, textureY); // Box 299
		bodyModel[169] = new ModelRendererTurbo(this, 181, 24, textureX, textureY); // Box 300
		bodyModel[170] = new ModelRendererTurbo(this, 1, 103, textureX, textureY); // Box 34
		bodyModel[171] = new ModelRendererTurbo(this, 13, 103, textureX, textureY); // Box 41
		bodyModel[172] = new ModelRendererTurbo(this, 16, 89, textureX, textureY); // Box 45
		bodyModel[173] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Control stand
		bodyModel[174] = new ModelRendererTurbo(this, 81, 75, textureX, textureY); // Control stand early gauges
		bodyModel[175] = new ModelRendererTurbo(this, 258, 64, textureX, textureY); // Box 62
		bodyModel[176] = new ModelRendererTurbo(this, 414, 25, textureX, textureY); // Box 36
		bodyModel[177] = new ModelRendererTurbo(this, 400, 25, textureX, textureY); // Box 37
		bodyModel[178] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 36
		bodyModel[179] = new ModelRendererTurbo(this, 16, 139, textureX, textureY); // Box 37
		bodyModel[180] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Box 38
		bodyModel[181] = new ModelRendererTurbo(this, 34, 126, textureX, textureY); // Box 46
		bodyModel[182] = new ModelRendererTurbo(this, 34, 121, textureX, textureY); // Box 47
		bodyModel[183] = new ModelRendererTurbo(this, 1, 64, textureX, textureY); // Box 36
		bodyModel[184] = new ModelRendererTurbo(this, 16, 64, textureX, textureY); // Box 37
		bodyModel[185] = new ModelRendererTurbo(this, 50, 107, textureX, textureY); // Box 46
		bodyModel[186] = new ModelRendererTurbo(this, 50, 102, textureX, textureY); // Box 47
		bodyModel[187] = new ModelRendererTurbo(this, 29, 59, textureX, textureY); // Box 46
		bodyModel[188] = new ModelRendererTurbo(this, 2, 59, textureX, textureY); // Box 47
		bodyModel[189] = new ModelRendererTurbo(this, 57, 86, textureX, textureY); // Box 38
		bodyModel[190] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Box 36
		bodyModel[191] = new ModelRendererTurbo(this, 16, 102, textureX, textureY); // Box 37
		bodyModel[192] = new ModelRendererTurbo(this, 51, 122, textureX, textureY); // Box 38
		bodyModel[193] = new ModelRendererTurbo(this, 1, 134, textureX, textureY); // Box 36
		bodyModel[194] = new ModelRendererTurbo(this, 16, 134, textureX, textureY); // Box 37
		bodyModel[195] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 36
		bodyModel[196] = new ModelRendererTurbo(this, 16, 69, textureX, textureY); // Box 37
		bodyModel[197] = new ModelRendererTurbo(this, 1, 107, textureX, textureY); // Box 36
		bodyModel[198] = new ModelRendererTurbo(this, 16, 107, textureX, textureY); // Box 37
		bodyModel[199] = new ModelRendererTurbo(this, 98, 11, textureX, textureY); // Box 66
		bodyModel[200] = new ModelRendererTurbo(this, 98, 44, textureX, textureY); // Box 171
		bodyModel[201] = new ModelRendererTurbo(this, 1, 164, textureX, textureY); // Box 34
		bodyModel[202] = new ModelRendererTurbo(this, 21, 174, textureX, textureY); // Box 41
		bodyModel[203] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 45
		bodyModel[204] = new ModelRendererTurbo(this, 58, 158, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 36
		bodyModel[206] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 37
		bodyModel[207] = new ModelRendererTurbo(this, 29, 156, textureX, textureY); // Box 46
		bodyModel[208] = new ModelRendererTurbo(this, 1, 156, textureX, textureY); // Box 47
		bodyModel[209] = new ModelRendererTurbo(this, 1, 166, textureX, textureY); // Box 36
		bodyModel[210] = new ModelRendererTurbo(this, 16, 166, textureX, textureY); // Box 37
		bodyModel[211] = new ModelRendererTurbo(this, 243, 21, textureX, textureY); // Box 221
		bodyModel[212] = new ModelRendererTurbo(this, 243, 26, textureX, textureY); // Box 221
		bodyModel[213] = new ModelRendererTurbo(this, 246, 51, textureX, textureY); // Exhast stack
		bodyModel[214] = new ModelRendererTurbo(this, 233, 70, textureX, textureY); // Box 62
		bodyModel[215] = new ModelRendererTurbo(this, 233, 80, textureX, textureY); // Box 62
		bodyModel[216] = new ModelRendererTurbo(this, 407, 3, textureX, textureY); // Sand cap long hood
		bodyModel[217] = new ModelRendererTurbo(this, 1, 126, textureX, textureY); // Sand cap short hood chop 2
		bodyModel[218] = new ModelRendererTurbo(this, 26, 64, textureX, textureY); // Sand cap short hood Stand
		bodyModel[219] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Sand cap short hood chop 1
		bodyModel[220] = new ModelRendererTurbo(this, 59, 163, textureX, textureY); // Sand cap short hood hamer
		bodyModel[221] = new ModelRendererTurbo(this, 422, 70, textureX, textureY); // Box 62
		bodyModel[222] = new ModelRendererTurbo(this, 243, 7, textureX, textureY); // MILW heater thingy
		bodyModel[223] = new ModelRendererTurbo(this, 252, 46, textureX, textureY); // Box 222 Wack ehast extention
		bodyModel[224] = new ModelRendererTurbo(this, 158, 27, textureX, textureY); // Box 299
		bodyModel[225] = new ModelRendererTurbo(this, 167, 27, textureX, textureY); // Box 300
		bodyModel[226] = new ModelRendererTurbo(this, 415, 8, textureX, textureY); // Wacky numberboard sockets
		bodyModel[227] = new ModelRendererTurbo(this, 397, 8, textureX, textureY); // Wacky numberboard sockets
		bodyModel[228] = new ModelRendererTurbo(this, 159, 10, textureX, textureY, BoxName.commander); // Commander beacon 2
		bodyModel[229] = new ModelRendererTurbo(this, 158, 14, textureX, textureY); // Box 400
		bodyModel[230] = new ModelRendererTurbo(this, 149, 13, textureX, textureY); // Box 364 prime base
		bodyModel[231] = new ModelRendererTurbo(this, 149, 9, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[232] = new ModelRendererTurbo(this, 149, 9, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[233] = new ModelRendererTurbo(this, 149, 9, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[234] = new ModelRendererTurbo(this, 149, 9, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[235] = new ModelRendererTurbo(this, 177, 132, textureX, textureY); // Box 102
		bodyModel[236] = new ModelRendererTurbo(this, 6, 46, textureX, textureY); // Steam gen exhast
		bodyModel[237] = new ModelRendererTurbo(this, 55, 23, textureX, textureY); // BCOL forehead
		bodyModel[238] = new ModelRendererTurbo(this, 53, 12, textureX, textureY); // BCOL forehead
		bodyModel[239] = new ModelRendererTurbo(this, 54, 2, textureX, textureY); // BCOL forehead
		bodyModel[240] = new ModelRendererTurbo(this, 64, 11, textureX, textureY, "lamp"); // BCOL headlight
		bodyModel[241] = new ModelRendererTurbo(this, 172, 13, textureX, textureY); // Box 215
		bodyModel[242] = new ModelRendererTurbo(this, 277, 47, textureX, textureY); // Box 31
		bodyModel[243] = new ModelRendererTurbo(this, 171, 101, textureX, textureY); // Box 107
		bodyModel[244] = new ModelRendererTurbo(this, 32, 140, textureX, textureY); // Box 149 BCOL detail
		bodyModel[245] = new ModelRendererTurbo(this, 32, 137, textureX, textureY); // Box 150 BCOL detail
		bodyModel[246] = new ModelRendererTurbo(this, 33, 43, textureX, textureY, "lamp"); // Box 149 glow
		bodyModel[247] = new ModelRendererTurbo(this, 40, 43, textureX, textureY, "lamp"); // Box 150 glow
		bodyModel[248] = new ModelRendererTurbo(this, 43, 49, textureX, textureY); // Wacky numberboard sockets
		bodyModel[249] = new ModelRendererTurbo(this, 43, 49, textureX, textureY); // Wacky numberboard sockets
		bodyModel[250] = new ModelRendererTurbo(this, 148, 78, textureX, textureY, "lamp"); // Markerlight
		bodyModel[251] = new ModelRendererTurbo(this, 148, 78, textureX, textureY, "lamp"); // Markerlight
		bodyModel[252] = new ModelRendererTurbo(this, 421, 15, textureX, textureY, "lamp"); // Box 149 glow
		bodyModel[253] = new ModelRendererTurbo(this, 395, 15, textureX, textureY, "lamp"); // Box 150 glow
		bodyModel[254] = new ModelRendererTurbo(this, 442, 44, textureX, textureY, "lamp"); // long hood gyralite top lamp
		bodyModel[255] = new ModelRendererTurbo(this, 442, 49, textureX, textureY, "lamp"); // long hood gyralite bottom lamp
		bodyModel[256] = new ModelRendererTurbo(this, 435, 45, textureX, textureY); // Box 78 gyralite lamp socket
		bodyModel[257] = new ModelRendererTurbo(this, 422, 5, textureX, textureY, "cull"); // Northeast Markerlight supports cull
		bodyModel[258] = new ModelRendererTurbo(this, 394, 5, textureX, textureY, "cull"); // Northeast Markerlight supports cull
		bodyModel[259] = new ModelRendererTurbo(this, 40, 46, textureX, textureY, "cull"); // Northeast Markerlight supports cull
		bodyModel[260] = new ModelRendererTurbo(this, 40, 46, textureX, textureY, "cull"); // Northeast Markerlight supports cull
		bodyModel[261] = new ModelRendererTurbo(this, 158, 24, textureX, textureY); // Box 299
		bodyModel[262] = new ModelRendererTurbo(this, 167, 24, textureX, textureY); // Box 300
		bodyModel[263] = new ModelRendererTurbo(this, 188, 24, textureX, textureY); // Box 299
		bodyModel[264] = new ModelRendererTurbo(this, 197, 24, textureX, textureY); // Box 300
		bodyModel[265] = new ModelRendererTurbo(this, 188, 27, textureX, textureY); // Box 299
		bodyModel[266] = new ModelRendererTurbo(this, 197, 27, textureX, textureY); // Box 300
		bodyModel[267] = new ModelRendererTurbo(this, 149, 13, textureX, textureY); // Box 364 prime base
		bodyModel[268] = new ModelRendererTurbo(this, 149, 9, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[269] = new ModelRendererTurbo(this, 149, 9, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[270] = new ModelRendererTurbo(this, 149, 9, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[271] = new ModelRendererTurbo(this, 149, 9, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[272] = new ModelRendererTurbo(this, 257, 54, textureX, textureY); // RS Vent box
		bodyModel[273] = new ModelRendererTurbo(this, 198, 132, textureX, textureY); // Box 102
		bodyModel[274] = new ModelRendererTurbo(this, 158, 100, textureX, textureY); // Box 107
		bodyModel[275] = new ModelRendererTurbo(this, 162, 144, textureX, textureY); // Box 427
		bodyModel[276] = new ModelRendererTurbo(this, 155, 144, textureX, textureY); // Box 428
		bodyModel[277] = new ModelRendererTurbo(this, 152, 144, textureX, textureY); // Box 429
		bodyModel[278] = new ModelRendererTurbo(this, 145, 146, textureX, textureY); // Box 330
		bodyModel[279] = new ModelRendererTurbo(this, 134, 149, textureX, textureY); // Box 431
		bodyModel[280] = new ModelRendererTurbo(this, 140, 146, textureX, textureY); // Box 432
		bodyModel[281] = new ModelRendererTurbo(this, 145, 144, textureX, textureY); // Box 434
		bodyModel[282] = new ModelRendererTurbo(this, 176, 152, textureX, textureY); // PRR trainphone
		bodyModel[283] = new ModelRendererTurbo(this, 164, 155, textureX, textureY); // PRR trainphone support
		bodyModel[284] = new ModelRendererTurbo(this, 164, 155, textureX, textureY); // PRR trainphone support
		bodyModel[285] = new ModelRendererTurbo(this, 167, 153, textureX, textureY, "cull"); // PRR trainphone suport cull
		bodyModel[286] = new ModelRendererTurbo(this, 311, 116, textureX, textureY); // Box 19
		bodyModel[287] = new ModelRendererTurbo(this, 332, 117, textureX, textureY, "cull"); // Airtank pipe and supports cull
		bodyModel[288] = new ModelRendererTurbo(this, 332, 114, textureX, textureY); // Box 19
		bodyModel[289] = new ModelRendererTurbo(this, 332, 114, textureX, textureY); // Box 548
		bodyModel[290] = new ModelRendererTurbo(this, 311, 111, textureX, textureY); // Box 448
		bodyModel[291] = new ModelRendererTurbo(this, 332, 121, textureX, textureY, "cull"); // Airtank pipe and supports cull
		bodyModel[292] = new ModelRendererTurbo(this, 332, 111, textureX, textureY); // Box 450
		bodyModel[293] = new ModelRendererTurbo(this, 332, 111, textureX, textureY); // Box 451
		bodyModel[294] = new ModelRendererTurbo(this, 309, 160, textureX, textureY); // Batterybox
		bodyModel[295] = new ModelRendererTurbo(this, 308, 142, textureX, textureY, "cull"); // Battery box cull
		bodyModel[296] = new ModelRendererTurbo(this, 357, 160, textureX, textureY); // Box 455
		bodyModel[297] = new ModelRendererTurbo(this, 358, 142, textureX, textureY, "cull"); // Battery box cull
		bodyModel[298] = new ModelRendererTurbo(this, 324, 160, textureX, textureY); // Box 457
		bodyModel[299] = new ModelRendererTurbo(this, 184, 91, textureX, textureY); // Box 354
		bodyModel[300] = new ModelRendererTurbo(this, 202, 87, textureX, textureY); // Box 355
		bodyModel[301] = new ModelRendererTurbo(this, 194, 94, textureX, textureY); // Box 358
		bodyModel[302] = new ModelRendererTurbo(this, 186, 95, textureX, textureY); // Box 359
		bodyModel[303] = new ModelRendererTurbo(this, 186, 95, textureX, textureY); // Box 360
		bodyModel[304] = new ModelRendererTurbo(this, 205, 92, textureX, textureY); // Box 364
		bodyModel[305] = new ModelRendererTurbo(this, 186, 105, textureX, textureY); // Box 368
		bodyModel[306] = new ModelRendererTurbo(this, 205, 101, textureX, textureY); // Box 369
		bodyModel[307] = new ModelRendererTurbo(this, 186, 105, textureX, textureY); // Box 370
		bodyModel[308] = new ModelRendererTurbo(this, 207, 87, textureX, textureY); // Box 371
		bodyModel[309] = new ModelRendererTurbo(this, 194, 103, textureX, textureY); // Box 372
		bodyModel[310] = new ModelRendererTurbo(this, 184, 101, textureX, textureY); // Box 374
		bodyModel[311] = new ModelRendererTurbo(this, 448, 4, textureX, textureY, "cull"); // Canadian winderization hatch cull
		bodyModel[312] = new ModelRendererTurbo(this, 450, 36, textureX, textureY, "cull"); // Canadian winderization hatch cull
		bodyModel[313] = new ModelRendererTurbo(this, 448, 15, textureX, textureY, "cull"); // RS winderization hatch 1
		bodyModel[314] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Steam gen exhaust
		bodyModel[315] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Steam gen exhaust extend 1
		bodyModel[316] = new ModelRendererTurbo(this, 9, 28, textureX, textureY); // Steam gen exhaust extend 2
		bodyModel[317] = new ModelRendererTurbo(this, 172, 44, textureX, textureY); // Box 403
		bodyModel[318] = new ModelRendererTurbo(this, 172, 41, textureX, textureY); // Box 404
		bodyModel[319] = new ModelRendererTurbo(this, 172, 38, textureX, textureY); // Box 405
		bodyModel[320] = new ModelRendererTurbo(this, 177, 36, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[321] = new ModelRendererTurbo(this, 170, 59, textureX, textureY); // MILW heater thingy
		bodyModel[322] = new ModelRendererTurbo(this, 171, 54, textureX, textureY); // MILW heater thingy
		bodyModel[323] = new ModelRendererTurbo(this, 200, 59, textureX, textureY); // MILW heater thingy
		bodyModel[324] = new ModelRendererTurbo(this, 200, 54, textureX, textureY); // MILW heater thingy
		bodyModel[325] = new ModelRendererTurbo(this, 209, 60, textureX, textureY); // MILW heater thingy
		bodyModel[326] = new ModelRendererTurbo(this, 209, 55, textureX, textureY); // MILW heater thingy
		bodyModel[327] = new ModelRendererTurbo(this, 216, 54, textureX, textureY); // MILW heater thingy
		bodyModel[328] = new ModelRendererTurbo(this, 216, 59, textureX, textureY); // MILW heater thingy
		bodyModel[329] = new ModelRendererTurbo(this, 181, 64, textureX, textureY); // MILW heater thingy
		bodyModel[330] = new ModelRendererTurbo(this, 184, 56, textureX, textureY, "cull"); // MILW heater thingy support cull
		bodyModel[331] = new ModelRendererTurbo(this, 184, 56, textureX, textureY, "cull"); // MILW heater thingy support cull
		bodyModel[332] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 512
		bodyModel[333] = new ModelRendererTurbo(this, 205, 25, textureX, textureY); // Box 327
		bodyModel[334] = new ModelRendererTurbo(this, 216, 25, textureX, textureY); // Box 328
		bodyModel[335] = new ModelRendererTurbo(this, 219, 28, textureX, textureY); // Box 329
		bodyModel[336] = new ModelRendererTurbo(this, 228, 28, textureX, textureY); // Box 330
		bodyModel[337] = new ModelRendererTurbo(this, 212, 28, textureX, textureY); // Box 331
		bodyModel[338] = new ModelRendererTurbo(this, 205, 28, textureX, textureY); // Box 332
		bodyModel[339] = new ModelRendererTurbo(this, 233, 99, textureX, textureY); // Box 5
		bodyModel[340] = new ModelRendererTurbo(this, 76, 99, textureX, textureY); // Box 19
		bodyModel[341] = new ModelRendererTurbo(this, 263, 133, textureX, textureY); // Box 81
		bodyModel[342] = new ModelRendererTurbo(this, 243, 133, textureX, textureY); // Box 83
		bodyModel[343] = new ModelRendererTurbo(this, 86, 133, textureX, textureY); // Box 86
		bodyModel[344] = new ModelRendererTurbo(this, 106, 133, textureX, textureY); // Box 89
		bodyModel[345] = new ModelRendererTurbo(this, 258, 101, textureX, textureY); // Box 116
		bodyModel[346] = new ModelRendererTurbo(this, 248, 101, textureX, textureY); // Box 117
		bodyModel[347] = new ModelRendererTurbo(this, 84, 98, textureX, textureY); // Box 131
		bodyModel[348] = new ModelRendererTurbo(this, 125, 113, textureX, textureY); // Box 138
		bodyModel[349] = new ModelRendererTurbo(this, 125, 106, textureX, textureY); // Box 139
		bodyModel[350] = new ModelRendererTurbo(this, 133, 113, textureX, textureY); // Box 230
		bodyModel[351] = new ModelRendererTurbo(this, 133, 106, textureX, textureY); // Box 233
		bodyModel[352] = new ModelRendererTurbo(this, 133, 113, textureX, textureY); // Box 239
		bodyModel[353] = new ModelRendererTurbo(this, 133, 106, textureX, textureY); // Box 241
		bodyModel[354] = new ModelRendererTurbo(this, 125, 113, textureX, textureY); // Box 246
		bodyModel[355] = new ModelRendererTurbo(this, 125, 106, textureX, textureY); // Box 248
		bodyModel[356] = new ModelRendererTurbo(this, 241, 98, textureX, textureY); // Box 5
		bodyModel[357] = new ModelRendererTurbo(this, 101, 104, textureX, textureY); // Box 116
		bodyModel[358] = new ModelRendererTurbo(this, 91, 104, textureX, textureY); // Box 117
		bodyModel[359] = new ModelRendererTurbo(this, 174, 141, textureX, textureY); // Box 105
		bodyModel[360] = new ModelRendererTurbo(this, 168, 102, textureX, textureY); // Box 105
		bodyModel[361] = new ModelRendererTurbo(this, 168, 111, textureX, textureY); // Box 105
		bodyModel[362] = new ModelRendererTurbo(this, 174, 132, textureX, textureY); // Box 105
		bodyModel[363] = new ModelRendererTurbo(this, 165, 99, textureX, textureY); // Box 105
		bodyModel[364] = new ModelRendererTurbo(this, 179, 10, textureX, textureY, "cull"); // Box 3 cull
		bodyModel[365] = new ModelRendererTurbo(this, 206, 5, textureX, textureY); // Box 5
		bodyModel[366] = new ModelRendererTurbo(this, 181, 5, textureX, textureY); // Box 304
		bodyModel[367] = new ModelRendererTurbo(this, 205, 10, textureX, textureY, "cull"); // Box 311 cull
		bodyModel[368] = new ModelRendererTurbo(this, 258, 106, textureX, textureY); // Box 116
		bodyModel[369] = new ModelRendererTurbo(this, 248, 106, textureX, textureY); // Box 117
		bodyModel[370] = new ModelRendererTurbo(this, 91, 106, textureX, textureY); // Box 117
		bodyModel[371] = new ModelRendererTurbo(this, 101, 106, textureX, textureY); // Box 116
		bodyModel[372] = new ModelRendererTurbo(this, 218, 40, textureX, textureY, "cull"); // Bell frame cul
		bodyModel[373] = new ModelRendererTurbo(this, 157, 62, textureX, textureY, "lamp"); // Markerlight 2 glow
		bodyModel[374] = new ModelRendererTurbo(this, 157, 65, textureX, textureY, "lamp"); // Markerlight 2 glow
		bodyModel[375] = new ModelRendererTurbo(this, 157, 62, textureX, textureY, "lamp"); // Markerlight 2 glow
		bodyModel[376] = new ModelRendererTurbo(this, 157, 65, textureX, textureY, "lamp"); // Markerlight 2 glow
		bodyModel[377] = new ModelRendererTurbo(this, 148, 69, textureX, textureY, "lamp"); // Markerlight 1
		bodyModel[378] = new ModelRendererTurbo(this, 157, 71, textureX, textureY, "lamp"); // Markerlight 2 glow
		bodyModel[379] = new ModelRendererTurbo(this, 157, 74, textureX, textureY, "lamp"); // Markerlight 2 glow
		bodyModel[380] = new ModelRendererTurbo(this, 148, 69, textureX, textureY, "lamp"); // Markerlight 1
		bodyModel[381] = new ModelRendererTurbo(this, 157, 71, textureX, textureY, "lamp"); // Markerlight 2 glow
		bodyModel[382] = new ModelRendererTurbo(this, 157, 74, textureX, textureY, "lamp"); // Markerlight 2 glow
		bodyModel[383] = new ModelRendererTurbo(this, 204, 40, textureX, textureY, "cull"); // Bell frame cul
		bodyModel[384] = new ModelRendererTurbo(this, 157, 80, textureX, textureY, "lamp"); // Markerlight glow
		bodyModel[385] = new ModelRendererTurbo(this, 157, 83, textureX, textureY, "lamp"); // Markerlight glow
		bodyModel[386] = new ModelRendererTurbo(this, 157, 80, textureX, textureY, "lamp"); // Markerlight glow
		bodyModel[387] = new ModelRendererTurbo(this, 157, 83, textureX, textureY, "lamp"); // Markerlight glow
		bodyModel[388] = new ModelRendererTurbo(this, 359, 110, textureX, textureY); // Box 92
		bodyModel[389] = new ModelRendererTurbo(this, 282, 110, textureX, textureY); // Box 93
		bodyModel[390] = new ModelRendererTurbo(this, 387, 127, textureX, textureY); // Box 221
		bodyModel[391] = new ModelRendererTurbo(this, 288, 127, textureX, textureY); // Box 222
		bodyModel[392] = new ModelRendererTurbo(this, 367, 126, textureX, textureY); // Box 92
		bodyModel[393] = new ModelRendererTurbo(this, 367, 126, textureX, textureY); // Box 92
		bodyModel[394] = new ModelRendererTurbo(this, 311, 126, textureX, textureY); // Box 92
		bodyModel[395] = new ModelRendererTurbo(this, 311, 126, textureX, textureY); // Box 92
		bodyModel[396] = new ModelRendererTurbo(this, 262, 182, textureX, textureY); // Box 18
		bodyModel[397] = new ModelRendererTurbo(this, 50, 46, textureX, textureY, "lamp"); // Wacky numberboard glow
		bodyModel[398] = new ModelRendererTurbo(this, 50, 46, textureX, textureY, "lamp"); // Wacky numberboard glow
		bodyModel[399] = new ModelRendererTurbo(this, 50, 46, textureX, textureY, "lamp"); // Wacky numberboard glow
		bodyModel[400] = new ModelRendererTurbo(this, 50, 46, textureX, textureY, "lamp"); // Wacky numberboard glow
		bodyModel[401] = new ModelRendererTurbo(this, 434, 70, textureX, textureY); // Box 221
		bodyModel[402] = new ModelRendererTurbo(this, 434, 48, textureX, textureY); // MILW heater thingy
		bodyModel[403] = new ModelRendererTurbo(this, 222, 166, textureX, textureY); // Box 50
		bodyModel[404] = new ModelRendererTurbo(this, 56, 143, textureX, textureY); // Box 21
		bodyModel[405] = new ModelRendererTurbo(this, 244, 164, textureX, textureY); // Box 223
		bodyModel[406] = new ModelRendererTurbo(this, 244, 162, textureX, textureY); // Box 224
		bodyModel[407] = new ModelRendererTurbo(this, 78, 139, textureX, textureY); // Box 225
		bodyModel[408] = new ModelRendererTurbo(this, 78, 141, textureX, textureY); // Box 226
		bodyModel[409] = new ModelRendererTurbo(this, 107, 149, textureX, textureY); // Box 132
		bodyModel[410] = new ModelRendererTurbo(this, 85, 149, textureX, textureY); // Box 133
		bodyModel[411] = new ModelRendererTurbo(this, 190, 162, textureX, textureY); // Box 307
		bodyModel[412] = new ModelRendererTurbo(this, 212, 162, textureX, textureY); // Box 308
		bodyModel[413] = new ModelRendererTurbo(this, 83, 186, textureX, textureY); // Box 4
		bodyModel[414] = new ModelRendererTurbo(this, 83, 198, textureX, textureY); // Box 4
		bodyModel[415] = new ModelRendererTurbo(this, 120, 178, textureX, textureY); // Box 446
		bodyModel[416] = new ModelRendererTurbo(this, 107, 198, textureX, textureY); // Box 4
		bodyModel[417] = new ModelRendererTurbo(this, 72, 178, textureX, textureY); // Box 446
		bodyModel[418] = new ModelRendererTurbo(this, 109, 174, textureX, textureY); // Box 448
		bodyModel[419] = new ModelRendererTurbo(this, 86, 174, textureX, textureY); // Box 448
		bodyModel[420] = new ModelRendererTurbo(this, 120, 166, textureX, textureY); // Box 361
		bodyModel[421] = new ModelRendererTurbo(this, 109, 161, textureX, textureY); // Box 361 big fuck off plow
		bodyModel[422] = new ModelRendererTurbo(this, 75, 166, textureX, textureY); // Box 361
		bodyModel[423] = new ModelRendererTurbo(this, 86, 161, textureX, textureY); // Box 361 big fuck off plow
		bodyModel[424] = new ModelRendererTurbo(this, 188, 199, textureX, textureY); // Box 4
		bodyModel[425] = new ModelRendererTurbo(this, 188, 211, textureX, textureY); // Box 4
		bodyModel[426] = new ModelRendererTurbo(this, 224, 179, textureX, textureY); // Box 446
		bodyModel[427] = new ModelRendererTurbo(this, 212, 199, textureX, textureY); // Box 4
		bodyModel[428] = new ModelRendererTurbo(this, 212, 211, textureX, textureY); // Box 4
		bodyModel[429] = new ModelRendererTurbo(this, 180, 179, textureX, textureY); // Box 446
		bodyModel[430] = new ModelRendererTurbo(this, 213, 187, textureX, textureY); // Box 448
		bodyModel[431] = new ModelRendererTurbo(this, 191, 187, textureX, textureY); // Box 448
		bodyModel[432] = new ModelRendererTurbo(this, 225, 166, textureX, textureY); // Box 361
		bodyModel[433] = new ModelRendererTurbo(this, 213, 174, textureX, textureY); // Box 361 big fuck off plow
		bodyModel[434] = new ModelRendererTurbo(this, 179, 166, textureX, textureY); // Box 361
		bodyModel[435] = new ModelRendererTurbo(this, 191, 174, textureX, textureY); // Box 361 big fuck off plow
		bodyModel[436] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 24
		bodyModel[437] = new ModelRendererTurbo(this, 175, 201, textureX, textureY); // Box 25
		bodyModel[438] = new ModelRendererTurbo(this, 120, 188, textureX, textureY); // Box 24
		bodyModel[439] = new ModelRendererTurbo(this, 70, 188, textureX, textureY); // Box 25
		bodyModel[440] = new ModelRendererTurbo(this, 107, 186, textureX, textureY); // Box 4
		bodyModel[441] = new ModelRendererTurbo(this, 81, 80, textureX, textureY); // Control stand
		bodyModel[442] = new ModelRendererTurbo(this, 73, 82, textureX, textureY); // Control stand
		bodyModel[443] = new ModelRendererTurbo(this, 87, 70, textureX, textureY); // Control stand standard gauges
		bodyModel[444] = new ModelRendererTurbo(this, 98, 88, textureX, textureY); // Early control pannel
		bodyModel[445] = new ModelRendererTurbo(this, 98, 80, textureX, textureY); // Early control pannel
		bodyModel[446] = new ModelRendererTurbo(this, 99, 75, textureX, textureY); // Standard gauge pannel
		bodyModel[447] = new ModelRendererTurbo(this, 1, 195, textureX, textureY); // Dynamics type 2 
		bodyModel[448] = new ModelRendererTurbo(this, 24, 198, textureX, textureY); // Dynamics type 1
		bodyModel[449] = new ModelRendererTurbo(this, 1, 212, textureX, textureY); // Dynamics type 2 Hammerhead
		bodyModel[450] = new ModelRendererTurbo(this, 24, 215, textureX, textureY); // Dynamics type 1 hammerhead
		bodyModel[451] = new ModelRendererTurbo(this, 441, 11, textureX, textureY, "lamp"); // long hood left lamp
		bodyModel[452] = new ModelRendererTurbo(this, 441, 11, textureX, textureY, "lamp"); // long hood right lamp
		bodyModel[453] = new ModelRendererTurbo(this, 157, 30, textureX, textureY); // Box 327
		bodyModel[454] = new ModelRendererTurbo(this, 243, 32, textureX, textureY); // Box 221
		bodyModel[455] = new ModelRendererTurbo(this, 243, 14, textureX, textureY); // MILW heater thingy
		bodyModel[456] = new ModelRendererTurbo(this, 243, 1, textureX, textureY); // MILW heater thingy
		bodyModel[457] = new ModelRendererTurbo(this, 167, 153, textureX, textureY, "cull"); // PRR trainphone suport cull
		bodyModel[458] = new ModelRendererTurbo(this, 450, 36, textureX, textureY, "lamp"); // long hood left lamp
		bodyModel[459] = new ModelRendererTurbo(this, 450, 36, textureX, textureY, "lamp"); // long hood right lamp
		bodyModel[460] = new ModelRendererTurbo(this, 443, 37, textureX, textureY); // BCOL lamp socket
		bodyModel[461] = new ModelRendererTurbo(this, 227, 41, textureX, textureY, "cull"); // BCOL Bell frame cul
		bodyModel[462] = new ModelRendererTurbo(this, 227, 38, textureX, textureY, "cull"); // BCOL Bell frame cul
		bodyModel[463] = new ModelRendererTurbo(this, 227, 44, textureX, textureY, "cull"); // BCOL Bell frame cul
		bodyModel[464] = new ModelRendererTurbo(this, 232, 40, textureX, textureY, "cull"); // BCOL Bell frame cul
		bodyModel[465] = new ModelRendererTurbo(this, 158, 98, textureX, textureY); // Box 107
		bodyModel[466] = new ModelRendererTurbo(this, 137, 45, textureX, textureY); // Control stand
		bodyModel[467] = new ModelRendererTurbo(this, 132, 51, textureX, textureY); // Control stand braking
		bodyModel[468] = new ModelRendererTurbo(this, 133, 56, textureX, textureY); // Control stand
		bodyModel[469] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // Control stand early gauges
		bodyModel[470] = new ModelRendererTurbo(this, 138, 38, textureX, textureY); // Control stand
		bodyModel[471] = new ModelRendererTurbo(this, 133, 46, textureX, textureY); // Control stand
		bodyModel[472] = new ModelRendererTurbo(this, 148, 38, textureX, textureY); // Control stand standard gauges
		bodyModel[473] = new ModelRendererTurbo(this, 141, 31, textureX, textureY); // Early control pannel
		bodyModel[474] = new ModelRendererTurbo(this, 141, 23, textureX, textureY); // Early control pannel
		bodyModel[475] = new ModelRendererTurbo(this, 142, 18, textureX, textureY); // Standard gauge pannel
		bodyModel[476] = new ModelRendererTurbo(this, 138, 144, textureX, textureY); // Box 434
		bodyModel[477] = new ModelRendererTurbo(this, 226, 146, textureX, textureY); // Box 108
		bodyModel[478] = new ModelRendererTurbo(this, 174, 146, textureX, textureY); // Box 108
		bodyModel[479] = new ModelRendererTurbo(this, 226, 146, textureX, textureY); // Box 108
		bodyModel[480] = new ModelRendererTurbo(this, 174, 146, textureX, textureY); // Box 108
		bodyModel[481] = new ModelRendererTurbo(this, 218, 47, textureX, textureY, "cull"); // CNJ Bell frame cul
		bodyModel[482] = new ModelRendererTurbo(this, 373, 142, textureX, textureY); // Box 31
		bodyModel[483] = new ModelRendererTurbo(this, 387, 47, textureX, textureY, "cull"); // MILW numberboard cull
		bodyModel[484] = new ModelRendererTurbo(this, 336, 132, textureX, textureY); // Box 374
		bodyModel[485] = new ModelRendererTurbo(this, 347, 132, textureX, textureY); // Box 377
		bodyModel[486] = new ModelRendererTurbo(this, 327, 131, textureX, textureY); // Box 374
		bodyModel[487] = new ModelRendererTurbo(this, 350, 131, textureX, textureY); // Box 377
		bodyModel[488] = new ModelRendererTurbo(this, 164, 14, textureX, textureY); // Box 409 commander base
		bodyModel[489] = new ModelRendererTurbo(this, 164, 10, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[490] = new ModelRendererTurbo(this, 159, 14, textureX, textureY); // Box 409 commander base
		bodyModel[491] = new ModelRendererTurbo(this, 159, 10, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[492] = new ModelRendererTurbo(this, 67, 39, textureX, textureY); // MON steam gen part
		bodyModel[493] = new ModelRendererTurbo(this, 67, 31, textureX, textureY); // MON steam gen part
		bodyModel[494] = new ModelRendererTurbo(this, 67, 44, textureX, textureY); // MON steam gen part
		bodyModel[495] = new ModelRendererTurbo(this, 172, 33, textureX, textureY); // Box 299
		bodyModel[496] = new ModelRendererTurbo(this, 181, 33, textureX, textureY); // Box 300
		bodyModel[497] = new ModelRendererTurbo(this, 172, 21, textureX, textureY); // Box 299
		bodyModel[498] = new ModelRendererTurbo(this, 181, 21, textureX, textureY); // Box 300

		bodyModel[0].addBox(0F, 0F, 0F, 68, 2, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[1].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(-37F, 1F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 9
		bodyModel[4].setRotationPoint(-37F, 8F, -12F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 10
		bodyModel[5].setRotationPoint(-37F, 6F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 12
		bodyModel[6].setRotationPoint(-37F, 3.5F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 13
		bodyModel[7].setRotationPoint(-37F, 1F, -8F);

		bodyModel[8].addBox(0F, 0F, 0F, 74, 2, 14, 0F); // Box 14
		bodyModel[8].setRotationPoint(-37F, -1F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 68, 2, 4, 0F); // Box 15
		bodyModel[9].setRotationPoint(-34F, -1F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[10].setRotationPoint(-37F, 1F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 74, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 18
		bodyModel[11].setRotationPoint(-37F, 1F, -5F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 23
		bodyModel[12].setRotationPoint(38F, 3F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[13].setRotationPoint(37F, 2.5F, -2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(32F, 1F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[15].setRotationPoint(-37F, 1F, 8F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 14, 10, 0F); // Box 34
		bodyModel[16].setRotationPoint(-33F, -15F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,-0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[17].setRotationPoint(-33F, -15F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F); // Box 37
		bodyModel[18].setRotationPoint(-33F, -15F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[19].setRotationPoint(-33F, -17F, -5F);

		bodyModel[20].addBox(0F, 0F, 0F, 39, 14, 14, 0F); // Box 41
		bodyModel[20].setRotationPoint(-31F, -15F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[21].setRotationPoint(37F, 1F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[22].setRotationPoint(37F, 1F, 8F);

		bodyModel[23].addBox(0F, 0F, 0F, 39, 2, 10, 0F); // Box 45
		bodyModel[23].setRotationPoint(-31F, -17F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 39, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[24].setRotationPoint(-31F, -17F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 39, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[25].setRotationPoint(-31F, -17F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 11, 12, 1, 0F); // Box 48
		bodyModel[26].setRotationPoint(9F, -17F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 11, 12, 1, 0F); // Box 49
		bodyModel[27].setRotationPoint(8F, -17F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 129
		bodyModel[28].setRotationPoint(8F, -22F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[29].setRotationPoint(8F, -20F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 132
		bodyModel[30].setRotationPoint(8F, -23F, 3F);

		bodyModel[31].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 135
		bodyModel[31].setRotationPoint(8F, -23F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[32].setRotationPoint(8F, -23F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[33].setRotationPoint(8F, -22F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[34].setRotationPoint(8F, -20F, -11F);

		bodyModel[35].addShapeBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315 door swing left
		bodyModel[35].setRotationPoint(8.5F, -17F, -10.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 61
		bodyModel[36].setRotationPoint(8F, -5F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 62
		bodyModel[37].setRotationPoint(20F, -3F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 12, 17, 0F); // Box 63
		bodyModel[38].setRotationPoint(8F, -17F, -7F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 12, 17, 0F); // Box 64
		bodyModel[39].setRotationPoint(19F, -17F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[40].setRotationPoint(19F, -22F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[41].setRotationPoint(19F, -21F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71 
		bodyModel[42].setRotationPoint(19F, -21F, 7F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // short hood lamp
		bodyModel[43].setRotationPoint(32.75F, -15F, -1.5F);

		bodyModel[44].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 79 door swing right
		bodyModel[44].setRotationPoint(19.5F, -17F, 10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // long hood lamp
		bodyModel[45].setRotationPoint(-33.75F, -15F, -1.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 94
		bodyModel[46].setRotationPoint(-30F, -14.5F, -7.25F);

		bodyModel[47].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 95
		bodyModel[47].setRotationPoint(-30F, -14.5F, 6.25F);

		bodyModel[48].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 102
		bodyModel[48].setRotationPoint(-34F, -9F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 105
		bodyModel[49].setRotationPoint(6F, -15F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 107
		bodyModel[50].setRotationPoint(-34F, -9F, 11F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 14, 24, 0F); // Box 108
		bodyModel[51].setRotationPoint(-34F, -9F, -12F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[52].setRotationPoint(-37.01F, -3F, -5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 121
		bodyModel[53].setRotationPoint(-37.01F, -3F, 1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 133
		bodyModel[54].setRotationPoint(37.01F, -3F, 1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[55].setRotationPoint(37.01F, -3F, -5F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 137
		bodyModel[56].setRotationPoint(-37F, 6F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // NP Bell 1
		bodyModel[57].setRotationPoint(24F, -19.5F, -0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // NP Bell 1
		bodyModel[58].setRotationPoint(24F, -20.5F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // NP Bell 1
		bodyModel[59].setRotationPoint(24.25F, -19F, -0.25F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // NP Bell 1
		bodyModel[60].setRotationPoint(24F, -17.5F, -1F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 149 glow
		bodyModel[61].setRotationPoint(-30F, -16F, -7.25F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 150 glow
		bodyModel[62].setRotationPoint(-30F, -16F, 6.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[63].setRotationPoint(19F, -22F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[64].setRotationPoint(8F, -21F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[65].setRotationPoint(8F, -22F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[66].setRotationPoint(8F, -22F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[67].setRotationPoint(8F, -21F, -10F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Control stand
		bodyModel[68].setRotationPoint(11F, -12F, 3F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Control stand braking
		bodyModel[69].setRotationPoint(15F, -12F, 4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Long hood ditchlight r
		bodyModel[70].setRotationPoint(-37.5F, -3F, 4.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[71].setRotationPoint(-37F, -3F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[72].setRotationPoint(-37F, -3F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Long hood ditchlight l
		bodyModel[73].setRotationPoint(-37.5F, -3F, -5.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // ditchlight short hood l
		bodyModel[74].setRotationPoint(38F, -3F, -4.25F);
		bodyModel[74].rotateAngleY = -3.14159265F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
		bodyModel[75].setRotationPoint(37.5F, -3F, -4F);
		bodyModel[75].rotateAngleY = -3.14159265F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 162
		bodyModel[76].setRotationPoint(37.5F, -3F, 6F);
		bodyModel[76].rotateAngleY = -3.14159265F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // ditchlight short hood r
		bodyModel[77].setRotationPoint(38F, -3F, 5.75F);
		bodyModel[77].rotateAngleY = -3.14159265F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Commander beacon 1
		bodyModel[78].setRotationPoint(9.32F, -24F, -0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 400
		bodyModel[79].setRotationPoint(9.5F, -24F, -0.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 215
		bodyModel[80].setRotationPoint(11F, -24.5F, -4.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 216
		bodyModel[81].setRotationPoint(19F, -17F, 11F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 217
		bodyModel[82].setRotationPoint(19F, -17F, -12F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[83].setRotationPoint(11F, -17F, 11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[84].setRotationPoint(11F, -17F, -12F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Exhast stack
		bodyModel[85].setRotationPoint(-14F, -22F, -1.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 227
		bodyModel[86].setRotationPoint(-37F, 8F, 10F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 228
		bodyModel[87].setRotationPoint(-37F, 6F, 10F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 229
		bodyModel[88].setRotationPoint(-37F, 6F, 8F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 231
		bodyModel[89].setRotationPoint(-37F, 3.5F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 232
		bodyModel[90].setRotationPoint(-37F, 1F, 7F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 236
		bodyModel[91].setRotationPoint(34F, 8F, 10F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 237
		bodyModel[92].setRotationPoint(34F, 6F, 10F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 238
		bodyModel[93].setRotationPoint(34F, 6F, 8F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 240
		bodyModel[94].setRotationPoint(34F, 3.5F, 7F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 242
		bodyModel[95].setRotationPoint(34F, 1F, 7F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 243
		bodyModel[96].setRotationPoint(34F, 8F, -12F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 244
		bodyModel[97].setRotationPoint(34F, 6F, -10F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 245
		bodyModel[98].setRotationPoint(34F, 6F, -10F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 247
		bodyModel[99].setRotationPoint(34F, 3.5F, -9F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 249
		bodyModel[100].setRotationPoint(34F, 1F, -8F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 250
		bodyModel[101].setRotationPoint(-37.02F, -2.5F, -7F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 251
		bodyModel[102].setRotationPoint(37.02F, -2.5F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[103].setRotationPoint(-35F, -17F, -0.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[104].setRotationPoint(-35F, -18F, -0.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[105].setRotationPoint(-34.75F, -16.5F, -0.25F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 6, 10, 0F); // Box 34
		bodyModel[106].setRotationPoint(31F, -7F, -5F);

		bodyModel[107].addBox(0F, 0F, 0F, 11, 6, 14, 0F); // Box 41
		bodyModel[107].setRotationPoint(20F, -7F, -7F);

		bodyModel[108].addBox(0F, 0F, 0F, 11, 2, 10, 0F); // Box 45
		bodyModel[108].setRotationPoint(20F, -9F, -5F);

		bodyModel[109].addBox(0F, 0F, 0F, 14, 11, 0, 0F); // Box 102
		bodyModel[109].setRotationPoint(20F, -12F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 107
		bodyModel[110].setRotationPoint(23F, -12F, 11F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 105
		bodyModel[111].setRotationPoint(21F, -15F, 11F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 14, 24, 0F); // Box 108
		bodyModel[112].setRotationPoint(34F, -9F, -12F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149 glow
		bodyModel[113].setRotationPoint(28F, -16F, -7.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150 glow
		bodyModel[114].setRotationPoint(28F, -16F, 6.25F);

		bodyModel[115].addBox(0F, 0F, 0F, 10, 5, 14, 0F); // Box 31
		bodyModel[115].setRotationPoint(-0.5F, 1F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 38
		bodyModel[116].setRotationPoint(-34F, -17.95F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 38
		bodyModel[117].setRotationPoint(-35F, -18.25F, -1F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 62
		bodyModel[118].setRotationPoint(20F, -5F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78 lamp socket
		bodyModel[119].setRotationPoint(32.5F, -15.5F, -2F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 lamp
		bodyModel[120].setRotationPoint(20F, -23F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Top short hood light l
		bodyModel[121].setRotationPoint(20.25F, -23F, -2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Top short hood light r
		bodyModel[122].setRotationPoint(20.25F, -23F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // short hood left lamp
		bodyModel[123].setRotationPoint(32.75F, -14.5F, -2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // short hood right lamp
		bodyModel[124].setRotationPoint(32.75F, -14.5F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // short hood top lamp
		bodyModel[125].setRotationPoint(32.75F, -15.5F, -1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // short hood bottom lamp
		bodyModel[126].setRotationPoint(32.75F, -13.5F, -1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // long hood lamp socket
		bodyModel[127].setRotationPoint(-33.5F, -15F, -1.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood left lamp
		bodyModel[128].setRotationPoint(-34.25F, -14.5F, -2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood right lamp
		bodyModel[129].setRotationPoint(-34.25F, -14.5F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood top lamp
		bodyModel[130].setRotationPoint(-34.25F, -15.5F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood bottom lamp
		bodyModel[131].setRotationPoint(-34.25F, -13.5F, -1F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 78 lamp socket
		bodyModel[132].setRotationPoint(32.5F, -14.5F, -2F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 78 lamp socket
		bodyModel[133].setRotationPoint(32.5F, -15.5F, -1F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 78 lamp socket
		bodyModel[134].setRotationPoint(-33.5F, -14.5F, -2F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 78 lamp socket
		bodyModel[135].setRotationPoint(-33.5F, -15.5F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[136].setRotationPoint(-10F, -19F, -1.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[137].setRotationPoint(-10F, -20F, -1.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[138].setRotationPoint(-9.75F, -18.5F, -1.25F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // long hood lamp socket
		bodyModel[139].setRotationPoint(-33F, -18.5F, -1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[140].setRotationPoint(-32F, -19F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood top lamp
		bodyModel[141].setRotationPoint(-33.75F, -19F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood bottom lamp
		bodyModel[142].setRotationPoint(-33.75F, -17F, -1F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
		bodyModel[143].setRotationPoint(32.5F, -8F, -1.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 34
		bodyModel[144].setRotationPoint(33.5F, -10F, -3.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 136
		bodyModel[145].setRotationPoint(37F, -6F, -5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[146].setRotationPoint(37F, -6F, 3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 136
		bodyModel[147].setRotationPoint(-37F, -6F, -5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[148].setRotationPoint(-37F, -6F, 3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 23
		bodyModel[149].setRotationPoint(36.5F, -5.5F, -2F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Markerlight 2
		bodyModel[150].setRotationPoint(-31.75F, -17.75F, 7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[151].setRotationPoint(-31.25F, -16F, 6.25F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Markerlight 2
		bodyModel[152].setRotationPoint(-31.75F, -17.5F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[153].setRotationPoint(-31.25F, -15.75F, -8.35F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 23
		bodyModel[154].setRotationPoint(-37.5F, -5.5F, -2F);

		bodyModel[155].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 34
		bodyModel[155].setRotationPoint(31F, -15F, -5F);

		bodyModel[156].addBox(0F, 0F, 0F, 11, 5, 14, 0F); // Box 41
		bodyModel[156].setRotationPoint(20F, -15F, -7F);

		bodyModel[157].addBox(0F, 0F, 0F, 11, 2, 10, 0F); // Box 45
		bodyModel[157].setRotationPoint(20F, -17F, -5F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[158].setRotationPoint(36.5F, -7.5F, -4F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[159].setRotationPoint(36.5F, -7.5F, 3F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[160].setRotationPoint(-37.5F, -7.5F, -4F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[161].setRotationPoint(-37.5F, -7.5F, 3F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[162].setRotationPoint(-37.5F, -4F, -0.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[163].setRotationPoint(36.5F, -4F, -0.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[164].setRotationPoint(17F, -24F, -5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[165].setRotationPoint(17F, -23F, -5F);

		bodyModel[166].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[166].setRotationPoint(8F, -24F, 5F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[167].setRotationPoint(10F, -23F, 5F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[168].setRotationPoint(20.5F, -24.5F, -0.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[169].setRotationPoint(20.5F, -23.5F, -0.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 34
		bodyModel[170].setRotationPoint(31F, -10F, -5F);

		bodyModel[171].addBox(0F, 0F, 0F, 11, 3, 14, 0F); // Box 41
		bodyModel[171].setRotationPoint(20F, -10F, -7F);

		bodyModel[172].addBox(0F, 0F, 0F, 11, 2, 10, 0F); // Box 45
		bodyModel[172].setRotationPoint(20F, -12F, -5F);

		bodyModel[173].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Control stand
		bodyModel[173].setRotationPoint(13F, -9F, 3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Control stand early gauges
		bodyModel[174].setRotationPoint(11F, -14F, 3F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 62
		bodyModel[175].setRotationPoint(6.5F, -3F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.875F, -0.875F, -0.875F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[176].setRotationPoint(-33F, -17F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, -0.875F, -0.875F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F); // Box 37
		bodyModel[177].setRotationPoint(-33F, -17F, 5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[178].setRotationPoint(31F, -7F, -7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F); // Box 37
		bodyModel[179].setRotationPoint(31F, -7F, 5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[180].setRotationPoint(31F, -17F, -5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[181].setRotationPoint(20F, -9F, 5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[182].setRotationPoint(20F, -9F, -7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.625F, -0.625F, -0.875F, -0.875F, -0.875F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[183].setRotationPoint(31F, -17F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.875F, -0.875F, -0.875F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F); // Box 37
		bodyModel[184].setRotationPoint(31F, -17F, 5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[185].setRotationPoint(20F, -12F, 5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[186].setRotationPoint(20F, -12F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[187].setRotationPoint(20F, -17F, 5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[188].setRotationPoint(20F, -17F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[189].setRotationPoint(31F, -12F, -5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.625F, -0.625F, -0.875F, -0.875F, -0.875F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[190].setRotationPoint(31F, -12F, -7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.875F, -0.875F, -0.875F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F); // Box 37
		bodyModel[191].setRotationPoint(31F, -12F, 5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[192].setRotationPoint(31F, -9F, -5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.625F, -0.625F, -0.875F, -0.875F, -0.875F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[193].setRotationPoint(31F, -9F, -7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.875F, -0.875F, -0.875F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F); // Box 37
		bodyModel[194].setRotationPoint(31F, -9F, 5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[195].setRotationPoint(31F, -15F, -7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F); // Box 37
		bodyModel[196].setRotationPoint(31F, -15F, 5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[197].setRotationPoint(31F, -10F, -7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F); // Box 37
		bodyModel[198].setRotationPoint(31F, -10F, 5F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 5, 20, 0F); // Box 66
		bodyModel[199].setRotationPoint(19F, -22F, -10F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 5, 20, 0F); // Box 171
		bodyModel[200].setRotationPoint(8F, -22F, -10F);

		bodyModel[201].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 34
		bodyModel[201].setRotationPoint(31F, -20F, -5F);

		bodyModel[202].addBox(0F, 0F, 0F, 11, 5, 14, 0F); // Box 41
		bodyModel[202].setRotationPoint(20F, -20F, -7F);

		bodyModel[203].addBox(0F, 0F, 0F, 11, 2, 10, 0F); // Box 45
		bodyModel[203].setRotationPoint(20F, -22F, -5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[204].setRotationPoint(31F, -22F, -5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.625F, -0.625F, -0.875F, -0.875F, -0.875F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[205].setRotationPoint(31F, -22F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.875F, -0.875F, -0.875F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F); // Box 37
		bodyModel[206].setRotationPoint(31F, -22F, 5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[207].setRotationPoint(20F, -22F, 5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[208].setRotationPoint(20F, -22F, -7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[209].setRotationPoint(31F, -20F, -7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, 0F); // Box 37
		bodyModel[210].setRotationPoint(31F, -20F, 5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[211].setRotationPoint(-30F, -17.75F, -5F);

		bodyModel[212].addBox(0F, 0F, 0F, 10, 1, 4, 0F); // Box 221
		bodyModel[212].setRotationPoint(-30F, -17.75F, -2F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Exhast stack
		bodyModel[213].setRotationPoint(-13.5F, -23F, -1.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 62
		bodyModel[214].setRotationPoint(20F, -5F, 7F);

		bodyModel[215].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 62
		bodyModel[215].setRotationPoint(20F, -5F, -11F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Sand cap long hood
		bodyModel[216].setRotationPoint(-32.5F, -17.25F, -1F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Sand cap short hood chop 2
		bodyModel[217].setRotationPoint(30.5F, -9.25F, -1F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Sand cap short hood Stand
		bodyModel[218].setRotationPoint(30.5F, -17.25F, -1F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Sand cap short hood chop 1
		bodyModel[219].setRotationPoint(30.5F, -12.25F, -1F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Sand cap short hood hamer
		bodyModel[220].setRotationPoint(30.5F, -22.25F, -1F);

		bodyModel[221].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 62
		bodyModel[221].setRotationPoint(-2F, -5F, -11F);

		bodyModel[222].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // MILW heater thingy
		bodyModel[222].setRotationPoint(-30F, -19.75F, -2F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 222 Wack ehast extention
		bodyModel[223].setRotationPoint(-13.5F, -26F, -1.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[224].setRotationPoint(4.5F, -19F, -0.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[225].setRotationPoint(6.5F, -18F, -0.5F);

		bodyModel[226].addShapeBox(0F, 0F, -4F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Wacky numberboard sockets
		bodyModel[226].setRotationPoint(-34F, -17F, -5F);
		bodyModel[226].rotateAngleY = 0.78539816F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Wacky numberboard sockets
		bodyModel[227].setRotationPoint(-34F, -17F, 5F);
		bodyModel[227].rotateAngleY = -0.78539816F;

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Commander beacon 2
		bodyModel[228].setRotationPoint(13.5F, -24F, -0.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 400
		bodyModel[229].setRotationPoint(13.68F, -24F, -0.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[230].setRotationPoint(13F, -24F, -1F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[231].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[232].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[233].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[234].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[235].addBox(0F, 0F, 0F, 10, 3, 0, 0F); // Box 102
		bodyModel[235].setRotationPoint(-2F, -12F, -11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Steam gen exhast
		bodyModel[236].setRotationPoint(20F, -23F, -1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // BCOL forehead
		bodyModel[237].setRotationPoint(20F, -23F, 3F);

		bodyModel[238].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // BCOL forehead
		bodyModel[238].setRotationPoint(20F, -23F, -3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BCOL forehead
		bodyModel[239].setRotationPoint(20F, -23F, -7F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // BCOL headlight
		bodyModel[240].setRotationPoint(21.5F, -22.5F, -1.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[241].setRotationPoint(15F, -24F, 0F);

		bodyModel[242].addBox(0F, 0F, 0F, 4, 9, 4, 0F); // Box 31
		bodyModel[242].setRotationPoint(4F, -10F, 7F);

		bodyModel[243].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 107
		bodyModel[243].setRotationPoint(4F, -9F, 7F);

		bodyModel[244].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 149 BCOL detail
		bodyModel[244].setRotationPoint(29F, -8F, -7F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 150 BCOL detail
		bodyModel[245].setRotationPoint(29F, -8F, 6F);

		bodyModel[246].addShapeBox(-2F, 0F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149 glow
		bodyModel[246].setRotationPoint(28F, -16F, -6.05F);
		bodyModel[246].rotateAngleY = 0.2443461F;

		bodyModel[247].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150 glow
		bodyModel[247].setRotationPoint(28F, -16F, 6.05F);
		bodyModel[247].rotateAngleY = -0.2443461F;

		bodyModel[248].addShapeBox(-1F, 0F, -4F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Wacky numberboard sockets
		bodyModel[248].setRotationPoint(34F, -17F, -5F);
		bodyModel[248].rotateAngleY = -0.78539816F;

		bodyModel[249].addShapeBox(-1F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Wacky numberboard sockets
		bodyModel[249].setRotationPoint(34F, -17F, 5F);
		bodyModel[249].rotateAngleY = 0.78539816F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Markerlight
		bodyModel[250].setRotationPoint(30.8F, -20F, 4.8F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Markerlight
		bodyModel[251].setRotationPoint(30.8F, -20F, -6.8F);

		bodyModel[252].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149 glow
		bodyModel[252].setRotationPoint(-28F, -16F, -6.05F);
		bodyModel[252].rotateAngleY = -0.2443461F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150 glow
		bodyModel[253].setRotationPoint(-28F, -16F, 6.05F);
		bodyModel[253].rotateAngleY = 0.2443461F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood gyralite top lamp
		bodyModel[254].setRotationPoint(-34.25F, -14F, -1F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood gyralite bottom lamp
		bodyModel[255].setRotationPoint(-34.25F, -12F, -1F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 78 gyralite lamp socket
		bodyModel[256].setRotationPoint(-33.5F, -14F, -1F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Northeast Markerlight supports cull
		bodyModel[257].setRotationPoint(-32.3F, -19F, -6.94F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Northeast Markerlight supports cull
		bodyModel[258].setRotationPoint(-32.3F, -19F, 4.94F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Northeast Markerlight supports cull
		bodyModel[259].setRotationPoint(31.3F, -19F, -6.96F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Northeast Markerlight supports cull
		bodyModel[260].setRotationPoint(31.3F, -19F, 4.96F);

		bodyModel[261].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[261].setRotationPoint(23.5F, -18.5F, -3.5F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[262].setRotationPoint(23.5F, -17.5F, -3.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[263].setRotationPoint(18F, -25F, -0.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[264].setRotationPoint(18F, -24F, -0.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[265].setRotationPoint(7F, -25F, -0.5F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[266].setRotationPoint(9F, -24F, -0.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[267].setRotationPoint(18F, -24F, -1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[268].setRotationPoint(18F, -24.5F, -1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[269].setRotationPoint(18F, -24.5F, -1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[270].setRotationPoint(18F, -24.5F, -1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[271].setRotationPoint(18F, -24.5F, -1F);

		bodyModel[272].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // RS Vent box
		bodyModel[272].setRotationPoint(-19F, -19F, -2F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 102
		bodyModel[273].setRotationPoint(-5F, -12F, -11F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[274].setRotationPoint(28F, -12F, 11.01F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[275].setRotationPoint(27F, -9F, -11.01F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[276].setRotationPoint(28F, -9.5F, -11.01F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[277].setRotationPoint(31F, -9.5F, -11.01F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 330
		bodyModel[278].setRotationPoint(28.5F, -8F, -11F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 431
		bodyModel[279].setRotationPoint(27F, -9.5F, -10F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 432
		bodyModel[280].setRotationPoint(29F, -7.5F, -10.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[281].setRotationPoint(28F, -12F, -11.01F);

		bodyModel[282].addBox(0F, 0F, 0F, 60, 9, 0, 0F); // PRR trainphone
		bodyModel[282].setRotationPoint(-31F, -24F, 7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // PRR trainphone support
		bodyModel[283].setRotationPoint(-29F, -23F, 7F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // PRR trainphone support
		bodyModel[284].setRotationPoint(26F, -23F, 7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // PRR trainphone suport cull
		bodyModel[285].setRotationPoint(1F, -23F, 4F);

		bodyModel[286].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 19
		bodyModel[286].setRotationPoint(-10F, 1.5F, -9.49F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F); // Airtank pipe and supports cull
		bodyModel[287].setRotationPoint(-10.01F, 1F, -9.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[288].setRotationPoint(-10F, 2.5F, -8.49F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[289].setRotationPoint(-10F, 2.5F, -10.49F);

		bodyModel[290].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 448
		bodyModel[290].setRotationPoint(-10F, 1.5F, 8.49F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F); // Airtank pipe and supports cull
		bodyModel[291].setRotationPoint(-10.01F, 1F, 8.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 450
		bodyModel[292].setRotationPoint(-10F, 2.5F, 7.49F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[293].setRotationPoint(-10F, 2.5F, 9.49F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Batterybox
		bodyModel[294].setRotationPoint(-0.5F, 6F, -11F);

		bodyModel[295].addBox(0F, 0F, 0F, 10, 6, 4, 0F); // Battery box cull
		bodyModel[295].setRotationPoint(-0.5F, 2F, -11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 455
		bodyModel[296].setRotationPoint(-0.5F, 6F, 7F);

		bodyModel[297].addBox(0F, 0F, 0F, 10, 6, 4, 0F); // Battery box cull
		bodyModel[297].setRotationPoint(-0.5F, 2F, 7F);

		bodyModel[298].addBox(0F, 0F, 0F, 9, 7, 14, 0F); // Box 457
		bodyModel[298].setRotationPoint(-9.5F, 1F, -7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[299].setRotationPoint(-38F, 8F, -10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[300].setRotationPoint(-39.5F, 9F, -10F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[301].setRotationPoint(-38F, 8F, 3F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[302].setRotationPoint(-39.5F, 7.5F, -3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[303].setRotationPoint(-39.5F, 7.5F, 3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[304].setRotationPoint(-39.5F, 7.5F, -3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 368
		bodyModel[305].setRotationPoint(37.5F, 7.5F, -3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 369
		bodyModel[306].setRotationPoint(37.5F, 7.5F, -3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 370
		bodyModel[307].setRotationPoint(37.5F, 7.5F, 3F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[308].setRotationPoint(37.5F, 9F, -10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[309].setRotationPoint(37F, 8F, 3F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[310].setRotationPoint(37F, 8F, -10F);

		bodyModel[311].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // Canadian winderization hatch cull
		bodyModel[311].setRotationPoint(-23F, -18.25F, -4F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Canadian winderization hatch cull
		bodyModel[312].setRotationPoint(-22F, -19.25F, -4F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RS winderization hatch 1
		bodyModel[313].setRotationPoint(-23F, -19.25F, -4F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Steam gen exhaust
		bodyModel[314].setRotationPoint(26F, -18F, 0F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Steam gen exhaust extend 1
		bodyModel[315].setRotationPoint(26.5F, -20F, 0.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Steam gen exhaust extend 2
		bodyModel[316].setRotationPoint(26.5F, -22F, 0.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[317].setRotationPoint(-31.5F, -20.5F, -0.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[318].setRotationPoint(-31.5F, -19.5F, -0.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[319].setRotationPoint(-31.25F, -19F, -0.25F);

		bodyModel[320].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 407 bell holder cull
		bodyModel[320].setRotationPoint(-31.5F, -20.5F, -1.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW heater thingy
		bodyModel[321].setRotationPoint(0F, -17.5F, -1.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW heater thingy
		bodyModel[322].setRotationPoint(1F, -18.5F, -1.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // MILW heater thingy
		bodyModel[323].setRotationPoint(-12F, -19.5F, -1.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F); // MILW heater thingy
		bodyModel[324].setRotationPoint(-12F, -19.5F, -0.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW heater thingy
		bodyModel[325].setRotationPoint(-14F, -19.5F, -2.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW heater thingy
		bodyModel[326].setRotationPoint(-14F, -19.5F, 1.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F); // MILW heater thingy
		bodyModel[327].setRotationPoint(-16F, -19.5F, -0.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // MILW heater thingy
		bodyModel[328].setRotationPoint(-16F, -19.5F, -1.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 21, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW heater thingy
		bodyModel[329].setRotationPoint(-20F, -19.5F, -1.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW heater thingy support cull
		bodyModel[330].setRotationPoint(-19.5F, -19.75F, -2F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW heater thingy support cull
		bodyModel[331].setRotationPoint(-4.5F, -19.75F, -2F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 512
		bodyModel[332].setRotationPoint(6F, -23F, -0.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[333].setRotationPoint(4.5F, -24.5F, -0.5F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[334].setRotationPoint(5.5F, -24.25F, 0.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[335].setRotationPoint(5F, -24.25F, -1.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[336].setRotationPoint(7F, -24F, -0.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[337].setRotationPoint(6F, -25.5F, 0.25F);

		bodyModel[338].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[338].setRotationPoint(6F, -25.5F, -1F);

		bodyModel[339].addBox(0F, 0F, 0F, 0, 13, 24, 0F); // Box 5
		bodyModel[339].setRotationPoint(-37.01F, -4F, -12F);

		bodyModel[340].addBox(0F, 0F, 0F, 0, 13, 24, 0F); // Box 19
		bodyModel[340].setRotationPoint(37.01F, -4F, -12F);

		bodyModel[341].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 81
		bodyModel[341].setRotationPoint(-34F, 1F, -11F);

		bodyModel[342].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 83
		bodyModel[342].setRotationPoint(-34F, 1F, 7F);

		bodyModel[343].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 86
		bodyModel[343].setRotationPoint(34F, 1F, -11F);

		bodyModel[344].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 89
		bodyModel[344].setRotationPoint(34F, 1F, 7F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, -1F, 0F, 4.25F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 116
		bodyModel[345].setRotationPoint(-37.01F, -9F, -10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 4.25F, -1F, 0F, 4.25F, -1F); // Box 117
		bodyModel[346].setRotationPoint(-37.01F, -9F, 6F);

		bodyModel[347].addBox(0F, 0F, 0F, 0, 5, 16, 0F); // Box 131
		bodyModel[347].setRotationPoint(37.01F, -9F, -8F);

		bodyModel[348].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 138
		bodyModel[348].setRotationPoint(-37F, 3.5F, -9F);
		bodyModel[348].rotateAngleX = 0.26179939F;

		bodyModel[349].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 139
		bodyModel[349].setRotationPoint(-37F, 1F, -8F);
		bodyModel[349].rotateAngleX = 0.26179939F;

		bodyModel[350].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 230
		bodyModel[350].setRotationPoint(-37F, 3.5F, 9F);
		bodyModel[350].rotateAngleX = -0.26179939F;

		bodyModel[351].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 233
		bodyModel[351].setRotationPoint(-37F, 1F, 8F);
		bodyModel[351].rotateAngleX = -0.26179939F;

		bodyModel[352].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 239
		bodyModel[352].setRotationPoint(34F, 3.5F, 9F);
		bodyModel[352].rotateAngleX = -0.26179939F;

		bodyModel[353].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 241
		bodyModel[353].setRotationPoint(34F, 1F, 8F);
		bodyModel[353].rotateAngleX = -0.26179939F;

		bodyModel[354].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 246
		bodyModel[354].setRotationPoint(34F, 3.5F, -9F);
		bodyModel[354].rotateAngleX = 0.26179939F;

		bodyModel[355].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 248
		bodyModel[355].setRotationPoint(34F, 1F, -8F);
		bodyModel[355].rotateAngleX = 0.26179939F;

		bodyModel[356].addBox(0F, 0F, 0F, 0, 5, 16, 0F); // Box 5
		bodyModel[356].setRotationPoint(-37.01F, -9F, -8F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, -1F, 0F, 4.25F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 116
		bodyModel[357].setRotationPoint(37.01F, -9F, -10F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 4.25F, -1F, 0F, 4.25F, -1F); // Box 117
		bodyModel[358].setRotationPoint(37.01F, -9F, 6F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-2F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[359].setRotationPoint(6F, -17F, -11.01F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,1.25F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.25F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 105
		bodyModel[360].setRotationPoint(21F, -17F, 11.01F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -2F, 0F, 0F); // Box 105
		bodyModel[361].setRotationPoint(21F, -10F, 11.01F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 1.25F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.25F, -1F, 0F); // Box 105
		bodyModel[362].setRotationPoint(6F, -10F, -11.01F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -2F, 0F, 0F); // Box 105
		bodyModel[363].setRotationPoint(21F, -13F, 11.01F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[364].setRotationPoint(11F, -17F, 10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[365].setRotationPoint(11F, -18F, 10F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[366].setRotationPoint(11F, -18F, -13F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 cull
		bodyModel[367].setRotationPoint(11F, -17F, -15F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, -1F, 0F, 4.25F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 116
		bodyModel[368].setRotationPoint(-37.01F, -9F, -12F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 4.25F, -1F, 0F, 4.25F, -1F); // Box 117
		bodyModel[369].setRotationPoint(-37.01F, -9F, 8F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 4.25F, -1F, 0F, 4.25F, -1F); // Box 117
		bodyModel[370].setRotationPoint(37.01F, -9F, 8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, -1F, 0F, 4.25F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 116
		bodyModel[371].setRotationPoint(37.01F, -9F, -12F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Bell frame cul
		bodyModel[372].setRotationPoint(-10F, -20F, -2F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight 2 glow
		bodyModel[373].setRotationPoint(-31.75F, -17F, -8.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight 2 glow
		bodyModel[374].setRotationPoint(-31.25F, -17F, -9F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight 2 glow
		bodyModel[375].setRotationPoint(-31.75F, -17.25F, 7.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight 2 glow
		bodyModel[376].setRotationPoint(-31.25F, -17.25F, 7F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Markerlight 1
		bodyModel[377].setRotationPoint(-32.75F, -20.5F, -6.75F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight 2 glow
		bodyModel[378].setRotationPoint(-32.75F, -20F, -6.25F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight 2 glow
		bodyModel[379].setRotationPoint(-32.25F, -20F, -6.75F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Markerlight 1
		bodyModel[380].setRotationPoint(-32.75F, -20.5F, 4.75F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight 2 glow
		bodyModel[381].setRotationPoint(-32.75F, -20F, 5.25F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight 2 glow
		bodyModel[382].setRotationPoint(-32.25F, -20F, 4.75F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Bell frame cul
		bodyModel[383].setRotationPoint(24F, -20.5F, -1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight glow
		bodyModel[384].setRotationPoint(30.75F, -19.5F, -6.25F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight glow
		bodyModel[385].setRotationPoint(31.25F, -19.5F, -6.75F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight glow
		bodyModel[386].setRotationPoint(30.75F, -19.5F, 5.25F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight glow
		bodyModel[387].setRotationPoint(31.25F, -19.5F, 4.75F);

		bodyModel[388].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 92
		bodyModel[388].setRotationPoint(-22.5F, 0F, -11.5F);

		bodyModel[389].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 93
		bodyModel[389].setRotationPoint(20.5F, 0F, -11.5F);

		bodyModel[390].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 221
		bodyModel[390].setRotationPoint(-23.5F, 2.5F, -2F);

		bodyModel[391].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 222
		bodyModel[391].setRotationPoint(19.5F, 2.5F, -2F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[392].setRotationPoint(-22.5F, 2F, -10F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[393].setRotationPoint(-22.5F, 2F, 5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[394].setRotationPoint(20.5F, 2F, -10F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[395].setRotationPoint(20.5F, 2F, 5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 74, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 18
		bodyModel[396].setRotationPoint(-37F, 2.5F, -5.5F);

		bodyModel[397].addBox(0F, 0F, -4F, 0, 2, 4, 0F); // Wacky numberboard glow
		bodyModel[397].setRotationPoint(34.01F, -17F, -5F);
		bodyModel[397].rotateAngleY = -0.78539816F;

		bodyModel[398].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Wacky numberboard glow
		bodyModel[398].setRotationPoint(34.01F, -17F, 5F);
		bodyModel[398].rotateAngleY = 0.78539816F;

		bodyModel[399].addBox(0F, 0F, -4F, 0, 2, 4, 0F); // Wacky numberboard glow
		bodyModel[399].setRotationPoint(-34.01F, -17F, -5F);
		bodyModel[399].rotateAngleY = 0.78539816F;

		bodyModel[400].addBox(0F, 0F, -4F, 0, 2, 4, 0F); // Wacky numberboard glow
		bodyModel[400].setRotationPoint(-34.01F, -17F, 5F);
		bodyModel[400].rotateAngleY = 2.35619449F;

		bodyModel[401].addShapeBox(0F, 0F, 0F, 20, 0, 20, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, -10F); // Box 221
		bodyModel[401].setRotationPoint(-30F, -17.76F, -5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 20, 0, 20, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, -10F); // MILW heater thingy
		bodyModel[402].setRotationPoint(-30F, -19.76F, -5F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 0, 22, 0F); // Box 50
		bodyModel[403].setRotationPoint(-40F, 8F, -11F);

		bodyModel[404].addBox(0F, 0F, 0F, 3, 0, 22, 0F); // Box 21
		bodyModel[404].setRotationPoint(37F, 8F, -11F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[405].setRotationPoint(-40F, 7F, -4F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[406].setRotationPoint(-40F, 7F, 4F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[407].setRotationPoint(37F, 7F, 3F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[408].setRotationPoint(37F, 7F, -3F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[409].setRotationPoint(-39F, 6F, -8F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[410].setRotationPoint(-39F, 6F, 0F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[411].setRotationPoint(37F, 6F, 0F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[412].setRotationPoint(37F, 6F, -8F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 4
		bodyModel[413].setRotationPoint(39F, 6F, -10F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[414].setRotationPoint(39F, 7F, -10F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 446
		bodyModel[415].setRotationPoint(39.5F, 4F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 4
		bodyModel[416].setRotationPoint(39F, 7F, 0F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 446
		bodyModel[417].setRotationPoint(39.5F, 4F, 2F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 448
		bodyModel[418].setRotationPoint(39F, 3F, 2F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[419].setRotationPoint(39F, 3F, -10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 361
		bodyModel[420].setRotationPoint(39.5F, 3F, 2F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0.5F, -4F, 0F, -1F, -4F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 361 big fuck off plow
		bodyModel[421].setRotationPoint(39.5F, -1F, 2F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 361
		bodyModel[422].setRotationPoint(39.5F, 3F, -10F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,1.5F, 0F, 0F, -2F, 0F, 0F, -1F, -4F, 0F, 0.5F, -4F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 361 big fuck off plow
		bodyModel[423].setRotationPoint(39.5F, -1F, -10F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[424].setRotationPoint(-40F, 6F, -10F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[425].setRotationPoint(-40F, 7F, -10F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2F, 1F, 0F, 1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[426].setRotationPoint(-40.5F, 4F, -10F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[427].setRotationPoint(-40F, 6F, 0F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[428].setRotationPoint(-40F, 7F, 0F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 446
		bodyModel[429].setRotationPoint(-40.5F, 4F, 2F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[430].setRotationPoint(-40F, 3F, 2F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 448
		bodyModel[431].setRotationPoint(-40F, 3F, -10F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 361
		bodyModel[432].setRotationPoint(-40.5F, 3F, 2F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,-1F, -4F, 0F, 0.5F, -4F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 361 big fuck off plow
		bodyModel[433].setRotationPoint(-40.5F, -1F, 2F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 361
		bodyModel[434].setRotationPoint(-40.5F, 3F, -10F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,-2F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -4F, 0F, -1F, -4F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 361 big fuck off plow
		bodyModel[435].setRotationPoint(-40.5F, -1F, -10F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[436].setRotationPoint(-40F, 6F, 0F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[437].setRotationPoint(-40F, 6F, -10F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 24
		bodyModel[438].setRotationPoint(39F, 6F, 0F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 25
		bodyModel[439].setRotationPoint(39F, 6F, -10F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 4
		bodyModel[440].setRotationPoint(39F, 6F, 0F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Control stand
		bodyModel[441].setRotationPoint(13F, -12F, 3F);

		bodyModel[442].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Control stand
		bodyModel[442].setRotationPoint(17.01F, -12F, 3F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Control stand standard gauges
		bodyModel[443].setRotationPoint(11F, -14F, 3F);

		bodyModel[444].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Early control pannel
		bodyModel[444].setRotationPoint(9F, -8F, 7F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Early control pannel
		bodyModel[445].setRotationPoint(9F, -12F, 7F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard gauge pannel
		bodyModel[446].setRotationPoint(9F, -12F, 7F);

		bodyModel[447].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Dynamics type 2 
		bodyModel[447].setRotationPoint(26F, -17.01F, -7F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Dynamics type 1
		bodyModel[448].setRotationPoint(27.5F, -18F, -2F);

		bodyModel[449].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Dynamics type 2 Hammerhead
		bodyModel[449].setRotationPoint(26F, -22.01F, -7F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Dynamics type 1 hammerhead
		bodyModel[450].setRotationPoint(27.5F, -23F, -2F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood left lamp
		bodyModel[451].setRotationPoint(-33.75F, -18F, -2F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood right lamp
		bodyModel[452].setRotationPoint(-33.75F, -18F, 0F);

		bodyModel[453].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[453].setRotationPoint(4.5F, -22.5F, -0.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 221
		bodyModel[454].setRotationPoint(-30F, -17.75F, 2F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MILW heater thingy
		bodyModel[455].setRotationPoint(-30F, -19.75F, -5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // MILW heater thingy
		bodyModel[456].setRotationPoint(-30F, -19.75F, 2F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // PRR trainphone suport cull
		bodyModel[457].setRotationPoint(-9F, -23F, 4F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood left lamp
		bodyModel[458].setRotationPoint(-34.25F, -17.5F, -2F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood right lamp
		bodyModel[459].setRotationPoint(-34.25F, -17.5F, 0F);

		bodyModel[460].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // BCOL lamp socket
		bodyModel[460].setRotationPoint(-33.5F, -17.5F, -2F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // BCOL Bell frame cul
		bodyModel[461].setRotationPoint(-30F, -19F, -5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BCOL Bell frame cul
		bodyModel[462].setRotationPoint(-30F, -20F, -5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // BCOL Bell frame cul
		bodyModel[463].setRotationPoint(-29.75F, -18.5F, -4.75F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // BCOL Bell frame cul
		bodyModel[464].setRotationPoint(-30F, -20F, -5.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[465].setRotationPoint(31F, -12F, 11.01F);

		bodyModel[466].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Control stand
		bodyModel[466].setRotationPoint(15F, -12F, -6F);

		bodyModel[467].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Control stand braking
		bodyModel[467].setRotationPoint(12F, -12F, -5F);

		bodyModel[468].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Control stand
		bodyModel[468].setRotationPoint(11F, -9F, -6F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Control stand early gauges
		bodyModel[469].setRotationPoint(11F, -14F, -5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Control stand
		bodyModel[470].setRotationPoint(14F, -12F, -6F);

		bodyModel[471].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Control stand
		bodyModel[471].setRotationPoint(10.99F, -12F, -4F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Control stand standard gauges
		bodyModel[472].setRotationPoint(14F, -14F, -5F);

		bodyModel[473].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Early control pannel
		bodyModel[473].setRotationPoint(17F, -8F, -10F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Early control pannel
		bodyModel[474].setRotationPoint(17F, -12F, -10F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard gauge pannel
		bodyModel[475].setRotationPoint(18F, -12F, -10F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[476].setRotationPoint(31F, -12F, -11.01F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[477].setRotationPoint(-34.01F, -5F, -12F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[478].setRotationPoint(34.01F, -5F, -12F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[479].setRotationPoint(-34.01F, -5F, 11F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[480].setRotationPoint(34.01F, -5F, 11F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // CNJ Bell frame cul
		bodyModel[481].setRotationPoint(-10.5F, -20F, -1.5F);

		bodyModel[482].addBox(0F, 0F, 0F, 10, 2, 14, 0F); // Box 31
		bodyModel[482].setRotationPoint(-0.5F, 6F, -7F);

		bodyModel[483].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // MILW numberboard cull
		bodyModel[483].setRotationPoint(-2F, -17F, -7F);

		bodyModel[484].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 374
		bodyModel[484].setRotationPoint(4F, 1F, -11.5F);
		bodyModel[484].rotateAngleX = -0.34906585F;

		bodyModel[485].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 377
		bodyModel[485].setRotationPoint(4F, 1F, 11.25F);
		bodyModel[485].rotateAngleX = 0.34906585F;

		bodyModel[486].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 374
		bodyModel[486].setRotationPoint(-11F, 1F, -11.5F);
		bodyModel[486].rotateAngleX = -0.34906585F;

		bodyModel[487].addBox(0F, 0F, -3F, 1, 1, 6, 0F); // Box 377
		bodyModel[487].setRotationPoint(-11F, 2F, 8.25F);
		bodyModel[487].rotateAngleX = 0.34906585F;

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[488].setRotationPoint(9.32F, -24F, -0.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[489].setRotationPoint(9.32F, -25F, -0.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[490].setRotationPoint(13.5F, -24F, -0.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[491].setRotationPoint(13.5F, -25F, -0.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // MON steam gen part
		bodyModel[492].setRotationPoint(20F, -18.5F, -1F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // MON steam gen part
		bodyModel[493].setRotationPoint(20F, -23F, -1F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MON steam gen part
		bodyModel[494].setRotationPoint(27F, -18F, -4F);

		bodyModel[495].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[495].setRotationPoint(22.5F, -19F, -0.5F);

		bodyModel[496].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[496].setRotationPoint(22.5F, -18F, -0.5F);

		bodyModel[497].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[497].setRotationPoint(20.5F, -19F, -0.5F);

		bodyModel[498].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[498].setRotationPoint(20.5F, -18F, -0.5F);
	}
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();
	Modelrs3_details theDeets = new Modelrs3_details();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 4||GetColor(entity) == 7324) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.35, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.7, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6324||GetColor(entity) == 2436){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver_Fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.35, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.7, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6323){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black_Fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.35, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.7, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.35, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.7, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			if (GetColor(entity) == 20||GetColor(entity) == 22) {
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/rs3-details-ccrl-nse.png"));
				GL11.glPushMatrix();
				//GL11.glTranslated(-1.35, -0.025, 0);
				theDeets.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			} else if (GetColor(entity) == 21) {
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/rs3-details-ser.png"));
				GL11.glPushMatrix();
				//GL11.glTranslated(-1.35, -0.025, 0);
				theDeets.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}
		}
	}
}