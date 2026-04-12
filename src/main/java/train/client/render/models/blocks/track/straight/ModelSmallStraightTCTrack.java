package train.client.render.models.blocks.track.straight;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.track.AbstractTrackModel;
import train.common.items.RailVariants;
import train.common.library.EnumTracks;
import train.common.library.ITrackDefinition;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelSmallStraightTCTrack extends AbstractTrackModel {
	
	private IModelCustom modelSmallStraight;
	private IModelCustom modelRoadCrossing;

	private IModelCustom modelRoadCrossingDynamic;

	protected String[] ballastTexture = new String[2];

	private static int listSmallStraight = -1;
	private static int listRoadCrossing = -1;
	private static int listRoadCrossingDynamic = -1;

	public ModelSmallStraightTCTrack()
	{
		if (!baked)
		{
			modelSmallStraight = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/straight/1x1.obj"));
			listSmallStraight = GL11.glGenLists(1);
			GL11.glNewList(listSmallStraight, GL11.GL_COMPILE);
			modelSmallStraight.renderAll();
			GL11.glEndList();

			modelRoadCrossing = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/straight/1x1_crossing.obj"));
			listRoadCrossing = GL11.glGenLists(1);
			GL11.glNewList(listRoadCrossing, GL11.GL_COMPILE);
			modelRoadCrossing.renderAll();
			GL11.glEndList();

			modelRoadCrossingDynamic = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/straight/track_roadcrossing_dynamic.obj"));
			listRoadCrossingDynamic = GL11.glGenLists(1);
			GL11.glNewList(listRoadCrossingDynamic, GL11.GL_COMPILE);
			modelRoadCrossingDynamic.renderAll();
			GL11.glEndList();

			baked = true;
		}
	}

	private void setupRender(int facing, double x, double y, double z, float r, float g, float b, float a)
	{
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);
		GL11.glColor4f(r, g, b, a);

		switch (facing)
		{
			case 3:
				GL11.glRotatef(90, 0, 1, 0);
				break;
			case 1:
				GL11.glRotatef(90, 0, 1, 0);
				break;
		}
	}

	protected void SetupDynamicBallastColour(int ballastColour)
	{
		float r = (float)(ballastColour >> 16 & 255) / 255.0F;
		float g = (float)(ballastColour >> 8 & 255) / 255.0F;
		float b = (float)(ballastColour & 255) / 255.0F;
		GL11.glColor4f(r,g,b,1);
	}

	protected void SetupDynamicBallast(String ballast)
	{
		if (ballast.contains(":")) {
			ballastTexture = ballast.split(":");
			ballastTexture[0] = ballastTexture[0].toLowerCase();
		}
		else {
			ballastTexture[0] = "minecraft";
			ballastTexture[1] = ballast;
		}
	}

	public void renderDynamic(RailVariants variants, String ballastTextureInput, int ballastColour)
	{
		tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_base.png"));
		GL11.glCallList(listRoadCrossing);
		SetupDynamicBallast(ballastTextureInput);
		tmt.Tessellator.bindTexture(new ResourceLocation(ballastTexture[0],  "textures/blocks/" + ballastTexture[1] +".png"));
		SetupDynamicBallastColour(ballastColour);
		GL11.glCallList(listRoadCrossingDynamic);

	}

	public void renderDynamic(RailVariants variants, int facing, double x, double y, double z, float r, float g, float b, float a, String ballastTexture, int colour)
	{
		setupRender(facing, x, y, z, r, g, b, a);

		// GL11.glTranslatef(0.0f, 0.0f, -1.0f);
		renderDynamic(variants, ballastTexture, colour);

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

	public void renderDynamic(TileTCRail tcRail, double x, double y, double z)
	{
		String iconName;
		Block block = Block.getBlockById(tcRail.getBallastMaterial());
		IIcon icon = block.getIcon(1, tcRail.ballastMetadata);
		int colour = block.colorMultiplier(tcRail.getWorldObj(), tcRail.xCoord, tcRail.yCoord - 1, tcRail.zCoord);
		if (icon != null) {
			iconName = icon.getIconName();
		}
		else {
			iconName = "tc:ballast_test";
			colour = 16777215;
		}
		renderDynamic( tcRail.getTrackType().getVariant(), getRailDirection(tcRail) , x, y, z, 1, 1, 1, 1, iconName, colour);
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z)
	{
		render(tcRail.getTrackType(), type, getRailDirection(tcRail), x, y, z, 1, 1, 1, 1 );
	}

	public void render(ITrackDefinition enumTracks, String type, int facing, double x, double y, double z, float r, float g, float b, float a )
	{
		setupRender(facing, x, y, z, r, g, b, a);

		// Bind the texture, so that OpenGL properly textures our block.
		switch (type)
		{
			case "crossing":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing.png"));
				GL11.glCallList(listRoadCrossing);
			break;
			case "crossing1":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_1.png"));
				GL11.glCallList(listRoadCrossing);
			break;
			case "crossing2":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_2.png"));
				GL11.glCallList(listRoadCrossing);
			break;
			default:
			{
				tmt.Tessellator.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(enumTracks.getVariant()));
				GL11.glCallList(listSmallStraight);
			}
		}

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}
