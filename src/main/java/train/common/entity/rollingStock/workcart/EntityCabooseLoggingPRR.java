package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class EntityCabooseLoggingPRR extends AbstractWorkCart
{

	public EntityCabooseLoggingPRR(World world) {
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
		return 2.2F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		 train.common.Traincraft.traincraftRegistry.RegisterRollingStockModel(
				new train.client.render.register.TrainRenderRecord(
						train.common.library.Info.modID,
						EntityCabooseLoggingPRR.class,
						new train.client.render.models.ModelPRRCaboose(),
						"PRRCaboose_",
						new float[] { 0.0F, -0.38F, 0.0F },
						new float[] { 0, 180, 180 },
						null
				)
		);
	}
}