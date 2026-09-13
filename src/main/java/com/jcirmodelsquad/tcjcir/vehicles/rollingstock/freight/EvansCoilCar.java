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
    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]{

                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_coils", "Large Steel Coil Spools",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_round_GTW", "Grand Trunk Western RR (Rounded Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0, 3, 0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_megacover_GTW", "Grand Trunk Western (Mega Cover)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_AGW", "Adelante Great Western",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_round_ATSF", "Atchison Topeka & Santa Fe",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_CR", "Conrail (Angled Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_round_CR", "Conrail (Rounded Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_ribbed_CR", "Conrail (Ribbed Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_round_DTI", "Detroit, Toledo and Ironton (Rounded Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_fiberglass_DTI", "Detroit, Toledo and Ironton (Fiberglass Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_IC", "Illinois Central",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_MILW", "Milwaukee Road",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_fiberglass_MKT", "Missouri-Kansas-Texas",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_NW", "Norfolk & Western",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_RDG", "Reading Company",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_CRIP", "Rock Island",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_SLSF", "Frisco",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_SOU", "Southern",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_SP", "Southern Pacific",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_blank", "Blandsville & Blankerston RR (Angled Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_round_blank", "Blandsville & Blankerston RR (Rounded Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_fiberglass_blank", "Blandsville & Blankerston RR (Fiberglass Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_megacover_blank", "Blandsville & Blankerston RR (Mega Cover)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_angled_CHSY", "Chessie System (Angled Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_round_CHSY", "Chessie System (Rounded Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_fiberglass_CHSY", "Chessie System (Fiberglass Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_round_CSX", "CSX (Rounded Covers, Yellow Ends)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_round_CSX2", "CSX (Rounded Covers)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_megacover_CSX", "Grand Trunk Western (Mega Cover, Yellow Ends)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },
                {new CargoSpecification(ModelEvansCoilCar_Covers.class,
                        "trains/coilcar_covers/evanscoilcover_megacover_CSX2", "Grand Trunk Western (Mega Cover)",
                        new CargoSpecification.RenderParameters().setOffset(0,3,0)),
                },

        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "GTW");
        InsertTexture(1, "AGW");
        InsertTexture(2, "ATSF");
        InsertTexture(3, "CR (Early)");
        InsertTexture(4, "CR (Late)");
        InsertTexture(5, "DT&I (Early)");
        InsertTexture(6, "DT&I (Late)");
        InsertTexture(7, "IC");
        InsertTexture(8, "MILW");
        InsertTexture(9, "MKT");
        InsertTexture(10, "N&W");
        InsertTexture(11, "RDG");
        InsertTexture(12, "CRIP");
        InsertTexture(13, "SLSF");
        InsertTexture(14, "SOU");
        InsertTexture(15, "SP");
        InsertTexture(16, "B&B (Early)");
        InsertTexture(17, "B&B (Late)");
        InsertTexture(18, "B&B (Early, With Chessie System Bulkhead)");
        InsertTexture(19, "B&B (Late, With CSX Railings)");
        InsertTexture(20, "Chessie System");
        InsertTexture(21, "CSX (Early)");
        InsertTexture(22, "CSX (Early, With Chessie System Bulkhead)");
        InsertTexture(23, "CSX (Late, With CSX Railings)");
    }

    @Override
    public String getInventoryName() {
        return "Evans Coil Car";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.88F;
    }

    @Override
    public String transportYear() {
        return "1964-1990";
    }
}