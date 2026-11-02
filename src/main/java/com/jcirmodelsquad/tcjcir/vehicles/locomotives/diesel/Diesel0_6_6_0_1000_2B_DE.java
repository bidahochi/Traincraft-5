package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class Diesel0_6_6_0_1000_2B_DE extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.Diesel0_6_6_0_1000_2_DE;
    }
    public Diesel0_6_6_0_1000_2B_DE(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "BLW 2000B");
        InsertTexture(1, "DPNC", LockoutGroup.DPNC);
    }

    @Override
    public boolean isFictional() {
        return true;
    }
        
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.73, 0.21, -0.48); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.90F; }

    @Override
    public String transportYear() {
        return "1945";
    }

    @Override
    public String getInventoryName() {
        return "BLW 0-6-6-0 1000/2B DE";
    }



}
