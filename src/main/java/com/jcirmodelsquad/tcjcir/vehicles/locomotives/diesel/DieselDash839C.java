package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselDash839C extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash839C;
    }
    public DieselDash839C(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Conrail");
        InsertTexture(1, "CSXT (YN2)");
        InsertTexture(2, "CSXT (YN3)");
        InsertTexture(3, "Norfolk Southern");
        InsertTexture(4, "Nomansi and Eastern Pacific", LockoutGroup.CUBED);
        InsertTexture(5, "Nomansi and Eastern Pacific (Late)", LockoutGroup.CUBED);
        InsertTexture(6, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(7, "Blandsville & Blankerston");
        InsertTexture(8, "Magnolia Acres", LockoutGroup.MAG);
        InsertTexture(9, "Nautilus", LockoutGroup.CUBED);
        InsertTexture(10, "Ann Arbor (but awesomer)");
        InsertTexture(11, "CEEX 101", LockoutGroup.BIDA);
        InsertTexture(12, "CNRC (Ex EARR) (Bida Fictional)"/*, LockoutGroup.CNRC*/);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.05, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F; }

    @Override
    public String transportYear() {
        return "1984-1987";
    }

    @Override
    public String getInventoryName() {
        return "GE C39-8";
    }



}
