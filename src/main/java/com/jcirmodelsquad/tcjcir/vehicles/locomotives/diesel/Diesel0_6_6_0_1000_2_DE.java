package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class Diesel0_6_6_0_1000_2_DE extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.Diesel0_6_6_0_1000_2_DE;
    }
    public Diesel0_6_6_0_1000_2_DE(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "BLW 2000");
        InsertTexture(1, "BLW 2001");
        InsertTexture(2, "NdeM 6000");
        InsertTexture(3, "NdeM 6001");
        InsertTexture(4, "NdeM 6002 (early)");
        InsertTexture(5, "NdeM 6002");
        InsertTexture(6, "DPNC", LockoutGroup.DPNC);
    }

    @Override
    public String transportCountry()
    {
        return "US_MX";
    }
        
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.69, 0.27, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.98F; }

    @Override
    public String transportYear() {
        return "1945";
    }

    @Override
    public String getInventoryName() {
        return "BLW 0-6-6-0 1000/2 DE";
    }



}
