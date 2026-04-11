package train.common.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.Traincraft;
import train.common.api.LiquidManager.StandardTank;
import train.common.entity.rollingStock.EntityBUnitDD35;
import train.common.entity.rollingStock.EntityBUnitEMDF3;
import train.common.entity.rollingStock.EntityBUnitEMDF7;
import train.common.library.GuiIDs;

import javax.annotation.Nullable;

public abstract class Tender extends Freight implements IFluidHandler, IInventory
{

	public ItemStack tenderItems[];
	private int maxTank;
	private int update = 8;
	private StandardTank theTank;
	private IFluidTank[] tankArray = new IFluidTank[1];
	public TileEntity[] blocksToCheck;

	/**
	 * USE Tender(World world, FluidStack filter)
	 * @param world
	 * @param fluid
	 * @param quantity
	 * @param capacity
	 * @param filter
	 */
	@Deprecated
	public Tender(World world, Fluid fluid, int quantity, int capacity, FluidStack filter)
	{
		this(world, filter);
	}

	public Tender(World world, @Nullable FluidStack filter)
	{
		super(world);
		this.maxTank = getTankCapacity();
		if (filter == null)
			this.theTank = LiquidManager.getInstance().new StandardTank(getTankCapacity());
		if (filter != null)
			this.theTank = LiquidManager.getInstance().new FilteredTank(getTankCapacity(), filter);
		tankArray[0] = theTank;
		dataWatcher.addObject(4, 0);
		this.dataWatcher.addObject(23, 0);
		freightInventorySize = 16;
		tenderItems = new ItemStack[freightInventorySize];
	}

	public int getTankCapacity()
	{
		return trainSpec.getTankCapacity();
	}

	@Override
	public final boolean interactFirst(EntityPlayer entityplayer) {
		playerEntity = entityplayer;
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		if (!this.worldObj.isRemote) {
			entityplayer.openGui(Traincraft.instance, GuiIDs.TENDER, worldObj, this.getEntityId(), -1, (int) this.posZ);
		}
		return true;
	}

	@Override
	public final void setDead() {
		super.setDead();
		isDead = true;
	}

