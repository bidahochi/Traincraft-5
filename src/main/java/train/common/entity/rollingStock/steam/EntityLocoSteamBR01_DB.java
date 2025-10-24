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
import train.common.library.EnumHeritageTrainsLegacy;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamBR01_DB extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamBR01_DB;
	}
	public EntityLocoSteamBR01_DB(World world) {
		super(world, EnumHeritageTrainsLegacy.locoSteamBR01_DB.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	
	public EntityLocoSteamBR01_DB(World world, double d, double d1, double d2) {
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
		return "BR01";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.4F;
	}

	
}