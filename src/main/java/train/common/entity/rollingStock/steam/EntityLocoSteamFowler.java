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
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamFowler extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamFowler;
	}

	public EntityLocoSteamFowler(World world) {
		super(world, EnumHeritageTrainsLegacy.locosteamKingClass.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	

	public EntityLocoSteamFowler(World world, double d, double d1, double d2) {
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
		TraincraftUtil.updateRider(this, -0.25, 0.25);
	}
@Override
	public String getInventoryName() {
		return "Fowler 4F";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.5F;
	}


	
}