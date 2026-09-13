package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.*;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.enums.CargoItemFilter;

public class FMCWoodchip extends AbstractStandardFreightCar
{
    public FMCWoodchip(World world) {
        super(world);
        cargoFilterCategory = CargoItemFilter.WOOD_CHIPS;
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
                {
                        {new CargoSpecification(Modelfmcwoodchip_load1.class,
                                "loads/fmcwoodchip_woodchips", "Woodchips load 1", new CargoSpecification.RenderParameters().setOffset(0.0, 3.0, 0)), },
                        {new CargoSpecification(Modelfmcwoodchip_load2.class,
                                "loads/fmcwoodchip_woodchips", "Woodchips load 2", new CargoSpecification.RenderParameters().setOffset(0.0, 3.0, 0)), },
                        {new CargoSpecification(Modelfmcwoodchip_load3.class,
                                "loads/fmcwoodchip_flat", "Woodchips load 3", new CargoSpecification.RenderParameters().setOffset(0.0, 3.05, 0)), },
                        {new CargoSpecification(Modelfmcwoodchip_load3.class,
                                "loads/fmcwoodchip_tarp", "Tarp Cover", new CargoSpecification.RenderParameters().setOffset(0.0, 3.0, 0)), },
                });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "Blandsville & Blankerston");
        InsertTexture(1, "FNCC (Big Wording)");
        InsertTexture(2, "FNCC (Herald)");
        InsertTexture(3, "FNCC (Herald Black)");
        InsertTexture(4, "Northern Pacific 1");
        InsertTexture(5, "Northern Pacific 2");
        InsertTexture(6, "Great Northern");
        InsertTexture(7, "Union Pacific 1");
        InsertTexture(8, "Union Pacific 2");
        InsertTexture(9, "THE Milwaukee Road");
        InsertTexture(10, "BN 1");
        InsertTexture(11, "BN 2");
        InsertTexture(12, "BN 3");
        InsertTexture(13, "BN 4");
        InsertTexture(14, "B&B tall end brakewheel");
        InsertTexture(15, "B&B Low end brakewheel");
        InsertTexture(16, "B&B Side brakewheel");
        InsertTexture(17, "B&B Side brake ratchet");
    }

    @Override
    public String getInventoryName() {
        return "Gunderson-FMC Woodchip Hopper";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.825F;
    }

    @Override
    public String transportYear() {
        return "1967-70";
    }
}
