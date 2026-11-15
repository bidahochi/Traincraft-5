package train.common.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.Traincraft;
import train.common.api.LiquidManager.StandardTank;
import train.common.api.locomotive.AbstractBoilerLocomotive;
import train.common.core.handlers.FuelHandler;
import train.common.library.GuiIDs;

public abstract class SteamTrain extends AbstractBoilerLocomotive implements IFluidHandler
{
	private int maxFuel = 20000;
	private int update = 8;

	/**
	 * 
	 * @param world
	 * @param capacity
	 */
	@Deprecated // Use SteamTrain(World world)
	public SteamTrain(World world, int capacity)
	{
		this(capacity, world, null);
	}

	public SteamTrain(World world)
	{
		this(0, world, null);
	}

	public SteamTrain(World world, FluidStack filter)
	{
		this(world, 0, filter);
	}

	@Deprecated // Use SteamTrain(World world, FluidStack filter)
	public SteamTrain(World world, int capacity, FluidStack filter)
	{
		this(capacity, world, filter);
		fuelTrain = 0;
		locoInvent = new ItemStack[inventorySize];
	}

	private SteamTrain(int capacity, World world, FluidStack filter) {
		super(world);
		if (filter == null) {
			this.coolantTank = LiquidManager.getInstance().new StandardTank(getTankCapacity());
		} else {
			this.coolantTank = LiquidManager.getInstance().new FilteredTank(getTankCapacity(), filter);
		}

		numCargoSlots = 3;
		numCargoSlots1 = 3;
		numCargoSlots2 = 3;
		inventorySize = numCargoSlots + numCargoSlots2 + numCargoSlots1 + fuelSlot + waterSlot;//
	}

	@Override
	public void pressKey(int i)
	{
		if (i == 7 && getActiveDriver() instanceof EntityPlayer)
		{
			((EntityPlayer) getActiveDriver()).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
		}
	}

	public StandardTank getTank() {
		return coolantTank;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
		this.coolantTank.writeToNBT(nbttagcompound);
		nbttagcompound.setBoolean("canBeAdjusted", canBeAdjusted);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		this.coolantTank.readFromNBT(nbttagcompound);
		canBeAdjusted = nbttagcompound.getBoolean("canBeAdjusted");
	}

