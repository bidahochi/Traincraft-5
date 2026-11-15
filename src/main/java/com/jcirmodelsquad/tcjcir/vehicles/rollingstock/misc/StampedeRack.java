package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.misc;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class StampedeRack extends AbstractPassengerCar
{
	public StampedeRack(World world) {
		super(world);
		InsertTexture(0, "Blandsville Cow Express");
		InsertTexture(1, "CSWR");
		InsertTexture(2, "");
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("livestock", 0F, 0.1F, 0F, SeatRole.LIVESTOCK)
		};
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return !isDead && entityplayer.getDistanceSqToEntity(this) <= 64D;
	}

	@Override
	public double getAdditionalYOffset()
	{
		return 0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.75F;
	}

	/*@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
		if (riddenByEntity != null) {

			NBTTagCompound c = new NBTTagCompound();
			if(riddenByEntity.writeMountToNBT(c)) {
				nbttagcompound.setTag("mob2", c);
			}
		}
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		if(nbttagcompound.hasKey("mob2")){
			readEntityFromNBT(nbttagcompound.getCompoundTag("mob2"));
		}
	}*/

}