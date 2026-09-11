package train.client.render;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.common.tile.TileSwitchStand;

/** Renders a two-state switch-stand skin using its on and off models. */
public final class RenderOnOffSwitchStand extends TileEntitySpecialRenderer
{
	private static final float MODEL_SCALE = 0.0625F;
	private final OnOffSwitchStandRenderDefinition definition;

	/**
	 * Creates a renderer for one configured switch-stand skin.
	 *
	 * @param definition models, textures, and transforms used by the skin
	 */
	public RenderOnOffSwitchStand(OnOffSwitchStandRenderDefinition definition)
	{
		this.definition = definition;
	}

	/**
	 * Renders the configured skin after resolving its mount height, facing correction, and powered state.
	 * Graphics state is always restored, including when model rendering fails.
	 *
	 * @param tileEntity switch-stand tile being rendered
	 * @param x camera-relative tile X coordinate
	 * @param y camera-relative tile Y coordinate
	 * @param z camera-relative tile Z coordinate
	 * @param partialTick partial tick supplied by the tile renderer
	 */
	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float partialTick)
	{
		if ((tileEntity instanceof TileSwitchStand) == false)
		{
			return;
		}
		TileSwitchStand switchStand = (TileSwitchStand)tileEntity;
		if (tileEntity.getWorldObj() == null)
		{
			return;
		}
		EmbeddedSwitchStandHostRenderer.render(switchStand, x, y, z);
		OnOffSwitchStandRenderDefinition.Transform facingTransform =
				definition.getFacingTransform(switchStand.getFacing());
		if (facingTransform == null)
		{
			return;
		}

		GL11.glPushMatrix();
		try
		{
			GL11.glTranslated(x + definition.getOriginX(),
					y + definition.getOriginY() + switchStand.getMountRenderOffset(),
					z + definition.getOriginZ());
			applyInitialRotation();
			applyFacingTransform(facingTransform);

			Block block = tileEntity.getWorldObj().getBlock(
					tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord);
			boolean powered = block.isProvidingWeakPower(tileEntity.getWorldObj(),
					tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord, 0) > 0;
			Tessellator.bindTexture(definition.getTexture(powered));
			ModelBase model = definition.getModel(powered);
			model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, MODEL_SCALE);
		}
		finally
		{
			GL11.glPopMatrix();
		}
	}

	/** Applies the skin's authored-axis correction before its world-facing transform. */
	private void applyInitialRotation()
	{
		GL11.glRotated(definition.getInitialRotationX(), 1.0D, 0.0D, 0.0D);
		GL11.glRotated(definition.getInitialRotationY(), 0.0D, 1.0D, 0.0D);
		GL11.glRotated(definition.getInitialRotationZ(), 0.0D, 0.0D, 1.0D);
	}

	/** Applies the exact rotation order and local correction used by the legacy stand renderers. */
	private void applyFacingTransform(OnOffSwitchStandRenderDefinition.Transform transform)
	{
		GL11.glRotated(transform.getRotationZ(), 0.0D, 0.0D, 1.0D);
		GL11.glRotated(transform.getRotationY(), 0.0D, 1.0D, 0.0D);
		GL11.glRotated(transform.getRotationX(), 1.0D, 0.0D, 0.0D);
		GL11.glTranslated(transform.getOffsetX(), transform.getOffsetY(), transform.getOffsetZ());
	}
}
