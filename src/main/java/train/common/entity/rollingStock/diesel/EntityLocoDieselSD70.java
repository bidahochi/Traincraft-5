package train.common.entity.rollingStock.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumHeritageTrainsLegacy;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityLocoDieselSD70 extends DieselTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselSD70;
	}

	public EntityLocoDieselSD70(World world) {
		super(world, EnumHeritageTrainsLegacy.locoDieselSD70.getTankCapacity(), LiquidManager.dieselFilter());
		initLoco();
	}

	public void initLoco() {
		fuelTrain = 0;
		locoInvent = new ItemStack[inventorySize];
	}

	public EntityLocoDieselSD70(World world, double d, double d1, double d2) {
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
		TraincraftUtil.updateRider(this,2.3, 0.3);
	}



	

	@Override
	public void onUpdate() {
		checkInvent(locoInvent[0]);
		super.onUpdate();
	}

	

	@Override
	public String getInventoryName() {
		return "SD70M";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.2F);
	}
	

	
}
