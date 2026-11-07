package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class DieselRT624 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRT624;
    }
    public DieselRT624(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "PRR");
        InsertTexture(1, "PRR (dynamics)");
        InsertTexture(2, "PRR (no trainphone)");
        InsertTexture(3, "PRR (small battery box)");
        InsertTexture(4, "PRR (small battery box, late)");
        InsertTexture(5, "MN&S");
        InsertTexture(6, "EJ&E (repower of DT-6-6-2000)");
        InsertTexture(7, "EJ&E (repower of DT-6-6-2000, new radiators)");
        InsertTexture(8, "EJ&E (repower of DT-6-6-2000, ex BLW 2001)");
        InsertTexture(9, "EJ&E (repower of DT-6-6-2000, engine heater)");
        InsertTexture(10, "EJ&E (repower of DT-6-6-2000, alternate paint scheme)");
        InsertTexture(11, "EJ&E (repower of DT-6-6-2000, engine heater, new radiators)");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
        
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.02, 0.24, -0.5); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.55F; }

    @Override
    public String transportYear() {
        return "1951-1954";
    }

    @Override
    public String getInventoryName() {
        return "BLH RT-624";
    }



}
