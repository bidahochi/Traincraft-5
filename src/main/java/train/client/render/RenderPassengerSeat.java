package train.client.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/** Suppresses rendering for the invisible auxiliary passenger mount. */
public final class RenderPassengerSeat extends Render
{
	/** Creates the no-op renderer used for tracked passenger mounts. */
	public RenderPassengerSeat()
	{
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTick)
	{
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return null;
	}
}
