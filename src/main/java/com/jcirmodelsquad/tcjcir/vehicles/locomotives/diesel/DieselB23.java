package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselB23 extends DieselTrain {


    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselB23; }

    public DieselB23(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Franklin Industrial Minerals (FIMX Early)");
        InsertTexture(1, "Southern Pacific (Early)");
        InsertTexture(2, "Southern Pacific (Late)");
        InsertTexture(3, "FNCC (KIT-L, 1st Order)", LockoutGroup.FNCC);
        InsertTexture(4, "FNCC (KIT-L, 2nd Order)", LockoutGroup.FNCC);
        InsertTexture(5, "FNCC (KIT80, 1nd Order)", LockoutGroup.FNCC);
        InsertTexture(6, "Blandsville & Blankerston");
        InsertTexture(7, "Western Pacific");
        InsertTexture(8, "Western Pacific (Post 90s)");
        InsertTexture(9, "CSXT (YN1)");
        InsertTexture(10, "Conrail");
        InsertTexture(11, "Norfolk Southern");
        InsertTexture(12, "Union Pacific (CCRCL)");
        InsertTexture(13, "Staff Storage Mountain Co.");
        InsertTexture(14, "USSC");
        InsertTexture(15, "CSXT (YN2)");
        InsertTexture(16, "Union Pacific");
        InsertTexture(17, "Providence & Worcester");
        InsertTexture(18, "Fox Union Rail Resources (FURRX)");
        InsertTexture(19, "Camas Prairie Railnet");
        InsertTexture(20, "Finger Lakes");
        InsertTexture(21, "Finger Lakes (Ex Camas Prairie)");
        InsertTexture(22, "AOK");
        InsertTexture(23, "ADT (Ex UP)"/*, LockoutGroup.ADT*/);
        InsertTexture(24, "ADT (Ex NS)"/*, LockoutGroup.ADT*/);
        InsertTexture(25, "ADT"/*, LockoutGroup.ADT*/);
        InsertTexture(26, "BNSF H1 (Ex ATSF)");
        InsertTexture(27, "Atlas & Red Sands Railroad", LockoutGroup.BIDA);
        InsertTexture(28, "Magnolia", LockoutGroup.MAG);
        InsertTexture(29, "CNRC 1901 & 1903 (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(30, "CNRC 1902 (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(31, "CSXT (Stealth)");
        InsertTexture(32, "CSXT (Bluedown)");
        InsertTexture(33, "Seaboard");
        InsertTexture(34, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F; }

    @Override
    public String getInventoryName() { return "GE B23-7"; }

    @Override
    public String transportYear() {
        return "1977-1984";
    }



}
