package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class Diesel0_6_6_0_1000_2_DE_68 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.Diesel0_6_6_0_1000_2_DE_68;
    }
    public Diesel0_6_6_0_1000_2_DE_68(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CNJ");
        InsertTexture(1, "CNJ (late)");
        InsertTexture(2, "CNJ (late, #2002)");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
        
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.69, 0.18, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.98F; }

    @Override
    public String transportYear() {
        return "1946-1947";
    }

    @Override
    public String getInventoryName() {
        return "BLW 0-6-6-0 1000/2 DE-6.8";
    }



}
