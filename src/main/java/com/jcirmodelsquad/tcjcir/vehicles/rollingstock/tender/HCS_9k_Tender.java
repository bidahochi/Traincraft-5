package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;


public class HCS_9k_Tender extends Tender  {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:hcs_9k_tender")
        .defaults()
        .fixtureType(train.common.api.LightFixtureType.HEADLIGHT, "rear_headlight")
        .build();

    public HCS_9k_Tender(World world) {
        super(world,  LiquidManager.WATER_FILTER);
       
        InsertTexture(0, "Blank");
        InsertTexture(1, "SPMW");
        InsertTexture(2, "Southern Pacific (Lines Lettering)");
        InsertTexture(3, "Southern Pacific");
        InsertTexture(4, "Herber Valley 618");
        InsertTexture(5, "Union Pacific (Late)");
    }

    @Override
    public String getInventoryName() {
        return "UP - SP 9000 Gallon Tender";
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public boolean canBeRidden() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.8F;
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
