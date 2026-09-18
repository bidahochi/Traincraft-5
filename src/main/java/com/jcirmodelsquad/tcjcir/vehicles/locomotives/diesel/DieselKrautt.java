package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselKrautt extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselKrautt;
    }
    public DieselKrautt(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
    }

    @Override
    public String transportCountry()
    {
        return "DE";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.4, 0.2, -0.3); }
    



    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    

    @Override
    public String getInventoryName() {
        return "Krauss-Maffei ML-4000";
    }

    




}
