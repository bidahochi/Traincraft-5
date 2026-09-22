package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class DieselCF7b extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCF7b;
    }
    public DieselCF7b(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Blandsville & Blankerston");
        InsertTexture(1, "FNCC (CEE Rebuilt)", LockoutGroup.FNCC);
        InsertTexture(2, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.5, 0.1, 0.0); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F; }

    @Override
    public String getInventoryName() {
        return "EMD CF7b";
    }

    @Override
    public String transportYear() {
        return "1969-1978";
    }

    @Override
    public boolean isFictional() {
        return true;
    }


}
