package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import com.jcirmodelsquad.tcjcir.models.trains.ModelPullman69ChairCar;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.entity.rollingStock.EntityStockCar;
import train.common.library.Info;

public class Pullman69ChairCar extends AbstractPassengerCar {

	public Pullman69ChairCar(World world) {
		super(world);
		InsertTexture(0, "Southern (early)");
		InsertTexture(1, "Southern (early) (divided)");
		InsertTexture(2, "Southern (late)");
		InsertTexture(3, "Southern (late) (divided)");
		InsertTexture(4, "Painted, Unlettered");
		InsertTexture(5, "Painted, Unlettered (air conditioning)");
		InsertTexture(6, "Definitely not RBMN");
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance() { return 3.72F; }

	@Override
	public String transportYear() {
		return "1922";
	}

	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
						Pullman69ChairCar.class,
						new ModelPullman69ChairCar(),
						"Pullman69ChairCar_",
						new float[] { -0.0F, 0.13F, 0.0F },
						new float[] { 0, 0, 180F },
						null
				)
		);
	}
}