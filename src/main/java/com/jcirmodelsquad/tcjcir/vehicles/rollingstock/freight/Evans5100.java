package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Evans5100 extends AbstractStandardFreightCar
{
    public Evans5100(World world) {
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
        InsertTexture(0, "Evans Demo (USLX)");
        InsertTexture(1, "PMA (USLX)");
        InsertTexture(2, "PMA (USLX) 2");
        InsertTexture(3, "Ogden (USLX)");
        InsertTexture(4, "Purina (USLX)");
        InsertTexture(5, "PIMP");
        InsertTexture(6, "BCOL");
        InsertTexture(7, "Georgia Pacific");
        InsertTexture(8, "Sargento (WSOR)");
        InsertTexture(9, "WSOR");
        InsertTexture(10, "UP");
        InsertTexture(11, "SFLC");
        InsertTexture(12, "IC");
        InsertTexture(13, "MP");
        InsertTexture(14, "FWD");
        InsertTexture(15, "MNS");
        InsertTexture(16, "ITC");
        InsertTexture(17, "GT");
        InsertTexture(18, "CNW (Red)");
        InsertTexture(19, "TPW");
        InsertTexture(20, "Blandsville & Blankerston (USRE Ends)");
        InsertTexture(21, "Aloha Shake (USLX)");
        InsertTexture(22, "PMA (USLX) 3");
        InsertTexture(23, "Louisiana Pacific");
        InsertTexture(24, "CNW (Yellow)");
        InsertTexture(25, "BM");
        InsertTexture(26, "Blandsville & Blankerston (PS Ends)");
        InsertTexture(27, "");
    }

    @Override
    public String getInventoryName() {
        return "Evans-USRE 5100 Cu Ft Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.875F;
    }

    @Override
    public String transportYear() {
        return "1969-1977";
    }
}
