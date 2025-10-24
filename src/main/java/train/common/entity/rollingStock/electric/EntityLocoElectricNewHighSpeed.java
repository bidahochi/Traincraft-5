package train.common.entity.rollingStock.electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricNewHighSpeed extends ElectricTrain {
	EntityPlayer playerEntity;

	@Override
	public SoundRecord getSoundRecord()
	{
		return null;
	}

	public EntityLocoElectricNewHighSpeed(World world) {
		super(world);
	}

	public EntityLocoElectricNewHighSpeed(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + (double) yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.35F, posZ);
	}

	

	@Override
	public String getInventoryName() {
		return "High Speed";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.75F;
	}

	
	
}