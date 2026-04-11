//you ever have a dream where you um you like um you want to up...

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelBettendorf_Truck_Small;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPFEr_40_23Reefer extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelPFEr_40_23Reefer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[122];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 26, 44, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 13, 164, textureX, textureY); // Box 58
		bodyModel[3] = new ModelRendererTurbo(this, 72, 75, textureX, textureY); // Box 61
		bodyModel[4] = new ModelRendererTurbo(this, 72, 75, textureX, textureY); // Box 62
		bodyModel[5] = new ModelRendererTurbo(this, 0, 164, textureX, textureY); // Box 63
		bodyModel[6] = new ModelRendererTurbo(this, 72, 75, textureX, textureY); // Box 64
		bodyModel[7] = new ModelRendererTurbo(this, 72, 75, textureX, textureY); // Box 65
		bodyModel[8] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 79
		bodyModel[9] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 72, 127, textureX, textureY); // Box 37
		bodyModel[14] = new ModelRendererTurbo(this, 72, 127, textureX, textureY); // Box 38
		bodyModel[15] = new ModelRendererTurbo(this, 57, 0, textureX, textureY); // Box 40
		bodyModel[16] = new ModelRendererTurbo(this, 6, 72, textureX, textureY); // Box 41
		bodyModel[17] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 59
		bodyModel[18] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 60
		bodyModel[19] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 45
		bodyModel[21] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 46
		bodyModel[22] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 47
		bodyModel[23] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 48
		bodyModel[24] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 49
		bodyModel[25] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 50
		bodyModel[26] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 51
		bodyModel[27] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 52
		bodyModel[28] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 53
		bodyModel[29] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 54
		bodyModel[30] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 55
		bodyModel[31] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 56
		bodyModel[32] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 57
		bodyModel[33] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 58
		bodyModel[34] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 59
		bodyModel[35] = new ModelRendererTurbo(this, 122, 109, textureX, textureY,"cull"); // Box 60 CULL
		bodyModel[36] = new ModelRendererTurbo(this, 122, 109, textureX, textureY,"cull"); // Box 61 CULL
		bodyModel[37] = new ModelRendererTurbo(this, 122, 109, textureX, textureY); // Box 62
		bodyModel[38] = new ModelRendererTurbo(this, 122, 109, textureX, textureY); // Box 63
		bodyModel[39] = new ModelRendererTurbo(this, 97, 75, textureX, textureY); // Box 65
		bodyModel[40] = new ModelRendererTurbo(this, 97, 75, textureX, textureY); // Box 66
		bodyModel[41] = new ModelRendererTurbo(this, 97, 75, textureX, textureY); // Box 67
		bodyModel[42] = new ModelRendererTurbo(this, 97, 75, textureX, textureY); // Box 68
		bodyModel[43] = new ModelRendererTurbo(this, 49, 72, textureX, textureY); // Box 69
		bodyModel[44] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 70
		bodyModel[45] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 71
		bodyModel[46] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 72
		bodyModel[47] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 73
		bodyModel[48] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 74
		bodyModel[49] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 75
		bodyModel[50] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 76
		bodyModel[51] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 77
		bodyModel[52] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 78
		bodyModel[53] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 79
		bodyModel[54] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 80
		bodyModel[55] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 81
		bodyModel[56] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 82
		bodyModel[57] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 83
		bodyModel[58] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 84
		bodyModel[59] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 85
		bodyModel[60] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 86
		bodyModel[61] = new ModelRendererTurbo(this, 29, 85, textureX, textureY); // Box 87
		bodyModel[62] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 88
		bodyModel[63] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 90
		bodyModel[64] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 91
		bodyModel[65] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 92
		bodyModel[66] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 93
		bodyModel[67] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 94
		bodyModel[68] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 95
		bodyModel[69] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 96
		bodyModel[70] = new ModelRendererTurbo(this, 111, 75, textureX, textureY); // Box 97
		bodyModel[71] = new ModelRendererTurbo(this, 19, 127, textureX, textureY,"cull"); // Box 98 CULL
		bodyModel[72] = new ModelRendererTurbo(this, 8, 127, textureX, textureY,"cull"); // Box 99 CULL
		bodyModel[73] = new ModelRendererTurbo(this, 41, 127, textureX, textureY,"cull"); // Box 100 CULL
		bodyModel[74] = new ModelRendererTurbo(this, 30, 127, textureX, textureY,"cull"); // Box 101 CULL
		bodyModel[75] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 103
		bodyModel[76] = new ModelRendererTurbo(this, 52, 137, textureX, textureY,"cull"); // Box 105 CULL
		bodyModel[77] = new ModelRendererTurbo(this, 52, 127, textureX, textureY,"cull"); // Box 106 CULL
		bodyModel[78] = new ModelRendererTurbo(this, 122, 97, textureX, textureY,"cull"); // Box 107 CULL
		bodyModel[79] = new ModelRendererTurbo(this, 118, 103, textureX, textureY); // Box 108
		bodyModel[80] = new ModelRendererTurbo(this, 0, 113, textureX, textureY); // Box 109
		bodyModel[81] = new ModelRendererTurbo(this, 0, 113, textureX, textureY); // Box 110
		bodyModel[82] = new ModelRendererTurbo(this, 121, 87, textureX, textureY,"cull"); // Box 111 CULL
		bodyModel[83] = new ModelRendererTurbo(this, 121, 87, textureX, textureY,"cull"); // Box 112 CULL
		bodyModel[84] = new ModelRendererTurbo(this, 13, 50, textureX, textureY); // Box 113
		bodyModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[86] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Box 116
		bodyModel[87] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Box 117
		bodyModel[88] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 118
		bodyModel[89] = new ModelRendererTurbo(this, 57, 22, textureX, textureY); // Box 120
		bodyModel[90] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 121
		bodyModel[91] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 123
		bodyModel[92] = new ModelRendererTurbo(this, 13, 71, textureX, textureY); // Box 124
		bodyModel[93] = new ModelRendererTurbo(this, 92, 91, textureX, textureY); // Box 125
		bodyModel[94] = new ModelRendererTurbo(this, 92, 91, textureX, textureY); // Box 126
		bodyModel[95] = new ModelRendererTurbo(this, 92, 102, textureX, textureY); // Box 127
		bodyModel[96] = new ModelRendererTurbo(this, 92, 102, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 121, 77, textureX, textureY,"cull"); // Box 130 CULL
		bodyModel[98] = new ModelRendererTurbo(this, 121, 77, textureX, textureY,"cull"); // Box 132 CULL
		bodyModel[99] = new ModelRendererTurbo(this, 121, 77, textureX, textureY,"cull"); // Box 134 CULL
		bodyModel[100] = new ModelRendererTurbo(this, 121, 82, textureX, textureY,"cull"); // Box 136 CULL
		bodyModel[101] = new ModelRendererTurbo(this, 121, 82, textureX, textureY,"cull"); // Box 137 CULL
		bodyModel[102] = new ModelRendererTurbo(this, 121, 77, textureX, textureY,"cull"); // Box 140 CULL
		bodyModel[103] = new ModelRendererTurbo(this, 121, 77, textureX, textureY,"cull"); // Box 142 CULL
		bodyModel[104] = new ModelRendererTurbo(this, 121, 77, textureX, textureY,"cull"); // Box 144 CULL
		bodyModel[105] = new ModelRendererTurbo(this, 112, 93, textureX, textureY); // Box 145
		bodyModel[106] = new ModelRendererTurbo(this, 63, 127, textureX, textureY); // Box 147
		bodyModel[107] = new ModelRendererTurbo(this, 0, 157, textureX, textureY); // Box 148
		bodyModel[108] = new ModelRendererTurbo(this, 21, 158, textureX, textureY); // Box 149
		bodyModel[109] = new ModelRendererTurbo(this, 47, 147, textureX, textureY); // Box 150
		bodyModel[110] = new ModelRendererTurbo(this, 0, 155, textureX, textureY); // Box 151
		bodyModel[111] = new ModelRendererTurbo(this, 0, 153, textureX, textureY); // Box 152
		bodyModel[112] = new ModelRendererTurbo(this, 0, 127, textureX, textureY); // Box 154
		bodyModel[113] = new ModelRendererTurbo(this, 0, 127, textureX, textureY); // Box 159
		bodyModel[114] = new ModelRendererTurbo(this, 245, 17, textureX, textureY); // Box 72
		bodyModel[115] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 124
		bodyModel[116] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 103
		bodyModel[117] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 124
		bodyModel[118] = new ModelRendererTurbo(this, 30, 57, textureX, textureY); // Box 122 cutlever
		bodyModel[119] = new ModelRendererTurbo(this, 30, 60, textureX, textureY); // Box 122 cutlever
		bodyModel[120] = new ModelRendererTurbo(this, 114, 0, textureX, textureY,"cull"); // cullpler writing dont ram me uwu
		bodyModel[121] = new ModelRendererTurbo(this, 114, 17, textureX, textureY,"cull"); // nuremburging my cull

		bodyModel[0].addBox(0F, 0F, 0F, 63, 1, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-31.5F, 2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 63, 2, 4, 0F); // Box 3
		bodyModel[1].setRotationPoint(-31.5F, 3F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 58
		bodyModel[2].setRotationPoint(21F, 5F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[3].setRotationPoint(-24F, 3F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 62
		bodyModel[4].setRotationPoint(-24F, 3F, 2F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 63
		bodyModel[5].setRotationPoint(-24F, 5F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[6].setRotationPoint(21F, 3F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[7].setRotationPoint(21F, 3F, 2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[8].setRotationPoint(-24F, 3F, 11.01F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[9].setRotationPoint(21F, 3F, 11.01F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[10].setRotationPoint(15F, 3F, 11.01F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[11].setRotationPoint(-6F, 3F, 11.01F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[12].setRotationPoint(-12F, 3F, 11.01F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 37
		bodyModel[13].setRotationPoint(-34.5F, 3F, -1.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 38
		bodyModel[14].setRotationPoint(31.5F, 3F, -1.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 27, 20, 1, 0F); // Box 40
		bodyModel[15].setRotationPoint(-31.5F, -18F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 41
		bodyModel[16].setRotationPoint(-31.5F, -18F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 59
		bodyModel[17].setRotationPoint(-32.5F, -1F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 60
		bodyModel[18].setRotationPoint(-32.5F, -1F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 61
		bodyModel[19].setRotationPoint(-32.5F, -1F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 45
		bodyModel[20].setRotationPoint(-32.5F, -4F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 46
		bodyModel[21].setRotationPoint(-32.5F, -4F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 47
		bodyModel[22].setRotationPoint(-32.5F, -4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 48
		bodyModel[23].setRotationPoint(-32.5F, -7F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 49
		bodyModel[24].setRotationPoint(-32.5F, -7F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 50
		bodyModel[25].setRotationPoint(-32.5F, -7F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 51
		bodyModel[26].setRotationPoint(-32.5F, -10F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 52
		bodyModel[27].setRotationPoint(-32.5F, -10F, -6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 53
		bodyModel[28].setRotationPoint(-32.5F, -10F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 54
		bodyModel[29].setRotationPoint(-32.5F, -13F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 55
		bodyModel[30].setRotationPoint(-32.5F, -13F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 56
		bodyModel[31].setRotationPoint(-32.5F, -13F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 57
		bodyModel[32].setRotationPoint(-32.5F, -16F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 58
		bodyModel[33].setRotationPoint(-32.5F, -16F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 59
		bodyModel[34].setRotationPoint(-32.5F, -16F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60 CULL
		bodyModel[35].setRotationPoint(-31.5F, 3F, 9.01F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 61 CULL
		bodyModel[36].setRotationPoint(-31.5F, 3F, -11.01F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 62
		bodyModel[37].setRotationPoint(30.5F, 3F, -11.01F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 63
		bodyModel[38].setRotationPoint(30.5F, 3F, 9.01F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[39].setRotationPoint(9F, 3F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 66
		bodyModel[40].setRotationPoint(9F, 3F, 2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[41].setRotationPoint(-11F, 3F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 68
		bodyModel[42].setRotationPoint(-11F, 3F, 2F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 69
		bodyModel[43].setRotationPoint(30.5F, -18F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 70
		bodyModel[44].setRotationPoint(31.5F, -16F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 71
		bodyModel[45].setRotationPoint(31.5F, -16F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 72
		bodyModel[46].setRotationPoint(31.5F, -16F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 73
		bodyModel[47].setRotationPoint(31.5F, -13F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 74
		bodyModel[48].setRotationPoint(31.5F, -13F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 75
		bodyModel[49].setRotationPoint(31.5F, -13F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 76
		bodyModel[50].setRotationPoint(31.5F, -10F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 77
		bodyModel[51].setRotationPoint(31.5F, -10F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 78
		bodyModel[52].setRotationPoint(31.5F, -10F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 79
		bodyModel[53].setRotationPoint(31.5F, -7F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 80
		bodyModel[54].setRotationPoint(31.5F, -7F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 81
		bodyModel[55].setRotationPoint(31.5F, -7F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 82
		bodyModel[56].setRotationPoint(31.5F, -4F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 83
		bodyModel[57].setRotationPoint(31.5F, -4F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 84
		bodyModel[58].setRotationPoint(31.5F, -4F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 85
		bodyModel[59].setRotationPoint(31.5F, -1F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 86
		bodyModel[60].setRotationPoint(31.5F, -1F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 87
		bodyModel[61].setRotationPoint(31.5F, -1F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[62].setRotationPoint(9F, 3F, 11.01F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[63].setRotationPoint(-17F, 3F, 11.01F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[64].setRotationPoint(-24F, 3F, -11.01F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[65].setRotationPoint(21F, 3F, -11.01F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[66].setRotationPoint(15F, 3F, -11.01F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 12, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[67].setRotationPoint(-6F, 3F, -11.01F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 95
		bodyModel[68].setRotationPoint(-12F, 3F, -11.01F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[69].setRotationPoint(9F, 3F, -11.01F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[70].setRotationPoint(-17F, 3F, -11.01F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 21, 1, 0F); // Box 98 CULL
		bodyModel[71].setRotationPoint(-31F, -18F, 11F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 21, 4, 0F); // Box 99 CULL
		bodyModel[72].setRotationPoint(-32.5F, -18F, 6.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 21, 1, 0F); // Box 100 CULL
		bodyModel[73].setRotationPoint(27F, -18F, -12F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 21, 4, 0F); // Box 101 CULL
		bodyModel[74].setRotationPoint(31.5F, -18F, -10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 103
		bodyModel[75].setRotationPoint(27F, 3F, 10.99F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 105 CULL
		bodyModel[76].setRotationPoint(27F, -5F, 11F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 106 CULL
		bodyModel[77].setRotationPoint(-31F, -5F, -12F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 107 CULL
		bodyModel[78].setRotationPoint(-33.5F, -12F, 2.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 108
		bodyModel[79].setRotationPoint(-33.5F, -12.01F, 2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 63, 2, 11, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[80].setRotationPoint(-31.5F, -20F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 63, 2, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[81].setRotationPoint(-31.5F, -20F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 111 CULL
		bodyModel[82].setRotationPoint(-32.5F, -21F, -1.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112 CULL
		bodyModel[83].setRotationPoint(31.5F, -21F, -1.5F);

		bodyModel[84].addShapeBox(0F, 0F, -1F, 5, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[84].setRotationPoint(-4.5F, -17F, 11.15F);

		bodyModel[85].addBox(0F, 0F, 0F, 27, 20, 1, 0F); // Box 114
		bodyModel[85].setRotationPoint(4.5F, -18F, 10F);

		bodyModel[86].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 116
		bodyModel[86].setRotationPoint(-4.5F, -18F, 10F);

		bodyModel[87].addShapeBox(-5F, 0F, -1F, 5, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 117
		bodyModel[87].setRotationPoint(4.5F, -17F, 11.15F);

		bodyModel[88].addBox(0F, 0F, 0F, 27, 20, 1, 0F); // Box 118
		bodyModel[88].setRotationPoint(-31.5F, -18F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 27, 20, 1, 0F); // Box 120
		bodyModel[89].setRotationPoint(4.5F, -18F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 121
		bodyModel[90].setRotationPoint(-4.5F, -18F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[91].setRotationPoint(-4.5F, -17F, -11.15F);

		bodyModel[92].addShapeBox(-5F, 0F, 0F, 5, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 124
		bodyModel[92].setRotationPoint(4.5F, -17F, -11.15F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[93].setRotationPoint(-30.5F, -20.5F, 2.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[94].setRotationPoint(-30.5F, -20.5F, -10.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[95].setRotationPoint(24.5F, -20.5F, -10.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(24.5F, -20.5F, 2.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 130 CULL
		bodyModel[97].setRotationPoint(23.5F, -21F, -1.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 132 CULL
		bodyModel[98].setRotationPoint(15.5F, -21F, -1.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 134 CULL
		bodyModel[99].setRotationPoint(7.5F, -21F, -1.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 136 CULL
		bodyModel[100].setRotationPoint(1.5F, -21F, -1.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 137 CULL
		bodyModel[101].setRotationPoint(-4.5F, -21F, -1.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 140 CULL
		bodyModel[102].setRotationPoint(-27.5F, -21F, -1.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 142 CULL
		bodyModel[103].setRotationPoint(-19.5F, -21F, -1.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 144 CULL
		bodyModel[104].setRotationPoint(-11.5F, -21F, -1.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 66, 0, 3, 0F); // Box 145
		bodyModel[105].setRotationPoint(-33F, -21.01F, -1.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 147
		bodyModel[106].setRotationPoint(-32.5F, -17.5F, 3.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 148
		bodyModel[107].setRotationPoint(-6.5F, 3F, -4.5F);
		bodyModel[107].rotateAngleX = -0.78539816F;

		bodyModel[108].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 149
		bodyModel[108].setRotationPoint(0.5F, 3F, 3.5F);
		bodyModel[108].rotateAngleX = -0.78539816F;

		bodyModel[109].addBox(0F, 0F, 0F, 1, 0, 10, 0F); // Box 150
		bodyModel[109].setRotationPoint(3.5F, 4F, -3.5F);
		bodyModel[109].rotateAngleX = -0.10035643F;
		bodyModel[109].rotateAngleY = -0.15707963F;

		bodyModel[110].addBox(0F, 0F, 0F, 19, 0, 1, 0F); // Box 151
		bodyModel[110].setRotationPoint(5.5F, 5F, 5.5F);
		bodyModel[110].rotateAngleY = -0.2268928F;
		bodyModel[110].rotateAngleZ = -0.03490659F;

		bodyModel[111].addBox(-27F, 0F, 0F, 27, 0, 1, 0F); // Box 152
		bodyModel[111].setRotationPoint(4.5F, 4F, -3.5F);
		bodyModel[111].rotateAngleY = -0.03490659F;
		bodyModel[111].rotateAngleZ = 0.06108652F;

		bodyModel[112].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 154
		bodyModel[112].setRotationPoint(-32.5F, -1.5F, -9F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 159
		bodyModel[113].setRotationPoint(31.5F, -1.5F, 4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[114].setRotationPoint(-32.51F, -19F, 2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 124
		bodyModel[115].setRotationPoint(27F, 3F, -10.99F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[116].setRotationPoint(-31F, 3F, -10.99F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[117].setRotationPoint(-31F, 3F, 10.99F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 2, 12, 0F); // Box 122 cutlever
		bodyModel[118].setRotationPoint(-33.5F, 4F, -1F);
		bodyModel[118].rotateAngleX = 0.12217305F;
		bodyModel[118].rotateAngleY = -0.12217305F;
		bodyModel[118].rotateAngleZ = -0.19198622F;

		bodyModel[119].addBox(0F, 0F, -12F, 0, 2, 12, 0F); // Box 122 cutlever
		bodyModel[119].setRotationPoint(32.5F, 4F, 1F);
		bodyModel[119].rotateAngleX = -0.12217305F;
		bodyModel[119].rotateAngleY = -0.03490659F;
		bodyModel[119].rotateAngleZ = 0.19198622F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0.01F, 0F, 0F, 61.01F, 0F, 0F, 61.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 61.01F, 0F, 0F, 61.01F, 0F, 0F, 0.01F, 0F, 0F); // cullpler writing dont ram me uwu
		bodyModel[120].setRotationPoint(-32F, -3.5F, -6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0.01F, 0F, 0F, 60.01F, 0F, 0F, 60.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 60.01F, 0F, 0F, 60.01F, 0F, 0F, 0.01F, 0F, 0F); // nuremburging my cull
		bodyModel[121].setRotationPoint(-31.5F, -18.5F, -10F);
	}
	ModelBettendorf_Truck_Small theTrucks1 = new ModelBettendorf_Truck_Small();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);
		if (GetColor(entity) == 12345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Bettendorf_Truck_small_PRR_FCC1940s.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.41, -0.02, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.82, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else{
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Bettendorf_Truck_small_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.41, -0.02, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.82, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}