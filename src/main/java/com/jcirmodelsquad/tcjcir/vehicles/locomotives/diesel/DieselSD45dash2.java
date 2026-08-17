package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSD45dash2 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sd45")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_two_body_478", "marker_two_body_482", "marker_two_body_484")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_486", "front_numberboard_body_487", "numberboard_body_225",
            "numberboard_body_226", "numberboard_body_507", "numberboard_body_508",
            "rear_numberboard_body_480", "rear_numberboard_body_481", "rear_numberboard_body_488",
            "rear_numberboard_body_489")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD45dash2;
    }
    public DieselSD45dash2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "Great Northern (Big Sky)");
        InsertTexture(1, "Great Northern (Empire Simplified");
        InsertTexture(2, "Burlington Northern");
        InsertTexture(3, "Northern Pacific");
        InsertTexture(4, "Southern Pacific (Early)");
        InsertTexture(5, "Penn Central");
        InsertTexture(6, "Denver & Rio Grande Western");
        InsertTexture(7, "Denver & Rio Grande Western");
        InsertTexture(8, "THE MILWAUKEE ROAD");
        InsertTexture(9, "THE MILWAUKEE ROAD");
        InsertTexture(10, "Chicago Northwestern");
        InsertTexture(11, "Chicago Northwestern (Zito Yellow)");
        InsertTexture(12, "Frisco");
        InsertTexture(13, "ATSF 5691 (Freightbonnet");
        InsertTexture(14, "ATSF 5712 (Freightbonnet)");
        InsertTexture(15, "ATSF (Bicentennial)");
        InsertTexture(16, "BNSF (Ex-ATSF Patched)");
        InsertTexture(17, "BNSF (H1)");
        InsertTexture(18, "BNSF (H3)");
        InsertTexture(19, "Blandsville & Blankerston (Flared Radiator)");
        InsertTexture(20, "Blandsville & Blankerston");
        InsertTexture(22, "CSXT (Yn3)");
        InsertTexture(23, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(24, "Glitter like the golden beautiful betch you are");
        InsertTexture(25, "GLC (Cigar Band)");
        InsertTexture(26, "AA (Fog)");

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
        double distance = 3.4;
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
            riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1 -0.0);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            riddenByEntity.setPosition(bogieX1, pitch, bogieZ1 +0.0);
        }
    }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.45F;
    }

    @Override
    public String transportYear() {
        return "1972-1974";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD45";
    }


    


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
