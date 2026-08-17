package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselH16_66 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:fmh16_66")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_fl", "marker_fm_body_479", "marker_fm_body_484",
            "marker_fm_body_486", "marker_fm_body_527", "marker_fr",
            "marker_rl", "marker_rm", "marker_rr")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselH16_66;
    }
    public DieselH16_66(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "TVA");
        InsertTexture(1, "Chicago Northwestern (Stripes)");
        InsertTexture(2, "Chicago Northwestern (No Stripes)");
        InsertTexture(3, "Chicago Northwestern");
        InsertTexture(4, "Chicago Northwestern (Zito Yellow)");
        InsertTexture(5, "TVA (Early Black)");
        InsertTexture(6, "TVA (Late Black)");
        InsertTexture(7, "The Milwaukee Road (Early)");
        InsertTexture(8, "The Milwaukee Road (Late)");
        InsertTexture(9, "Squaw Creek Coal (Yellow Steps)");
        InsertTexture(10, "Squaw Creek Coal");
        InsertTexture(11, "Canadian Pacific");
        InsertTexture(12, "DLMR", LockoutGroup.DLMR);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }


    @Override
    public void updateRiderPosition() {
        if (riddenByEntity == null) {return;}
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = 3.15;
        double yOffset = 0.15;
        float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
        float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
        if(side.isServer()){
            rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
            rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
            anglePitchClient = serverRealPitch*60;
        }
        float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
                + riddenByEntity.getYOffset() + yOffset);
        float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (this.posX + (rotationCos1 * distance));
        double bogieZ1 = (this.posZ + (rotationSin1* distance));
        if(anglePitchClient>20 && rotationCos1 == 1){
            bogieX1-=pitchRads*2;
            pitch-=pitchRads*1.2;
        }
        if(anglePitchClient>20 && rotationSin1 == 1){
            bogieZ1-=pitchRads*2 + 1;
            pitch-=pitchRads*1.2;
        }
        if (pitchRads == 0.0) {
            riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }
    }
    





    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }



    @Override
    public String getInventoryName() {
        return "FM H16-66";
    }

    
    


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}
