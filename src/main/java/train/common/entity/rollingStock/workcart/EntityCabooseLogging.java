package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelCabooseLogging;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractWorkCart;
import train.common.library.Info;

public class EntityCabooseLogging extends AbstractWorkCart {

	public EntityCabooseLogging(World world) {
		super(world);
	}

	

	@Override
	public double getAdditionalYOffset()
	{
		return 0.15F;
	}

	@Override
	public String getInventoryName() {
		return "Logging Caboose";
	}


	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.0F;
	}

	@Override
	public void onRenderInsertRecord() {
		Traincraft.traincraftRegistry.RegisterRollingStockModel(
				new TrainRenderRecord(
						Info.modID,
						EntityCabooseLogging.class,
						new ModelCabooseLogging(),
						"cabLogging_",
						new float[] { 0.0F, -0.42F, 0.0F },
						null,
						null
				)
		);
	}
}