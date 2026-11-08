package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class DieselDT662000 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDT662000;
    }
    public DieselDT662000(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "MN&S");
        InsertTexture(1, "MN&S (late)");
        InsertTexture(2, "DSSA");
        InsertTexture(3, "DSSA (late)");
        InsertTexture(4, "DSSA (SOO patch)");
        InsertTexture(5, "SOO (maroon)");
        InsertTexture(6, "SOO");
        InsertTexture(7, "SSW (early scheme)");
        InsertTexture(8, "EJ&E (early)");
        InsertTexture(9, "EJ&E");
        InsertTexture(10, "EJ&E (ex BLW 2001)");
        InsertTexture(11, "EJ&E (118 late)");
        InsertTexture(12, "BLW 2000");
        InsertTexture(13, "BLW 2001");
        InsertTexture(14, "TRC (early)");
        InsertTexture(15, "TRC");
        InsertTexture(16, "TRC (late)");
        InsertTexture(17, "PBCC 50 (early)");
        InsertTexture(18, "PBCC 50");
        InsertTexture(19, "PBCC 51 (early)");
        InsertTexture(20, "PBCC 51");
        InsertTexture(21, "ATSF (early)");
        InsertTexture(22, "ATSF");
        InsertTexture(23, "ATSF (late)");
        InsertTexture(24, "ATSF (small dynamics, early)");
        InsertTexture(25, "ATSF (small dynamics)");
        InsertTexture(26, "ATSF (small dynamics, late)");
        InsertTexture(27, "ATSF (dynamics, early)");
        InsertTexture(28, "ATSF (dynamics)");
        InsertTexture(29, "ATSF (dynamics, late)");
        InsertTexture(30, "ATSF (ex BLW 2000)");
        InsertTexture(31, "AGW");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
        
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.02, 0.24, -0.5); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.55F; }

    @Override
    public String transportYear() {
        return "1948-1950";
    }

    @Override
    public String getInventoryName() {
        return "BLW DT-6-6-2000";
    }



}
