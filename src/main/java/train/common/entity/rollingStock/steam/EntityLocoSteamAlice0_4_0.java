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

public class EntityLocoSteamAlice0_4_0 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamAlice0_4_0;
	}

	public EntityLocoSteamAlice0_4_0(World world) {
		super(world, EnumHeritageTrainsLegacy.locoSteamAlice.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	

	public EntityLocoSteamAlice0_4_0(World world, double d, double d1, double d2) {
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
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.65, posZ);// default
	}
	@Override
	public boolean shouldRiderSit(){return false;}
@Override
	public String getInventoryName() {
		return "0-4-0 Alice";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.9F;
	}

	
}