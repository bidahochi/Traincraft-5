package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.api.Freight;
import train.common.library.GuiIDs;

public class BuddPrewarBaggage extends AbstractStandardFixedFreightCar
{
	public BuddPrewarBaggage(World world)
	{
		super(world);
	}

	public BuddPrewarBaggage(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "CB&Q 900 \"Silver Light\" (early)");
		InsertTexture(1, "CB&Q 900 \"Silver Light\"");
		InsertTexture(2, "CB&Q 900 \"Silver Light\" (late)");
		InsertTexture(3, "ATSF 3432-3445");
		InsertTexture(4, "ATSF 3446-3452");
		InsertTexture(5, "ATSF 3440 (late)");
	}

	@Override
	public String getInventoryName() {
		return "Budd Prewar Baggage";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.23F;
	}
}