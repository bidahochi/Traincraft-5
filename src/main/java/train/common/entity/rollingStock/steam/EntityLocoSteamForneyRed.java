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

public class EntityLocoSteamForneyRed extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamForneyRed;
	}
	public EntityLocoSteamForneyRed(World world) {
		super(world,  EnumHeritageTrainsLegacy.locoSteamForney.getTankCapacity(), LiquidManager.WATER_FILTER);
		initLocoSteam();
	}

	public void initLocoSteam() {
		fuelTrain = 0;
		this.inventorySize = 17;
		locoInvent = new ItemStack[inventorySize];
	}
	public EntityLocoSteamForneyRed(World world, double d, double d1, double d2) {
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
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.45, posZ);// default
	}



	@Override
	public void pressKey(int i) {
		if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
			((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.FORNEY, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (worldObj.isRemote) {
			return;
		}
		checkInvent(locoInvent[0], locoInvent[1], this);
		for (int h = 0; h < this.locoInvent.length; h++) {
			if (this.locoInvent[h] != null && steamFuelLast(this.locoInvent[h]) != 0) {
				if (fuelTrain <= 0 && !worldObj.isRemote) {
					fuelTrain = steamFuelLast(this.locoInvent[h]);
					if (!worldObj.isRemote) {
						this.decrStackSize(h, 1);
					}
				}
			}
			else if (this.locoInvent[h] != null && steamFuelLast(this.locoInvent[h]) != 0) {
				if (fuelTrain <= 0 && !worldObj.isRemote) {
					fuelTrain = steamFuelLast(this.locoInvent[h]);
					if (!worldObj.isRemote) {
						this.decrStackSize(h, 1);
					}
				}
			}
		}
	}
@Override
	public String getInventoryName() {
		return "Forney";
	}
	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}

	@Override
	public boolean canBeAdjusted(EntityMinecart cart) {
		return canBeAdjusted;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}