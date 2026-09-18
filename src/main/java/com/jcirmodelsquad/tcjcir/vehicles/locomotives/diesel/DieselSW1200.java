package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

//haha sw1 go brrrr
public class DieselSW1200 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW1200;
    }
    public DieselSW1200(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Illinois Terminal");
        InsertTexture(1, "Burlington Northern");
        InsertTexture(2, "Denver & Rio Grande Western");
        InsertTexture(3, "Denver & Rio Grande Western (Late)");
        InsertTexture(4, "Chicago & North Western");
        InsertTexture(5, "Great Northern");
        InsertTexture(6, "Milwaukee Road");
        InsertTexture(7, "Minneapolis, Northfield and Southern");
        InsertTexture(8, "Great Lakes & Northern Territories");
        InsertTexture(9, "Fremont & Elkhorn Valley Railroad");
        InsertTexture(10, "West Creek Pacific");
        InsertTexture(11, "Blandsville & Blankerston");
        InsertTexture(12, "JRN");
        InsertTexture(13, "JRN (Yellow Cab)");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.08, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F; }

    @Override
    public String transportYear() {
        return "1954-1966";
    }

    @Override
    public String getInventoryName() {
        return "EMD SW1200";
    }


}
