package train.client.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import train.client.render.embedded.CapturedHostBlockAccess;
import train.client.render.embedded.EmbeddedHostRenderState;
import train.common.tile.TileSwitchStand;

/** Replays the captured slab or stair beneath a true-embedded switch stand. */
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

	/** Clamps each vanilla slab or stair component without changing its horizontal topology or lower surfaces. */
	private static final class HeightClampedRenderBlocks extends RenderBlocks
	{
		private final double maximumHeight;

		private HeightClampedRenderBlocks(CapturedHostBlockAccess blockAccess, double maximumHeight)
		{
			super(blockAccess);
			this.maximumHeight = maximumHeight;
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
