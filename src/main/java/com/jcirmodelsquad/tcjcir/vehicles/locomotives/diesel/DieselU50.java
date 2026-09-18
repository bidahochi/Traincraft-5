package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU50 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU50;
    }
    public DieselU50(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Union Pacific");
        InsertTexture(1, "Southern Pacific");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Southfield");
        InsertTexture(4, "Southfield De Mexico");
        InsertTexture(5, "Penn Central the objectively best railroad to own the U50 guys i swear PC owned like 30 of them trust me bro my source is that i MADE IT THE FUCK UP");
        InsertTexture(6, "hamburge helper rayroade", LockoutGroup.DLMR);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 5.3, 0.4, -0.3); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.8F;
    }

    @Override
    public String transportYear() {
        return "1963-1965";
    }

    @Override
    public String getInventoryName() {
        return "GE U50";
    }


}
