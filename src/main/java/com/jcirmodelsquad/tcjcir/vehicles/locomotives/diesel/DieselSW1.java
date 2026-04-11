package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

//haha sw1 go brrrr
public class DieselSW1 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW1;
    }
    public DieselSW1(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "MILW");
        InsertTexture(1, "Seattle & North Coast 52");
        InsertTexture(2, "Burlington Northern 91");
        InsertTexture(3, "ARR (Early)");
        InsertTexture(4, "ARR (Later)");
        InsertTexture(5, "WP");
        InsertTexture(6, "WP");
        InsertTexture(7, "Magnolia", LockoutGroup.MAG);
        InsertTexture(8, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(9, "DLMR", LockoutGroup.DLMR);
        InsertTexture(10, "DLMR", LockoutGroup.DLMR);
        InsertTexture(11, "POOP TRAIN RAILROAD");
        InsertTexture(12, "NEP", LockoutGroup.CUBED);
        InsertTexture(13, "NEP MOW", LockoutGroup.CUBED);
        InsertTexture(14, "NYC");
        InsertTexture(15, "NYC");
        InsertTexture(16, "ur mom");
        InsertTexture(17, "Deadwood & Northern (Ex FMSR)", LockoutGroup.DLMR);
        InsertTexture(18, "FMSR", LockoutGroup.FMSR);
        InsertTexture(19, "Pacific Electric / SP");
        InsertTexture(20, "Sacramento Northern / WP");
        InsertTexture(21, "FRLC", LockoutGroup.DLMR);
        InsertTexture(22, "Monon (DS-50)");
        InsertTexture(23, "Monon");
        InsertTexture(24, "Rock Island (Yellow Nose)");
        InsertTexture(25, "AOK");
    }

    @Override
    public float transportMetricHorsePower()
    {
        return 600;
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.15, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F; }

    @Override
    public String transportYear() {
        return "1939-1953";
    }

    @Override
    public String getInventoryName() {
        return "EMD SW1";
    }

    @Override
    public int getTankCapacity()
    {
        return 8000;
    }
}
