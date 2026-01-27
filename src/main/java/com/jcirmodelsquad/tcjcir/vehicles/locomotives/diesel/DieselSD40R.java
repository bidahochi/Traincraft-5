package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;


public class DieselSD40R extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD40R;
    }
    public DieselSD40R(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "Southern Pacific (Early)");
        InsertTexture(1, "Southern Pacific (Late)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "CSLX");
        initOverlayTextures();
        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Engine Number",
                11, 8, 3, EnumOverlayFonts.BapSansMid, 7f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }



    @Override
    public String getInventoryName() {
        return "EMD SD40R";
    }

    

    
    

}