	private void placeInInvent(ItemStack itemstack1, SteamTrain loco) {
		for (int i = 2; i < loco.locoInvent.length; i++) {
			if (loco.locoInvent[i] == null) {
				loco.locoInvent[i] = itemstack1;
				return;
			}
			else if (loco.locoInvent[i] != null && loco.locoInvent[i].getItem() == itemstack1.getItem() && itemstack1.isStackable() &&
					(!itemstack1.getHasSubtypes() || locoInvent[i].getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(locoInvent[i], itemstack1)) {
				int var9 = locoInvent[i].stackSize + itemstack1.stackSize;
				if (var9 <= itemstack1.getMaxStackSize()) {
					loco.locoInvent[i].stackSize = var9;
					return;
				}
				else if (locoInvent[i].stackSize < locoInvent[i].getMaxStackSize()) {
					loco.locoInvent[i].stackSize += 1;
					return;
				}
			}
			else if (i == loco.locoInvent.length - 1) {
				entityDropItem(itemstack1,1);
				return;
			}
		}
	}

	public void liquidInSlot(ItemStack itemstack, SteamTrain loco) {

		if (worldObj.isRemote)
			return;
		this.update += 1;
		if (this.update % 8 == 0 && itemstack != null) {
			ItemStack result = LiquidManager.getInstance().processContainer(this, 1, this, itemstack); //'this' needs to be the loco inventory, but that's not an inventory it's a Itemstack[]
			if (result != null) {
				placeInInvent(result, loco);
			}
		}
	}

	@Override
	protected void checkBoilerInventory(ItemStack locoInvent0, ItemStack locoInvent1) {
		if (!this.canCheckInvent)
			return;

		boolean hasCoalInTender = false;
		if (isLocoTurnedOn() && ticksExisted%10==0) {
			FluidStack drain = null;

			if(fill(ForgeDirection.UNKNOWN,new FluidStack(FluidRegistry.WATER, 100), false)==100) {
				blocksToCheck = new TileEntity[]{worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY - 1), MathHelper.floor_double(posZ)),
						worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 2), MathHelper.floor_double(posZ)),
						worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 3), MathHelper.floor_double(posZ)),
						worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 4), MathHelper.floor_double(posZ))
				};

				for (TileEntity block : blocksToCheck) {
					if (drain == null && block instanceof IFluidHandler) {
						for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS) {
							if(((IFluidHandler) block).drain(direction,100,false)!=null &&
									((IFluidHandler) block).drain(direction, 100, false).fluid==FluidRegistry.WATER &&
									((IFluidHandler) block).drain(direction, 100, false).amount ==100
							) {
								drain = ((IFluidHandler) block).drain(
										direction, 100, true);
							}
						}
					}
				}
			}

			if(cartLinked1 instanceof Tender){
				if(drain==null && fill(ForgeDirection.UNKNOWN,new FluidStack(FluidRegistry.WATER, 100), false)==100) {
					if (getFluid() == null || getFluid().getFluid() == FluidRegistry.WATER) {
						drain = ((Tender) cartLinked1).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
					}
				}
				for (int h = 0; h < ((Tender) cartLinked1).tenderItems.length; h++) {
					if (((Tender) cartLinked1).tenderItems[h] != null && FuelHandler.steamFuelLast(((Tender) cartLinked1).tenderItems[h]) != 0) {
						if (getFuel() < maxFuel && ((getFuel() + FuelHandler.steamFuelLast(((Tender) cartLinked1).tenderItems[h])) <= maxFuel)) {
							fuelTrain += FuelHandler.steamFuelLast(((Tender) cartLinked1).tenderItems[h]);
							hasCoalInTender = true;
							((Tender) cartLinked1).decrStackSize(h, 1);
							break;
						}
					}
				}


			} else if (cartLinked2 instanceof Tender){

				if(drain==null && fill(ForgeDirection.UNKNOWN,new FluidStack(FluidRegistry.WATER, 100), false)==100) {
					if (getFluid() == null || getFluid().getFluid() == FluidRegistry.WATER) {
						drain = ((Tender) cartLinked2).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
					}
				}


				for (int h = 0; h < ((Tender) cartLinked2).tenderItems.length; h++) {
					if (((Tender) cartLinked2).tenderItems[h] != null && FuelHandler.steamFuelLast(((Tender) cartLinked2).tenderItems[h]) != 0) {
						if (getFuel() < maxFuel && ((getFuel() + FuelHandler.steamFuelLast(((Tender) cartLinked2).tenderItems[h])) <= maxFuel)) {
							fuelTrain += FuelHandler.steamFuelLast(((Tender) cartLinked2).tenderItems[h]);
							hasCoalInTender = true;
							((Tender) cartLinked2).decrStackSize(h, 1);
							break;
						}
					}
				}
			}
			if (drain != null){
				fill(ForgeDirection.UNKNOWN, drain, true);
			}
		}
		if (!hasCoalInTender && locoInvent0 != null && FuelHandler.steamFuelLast(locoInvent0) != 0) {
			if (getFuel() < maxFuel && ((getFuel() + FuelHandler.steamFuelLast(locoInvent0) <= maxFuel))) {
				fuelTrain += FuelHandler.steamFuelLast(locoInvent0);
				decrStackSize(0, 1);
			}
		}


		if (locoInvent1 != null) {
			liquidInSlot(locoInvent1, this);
			return;
		}
		if (getFuel() <= 0) {
			motionX *= 0.88;
			motionZ *= 0.88;
		}
	}

	/** Used for the gui */
	@Override
	public int getFuelDiv(int i) {
		if (worldObj.isRemote) {
			return ((this.dataWatcher.getWatchableObjectInt(24) * i) / maxFuel);
		}
		return (this.fuelTrain * i) / maxFuel;
	}

	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
		return coolantTank.fill(resource, doFill);
	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
		if (resource == null || !resource.isFluidEqual(coolantTank.getFluid())) {
			return null;
		}
		return coolantTank.drain(resource.amount, doDrain);
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
		return coolantTank.drain(maxDrain, doDrain);
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
		return new FluidTankInfo[] { coolantTank.getInfo() };
	}

	public FluidStack getFluid() {
		return coolantTank.getFluid();
	}

	public int getFluidAmount() {
		return coolantTank.getFluidAmount();
	}
}
