package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.Modelcoil_load3;
import com.jcirmodelsquad.tcjcir.models.loads.Modelgondola_load_flat_aggregates_large;
import com.jcirmodelsquad.tcjcir.models.loads.Modelrebar_bundle_long;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class gsco67millgon extends AbstractStandardFreightCar
{
    public gsco67millgon(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(Modelgondola_load_flat_aggregates_large.class, "loads/gondola_load_flat_aggregates_medium_dort",
                        "Aggregate - Dirt", 0, 2.7, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_large.class, "loads/gondola_load_flat_aggregates_medium_peagravel",
                        "Aggregate - Peagravel", 0, 2.7, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_large.class, "loads/gondola_load_flat_aggregates_medium_gravel",
                        "Aggregate - Gravel", 0, 2.7, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_large.class, "loads/gondola_load_flat_aggregates_medium_scrap1",
                        "Scrapmetal A", 0, 2.7, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_large.class, "loads/gondola_load_flat_aggregates_medium_scrap2",
                        "Scrapmetal B", 0, 2.7, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_large.class, "loads/gondola_load_flat_cullet2_medium",
                        "Cullet / Scrap Glass", 0, 2.7, 0)},
                { new CargoSpecification(Modelrebar_bundle_long.class, "loads/rebar_bundle2_long",
                        "Rebar Bundle", 0, 2.5, 0)},
                { new CargoSpecification(Modelcoil_load3.class, "loads/coils",
                        "Metal Coils", 0, 2.5, 0)},
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "Generic Red");
        InsertTexture(1, "Generic Green");
        InsertTexture(2, "WP");
        InsertTexture(3, "Magnolia");
        InsertTexture(4, "FNCC");
        InsertTexture(5, "DN");
        InsertTexture(6, "DLMR");
        InsertTexture(7, "GLNT");
        InsertTexture(8, "GLONTCHJ 2");
    }

    @Override
    public String getInventoryName() {
        return "GSCO 67' Drop-End Mill Gondola";
    }//GSCO 67' Mill Gondola

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.3F;
    }

    @Override
    public String transportYear() {
        return "1940-1953";
    }
}