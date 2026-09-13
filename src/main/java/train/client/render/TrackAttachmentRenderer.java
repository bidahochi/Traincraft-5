package train.client.render;

import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.EXTBlendColor;
import org.lwjgl.opengl.GL11;
import train.common.library.track.path.TrackPathGeometry;
import train.common.library.track.path.TrackPathSample;
import train.common.tile.TileTCRail;
import train.common.track.attachment.TrackAttachment;
import train.common.track.attachment.TrackAttachmentOperations;
import train.common.track.attachment.TrackAttachmentSlopeAlignment;
import train.common.track.attachment.TrackAttachmentType;

import java.util.LinkedHashMap;
import java.util.Map;

/** Dispatches rendering by attachment behavior while the track renderer supplies the underlying rail. */
public final class TrackAttachmentRenderer
{
	private static final int LIGHTMAP_COMPONENT_MASK = 0xFFFF;
	private static final int LIGHTMAP_SECOND_COMPONENT_SHIFT = 16;
	private static final float VALID_PREVIEW_ALPHA = 0.55F;
	private static final float INVALID_PREVIEW_ALPHA = 0.3F;
	private static final Map<String, ModelRegistration> MODEL_RENDERERS =
			new LinkedHashMap<String, ModelRegistration>();

	private TrackAttachmentRenderer()
	{
	}

	/**
	 * Registers a client model without requiring common attachment code to know the model family.
	 *
	 * @param designId stable design identifier supplied by the attachment source block
	 * @param renderer client-only model renderer
	 * @param authoredYawCorrectionDegrees rotation from canonical forward to the model's authored forward axis
	 */
	public static void registerModelRenderer(String designId, ITrackAttachmentModelRenderer renderer,
			float authoredYawCorrectionDegrees)
	{
		if (designId == null || designId.length() == 0)
		{
			throw new IllegalArgumentException("Track attachment design id cannot be empty");
		}
		if (renderer == null)
		{
			throw new IllegalArgumentException("Track attachment model renderer cannot be null: " + designId);
		}
		if (MODEL_RENDERERS.containsKey(designId))
		{
			throw new IllegalArgumentException("Duplicate track attachment model renderer: " + designId);
		}
		if (Float.isNaN(authoredYawCorrectionDegrees) || Float.isInfinite(authoredYawCorrectionDegrees))
		{
			throw new IllegalArgumentException("Track attachment model yaw correction must be finite: " + designId);
		}
		MODEL_RENDERERS.put(designId, new ModelRegistration(renderer, authoredYawCorrectionDegrees));
	}

