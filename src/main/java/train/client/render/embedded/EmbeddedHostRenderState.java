package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

import java.nio.FloatBuffer;

/**
 * Owns temporary OpenGL and tessellator state used by embedded-host face emission.
 *
 * <p>Creation snapshots every state value this renderer changes; {@link #restore()} must run from a {@code finally}
 * block. Large meshes are split below Minecraft 1.7.10's tessellator growth threshold without changing face order.</p>
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedHostRenderState
{
	/*
	 * Minecraft 1.7.10 grows Tessellator's int buffer when a batch exceeds
	 * 2,047 quads, then replaces that large buffer with its small default after
	 * draw(). Staying slightly below that boundary prevents the same multi-MiB
	 * arrays from being allocated again for every large embedded track frame.
	 */
	private static final int MAX_QUADS_PER_BATCH = 2000;
	private static final int GL_QUERY_BUFFER_FLOATS = 16;
	private final boolean lightingEnabled;
	private final boolean cullFaceEnabled;
	private final int shadeModel;
	private final int activeTexture;
	private final int blockTextureBinding;
	private final float red;
	private final float green;
	private final float blue;
	private final float alpha;
	private boolean drawing;
	private int quadsInBatch;

	/** Captures the OpenGL state that embedded-host rendering temporarily changes. */
	private EmbeddedHostRenderState()
	{
		lightingEnabled = GL11.glIsEnabled(GL11.GL_LIGHTING);
		cullFaceEnabled = GL11.glIsEnabled(GL11.GL_CULL_FACE);
		shadeModel = GL11.glGetInteger(GL11.GL_SHADE_MODEL);
		activeTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
		OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
		blockTextureBinding = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
		OpenGlHelper.setActiveTexture(activeTexture);
		// LWJGL 2 validates glGetFloat buffers against the largest possible
		// result (a 4x4 matrix), even for four-component values such as color.
		FloatBuffer colour = BufferUtils.createFloatBuffer(GL_QUERY_BUFFER_FLOATS);
		GL11.glGetFloat(GL11.GL_CURRENT_COLOR, colour);
		red = colour.get(0);
		green = colour.get(1);
		blue = colour.get(2);
		alpha = colour.get(3);
	}

	/**
	 * Captures render state and opens an embedded-host tessellator batch.
	 *
	 * @return active render-state owner
	 */
	public static EmbeddedHostRenderState begin()
	{
		return begin(true);
	}

	/**
	 * Captures and prepares the same GL state as {@link #begin()} without
	 * opening a Tessellator batch. Use this when replaying already-compiled
	 * embedded geometry through a display list.
	 *
	 * @return active display-list render-state owner
	 */
	public static EmbeddedHostRenderState beginDisplayList()
	{
		return begin(false);
	}

	/**
	 * Captures render state and optionally opens a tessellator batch.
	 *
	 * @param startTessellator whether to begin drawing quads immediately
	 * @return active render-state owner
	 */
	private static EmbeddedHostRenderState begin(boolean startTessellator)
	{
		EmbeddedHostRenderState state = new EmbeddedHostRenderState();
		boolean started = false;
		try
		{
			OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
			Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glDisable(GL11.GL_CULL_FACE);
			GL11.glShadeModel(GL11.GL_SMOOTH);
			if (startTessellator)
			{
				Tessellator.instance.startDrawingQuads();
				state.drawing = true;
			}
			started = true;
			return state;
		}
		finally
		{
			if (started == false)
			{
				state.restore();
			}
		}
	}

	/**
	 * Returns the tessellator owned between {@link #begin()} and {@link #finish()}.
	 *
	 * @return shared Minecraft tessellator
	 */
	public Tessellator getTessellator()
	{
		return Tessellator.instance;
	}

	/**
	 * Reserves one quad in the current Tessellator batch, flushing first when
	 * the next face would force Minecraft's temporary raw buffer to grow.
	 *
	 * <p>The texture and GL state owned by this object remain active across the
	 * flush. Callers must invoke this exactly once before emitting each quad.</p>
	 *
	 * @throws IllegalStateException when this state does not own an active tessellator batch
	 */
	public void prepareForQuad()
	{
		if (drawing == false)
		{
			throw new IllegalStateException("Embedded host render state is not drawing");
		}
		if (quadsInBatch >= MAX_QUADS_PER_BATCH)
		{
			drawing = false;
			Tessellator.instance.draw();
			Tessellator.instance.startDrawingQuads();
			drawing = true;
			quadsInBatch = 0;
		}
		quadsInBatch++;
	}

	/** Draws the owned tessellator batch while leaving captured GL state active. */
	public void finish()
	{
		if (drawing)
		{
			try
			{
				Tessellator.instance.draw();
			}
			finally
			{
				drawing = false;
			}
		}
	}

	/** Finishes outstanding geometry and restores every GL state captured by {@link #begin()}. */
	public void restore()
	{
		if (drawing)
		{
			try
			{
				Tessellator.instance.draw();
			}
			finally
			{
				drawing = false;
			}
		}
		OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, blockTextureBinding);
		OpenGlHelper.setActiveTexture(activeTexture);
		GL11.glColor4f(red, green, blue, alpha);
		GL11.glShadeModel(shadeModel);
		setEnabled(GL11.GL_CULL_FACE, cullFaceEnabled);
		setEnabled(GL11.GL_LIGHTING, lightingEnabled);
	}

	/**
	 * Restores one OpenGL capability to a captured enabled state.
	 *
	 * @param capability OpenGL capability constant
	 * @param enabled whether the capability should be enabled
	 */
	private static void setEnabled(int capability, boolean enabled)
	{
		if (enabled)
		{
			GL11.glEnable(capability);
		}
		else
		{
			GL11.glDisable(capability);
		}
	}
}
