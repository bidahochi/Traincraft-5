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

public class EntityTenderBerk1225 extends Tender  {
	
	public EntityTenderBerk1225(World world) {
		super(world, FluidRegistry.WATER, 0, EnumHeritageTrainsLegacy.Model225Tender.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	

	public EntityTenderBerk1225(World world, double d, double d1, double d2) {
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
	public String getInventoryName() {
		return "Berkshire 1225 Tender";
	}@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.875F;
	}

	
}