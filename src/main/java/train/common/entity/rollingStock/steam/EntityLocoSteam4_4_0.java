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

public class EntityLocoSteam4_4_0 extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteam4_4_0;
	}
	public EntityLocoSteam4_4_0(World world) {
		super(world, EnumHeritageTrainsLegacy.locoSteam4_4_0.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	

	public EntityLocoSteam4_4_0(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.45, posZ);// default
	}
@Override
	public String getInventoryName() {
		return "4-4-0 (US)";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.6F;
	}

	
}