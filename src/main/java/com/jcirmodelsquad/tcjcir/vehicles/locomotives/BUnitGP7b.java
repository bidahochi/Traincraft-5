package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.LiquidTank;
import train.common.library.GuiIDs;

@Deprecated
public class BUnitGP7b extends LiquidTank implements IFluidHandler {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:bunitgp7b")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_437", "marker_body_438", "marker_body_439",
            "marker_body_440")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_127", "front_numberboard_body_128", "rear_numberboard_body_206",
            "rear_numberboard_body_207")
        .build();

	public int freightInventorySize;

	private int update = 8;
	private LiquidManager.StandardTank theTank;

	public BUnitGP7b(World world) {
		super(world, 0);
		initFreightWater();
		this.theTank = LiquidManager.getInstance().new FilteredTank(getTankCapacity(), LiquidManager.dieselFilter());
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}



	@Override
	public void onUpdate() {
		super.onUpdate();
		checkInvent(cargoItems[0]);
		if (worldObj.isRemote) {
			return;
		}

		if (theTank != null && theTank.getFluid() != null) {
			this.dataWatcher.updateObject(18, theTank.getFluidAmount());
			this.dataWatcher.updateObject(4, theTank.getFluid().getFluidID());
			if (theTank.getFluid().amount <= 1) {
				motionX *= 0.94;
				motionZ *= 0.94;
			}
		}
		else if (theTank != null && theTank.getFluid() == null) {
			this.dataWatcher.updateObject(18, 0);
			this.dataWatcher.updateObject(4, 0);
		}

		if (getAmount() > 0) {
			// setColor(getColorFromString("Full"));
			setDefaultMass(-trainSpec.getMass()*2);
			if ((motionX>0.01 || motionZ>0.01) && ticksExisted % 40 == 0) {
				drain(ForgeDirection.UNKNOWN, 8,true);
			}

		} else if (getAmount() <= 0) {
			// setColor(getColorFromString("Empty"));
			setDefaultMass(trainSpec.getMass());
		}
	}

	public int getDiesel() {
		return (this.dataWatcher.getWatchableObjectInt(18));
	}

	public int getLiquidItemID() {
		return (this.dataWatcher.getWatchableObjectInt(4));
	}

	public LiquidManager.StandardTank getTank() {
		return theTank;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < cargoItems.length; i++) {
			if (cargoItems[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				cargoItems[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}


		nbttagcompound.setTag("Items", nbttaglist);
		if (theTank !=null && theTank.getFluid() != null) {
			new FluidStack(theTank.getFluid(), this.dataWatcher.getWatchableObjectInt(18)).writeToNBT(nbttagcompound);
		}
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		cargoItems = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 0xff;
			if (j >= 0 && j < cargoItems.length) {
				cargoItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
		if (nbttagcompound.hasKey("FluidName")) {
			fill(ForgeDirection.UNKNOWN, FluidStack.loadFluidStackFromNBT(nbttagcompound), true);
		}

	}

	private void placeInInvent(ItemStack itemstack1) {
		for (int i = 1; i < cargoItems.length; i++) {
			if (cargoItems[i] == null) {
				cargoItems[i] = itemstack1;
				return;
			}
			else if (cargoItems[i] != null && cargoItems[i].getItem() == itemstack1.getItem() && itemstack1.isStackable() && (!itemstack1.getHasSubtypes() || cargoItems[i].getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(cargoItems[i], itemstack1)) {
				int var9 = cargoItems[i].stackSize + itemstack1.stackSize;
				if (var9 <= itemstack1.getMaxStackSize()) {
					cargoItems[i].stackSize = var9;

				}
				else if (cargoItems[i].stackSize < itemstack1.getMaxStackSize()) {
					cargoItems[i].stackSize += 1;
				}
				return;
			}
			else if (i == cargoItems.length - 1) {
				entityDropItem(itemstack1,1);
				return;
			}
		}
	}

	public void liquidInSlot(ItemStack itemstack) {
		if (worldObj.isRemote)
			return;
		this.update += 1;
		if (this.update % 8 == 0 && itemstack != null) {
			ItemStack result = LiquidManager.getInstance().processContainer(this, 0, this, itemstack);
			if (result != null) {
				placeInInvent(result);
			}
		}
	}

	public ItemStack checkInvent(ItemStack cargoItems0) {

		if (getDiesel() > 0) {
			fuelTrain = (getDiesel());
		}
		if (fuelTrain <= 0) {
			motionX *= 0.88;
			motionZ *= 0.88;
		}
		if (cargoItems0 != null) {
			liquidInSlot(cargoItems0);
		}
		return cargoItems0;
	}

	public void initFreightWater() {
		freightInventorySize = 2;
		cargoItems = new ItemStack[freightInventorySize];
	}

	@Override
	public String getInventoryName() {
		return "GP7B";
	}

	@Override
	public int getSizeInventory() {
		return freightInventorySize;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		if (!this.worldObj.isRemote) {
			entityplayer.openGui(Traincraft.instance, GuiIDs.LIQUID, worldObj, this.getEntityId(), -1, (int) this.posZ);
		}
		return true;
	}

	@Override
	public boolean isStorageCart() {
		return true;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.5F;
	}


	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
		return theTank.fill(resource, doFill);
	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
		if (resource == null || !resource.isFluidEqual(theTank.getFluid())) {
			return null;
		}
		return theTank.drain(resource.amount, doDrain);
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
		return theTank.drain(maxDrain, doDrain);
	}

	@Override
	public boolean canFill(ForgeDirection from, Fluid fluid) {
		return true;
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid) {
		return true;
	}

	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from) {
		return new FluidTankInfo[] { theTank.getInfo() };
	}

	public FluidStack getFluid() {
		return theTank.getFluid();
	}

	public int getFluidAmount() {
		return dataWatcher.getWatchableObjectInt(18);
	}

	@Override
	public String getLiquidName(){
		return FluidRegistry.getFluid(this.dataWatcher.getWatchableObjectInt(4))!=null? FluidRegistry.getFluid(this.dataWatcher.getWatchableObjectInt(4)).getUnlocalizedName():null;
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}