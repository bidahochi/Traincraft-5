package train.client.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import train.client.render.embedded.CapturedHostBlockAccess;
import train.client.render.embedded.EmbeddedHostRenderState;
import train.common.tile.TileSwitchStand;

/** Replays the captured full block, slab, or stair beneath a true-embedded switch stand. */
public final class EmbeddedSwitchStandHostRenderer
{
	private EmbeddedSwitchStandHostRenderer()
	{
	}

	/**
	 * Renders one captured host with vanilla block geometry and unobstructed world lighting.
	 *
	 * @param switchStand embedded stand that owns the captured host
	 * @param renderX camera-relative host X coordinate
	 * @param renderY camera-relative host Y coordinate
	 * @param renderZ camera-relative host Z coordinate
	 */
	public static void render(TileSwitchStand switchStand, double renderX, double renderY, double renderZ)
	{
		if (switchStand == null || switchStand.isEmbedded() == false
				|| switchStand.getWorldObj() == null)
		{
			return;
		}
		Block hostBlock = switchStand.getEmbeddedHostBlock();
		CapturedHostBlockAccess blockAccess = new CapturedHostBlockAccess(
				switchStand.getWorldObj(), switchStand.xCoord, switchStand.yCoord, switchStand.zCoord,
				hostBlock, switchStand.getEmbeddedHostMetadata(), switchStand.yCoord + 1);
		RenderBlocks renderer = new HeightClampedRenderBlocks(
				blockAccess, switchStand.getMountRenderOffset());
		EmbeddedHostRenderState renderState = null;
		try
		{
			renderState = EmbeddedHostRenderState.begin();
			Tessellator tessellator = renderState.getTessellator();
			tessellator.setTranslation(renderX - switchStand.xCoord,
					renderY - switchStand.yCoord, renderZ - switchStand.zCoord);
			renderer.renderBlockByRenderType(hostBlock,
					switchStand.xCoord, switchStand.yCoord, switchStand.zCoord);
			renderState.finish();
		}
		finally
		{
			Tessellator.instance.setTranslation(0.0D, 0.0D, 0.0D);
			if (renderState != null)
			{
				renderState.restore();
			}
		}
	}

	/** Clamps each captured host component without changing its horizontal topology or lower surfaces. */
	private static final class HeightClampedRenderBlocks extends RenderBlocks
	{
		private final double maximumHeight;

		private HeightClampedRenderBlocks(CapturedHostBlockAccess blockAccess, double maximumHeight)
		{
			super(blockAccess);
			this.maximumHeight = maximumHeight;
		}

		/**
		 * Renders captured stand hosts with their unobstructed light sample but without partial-bounds ambient occlusion.
		 * Vanilla partial AO samples opaque blocks beside an inset top face at the host's own Y level, which can blacken
		 * the complete top beneath a stand. Directional face shading and the captured material's biome tint are retained.
		 */
		@Override
		public boolean renderStandardBlock(Block block, int x, int y, int z)
		{
			int colour = block.colorMultiplier(blockAccess, x, y, z);
			float red = (colour >> 16 & 255) / 255.0F;
			float green = (colour >> 8 & 255) / 255.0F;
			float blue = (colour & 255) / 255.0F;
			if (EntityRenderer.anaglyphEnable)
			{
				float anaglyphRed = (red * 30.0F + green * 59.0F + blue * 11.0F) / 100.0F;
				float anaglyphGreen = (red * 30.0F + green * 70.0F) / 100.0F;
				float anaglyphBlue = (red * 30.0F + blue * 70.0F) / 100.0F;
				red = anaglyphRed;
				green = anaglyphGreen;
				blue = anaglyphBlue;
			}
			return renderStandardBlockWithColorMultiplier(block, x, y, z, red, green, blue);
		}

		@Override
		public void setRenderBoundsFromBlock(Block block)
		{
			super.setRenderBoundsFromBlock(block);
			if (renderMaxY > maximumHeight)
			{
				renderMaxY = maximumHeight;
			}
		}
	}
}
