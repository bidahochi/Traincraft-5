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

import static train.common.items.RailVariants.EMBEDDED;

@SideOnly(Side.CLIENT)
public class ModelTwoWaysCrossingTCTrack extends ModelBase {
	private IModelCustom modelTwoWaysCrossing;
	private IModelCustom modelDoubleDiamondCrossing;
	private IModelCustom modelDiagonalTwoWaysCrossing;
	private IModelCustom modelFourWaysCrossing;

	public ModelTwoWaysCrossingTCTrack()
	{
		modelTwoWaysCrossing = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/crossing/standard.obj"));
		modelDoubleDiamondCrossing = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/crossing/double_diamond.obj"));
		modelDiagonalTwoWaysCrossing = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/crossing/45-deg_standard.obj"));
		modelFourWaysCrossing = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/crossing/double_diamond_plus.obj"));
	}

	private void render(String crossingVariant)
	{
		switch (crossingVariant)
		{
			case "twoways_crossing":
				modelTwoWaysCrossing.renderAll();
				break;
			case "diamond":
				modelDoubleDiamondCrossing.renderAll();
				break;
			case "diagonal_crossing":
				modelDiagonalTwoWaysCrossing.renderAll();
				break;
			case "universal_crossing":
				modelFourWaysCrossing.renderAll();
				break;
		}
	}

	public void render(String crossingVariant, TileTCRail tcRail, double x, double y, double z)
	{
		render(crossingVariant, tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord), tcRail.getTrackType().getVariant(), x, y, z, 1, 1, 1, 1);
	}

	public void render(String crossingVariant, int facing, RailVariants variants, double x, double y, double z, float r, float g, float b, float a)
	{
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(variants));

		GL11.glColor4f(r, g, b, a);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);
		if (crossingVariant.equals("diamond") && (facing == 1 || facing == 3))
		{
			GL11.glRotatef(90, 0, 1,0);
		}

		this.render(crossingVariant);
		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}