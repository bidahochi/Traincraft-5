package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class DieselDT662000NA extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDT662000NA;
    }
    public DieselDT662000NA(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "EJ&E");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
        
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 1.84, 0.24, -0.5); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.58F; }

    @Override
    public String transportYear() {
        return "1946";
    }

    @Override
    public String getInventoryName() {
        return "BLW DT-6-6-2000NA";
    }



}
