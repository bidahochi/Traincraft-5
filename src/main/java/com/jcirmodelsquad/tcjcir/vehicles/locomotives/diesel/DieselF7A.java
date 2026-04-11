package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;


public class DieselF7A extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF7A;
    }
    public DieselF7A(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the benis sus
        InsertTexture(0, "PC (Ex NYC)");
        InsertTexture(1, "Mesa Desert");
        InsertTexture(2, "DRGW (Black with yellow stripes)");
        InsertTexture(3, "DRGW (4 stripe)");
        InsertTexture(4, "DRGW (4 stripe, late)");
        InsertTexture(5, "DRGW (1 stripe)");
        InsertTexture(6, "Amtrak (Ex NP)");
        InsertTexture(7, "Amtrak (Ex NP)");
        InsertTexture(8, "ATSF (Bluebonnet)");
        InsertTexture(9, "ATSF (As Delivered)");
        InsertTexture(10, "ATSF (Early)");
        InsertTexture(11, "ATSF (Rebuilt)");
        InsertTexture(12, "ATSF (Yellowbonnet 1)");
        InsertTexture(13, "ATSF (Yellowbonnet 2)");
        InsertTexture(14, "MMID 100");
        InsertTexture(15, "MMID 101");
        InsertTexture(16, "NYC (Early)");
        InsertTexture(17, "NYC (Black)");
        InsertTexture(18, "EMD Demonstrator");
        InsertTexture(19, "WM (Speed Lettering)");
        InsertTexture(20, "WM (Circus");
        InsertTexture(21, "WM (Fireball)");
        InsertTexture(22, "CB&Q (With coupler cover)");
        InsertTexture(23, "CB&Q");
        InsertTexture(24, "CB&Q (Late, with coupler cover)");
        InsertTexture(25, "CB&Q (Late)");
        InsertTexture(26, "MILW (Grey scheme)");
        InsertTexture(27, "Conrail Blue");
        InsertTexture(28, "SP Black Widow");
        InsertTexture(29, "SP Scarlet (Bloodynose)");
        InsertTexture(30, "Pennsylvania Railroad (As Delivered)");
        InsertTexture(31, "Southern (Black)");
        InsertTexture(32, "Southern (Green)");
        InsertTexture(33, "Southern (As Delivered)");
    }

    @Override
    public float transportMetricHorsePower()
    {
        return 1500;
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.4, 0.19, -0.35); }

    @Override
    public String transportYear() {
        return "1949-1953";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.91F;
    }

    @Override
    public String getInventoryName() {
        return "EMD F7a";
    }

    @Override
    public int getTankCapacity()
    {
        return 10000;
    }


    

}
