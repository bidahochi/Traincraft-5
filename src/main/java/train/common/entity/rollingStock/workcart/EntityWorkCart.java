package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class EntityWorkCart extends AbstractWorkCart
{
	public EntityWorkCart(World world) {
		super(world);
	}

	

	@Override
	public String getInventoryName() {
		return "Work cart";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.8F);
	}

	@Override
	public void onRenderInsertRecord() {
		train.common.Traincraft.traincraftRegistry.RegisterRollingStockModel(
				new train.client.render.register.TrainRenderRecord(
						train.common.library.Info.modID,
						EntityWorkCart.class,
						new train.client.render.models.ModelWorkCart(),
						"workcart",
						new float[] { 0.0F, -0.42F, 0.0F },
						null,
						null
				)
		);
	}
}