package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACFRailboxCushioned extends AbstractStandardFreightCar
{
    public ACFRailboxCushioned(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "ASAB (Cushioned)");
        InsertTexture(1, "ADN (Cushioned)");
        InsertTexture(2, "BN (Cushioned)");
        InsertTexture(3, "MP (Cushioned)");
        InsertTexture(4, "T&P (Cushioned)");
        InsertTexture(5, "St, Maries (Cushioned)");
        InsertTexture(6, "Blandsville & Blankerston (Cushioned)");
        InsertTexture(7, "DLMR (Cushioned)");
        InsertTexture(8, "AN (Cushioned)");
        InsertTexture(9, "OC&G (Cushioned)");
    }

    @Override
    public String getInventoryName() {
        return "ACF Railbox Boxcar (Cushioned)";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.9F;
    }

    @Override
    public String transportYear() {
        return "1974-1980";
    }
}
