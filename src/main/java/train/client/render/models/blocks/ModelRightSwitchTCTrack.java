package train.client.render.models.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.items.RailVariants;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelRightSwitchTCTrack extends ModelBase {
	private IModelCustom modelMediumRightSwitchActive;
	private IModelCustom modelMediumRightSwitchInactive;
	private IModelCustom modelMediumRightParallelSwitchInactive;
	private IModelCustom modelMediumRightParallelSwitchActive;

	private IModelCustom modelLargeRightParallelSwitchInactive;
	private IModelCustom modelLargeRightParallelSwitchActive;
	private IModelCustom modelLargeRightSwitchActive;
	private IModelCustom modelLargeRightSwitchInactive;

	private IModelCustom modelVeryLargeRightSwitchActive;
	private IModelCustom modelVeryLargeRightSwitchInactive;

	private IModelCustom modelMediumRight45degreeSwitchActive;
	private IModelCustom modelMediumRight45degreeSwitchInActive;

	private IModelCustom modelLargeRight45degreeSwitchActive;
	private IModelCustom modelLargeRight45degreeSwitchInActive;

	public ModelRightSwitchTCTrack() {
		modelMediumRightSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x4_right.obj"));
		modelMediumRightSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x4_right.obj"));

		modelMediumRightParallelSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x11_right.obj"));
		modelMediumRightParallelSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x11_right.obj"));

		modelLargeRightParallelSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x17_right.obj"));
		modelLargeRightParallelSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x17_right.obj"));

		modelLargeRightSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/6x6_right.obj"));
		modelLargeRightSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/6x6_right.obj"));

		modelMediumRight45degreeSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/3x5_right.obj"));
		modelMediumRight45degreeSwitchInActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/3x5_right.obj"));

		modelLargeRight45degreeSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x8_right.obj"));
		modelLargeRight45degreeSwitchInActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x8_right.obj"));

		modelVeryLargeRightSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/11x11_right.obj"));
		modelVeryLargeRightSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/11x11_right.obj"));
		
	}

	public void renderMediumActive() {
		modelMediumRightSwitchActive.renderAll();
	}
	public void renderMediumInactive() {
		modelMediumRightSwitchInactive.renderAll();
	}
	public void renderMediumParallelInactive() {
		modelMediumRightParallelSwitchInactive.renderAll();
	}
	public void renderMediumParallelActive() {
		modelMediumRightParallelSwitchActive.renderAll();
	}
	public void renderLargeParallelInactive() {
		modelLargeRightParallelSwitchInactive.renderAll();
	}
	public void renderLargeParallelActive() { modelLargeRightParallelSwitchActive.renderAll();}

	public void renderLarge90Active() {
		modelLargeRightSwitchActive.renderAll();
	}
	public void renderLarge90Inactive() {
		modelLargeRightSwitchInactive.renderAll();
	}

	public void renderVeryLarge90Active() {
		modelVeryLargeRightSwitchActive.renderAll();
	}
	public void renderVeryLarge90Inactive() {
		modelVeryLargeRightSwitchInactive.renderAll();
	}

	public void renderMedium45degreeActive() {
		modelMediumRight45degreeSwitchActive.renderAll();
	}
	public void renderMedium45degreeInActive() {
		modelMediumRight45degreeSwitchInActive.renderAll();
	}
	public void renderLarge45degreeActive() {
		modelLargeRight45degreeSwitchActive.renderAll();
	}
	public void renderLarge45degreeInActive() {
		modelLargeRight45degreeSwitchInActive.renderAll();
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z)
	{
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
		// Push a blank matrix onto the stack

		GL11.glColor4f(r, g, b, a);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		if (facing == 3) {
			if(type.equals("medium")){
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
			}
			if(type.equals("large_90")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 4.0f);
			}
			if(type.equals("very_large_90")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(-90, 0, 1, 0);
			}
			if(type.equals("large_parallel")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_45degree")){
				GL11.glTranslatef(0.0f, 0.0f, 0);
				GL11.glRotatef(-90, 0, 1, 0);
			}
			if(type.equals("large_45degree")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}
		}
		if (facing == 1) {
			if(type.equals("medium")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
			}
			if(type.equals("large_90")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 4.0f);
			}
			if(type.equals("very_large_90")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(90, 0, 1, 0);
			}
			if(type.equals("large_parallel")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_45degree")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0);
			}
			if(type.equals("large_45degree")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}
		}
		if(facing == 2){
			if(type.equals("medium")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
			}
			if(type.equals("large_90")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 4.0f);
			}
			if(type.equals("very_large_90")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0.0f);
			}
			if(type.equals("large_parallel")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}

			if(type.equals("medium_45degree")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0f);
			}

			if(type.equals("large_45degree")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}

		}
		if(facing == 0){
			if(type.equals("medium")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
			}
			if(type.equals("large_90")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 4.0f);
			}
			if(type.equals("very_large_90")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(180, 0, 1, 0);
			}
			if(type.equals("large_parallel")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_45degree")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0.0f);
			}
			if(type.equals("large_45degree")){
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
		else if(type.equals("medium_45degree")&&active)this.renderMedium45degreeActive();
		else if(type.equals("medium_45degree")&&!active)this.renderMedium45degreeInActive();
		else if(type.equals("large_45degree")&&active)this.renderLarge45degreeActive();
		else if(type.equals("large_45degree")&&!active)this.renderLarge45degreeInActive();
		
		//if(type.equals("large"))this.renderLarge();

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
