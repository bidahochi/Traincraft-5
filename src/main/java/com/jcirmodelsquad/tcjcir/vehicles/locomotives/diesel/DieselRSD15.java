package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselRSD15 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:rsd15")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_457", "marker_body_458", "marker_body_474",
            "marker_body_475", "marker_body_498", "marker_body_499",
            "marker_body_586", "marker_body_587", "marker_cad_body_524",
            "marker_cad_body_525", "marker_gmd")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_375", "front_numberboard_body_376", "numberboard_chop_body_532",
            "numberboard_chop_body_533")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRSD15;
    }
    public DieselRSD15(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "FURRX (EX CSWR)");
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
        double distance = 3;
        double yOffset = 0.2;
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }



    @Override
    public String getInventoryName() {
        return "ALCo RSD-15";
    }


    


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
