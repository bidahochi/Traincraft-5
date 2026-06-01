package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.ModelAAR50TonHopperLoad;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class AAR50TonHopper extends AbstractStandardFreightCar
{
    public AAR50TonHopper(World world)
    {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(ModelAAR50TonHopperLoad.class,
                        "loads/AAR_50Ton_hopper_load_coal", "Coal", 0, 3.05, 0) },
                { new CargoSpecification(ModelAAR50TonHopperLoad.class,
                        "loads/AAR_50Ton_hopper_load_gravel", "Gravel", 0, 3.05, 0) }
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "L&NE");
        InsertTexture(1, "ATSF");
        InsertTexture(2, "AGW");
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.75F;
    }

    @Override
    protected double getRearBogieOffset() {
        return -1D;
    }

    @Override
    protected double getFrontBogieOffset() {
        return 1D;
    }
}
