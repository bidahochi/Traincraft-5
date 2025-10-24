package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

@Deprecated
public class EntityLocoSteamU57 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return null;
	}

	public EntityLocoSteamU57(World world) {
		super(world, 5000/*Change here to EnumTrains..getTankCapacity()*/, LiquidManager.WATER_FILTER);
		
	}

	

	public EntityLocoSteamU57(World world, double d, double d1, double d2) {
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
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.5F, posZ);
	}



	

	
@Override
	public String getInventoryName() {
		return "USSR 0-5-0";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.39F;
	}

	
}