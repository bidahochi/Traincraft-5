package train.common.entity.rollingStock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class EntityFlatCart extends AbstractPassengerCar {

	public EntityFlatCart(World world) {
		super(world);
	}

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.4, posZ);
	}



	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.4F;
	}

	@Override
	public void onRenderInsertRecord() {
		train.common.Traincraft.traincraftRegistry.RegisterRollingStockModel(
				new train.client.render.register.TrainRenderRecord(
						train.common.library.Info.modID,
						EntityFlatCart.class,
						new train.client.render.models.ModelFlatCar(),
						"flatcart",
						new float[] { 0.0F, -0.40F, 0.0F },
						null,
						null
				)
		);
	}
}