	/**
	 * Renders every visible attachment owned by a track render tile and restores the caller's lightmap and color state.
	 *
	 * @param owner authoritative model-bearing rail tile
	 * @param renderX owner X coordinate relative to the current camera
	 * @param renderY owner Y coordinate relative to the current camera
	 * @param renderZ owner Z coordinate relative to the current camera
	 */
	public static void render(TileTCRail owner, double renderX, double renderY, double renderZ)
	{
		if (owner.getTrackAttachments().isEmpty())
		{
			return;
		}
		float previousLightmapX = OpenGlHelper.lastBrightnessX;
		float previousLightmapY = OpenGlHelper.lastBrightnessY;
		try
		{
			for (TrackAttachment attachment : owner.getTrackAttachments())
			{
				if (attachment.getType().hasBehavior(TrackAttachmentType.RENDERS) == false)
				{
					continue;
				}
				renderOne(owner, attachment, renderX, renderY, renderZ);
			}
		}
		finally
		{
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,
					previousLightmapX, previousLightmapY);
			GL11.glColor4f(1, 1, 1, 1);
		}
	}

	/**
	 * Renders a translucent, non-installed attachment candidate with the same transform as placed geometry.
	 *
	 * @param owner authoritative track render owner
	 * @param attachment resolved attachment candidate
	 * @param renderX owner X coordinate relative to the camera
	 * @param renderY owner Y coordinate relative to the camera
	 * @param renderZ owner Z coordinate relative to the camera
	 * @param validPlacement whether the candidate's mounting slot is available
	 */
	public static void renderPreview(TileTCRail owner, TrackAttachment attachment,
			double renderX, double renderY, double renderZ, boolean validPlacement)
	{
		if (owner == null || attachment == null
				|| attachment.getType().hasBehavior(TrackAttachmentType.RENDERS) == false)
		{
			return;
		}
		float previousLightmapX = OpenGlHelper.lastBrightnessX;
		float previousLightmapY = OpenGlHelper.lastBrightnessY;
		GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
		try
		{
			GL11.glEnable(GL11.GL_BLEND);
			float alpha = validPlacement ? VALID_PREVIEW_ALPHA : INVALID_PREVIEW_ALPHA;
			EXTBlendColor.glBlendColorEXT(1.0F, 1.0F, 1.0F, alpha);
			GL11.glBlendFunc(EXTBlendColor.GL_CONSTANT_ALPHA_EXT,
					EXTBlendColor.GL_ONE_MINUS_CONSTANT_ALPHA_EXT);
			GL11.glDepthMask(false);
			GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
			GL11.glPolygonOffset(-1.0F, -1.0F);
			renderOne(owner, attachment, renderX, renderY, renderZ);
		}
		finally
		{
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,
					previousLightmapX, previousLightmapY);
			GL11.glPopAttrib();
			GL11.glColor4f(1, 1, 1, 1);
		}
	}

	/** Applies the shared path, height, slope, and yaw transforms before dispatching one attachment model. */
	private static void renderOne(TileTCRail owner, TrackAttachment attachment,
			double renderX, double renderY, double renderZ)
	{
		applyLighting(owner, attachment);
		TrackPathSample pathSample = TrackAttachmentOperations.getAttachmentPathSample(owner, attachment);
		GL11.glPushMatrix();
		GL11.glTranslated(renderX + pathSample.getWorldX() - owner.xCoord,
				renderY + attachment.getOffsetY()
						+ TrackAttachmentOperations.getAttachmentRenderYOffset(owner, attachment),
				renderZ + pathSample.getWorldZ() - owner.zCoord);
		if (attachment.getType().getSlopeAlignment() == TrackAttachmentSlopeAlignment.TRACK_SURFACE)
		{
			applySlopePitch(owner);
		}
		renderAttachment(owner, attachment, pathSample);
		GL11.glPopMatrix();
	}

	/** Dispatches attachment-local geometry to the model registered for the attachment definition. */
	private static void renderAttachment(TileTCRail owner, TrackAttachment attachment,
			TrackPathSample pathSample)
	{
		ModelRegistration registration = MODEL_RENDERERS.get(attachment.getType().getDesignId());
		if (registration != null)
		{
			GL11.glRotatef(attachment.getYawDegrees() + registration.authoredYawCorrectionDegrees,
					0.0F, 1.0F, 0.0F);
			registration.renderer.renderTrackAttachment(
					new TrackAttachmentRenderContext(owner, attachment, pathSample));
		}
	}

	/** Applies the owner's world-space slope gradient as a local model pitch. */
	private static void applySlopePitch(TileTCRail owner)
	{
		double gradientX = TrackPathGeometry.getSlopeGradientX(owner);
		double gradientZ = TrackPathGeometry.getSlopeGradientZ(owner);
		double gradientMagnitude = Math.sqrt(gradientX * gradientX + gradientZ * gradientZ);
		if (gradientMagnitude == 0.0D)
		{
			return;
		}
		GL11.glRotatef((float)Math.toDegrees(Math.atan(gradientMagnitude)),
				(float)(-gradientZ / gradientMagnitude), 0.0F,
				(float)(gradientX / gradientMagnitude));
	}

	/** Samples light at the attachment-bearing cell and applies it to the legacy lightmap. */
	private static void applyLighting(TileTCRail owner, TrackAttachment attachment)
	{
		if (owner.getWorldObj() == null)
		{
			return;
		}
		int x = owner.xCoord + attachment.getOffsetX();
		int y = owner.yCoord + attachment.getOffsetY()
				+ (int)Math.ceil(TrackAttachmentOperations.getAttachmentRenderYOffset(owner, attachment));
		int z = owner.zCoord + attachment.getOffsetZ();
		int brightness = owner.getWorldObj().getLightBrightnessForSkyBlocks(x, y, z, 0);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,
				brightness & LIGHTMAP_COMPONENT_MASK,
				brightness >>> LIGHTMAP_SECOND_COMPONENT_SHIFT & LIGHTMAP_COMPONENT_MASK);
	}

	private static final class ModelRegistration
	{
		private final ITrackAttachmentModelRenderer renderer;
		private final float authoredYawCorrectionDegrees;

		private ModelRegistration(ITrackAttachmentModelRenderer renderer, float authoredYawCorrectionDegrees)
		{
			this.renderer = renderer;
			this.authoredYawCorrectionDegrees = authoredYawCorrectionDegrees;
		}
	}
}
