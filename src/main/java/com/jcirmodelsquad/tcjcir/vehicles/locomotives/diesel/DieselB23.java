package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class DieselB23 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselB23;
    }
    public DieselB23(World world) {
        super(world, EnumTrains.B23.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Franklin Industrial Minerals (FIMX Early)");
        InsertTexture(1, "Southern Pacific (Early)");
        InsertTexture(2, "Southern Pacific (Late)");
        InsertTexture(3, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(4, "Blandsville & Blankerston");
        InsertTexture(5, "Western Pacific");
        InsertTexture(6, "Western Pacific (Post 90s)");
        InsertTexture(7, "CSXT (YN1)");
        InsertTexture(8, "Conrail");
        InsertTexture(9, "Norfolk Southern");
        InsertTexture(10, "Union Pacific (CCRCL)");
        InsertTexture(11, "Staff Storage Mountain Co.");
        InsertTexture(12, "USSC");
        InsertTexture(13, "CSXT (YN2)");
        InsertTexture(14, "Union Pacific");
        InsertTexture(15, "Providence & Worcester");
        InsertTexture(16, "Fox Union Rail Resources (FURRX)");
        InsertTexture(17, "Camas Prairie Railnet");
        InsertTexture(18, "Finger Lakes");
        InsertTexture(19, "Finger Lakes (Ex Camas Prairie)");
        InsertTexture(20, "AOK");
        InsertTexture(21, "ADT (Ex UP)");
        InsertTexture(22, "ADT (Ex NS)");
        InsertTexture(23, "ADT");
        InsertTexture(24, "BNSF H1 (Ex ATSF)");
        InsertTexture(25, "Atlas & Red Sands Railroad");
        InsertTexture(26, "Magnolia");
        InsertTexture(27, "CNRC 1901 & 1903", LockoutGroup.CNRC);
        InsertTexture(28, "CNRC 1902", LockoutGroup.CNRC);
        InsertTexture(29, "CSXT (Stealth)");
        InsertTexture(30, "CSXT (Bluedown)");
        InsertTexture(31, "Seaboard");
    }
    public DieselB23(World world, double d, double d1, double d2){
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    
    @Override
    public void updateRiderPosition() {
        if (riddenByEntity == null) {return;}
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = 3.2; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
        double distanceLR = -0.35; //how far left/right on the entity you ride; left > 0; right < 0;
        double yOffset = 0.25;
        float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
        float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
        float rotationCosLR1 = (float) Math.cos(Math.toRadians(this.renderYaw));
        float rotationSinLR1 = (float) Math.sin(Math.toRadians((this.renderYaw)));
        if(side.isServer()){
            rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
            rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
            rotationCosLR1 = (float) Math.cos(Math.toRadians(this.serverRealRotation));
            rotationSinLR1 = (float) Math.sin(Math.toRadians((this.serverRealRotation)));
            anglePitchClient = serverRealPitch*60;
        }
        float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
                + riddenByEntity.getYOffset() + yOffset);
        float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (this.posX + (rotationCos1 * distance) + (rotationCosLR1 * distanceLR));
        double bogieZ1 = (this.posZ + (rotationSin1* distance) + (rotationSinLR1 * distanceLR));
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }

    

    @Override
    public String getInventoryName() {
        return "GE B23-7";
    }

    


    

}
