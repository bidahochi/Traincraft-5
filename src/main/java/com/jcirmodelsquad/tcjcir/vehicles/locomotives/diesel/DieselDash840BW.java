package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselDash840BW extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash840BW;
    }
    public DieselDash840BW(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "ATSF");
        InsertTexture(1, "borgborg");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(4, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(5, "Coyote & Fort Woods (Bida Freelance)");
        InsertTexture(6, "");
        InsertTexture(7, "");
        InsertTexture(8, "");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.7, 0.35, -0.35); }
    

    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }

    @Override
    public String transportYear() {
        return "1988-1992";
    }

    @Override
    public String getInventoryName() {
        return "GE Dash 8-40BW";
    }


}
