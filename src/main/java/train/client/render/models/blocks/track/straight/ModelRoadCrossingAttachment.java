package train.client.render.models.blocks.track.straight;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.ITrackAttachmentModelRenderer;
import train.client.render.TrackAttachmentRenderContext;
import train.client.render.models.blocks.track.DynamicBallastTextureCache;
import train.common.library.Info;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;
import train.common.track.attachment.RoadCrossingAttachmentResolver;
import train.common.track.attachment.RoadCrossingGeometry;

import java.util.EnumMap;
import java.util.Map;

/** Renders only the road surface layered over an independently rendered track. */
public final class ModelRoadCrossingAttachment implements ITrackAttachmentModelRenderer
{
	private static final ResourceLocation BASE_TEXTURE = new ResourceLocation(
			Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_base.png");
	private static final Map<RoadCrossingGeometry, GeometryModel> GEOMETRY_MODELS =
			new EnumMap<RoadCrossingGeometry, GeometryModel>(RoadCrossingGeometry.class);

	static
	{
		registerGeometry(RoadCrossingGeometry.CARDINAL_STRAIGHT,
				"track/straight/1x1_crossing.obj", "Road_crossing_surface",
				"track/straight/track_roadcrossing_dynamic.obj", 0.0F);
	}

	private final ResourceLocation fixedTexture;
	private final boolean dynamic;

	/**
	 * Creates a fixed-texture road surface.
	 *
	 * @param textureName texture filename beneath Traincraft's model texture directory
	 */
	public ModelRoadCrossingAttachment(String textureName)
	{
		this(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + textureName), false);
	}

	private ModelRoadCrossingAttachment(ResourceLocation fixedTexture, boolean dynamic)
	{
		this.fixedTexture = fixedTexture;
		this.dynamic = dynamic;
	}

	/** Creates the appearance whose central surface follows the mounted track's ballast material. */
	public static ModelRoadCrossingAttachment dynamic()
	{
		return new ModelRoadCrossingAttachment(null, true);
	}

	/**
	 * Registers the model pair and authored-axis correction for one supported crossing geometry. A future diagonal
	 * asset uses this boundary without changing attachment persistence or item behavior.
	 *
	 * @param geometry track-path geometry supplied by these assets
	 * @param surfaceModelPath attachment-only surface model path
	 * @param surfacePart named attachment-only group within the surface model
	 * @param dynamicFillModelPath model providing the host-material fill
	 * @param authoredYawCorrectionDegrees correction from the model axis to canonical attachment forward
	 * @return whether the previously unregistered geometry was accepted
	 */
	public static boolean registerGeometry(RoadCrossingGeometry geometry, String surfaceModelPath,
			String surfacePart, String dynamicFillModelPath, float authoredYawCorrectionDegrees)
	{
		if (geometry == null || surfaceModelPath == null || surfacePart == null
				|| dynamicFillModelPath == null || GEOMETRY_MODELS.containsKey(geometry))
		{
			return false;
		}
		IModelCustom surfaceModel = AdvancedModelLoader.loadModel(
				new ResourceLocation(Info.modelPrefix + surfaceModelPath));
		int surfaceDisplayList = GL11.glGenLists(1);
		GL11.glNewList(surfaceDisplayList, GL11.GL_COMPILE);
		surfaceModel.renderPart(surfacePart);
		GL11.glEndList();

		IModelCustom dynamicFillModel = AdvancedModelLoader.loadModel(
				new ResourceLocation(Info.modelPrefix + dynamicFillModelPath));
		int dynamicFillDisplayList = GL11.glGenLists(1);
		GL11.glNewList(dynamicFillDisplayList, GL11.GL_COMPILE);
		dynamicFillModel.renderAll();
		GL11.glEndList();
		GEOMETRY_MODELS.put(geometry, new GeometryModel(surfaceDisplayList,
				dynamicFillDisplayList, authoredYawCorrectionDegrees));
		return true;
	}

