package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricW_A55 extends ElectricTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:w_a55")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_20", "numberboard_body_24")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricW_A55;
    }
    public ElectricW_A55(World world) {
        super(world);
        InsertTexture(0, "Generic");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.27, -0.3, 0.4); }

    

    





    @Override
    public String getInventoryName() {
        return "SEC W-A55";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.52F;
    }

    
    

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
