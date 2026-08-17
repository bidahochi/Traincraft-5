package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselH1044 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:h1044")
        .defaults()
        .fixtureType(train.common.api.LightFixtureType.COMMANDER, "rear_commander")
        .build();

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselH1044;
    }
    public DieselH1044(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Hallet Dock Company");
        InsertTexture(1, "Union Pacific");
        InsertTexture(2, "Denver & Rio Grande");
        InsertTexture(3, "Frisco");
        InsertTexture(4, "ATSF (Zebra)");
        InsertTexture(5, "New York Central");
        InsertTexture(6, "Apache Railway");
        InsertTexture(7, "The Milwaukee Road");
        InsertTexture(8, "Garry (The First FURRX Unit)", LockoutGroup.BIDA);
        InsertTexture(9, "Chicago Northwestern");
        InsertTexture(10, "Illinois Harbor Belt");
        InsertTexture(11, "Dee Dee Valley Railroad");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.3, 0.1, -0.45); }



    



    @Override
    public String getInventoryName() {
        return "FM H10-44";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return (1.1F);
    }
    


    

}
