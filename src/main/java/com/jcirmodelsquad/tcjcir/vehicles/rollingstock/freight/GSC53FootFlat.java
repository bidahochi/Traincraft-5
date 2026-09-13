package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.ModelWrappedWoodOptimized_bulkhead_slice_For53Ft;
import com.jcirmodelsquad.tcjcir.models.loads.Modelpipeload1;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class GSC53FootFlat extends AbstractStandardFreightCar
{
    public GSC53FootFlat(World world) {
        super(world);
    }

    

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][] {

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
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "UP (1970)");
        InsertTexture(1, "UP (1962)");
        InsertTexture(2, "BN");
        InsertTexture(3, "BN (Alternate Ends)");
        InsertTexture(4, "NP (1965)");
        InsertTexture(5, "NP (1967)");
        InsertTexture(6, "Blandsville & Blankerston");
        InsertTexture(7, "Blandsville & Blankerston (Alternate Ends)");
    }

    @Override
    public String getInventoryName() {
        return "GSC 53' Flatcar";
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