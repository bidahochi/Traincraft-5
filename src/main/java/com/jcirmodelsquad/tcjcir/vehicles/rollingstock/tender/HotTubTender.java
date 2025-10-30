package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.enums.LockoutGroup;
import train.common.library.EnumTrains;

public class HotTubTender extends Tender  {

    public HotTubTender(World world) {
        super(world, FluidRegistry.WATER, 0, EnumTrains.HotTubTender.getTankCapacity(), LiquidManager.WATER_FILTER);
       
        InsertTexture(0, "FMSR 500", LockoutGroup.FMSR);
        InsertTexture(1, "FMSR 511", LockoutGroup.FMSR);
        InsertTexture(2, "FMSR 514", LockoutGroup.FMSR);
        InsertTexture(3, "a");
    }

    @Override
    public String getInventoryName() {
        return "FMSR \"Hot Tub\" Tender";
    }

    @Override
    public boolean canBeRidden() {
        return true;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.8F;
    }

}