	@Override
	public void renderTrackAttachment(TrackAttachmentRenderContext context)
	{
		RoadCrossingAttachmentResolver.Resolution resolution = RoadCrossingAttachmentResolver.INSTANCE.resolve(
				context.getOwner(), context.getSelectedCellX(), context.getSelectedCellZ());
		GeometryModel model = resolution == null ? null : GEOMETRY_MODELS.get(resolution.getGeometry());
		if (model == null)
		{
			return;
		}
		GL11.glPushMatrix();
		GL11.glRotatef(model.authoredYawCorrectionDegrees, 0.0F, 1.0F, 0.0F);
		if (dynamic == false)
		{
			tmt.Tessellator.bindTexture(fixedTexture);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glCallList(model.surfaceDisplayList);
			GL11.glPopMatrix();
			return;
		}
		tmt.Tessellator.bindTexture(BASE_TEXTURE);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glCallList(model.surfaceDisplayList);
		renderDynamicFill(context, model.dynamicFillDisplayList);
		GL11.glPopMatrix();
	}

	private static void renderDynamicFill(TrackAttachmentRenderContext context, int dynamicFillDisplayList)
	{
		DynamicSurface surface = resolveDynamicSurface(context);
		Block ballast = surface.block;
		IIcon icon = ballast != null && ballast != Blocks.air
				? ballast.getIcon(1, surface.metadata) : null;
		String iconName = icon != null ? icon.getIconName() : "tc:ballast_test";
		int color = icon != null ? surface.color : 0xFFFFFF;
		tmt.Tessellator.bindTexture(DynamicBallastTextureCache.get(iconName));
		GL11.glColor4f((color >> 16 & 255) / 255.0F,
				(color >> 8 & 255) / 255.0F, (color & 255) / 255.0F, 1.0F);
		GL11.glCallList(dynamicFillDisplayList);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}

	private static DynamicSurface resolveDynamicSurface(TrackAttachmentRenderContext context)
	{
		TileTCRail owner = context.getOwner();
		int cellX = context.getSelectedCellX();
		int cellY = context.getSelectedCellY();
		int cellZ = context.getSelectedCellZ();
		TileTCRailHostData.CapturedHostBlock captured =
				owner.getCapturedHostBlockAtWorld(cellX, cellY, cellZ);
		if (captured != null)
		{
			return new DynamicSurface(Block.getBlockById(captured.blockId),
					captured.metadata, captured.colour);
		}
		if (owner.getBallastMaterial() != 0)
		{
			Block ballast = Block.getBlockById(owner.getBallastMaterial());
			int color = ballast != null ? ballast.colorMultiplier(owner.getWorldObj(), cellX, cellY - 1, cellZ)
					: 0xFFFFFF;
			return new DynamicSurface(ballast, owner.ballastMetadata, color);
		}
		Block support = owner.getWorldObj().getBlock(cellX, cellY - 1, cellZ);
		int metadata = owner.getWorldObj().getBlockMetadata(cellX, cellY - 1, cellZ);
		return new DynamicSurface(support, metadata,
				support.colorMultiplier(owner.getWorldObj(), cellX, cellY - 1, cellZ));
	}

	private static final class GeometryModel
	{
		private final int surfaceDisplayList;
		private final int dynamicFillDisplayList;
		private final float authoredYawCorrectionDegrees;

		private GeometryModel(int surfaceDisplayList, int dynamicFillDisplayList,
				float authoredYawCorrectionDegrees)
		{
			this.surfaceDisplayList = surfaceDisplayList;
			this.dynamicFillDisplayList = dynamicFillDisplayList;
			this.authoredYawCorrectionDegrees = authoredYawCorrectionDegrees;
		}
	}

	private static final class DynamicSurface
	{
		private final Block block;
		private final int metadata;
		private final int color;

		private DynamicSurface(Block block, int metadata, int color)
		{
			this.block = block;
			this.metadata = metadata;
			this.color = color;
		}
	}
}
