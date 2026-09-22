package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSD50 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD50;
    }
    public DieselSD50(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CSX (YN1)");
        InsertTexture(1, "CSX (YN2)");
        InsertTexture(2, "CSX (YN3)");
        InsertTexture(3, "CR (First Order)");
        InsertTexture(4, "NS (Ex CR)");
        InsertTexture(5, "DRGW");
        InsertTexture(6, "ANE (1st & 2nd Orders) (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(7, "Blandsville & Blanklands Terminal Railroad Association");
        InsertTexture(8, "HBRY");
        InsertTexture(9, "FNCC KIT-L", LockoutGroup.FNCC);
        InsertTexture(10, "FNCC KIT80", LockoutGroup.FNCC);
        InsertTexture(11, "Seaboard System");
        InsertTexture(12, "Chessie System");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.7, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.425F; }

    @Override
    public String transportYear() {
        return "1980-1985";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD50";
    }


}
