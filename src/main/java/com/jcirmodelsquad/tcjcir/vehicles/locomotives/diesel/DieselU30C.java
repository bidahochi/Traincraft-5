package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU30C extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU30C;
    }
    public DieselU30C(World world) {
        super(world, LiquidManager.dieselFilter());//its like magic guys trust me

        InsertTexture(0, "Burlington Northern 5344");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(3, "FNCC (KIT80)", LockoutGroup.FNCC);
        InsertTexture(4, "Southern Pacific");
        InsertTexture(5, "Rock Island");
        InsertTexture(6, "Deadwood & La Mesa", LockoutGroup.DLMR);
        InsertTexture(7, "West Creek Pacific");
        InsertTexture(8, "Boston & Maine 663 (Guilford)");
        InsertTexture(9, "AGW", LockoutGroup.AGW);
        InsertTexture(10, "GCM", train.common.enums.LockoutGroup.GCM);
        InsertTexture(11, "Chicago and North Western");
        InsertTexture(12, "CSXT (Stealth)");
        InsertTexture(13, "CSXT (Bluedown)");
        InsertTexture(14, "Seaboard System");
        InsertTexture(15, "Chessie System");
    }


    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.6, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.65F;
    }

    @Override
    public String transportYear() {
        return "1966-1976";
    }

    @Override
    public String getInventoryName() {
        return "GE U30C";
    }


}
