//JC cant tell me what to make and what not to make

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFRED extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFRED() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[6];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 11, 1, textureX, textureY, "bottom_one"); // Box 189 glow
		bodyModel[3] = new ModelRendererTurbo(this, 10, 10, textureX, textureY, "top_one"); // Box 4 lamp
		bodyModel[4] = new ModelRendererTurbo(this, 7, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 6

		bodyModel[0].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 1
		bodyModel[0].setRotationPoint(-0.5F, -2F, -0.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 2
		bodyModel[1].setRotationPoint(-1F, -8F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 glow
		bodyModel[2].setRotationPoint(-1.25F, -6F, -1F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 4 lamp
		bodyModel[3].setRotationPoint(-1.25F, -8F, -1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 5
		bodyModel[4].setRotationPoint(0F, -3F, 1F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 6
		bodyModel[5].setRotationPoint(0F, 2F, -1F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 6; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}