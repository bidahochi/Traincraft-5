/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.entity.rollingStock.passenger;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.client.render.models.ModelPassenger_DB_oriental;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.library.Info;

public class EntityPassengerDBOriental extends AbstractPassengerCar {

	public EntityPassengerDBOriental(World world) {
		super(world);
	}


	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.25F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerDBOriental.class, new ModelPassenger_DB_oriental(),
				"passenger_DB_oriental_",
				new float[] { 0F, -0.42F, 0.0F },
				new float[] { 180F, 0F, 0F },
				new float[] { -1F, -1F, 1F }));
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("passenger_1", 0f, 0.2f, 0f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_2", -1f, 0.2f, 0f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_3", 1f, 0.2f, 0f, SeatRole.PASSENGER)
		};
	}

}
