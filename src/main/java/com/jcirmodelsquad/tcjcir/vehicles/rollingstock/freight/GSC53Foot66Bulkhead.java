package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.ModelMixedLogs_gsi_53_short;
import com.jcirmodelsquad.tcjcir.models.loads.ModelWrappedWoodOptimized_bulkhead_slice_For53Ft;
import com.jcirmodelsquad.tcjcir.models.loads.Modelgsi_53_bulk_stakes;
import com.jcirmodelsquad.tcjcir.models.loads.Modelpipeload1;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class GSC53Foot66Bulkhead extends AbstractStandardFreightCar
{
    public GSC53Foot66Bulkhead(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
        {
            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//washaska wood
                    "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//washaska wood 2
                    "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//tolko wood
                    "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//canfor wood
                    "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//blank wood
                    "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//foggy woob
                    "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Thick & Thin
                    "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Oak
                    "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Spruce
                    "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Birch
                    "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Jungle
                    "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Acacia
                    "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Dark Oak
                    "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Pine
                    "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Redwood
                    "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Fir
                    "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 1.87, 0),},

            { new CargoSpecification(Modelpipeload1.class,
                    "loads/pipe_falling_sfx_1", "Pipes", 0, 2.5, 0) },

            { new CargoSpecification(ModelMixedLogs_gsi_53_short.class,
                    "loads/MixedLogs_Spruce", "Spruce Logs", 0, 2.5, 0),
                    new CargoSpecification(Modelgsi_53_bulk_stakes.class,
                            "loads/gsi_53_bulk_stakes", "Spruce Logs", 0, 3, 0) },

            { new CargoSpecification(ModelMixedLogs_gsi_53_short.class,
                    "loads/MixedLogs_Oak", "Oak Logs", 0, 2.5, 0),
                    new CargoSpecification(Modelgsi_53_bulk_stakes.class,
                            "loads/gsi_53_bulk_stakes", "Oak Logs", 0, 3, 0) },

            { new CargoSpecification(ModelMixedLogs_gsi_53_short.class,
                    "loads/MixedLogs_Redwood", "Redwood Logs", 0, 2.5, 0),
                    new CargoSpecification(Modelgsi_53_bulk_stakes.class,
                            "loads/gsi_53_bulk_stakes", "Redwood Logs", 0, 3, 0) },

            { new CargoSpecification(ModelMixedLogs_gsi_53_short.class,
                    "loads/MixedLogs_Pine", "Pine Logs", 0, 2.5, 0),
                    new CargoSpecification(Modelgsi_53_bulk_stakes.class,
                            "loads/gsi_53_bulk_stakes", "Pine Logs", 0, 3, 0) },

            { new CargoSpecification(ModelMixedLogs_gsi_53_short.class,
                    "loads/MixedLogs_Fir", "Fir Logs", 0, 2.5, 0),
                    new CargoSpecification(Modelgsi_53_bulk_stakes.class,
                            "loads/gsi_53_bulk_stakes", "Fir Logs", 0, 3, 0) },

            { new CargoSpecification(ModelMixedLogs_gsi_53_short.class,
                    "loads/MixedLogs_Jungle", "Jungle Logs", 0, 2.5, 0),
                    new CargoSpecification(Modelgsi_53_bulk_stakes.class,
                            "loads/gsi_53_bulk_stakes", "Jungle Logs", 0, 3, 0) },

            { new CargoSpecification(ModelMixedLogs_gsi_53_short.class,
                    "loads/MixedLogs_Birch", "Birch Logs", 0, 2.5, 0),
                    new CargoSpecification(Modelgsi_53_bulk_stakes.class,
                            "loads/gsi_53_bulk_stakes", "Birch Logs", 0, 3, 0) },

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Douglas Fir
                    "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Sitka Spruce
                    "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 1.87, 0),},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,//Western Red Cedar
                    "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice_For53Ft.class,
                            "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 1.87, 0),},
        });//why its auto indenting is beyond me but whoever decided it should do that is a fucking retard
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "ICG");
        InsertTexture(1, "GN");
        InsertTexture(2, "NP");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "Minneapolis and St. Louis");
        InsertTexture(5, "AGW");
    }

    @Override
    public String getInventoryName() {
        return "GSC 53' Bulkhead Flatcar (6' 6\" Bulkhead)";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.6F;
    }

    @Override
    public String transportYear() {
        return "1954-1967";
    }
}