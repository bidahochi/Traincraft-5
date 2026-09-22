package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselF9A extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF9A;
    }
    public DieselF9A(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "BN 814");
        InsertTexture(1, "FMSR", LockoutGroup.FMSR);
        InsertTexture(2, "FNCC (Ex NP)", LockoutGroup.FNCC);
        InsertTexture(3, "EMD Demonstrator");
        InsertTexture(4, "Norfolk Southern");
        InsertTexture(5, "DRGW (4 stripe)");
        InsertTexture(6, "DRGW (4 stripe, late)");
        InsertTexture(7, "DRGW (1 stripe)");
        InsertTexture(8, "SP Scarlet (Bloodynose)");
        InsertTexture(9, "TNO/SP Blackwidow");
        InsertTexture(10, "TNO Halloween Scheme");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.4, 0.19, -0.35); }
    

    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.91F;
    }

    @Override
    public String transportYear() {
        return "1953-1960";
    }

    @Override
    public String getInventoryName() {
        return "EMD F9a";
    }






}
