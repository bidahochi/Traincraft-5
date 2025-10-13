package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.renderhelper.ModelRenderHelper;
import train.common.enums.TrackResourceLocations;
import train.common.items.RailVariants;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelLeftTurnTCTrack extends ModelBase {
	private IModelCustom model1XLeftTurn;
	private IModelCustom modelMediumLeftTurn;
	private IModelCustom modelLargeLeftTurn;
	private IModelCustom modelVeryLargeLeftTurn;
	private IModelCustom modelSuperLargeLeftTurn;
	private IModelCustom model29XLeftTurn;
	private IModelCustom model32XLeftTurn;

	public ModelLeftTurnTCTrack() {
		model1XLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/1x1.obj"));
		modelMediumLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/3x3.obj"));
		modelLargeLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/5x5.obj"));
		modelVeryLargeLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/10x10.obj"));
		modelSuperLargeLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/16x16.obj"));
		model29XLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/29x29.obj"));
		model32XLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/32x32.obj"));
	}

	public void render1X() {model1XLeftTurn.renderAll();}
	public void renderMedium() {
		modelMediumLeftTurn.renderAll();
	}
	public void renderLarge() {
		modelLargeLeftTurn.renderAll();
	}
	public void renderVeryLarge() {
		modelVeryLargeLeftTurn.renderAll();
	}
	public void renderSuperLarge() { modelSuperLargeLeftTurn.renderAll();}

	public void render29X() {model29XLeftTurn.renderAll();}
	public void render32X() {model32XLeftTurn.renderAll();}

	private void setRotation(byte facing)
	{
		switch(facing)
		{
			case 0:
				GL11.glRotatef(180, 0, 1, 0);
				break;
			case 1:
				GL11.glRotatef(90, 0, 1, 0);
				break;
			case 2:
				GL11.glRotatef(0, 0, 1, 0);
				break;
			case 3:
				GL11.glRotatef(-90, 0, 1, 0);
				break;
			default:
			break;
		}
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
		render( type, tcRail.getTrackType().getVariant(), facing, x, y, z, 1, 1, 1, 1);
	}

	public void render(String type, RailVariants variants, int facing, double x, double y, double z, float r, float g, float b, float a) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 1.5f, (float) y, (float) z + 5.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(variants));

		GL11.glColor4f(r, g, b, a);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);


		setRotation((byte)facing);

		switch (type)
		{
			case "super_large":
			case "embedded_super_large":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-5.5f,0f,1.5f);
					break;
					case 1:
						GL11.glTranslatef(4.5f,0f,-0.5f);
					break;
					case 2:
						GL11.glTranslatef(-1.5f,0f,-4.5f);
					break;
					default:
						GL11.glTranslatef(0.5f,0f,5.5f);
					break;
				}
				this.renderSuperLarge();
				break;
			case "very_large":
			case "embedded_very_large":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-5.5f,0,1.5f);
						break;
					case 1:
						GL11.glTranslatef(4.5f,0,-0.5f);
						break;
					case 2:
						GL11.glTranslatef(-1.5f,0,-4.5f);
						break;
					default:
						GL11.glTranslatef(0.5f,0,5.5f);
						break;
				}
				this.renderVeryLarge();
				break;
			case "large":
			case "embedded_large":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-5.5f,0,1.5f);
						break;
					case 1:
						GL11.glTranslatef(4.5f,0,-0.5f);
						break;
					case 2:
						GL11.glTranslatef(-1.5f,0,-4.5f);
						break;
					default:
						GL11.glTranslatef(0.5f,0,5.5f);
						break;
				}
				this.renderLarge();
				break;
			case "medium":
			case "embedded_medium":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-8.0f, 0.0f, 2.0f);
						break;
					case 1:
						GL11.glTranslatef(2.0f, 0.0f, 0.0f);
						break;
					case 2:
						GL11.glTranslatef(-4.0f, 0.0f, -4.0f);
						break;
					default:
						GL11.glTranslatef(-2.0f, 0.0f, 6.0f);
						break;
				}
				this.renderMedium();
				break;
			case "1x":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-5.5f,0,1.5f);
						break;
					case 1:
						GL11.glTranslatef(4.5f,0,-0.5f);
						break;
					case 2:
						GL11.glTranslatef(-1.5f,0,-4.5f);
						break;
					default:
						GL11.glTranslatef(0.5f,0,5.5f);
						break;
				}
				render1X();
				break;
			case "29x":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-5.5f,0,1.5f);
						break;
					case 1:
						GL11.glTranslatef(4.5f,0,-0.5f);
						break;
					case 2:
						GL11.glTranslatef(-1.5f,0,-4.5f);
						break;
					default:
						GL11.glTranslatef(0.5f,0,5.5f);
						break;
				}
				render29X();
				break;
			case "32x":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-5.5f,0,1.5f);
						break;
					case 1:
						GL11.glTranslatef(4.5f,0,-0.5f);
						break;
					case 2:
						GL11.glTranslatef(-1.5f,0,-4.5f);
						break;
					default:
						GL11.glTranslatef(0.5f,0,5.5f);
						break;
				}
				render32X();
				break;
		}

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
