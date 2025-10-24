package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.ModelEvansCoilCar_Covers;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class EvansCoilCar extends AbstractStandardFreightCar
{
    public EvansCoilCar(World world) {
        super(world);
    }

    public EvansCoilCar(World world, double x, double y, double z){
        super(world, x , y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]{

                {new CargoSpecification(ModelEvansCoilCar_Covers.class,//huh??
                        "coilcar_covers/evanscoilcover_coils", "Steel Coil Spools",
                        new CargoSpecification.RenderParameters().setOffset(0,0,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,//huh 2??
                        "coilcar_covers/evanscoilcover_angled_blank", "Cover (Angled, Blandsville & Blankerston RR)",
                        new CargoSpecification.RenderParameters().setOffset(0,0,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,//huh 3??
                        "coilcar_covers/evanscoilcover_round_blank", "Cover (Rounded, Blandsville & Blankerston RR)",
                        new CargoSpecification.RenderParameters().setOffset(0,0,0)),
                },

        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "B&B (Early)");
        InsertTexture(1, "");
    }

    @Override
    public String getInventoryName() {
        return "Evans Coil Car";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.0F;
    }
}