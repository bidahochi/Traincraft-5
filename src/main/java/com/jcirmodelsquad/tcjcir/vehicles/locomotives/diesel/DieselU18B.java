package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU18B extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:u18b")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_150", "marker_body_151", "marker_body_162",
            "marker_body_163")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_100", "numberboard_body_45", "numberboard_body_46",
            "numberboard_body_99")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU18B;
    }
    public DieselU18B(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "MEC 405");
        InsertTexture(1, "MEC 402");
        InsertTexture(2, "PW 1801 (As Delivered)");
        InsertTexture(3, "PW 1801 (Early)");
        InsertTexture(4, "Blandsville & Blankerston");
        InsertTexture(5, "Pickens Railway");
        InsertTexture(6, "CSXT MOW");
        InsertTexture(7, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(8, "West Creek Pacific");
        InsertTexture(9, "Seaboard Coast Line");
        InsertTexture(10, "Seaboard System");
        InsertTexture(11, "Seaboard System (Family Lines)");
        InsertTexture(12, "SCL Blank");
        InsertTexture(13, "Texas Utilities");
        InsertTexture(14, "Texas Utilities (RCO Gear)");
        //InsertTexture(16, "NEP");
        InsertTexture(16, "NDEM (Red & Olive)");
        InsertTexture(17, "FMN (Two Tone Blue)");
        InsertTexture(18, "CSXT");
        InsertTexture(19, "CSXT");
        InsertTexture(20, "CSXT");
        InsertTexture(21, "CSXT");
        InsertTexture(22, "CSXT");
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
        double distance = 2.6;
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
        //System.out.println(rotationCos1+" "+rotationSin1);
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String transportYear() {
        return "1973-1976";
    }

    @Override
    public String getInventoryName() {
        return "GE U18B";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
