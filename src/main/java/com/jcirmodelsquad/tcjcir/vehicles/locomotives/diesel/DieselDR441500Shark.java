package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class DieselDR441500Shark extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDR441500Shark;
    }
    public DieselDR441500Shark(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Demonstrator");
        InsertTexture(1, "Elgin, Joliet & Eastern");
        InsertTexture(2, "Baltimore & Ohio");
        InsertTexture(3, "Baltimore & Ohio (Late)");
        InsertTexture(4, "Baltimore & Ohio (Late, with plow)");
        InsertTexture(5, "Blandsville & Blankerston");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.8, 0.3, -0.37); }


    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.08F;
    }

    @Override
    public String getInventoryName() {
        return "BLW DR-4-4-1500 (Phase 3)";
    }





}
