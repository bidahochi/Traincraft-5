package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselCF7round3 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCF7round3;
    }
    public DieselCF7round3(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(1, "FNCC (KIT-L, Ex ATSF, Dual Canon)", LockoutGroup.FNCC);
        InsertTexture(2, "FNCC (KIT-L, Ex ATSF, Dual Canon)", LockoutGroup.FNCC);
        InsertTexture(3, "Avanste Northeastern (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(4, "Paradox Rail 69");
        InsertTexture(5, "Drexel Co", LockoutGroup.DRXL);
        InsertTexture(6, "FURRX (EX CSWR)");
        InsertTexture(7, "West Creek Pacific");
        InsertTexture(8, "Marshwood Terminal");
        InsertTexture(9, "Lisha & Watson", LockoutGroup.LW);
        InsertTexture(10, "");
        InsertTexture(11, "");
        InsertTexture(12, "");
        InsertTexture(13, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.5, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F; }

    @Override
    public String getInventoryName() {
        return "EMD CF7 Roundcab";
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
