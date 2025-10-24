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
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumHeritageTrainsLegacy;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamBerk1225 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return null;
	}

	public EntityLocoSteamBerk1225(World world) {
		super(world, EnumHeritageTrainsLegacy.locosteamBerk1225.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	

	public EntityLocoSteamBerk1225(World world, double d, double d1, double d2) {
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
		TraincraftUtil.updateRider(this, -1.125, 0.375);
	}



	

	
@Override
	public String getInventoryName() {
		return "Berkshire 1225";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.375F;
	}


	
}