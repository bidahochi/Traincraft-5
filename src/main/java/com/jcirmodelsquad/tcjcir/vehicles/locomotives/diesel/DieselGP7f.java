package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP7f extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP7f;
    }
    public DieselGP7f(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "ARR 1803");
        InsertTexture(1, "ARR 1807");
        InsertTexture(2, "ARR 1802");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "SNCT 401 (Protolance)", LockoutGroup.SNCT);
        InsertTexture(5, "SNCT 402 (Protolance)", LockoutGroup.SNCT);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.55, 0.1, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1949-1954";
    }

    @Override
    public String getInventoryName() {
        return "ARR GP7u";
    }


}