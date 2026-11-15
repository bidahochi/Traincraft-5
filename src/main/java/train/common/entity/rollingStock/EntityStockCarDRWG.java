package train.common.entity.rollingStock;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class EntityStockCarDRWG extends AbstractPassengerCar {
	public EntityStockCarDRWG(World world) {
		super(world);
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("livestock", 0F, 0.2F, 0F, SeatRole.LIVESTOCK)
		};
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return !isDead && entityplayer.getDistanceSqToEntity(this) <= 64D;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.55F;
	}

	@Override
	public void onRenderInsertRecord() {
		train.common.Traincraft.traincraftRegistry.RegisterRollingStockModel(
				new train.client.render.register.TrainRenderRecord(
						train.common.library.Info.modID,
						EntityStockCarDRWG.class,
						new train.client.render.models.ModelDRWGStockCar(),
						"drwgstockcar",
						new float[] { 1.0F, -0.4F, 0.0F },
						new float[] { 0, 0, 180 },
						null
				)
		);
	}
}