package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselM630W extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM630W;
    }
    public DieselM630W(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Blandsville & Blankerston");
        InsertTexture(1, "North Fox & Yukon Route (FNCC, KIT-L, Big Canon)", LockoutGroup.FNCC);
        InsertTexture(2, "BCRail");

    }

    @Override
    public String transportCountry()
    {
        return "CA";
    }
    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.75, 0.35, -0.4); }


    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.525F;
    }



    @Override
    public String getInventoryName() {
        return "MLW M630W";
    }

    




}
