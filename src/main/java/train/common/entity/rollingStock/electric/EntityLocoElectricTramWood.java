package train.common.entity.rollingStock.electric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricTramWood extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricTramWood;
	}
	public EntityLocoElectricTramWood(World world) {
		super(world);
	}



	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.8F, 0.1F, -0.0045F, SeatRole.DRIVER)
		};
	}



	@Override
	public void pressKey(int i) {
		if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
			((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);

		}
	}

	

	
	@Override
	public String getInventoryName() {
		return "Tram";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		//float dist = 0.1F;
		return (0.7F);
	}
	
}