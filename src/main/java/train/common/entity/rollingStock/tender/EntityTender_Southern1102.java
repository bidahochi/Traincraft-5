package train.common.entity.rollingStock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.library.EnumHeritageTrainsLegacy;
import train.common.library.GuiIDs;

public class EntityTender_Southern1102 extends Tender  {
	
	

	public EntityTender_Southern1102(World world) {
		super(world, FluidRegistry.WATER, 0, EnumHeritageTrainsLegacy.tender_Southern1102.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	

	public EntityTender_Southern1102(World world, double d, double d1, double d2) {
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
	public String getInventoryName() {
		return "Baldwin 4-6-0 Tender";
	}@Override
	public boolean canBeRidden() {
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}

	
}