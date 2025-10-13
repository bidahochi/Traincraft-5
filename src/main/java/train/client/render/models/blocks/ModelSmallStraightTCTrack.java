package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.enums.TrackResourceLocations;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelSmallStraightTCTrack extends ModelBase {
	
	private IModelCustom modelSmallStraight;
	private IModelCustom modelRoadCrossing;

	public ModelSmallStraightTCTrack() {
		modelSmallStraight = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/straight/1x1.obj"));
		modelRoadCrossing = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/straight/1x1_crossing.obj"));
	}

	private void render(String type)
	{
		switch (type)
		{
			case "straight":
			case "embedded":
				modelSmallStraight.renderAll();
			break;
			case "crossing":
				modelRoadCrossing.renderAll();
			break;
			case "crossing1":
				modelRoadCrossing.renderAll();
			break;
			case "crossing2":
				modelRoadCrossing.renderAll();
			break;
		}

        //render( type, tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord), x, y, z, 1, 1, 1, 1);
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
		render( type, facing, x, y, z, 1, 1, 1, 1 );
	}

	public void render( String type, int facing, double x, double y, double z, float r, float g, float b, float a )
	{
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);
		GL11.glColor4f(r, g, b, a);

		// Bind the texture, so that OpenGL properly textures our block.
		switch (type)
		{
			case "straight":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(TrackResourceLocations.track_normal);
			break;
			case "embedded":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(TrackResourceLocations.track_embedded);
			break;
			case "crossing":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing.png"));
			break;
			case "crossing1":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_1.png"));
			break;
			case "crossing2":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_2.png"));
			break;
		}

		switch (facing)
		{
			case 3:
				GL11.glRotatef(90, 0, 1, 0);
			break;
			case 1:
				GL11.glRotatef(90, 0, 1, 0);
			break;
		}

		render(type);

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
