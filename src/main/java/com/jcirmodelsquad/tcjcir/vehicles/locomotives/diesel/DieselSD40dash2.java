package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;


public class DieselSD40dash2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD40dash2;
    }
    public DieselSD40dash2(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "LLPX");
        InsertTexture(1, "Burlington Northern");
        InsertTexture(2, "Avanste Northeastern (Yard Service)", LockoutGroup.ANE);
        InsertTexture(3, "Avanste Northeastern (Road Service)", LockoutGroup.ANE);
        InsertTexture(4, "Union Pacific");
        InsertTexture(5, "BNSF");
        InsertTexture(6, "BNSF");
        InsertTexture(7, "Milwaukee Road");
        InsertTexture(8, "Milwaukee Road (Icebreakers)");
        InsertTexture(9, "Milwaukee Road (Bicentennial)");
        InsertTexture(10, "Rock Island");
        InsertTexture(11, "NdeM");
        InsertTexture(12, "Norfolk Southern");
        InsertTexture(13, "Norfolk Southern (Ex-N&W)");
        InsertTexture(14, "Norfolk Southern (Ex-SOU)");
        InsertTexture(15, "Blandsville & Blankerston");
        InsertTexture(16, "CSLX");
        InsertTexture(17, "CSX (Yn3 RCO)");
        InsertTexture(18, "Fort Worth Western Railroad");
        InsertTexture(19, "FURRX");
        InsertTexture(20, "FURRX");
        InsertTexture(21, "CSLX (EX CSWR)");
        InsertTexture(22, "ATSF (Freightbonnet)");
        InsertTexture(23, "ATSF (Freightbonnet)");
        InsertTexture(24, "Morristown Tenneva and Southern");
        InsertTexture(25, "Morristown Tenneva and Southern (High Hood)");
        InsertTexture(26, "Kansas City Southern");
        InsertTexture(27, "Florida East Coast");
        InsertTexture(28, "CSXT (YN2)");
        InsertTexture(29, "Great Lakes & Northern Territories");
        InsertTexture(30, "Plainview");
        InsertTexture(31, "FURRX");
        InsertTexture(32, "Wesser Valley");
        InsertTexture(33, "CSX (Yn3 Non-RCO)");
        InsertTexture(34, "Chicago and North Western");
        InsertTexture(35, "Seaboard System");
        InsertTexture(36, "Southern");
        InsertTexture(37, "Chessie System");
        initOverlayTextures();
        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Engine Number",
                11, 8, 3, EnumOverlayFonts.BapSansSmall, 7f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(31, 13), new Point(90, 13) }
        ));
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
        double distance = 3.1;
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F; }

    @Override
    public String transportYear() {
        return "1972-1989";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD40-2";
    }

}