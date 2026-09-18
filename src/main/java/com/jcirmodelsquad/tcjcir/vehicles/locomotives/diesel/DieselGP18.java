package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP18 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP18;
    }
    public DieselGP18(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "NP");
        InsertTexture(1, "BN 1996");
        InsertTexture(2, "T&P");
        InsertTexture(3, "MP (highhood)");
        InsertTexture(4, "MP (chop nose)");
        InsertTexture(5, "MP (eagle repaint)");
        InsertTexture(6, "RI");
        InsertTexture(7, "IC (highhood)");
        InsertTexture(8, "IC (chop nose)");
        InsertTexture(9, "Blandsville & Blankerston");
        InsertTexture(10, "Blandsville & Blankerston");
        InsertTexture(11, "Seaboard System");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.55, 0.15, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1959-1963";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP18";
    }


}