package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselM640W extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM640W;
    }
    public DieselM640W(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "COW");
        InsertTexture(1, "COW (Special)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Kingsland Rail");

    }

    @Override
    public String transportCountry()
    {
        return "CA";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.75, 0.35, -0.4); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.525F;
    }

    @Override
    public String getInventoryName() {
        return "MLW M640W";
    }


}
