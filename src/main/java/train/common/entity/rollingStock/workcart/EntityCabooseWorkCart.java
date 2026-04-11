package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class EntityCabooseWorkCart extends AbstractWorkCart
{

	public EntityCabooseWorkCart(World world) {
		super(world);
	}

	

	@Override
	public double getAdditionalYOffset()
	{
		return 0.15F;
	}

	@Override
	public String getInventoryName() {
		return "Caboose";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.45F);
	}

	@Override
	public void onRenderInsertRecord() {
		train.common.Traincraft.traincraftRegistry.RegisterRollingStockModel(
				new train.client.render.register.TrainRenderRecord(
						train.common.library.Info.modID,
						EntityCabooseWorkCart.class,
						new train.client.render.models.ModelWorkCaboose(),
						"workcaboose",
						new float[] { 0.0F, -0.40F, 0.0F },
						null,
						null
				)
		);
	}
}