	public int freightInventorySize;

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
		this.theTank.writeToNBT(nbttagcompound);

		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < tenderItems.length; i++) {
			if (tenderItems[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				tenderItems[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		nbttagcompound.setTag("Items", nbttaglist);
	}
	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		this.theTank.readFromNBT(nbttagcompound);

		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		tenderItems = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 0xff;
			if (j >= 0 && j < tenderItems.length) {
				tenderItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
	}

	@Override
	public final int getSizeInventory() {
		return freightInventorySize;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if (worldObj.isRemote == false)
		{

			if (theTank != null && theTank.getFluid() != null) {
				this.dataWatcher.updateObject(23, theTank.getFluid().amount);
				this.dataWatcher.updateObject(4, theTank.getFluid().getFluidID());
			}
			else if (theTank != null && theTank.getFluid() == null) {
				this.dataWatcher.updateObject(23, 0);
				this.dataWatcher.updateObject(4, 0);
			}
		}

		checkInvent(tenderItems[0], this);
	}
	/**
	 * handle mass depending on items and liquid
	 */
	@Override
	protected void handleMass(){
		if(this.updateTicks%10!=0)return;
		double preciseAmount=0;
		this.mass=this.getDefaultMass();
		if(theTank != null && theTank.getFluid() != null && theTank.getFluid().amount>0){
			preciseAmount = theTank.getFluid().amount;
		}		
		this.itemInsideCount=0;
		for (int i = 0; i < getSizeInventory(); i++) {
			ItemStack itemstack = getStackInSlot(i);
			if (itemstack != null && itemstack.stackSize > 0) {
				this.itemInsideCount+=itemstack.stackSize;
			}
		}
		mass+=(this.itemInsideCount*0.0001);//1 item = 1 kilo
		mass+=(preciseAmount/10000);//1 bucket = 1 kilo
	}

	/**
	 * added for SMP, used by the HUD
	 * 
	 * @return
	 */
	public int getWater() {
		return (this.dataWatcher.getWatchableObjectInt(23));
	}

	/**
	 * used by the GUI
	 * 
	 * @return int
	 */
	public int getLiquidItemID() {
		return (this.dataWatcher.getWatchableObjectInt(4));
	}

	public int getCartTankCapacity() {
		return maxTank;
	}

	public StandardTank getTank() {
		return theTank;
	}

	private void placeInInvent(ItemStack itemstack1, Tender tender) {
		for (int i = 1; i < tender.tenderItems.length; i++) {
			if (tender.tenderItems[i] == null) {
				tender.tenderItems[i] = itemstack1;
				return;
			}
			else if (tender.tenderItems[i] != null && tender.tenderItems[i].getItem() == itemstack1.getItem() && itemstack1.isStackable() &&
					(!itemstack1.getHasSubtypes() || tender.tenderItems[i].getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(tender.tenderItems[i], itemstack1)) {
				int var9 = tender.tenderItems[i].stackSize + itemstack1.stackSize;
				if (var9 <= tender.tenderItems[i].getMaxStackSize()) {
					tender.tenderItems[i].stackSize = var9;
					return;
				}
				else if (tender.tenderItems[i].stackSize < tender.tenderItems[i].getMaxStackSize()) {
					tender.tenderItems[i].stackSize += 1;
					return;
				}
			}
			else if (i == tender.tenderItems.length - 1) {
				entityDropItem(itemstack1,1);
				return;
			}
		}
	}

	public void liquidInSlot(ItemStack itemstack, Tender tender) {
		if (worldObj.isRemote)
			return;
		this.update += 1;
		if (this.update % 8 == 0 && itemstack != null) {
			ItemStack result = LiquidManager.getInstance().processContainer(this, 0, this, itemstack);
			if (result != null) {
				placeInInvent(result, tender);
				decrStackSize(0, 1);
			}
		}
	}

	protected void checkInvent(ItemStack tenderInvent, Tender loco) {
		if (tenderInvent != null) {
			liquidInSlot(tenderInvent, loco);
		}

		if(ticksExisted%5==0 && fill(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER,100), false)==100) {
			FluidStack drain =null;
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
			if (drain ==null && cartLinked1 instanceof LiquidTank
					&& !(cartLinked1 instanceof EntityBUnitEMDF7) && !(cartLinked1 instanceof EntityBUnitEMDF3) && !(cartLinked1 instanceof EntityBUnitDD35)) {
				if (getFluid() == null) {
					drain = ((LiquidTank) cartLinked1).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
				} else if (getFluid().getFluid() == FluidRegistry.WATER) {
					drain = ((LiquidTank) cartLinked1).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
				}
			} else if (drain ==null && cartLinked2 instanceof LiquidTank
					&& !(cartLinked1 instanceof EntityBUnitEMDF7) && !(cartLinked1 instanceof EntityBUnitEMDF3) && !(cartLinked1 instanceof EntityBUnitDD35)) {
				if (getFluid() == null) {
					drain = ((LiquidTank) cartLinked2).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
				} else if (getFluid().getFluid() == FluidRegistry.WATER) {
					drain = ((LiquidTank) cartLinked2).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
				}
			}
			if (drain != null) {
				fill(ForgeDirection.UNKNOWN, drain, true);
			}
		}
	}
	/*IInventory implements*/
	@Override
	public ItemStack getStackInSlot(int i) {
		return tenderItems[i];
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1) {
		if (this.tenderItems[par1] != null) {
			ItemStack var2 = this.tenderItems[par1];
			this.tenderItems[par1] = null;
			return var2;
		}
		else {
			return null;
		}
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		if (tenderItems[i] != null) {
			if (tenderItems[i].stackSize <= j) {
				ItemStack itemstack = tenderItems[i];
				tenderItems[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = tenderItems[i].splitStack(j);
			if (tenderItems[i].stackSize == 0) {
				tenderItems[i] = null;
			}
			return itemstack1;
		}
		else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		tenderItems[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
			itemstack.stackSize = getInventoryStackLimit();
		}
	}
	
	public void setLiquid(FluidStack liquid) {
	}

	public void setCapacity(int capacity) {
		this.maxTank = capacity;
	}

	public int getCapacity() {
		return this.maxTank;
	}
	@Override
    public int fill(ForgeDirection from, FluidStack resource, boolean doFill)
    {
        return theTank.fill(resource, doFill);
    }

    @Override
    public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain)
    {
        if (resource == null || !resource.isFluidEqual(theTank.getFluid()))
        {
            return null;
        }
        return theTank.drain(resource.amount, doDrain);
    }

    @Override
    public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain)
    {
        return theTank.drain(maxDrain, doDrain);
    }

    @Override
    public boolean canFill(ForgeDirection from, Fluid fluid)
    {
        return true;
    }

    @Override
    public boolean canDrain(ForgeDirection from, Fluid fluid)
    {
        return true;
    }

    @Override
    public FluidTankInfo[] getTankInfo(ForgeDirection from)
    {
        return new FluidTankInfo[] { theTank.getInfo() };
    }
	
    public FluidStack getFluid()
    {
        return theTank.getFluid();
    }

    public int getFluidAmount()
    {
        return theTank.getFluidAmount();
    }

	@Override
	public void dropCartAsItem(boolean isCreative)
	{
		if(!itemdropped)
		{
			super.dropCartAsItem(isCreative);
			dropStockInventoryContents(this, tenderItems);
		}
	}
}