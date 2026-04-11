package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import com.jcirmodelsquad.tcjcir.models.pantos.Modelpanto_gm6c_down;
import com.jcirmodelsquad.tcjcir.models.pantos.Modelpanto_gm6c_downup;
import com.jcirmodelsquad.tcjcir.models.pantos.Modelpanto_gm6c_up;
import com.jcirmodelsquad.tcjcir.models.pantos.Modelpanto_gm6c_updown;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricGM6C_2 extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricGM6C_2;
    }
    public ElectricGM6C_2(World world) {
        super(world);
        InsertTexture(0, "EMDX Demo");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Conrail");
        InsertTexture(3, "Norfolk Southern");
        InsertTexture(4, "Norfolk Southern (Later in Life)");
        InsertTexture(5, "FNCC (KIT-Lm, Non Canon)", LockoutGroup.FNCC);
        InsertTexture(6, "FNCC E630 (TNRJ 6 Years Celebration Unit, Non Canon)", LockoutGroup.FNCC);

        setCargoManager(new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(Modelpanto_gm6c_down.class, "pantopart_gm6c",
                        "Pantograph (Both Down)", 0, 3.085, 0)},
                { new CargoSpecification(Modelpanto_gm6c_updown.class, "pantopart_gm6c",
                        "Pantograph (Up Down)", 0, 3.085, 0)},
                { new CargoSpecification(Modelpanto_gm6c_downup.class, "pantopart_gm6c",
                        "Pantograph (Down Up)", 0, 3.085, 0)},
                { new CargoSpecification(Modelpanto_gm6c_up.class, "pantopart_gm6c",
                        "Pantograph (Both Up)", 0, 3.085, 0)},

        }).setDefaultOverride(1));
    }

    @Override
    public float transportMetricHorsePower()
    {
        return 6000;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.8, -0.10, -0.35); }

    @Override
    public String getInventoryName() {
        return "EMD GM6C";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.45F;
    }

}
