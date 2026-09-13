package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselPA1 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:alcopa1")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_l_type_1", "marker_l_type_2", "marker_l_type_3",
            "marker_r_type_1", "marker_r_type_2", "marker_r_type_3")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselPA1;
    }
    public DieselPA1(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Santa Fe");
        InsertTexture(1, "Santa Fe (Late)");
        InsertTexture(2, "Demonstrator");
        InsertTexture(3, "Nickel Plate Road (Early)");
        InsertTexture(4, "Nickel Plate Road");
        InsertTexture(5, "Wabash");
        InsertTexture(6, "Denver & Rio Grande Western");
        InsertTexture(7, "Denver & Rio Grande Western (4 Stripe)");
        InsertTexture(8, "Southern Pacific");
        InsertTexture(9, "Cotton Belt");
        InsertTexture(10, "New Haven");
        InsertTexture(11, "New Haven (Reverse McGinnis)");
        InsertTexture(12, "Pennsylvania Railroad");
        InsertTexture(13, "Union Pacific");
        InsertTexture(14, "Demonstrator (Canadian)");
        InsertTexture(15, "CN (Semi-fictional)");
        InsertTexture(16, "Missouri Pacific");
        InsertTexture(17, "Missouri Pacific (Jenks Blue)");
        InsertTexture(18, "Missouri-Kansas-Texas (Shadowlined)");
        InsertTexture(19, "Missouri-Kansas-Texas");
        InsertTexture(20, "New York Central");
        InsertTexture(21, "Pittsburgh & Lake Erie");
        InsertTexture(22, "Lehigh Valley");
        InsertTexture(23, "American Freedom Train");
        InsertTexture(24, "Generic");
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
        double distance = 3.3;
        double yOffset = 0.14;
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F;
    }



    @Override
    public String getInventoryName() {
        return "Alco PA-1";
    }





    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}
