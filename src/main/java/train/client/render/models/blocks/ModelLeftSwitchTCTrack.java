package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.items.RailVariants;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelLeftSwitchTCTrack extends ModelBase {
	private IModelCustom modelMediumLeftSwitchActive;
	private IModelCustom modelMediumLeftSwitchInactive;
	private IModelCustom modelMediumLeftParallelSwitchInactive;
	private IModelCustom modelMediumLeftParallelSwitchActive;
	private IModelCustom modelLargeLeftParallelSwitchInactive;
	private IModelCustom modelLargeLeftParallelSwitchActive;
	private IModelCustom modelLargeLeftSwitchActive;
	private IModelCustom modelLargeLeftSwitchInactive;

	private IModelCustom modelVeryLargeLeftSwitchActive;
	private IModelCustom modelVeryLargeLeftSwitchInactive;
	private IModelCustom modelMediumLeft45degreeSwitchActive;
	private IModelCustom modelMediumLeft45degreeSwitchInActive;
	private IModelCustom modelLargeLeft45degreeSwitchActive;
	private IModelCustom modelLargeLeft45degreeSwitchInActive;

	public ModelLeftSwitchTCTrack() {
		modelMediumLeftSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x4_left.obj"));
		modelMediumLeftSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x4_left.obj"));

		modelMediumLeftParallelSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x11_left.obj"));
		modelMediumLeftParallelSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x11_left.obj"));

		modelLargeLeftParallelSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x17_left.obj"));
		modelLargeLeftParallelSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x17_left.obj"));

		modelLargeLeftSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/6x6_left.obj"));
		modelLargeLeftSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/6x6_left.obj"));

		modelMediumLeft45degreeSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/3x5_left.obj"));
		modelMediumLeft45degreeSwitchInActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/3x5_left.obj"));

		modelLargeLeft45degreeSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x8_left.obj"));
		modelLargeLeft45degreeSwitchInActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x8_left.obj"));

		modelVeryLargeLeftSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/11x11_left.obj"));
		modelVeryLargeLeftSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/11x11_left.obj"));
	}

	public void renderMediumActive() {
		modelMediumLeftSwitchActive.renderAll();
	}
	public void renderMediumInactive() {
		modelMediumLeftSwitchInactive.renderAll();
	}
	public void renderMediumParallelInactive() {
		modelMediumLeftParallelSwitchInactive.renderAll();
	}
	public void renderMediumParallelActive() {
		modelMediumLeftParallelSwitchActive.renderAll();
	}
	public void renderLargeParallelInactive() {
		modelLargeLeftParallelSwitchInactive.renderAll();
	}
	public void renderLargeParallelActive() {
		modelLargeLeftParallelSwitchActive.renderAll();
	}
	public void renderLarge90Active() {
		modelLargeLeftSwitchActive.renderAll();
	}
	public void renderLarge90Inactive() {
		modelLargeLeftSwitchInactive.renderAll();
	}

	public void renderVeryLarge90Active() {
		modelVeryLargeLeftSwitchActive.renderAll();
	}
	public void renderVeryLarge90Inactive() {
		modelVeryLargeLeftSwitchInactive.renderAll();
	}

	public void renderMedium45degreeActive() {modelMediumLeft45degreeSwitchActive.renderAll();}
	public void renderMedium45degreeInActive() {modelMediumLeft45degreeSwitchInActive.renderAll();}

	public void renderLarge45degreeActive() {modelLargeLeft45degreeSwitchActive.renderAll();}
	public void renderLarge45degreeInActive() {modelLargeLeft45degreeSwitchInActive.renderAll();}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
		render( type, tcRail.getTrackType().getVariant(), facing, tcRail.getSwitchState(), x, y, z, 1, 1, 1, 1);
	}

	public void render(String type, RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		tmt.Tessellator.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(railVariant));
		GL11.glColor4f(r, g, b, a);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		if (facing == 3) {
			if(type.equals("medium")){
				GL11.glTranslatef(-1.0f, 0.0f, 1.0f);
			}
			else if(type.equals("large_90")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, -4.0f);
			}
			else if(type.equals("very_large_90")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			else if(type.equals("medium_parallel")){
				GL11.glRotatef(-90, 0, 1, 0);
			}
			else if(type.equals("large_parallel")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			else if(type.equals("medium_45degree")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0);
			}
			else if(type.equals("large_45degree")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}

		}
		else if (facing == 1) {
			if(type.equals("medium")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 1.0f);
			}
			else if(type.equals("large_90")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, -4.0f);
			}
			else if(type.equals("very_large_90")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			else if(type.equals("medium_parallel")){
				GL11.glRotatef(90, 0, 1, 0);
			}
			else if(type.equals("large_parallel")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			else if(type.equals("medium_45degree")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0);
			}
			else if(type.equals("large_45degree")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}
		}
		else if(facing == 2){
			if(type.equals("medium")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 1.0f);
			}
			else if(type.equals("large_90")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, -4.0f);
			}
			else if(type.equals("very_large_90")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			else if(type.equals("large_parallel")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			else if(type.equals("medium_45degree")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0f);
			}
			else if(type.equals("large_45degree")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}
		}
		else if(facing == 0){
			if(type.equals("medium")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 1.0f);
			}
			else if(type.equals("large_90")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(.0f, 0.0f, -4.0f);
			}
			else if(type.equals("very_large_90")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			else if(type.equals("medium_parallel")){
				GL11.glRotatef(180, 0, 1, 0);
			}
			else if(type.equals("large_parallel")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			else if(type.equals("medium_45degree")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(0f, 0.0f, 0);
			}
			else if(type.equals("large_45degree")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}
		}
		if(type.equals("medium")&&!active)this.renderMediumInactive();
		else if(type.equals("medium")&&active)this.renderMediumActive();
		else if(type.equals("medium_parallel")&&!active)this.renderMediumParallelInactive();
		else if(type.equals("medium_parallel")&&active)this.renderMediumParallelActive();
		else if(type.equals("large_parallel")&&!active)this.renderLargeParallelInactive();
		else if(type.equals("large_parallel")&&active)this.renderLargeParallelActive();
		else if(type.equals("large_90")&&!active)this.renderLarge90Inactive();
		else if(type.equals("large_90")&&active)this.renderLarge90Active();
		else if(type.equals("very_large_90")&&!active)this.renderVeryLarge90Inactive();
		else if(type.equals("very_large_90")&&active)this.renderVeryLarge90Active();
		else if(type.equals("medium_45degree")&&!active)this.renderMedium45degreeInActive();
		else if(type.equals("medium_45degree")&&active)this.renderMedium45degreeActive();
		else if(type.equals("large_45degree")&&!active)this.renderLarge45degreeInActive();
		else if(type.equals("large_45degree")&&active)this.renderLarge45degreeActive();
		
		//if(type.equals("large"))this.renderLarge();

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}