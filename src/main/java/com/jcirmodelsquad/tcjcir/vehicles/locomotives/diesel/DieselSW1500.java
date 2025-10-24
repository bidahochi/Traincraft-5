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


public class DieselSW1500 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW1500;
    }
    public DieselSW1500(World world) {
        super(world, EnumTrains.SW1500.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Denver SUCK MY FUCKIN BALLS cock sucker island (stupid) mofo Volkswagon 1083 deez nuts express");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Southern Pacific");
        InsertTexture(3, "CFW 1136", LockoutGroup.BIDA);
        InsertTexture(4, "Penn Central");
        InsertTexture(5, "GM Demonstrator");
        InsertTexture(6, "BNSF H1");
        InsertTexture(7, "FNCC (DRW)", LockoutGroup.FNCC);
        InsertTexture(8, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(9, "Indiana Harbor Belt");
        InsertTexture(10, "Nomansi and Eastern Pacific? maybe?");
        InsertTexture(11, "CSXT (Yn3)");
        InsertTexture(12, "Port of Latona Terminal Railroad");
        InsertTexture(13, "Morristown Tenneva & Southern (The 1701 Trekkie Unit)", LockoutGroup.MTS);
        InsertTexture(14, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(15, "Southern Port Belt");
        InsertTexture(16, "Western Pacific (Preserved)");
        InsertTexture(17, "Western Pacific");
        InsertTexture(18, "Western Pacific (Late)");
        InsertTexture(19, "Apalachicola Northern");
        InsertTexture(20, "Canadian National (WC)");
        InsertTexture(21, "Grassland Laboratories");
        InsertTexture(22, "FURRX");
        InsertTexture(23, "FURRX");
        InsertTexture(24, "ADT");
        InsertTexture(25, "CSXT (Yn2)");
        InsertTexture(26, "CSXT (Yn1)");
        InsertTexture(27, "CSXT (Stealth)");
        InsertTexture(28, "Seaboard");
    }
    public DieselSW1500(World world, double d, double d1, double d2){
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
        double distance = -0.1; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
        double distanceLR = -0.35; //how far left/right on the entity you ride; left > 0; right < 0;
        double yOffset = 0.3;
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.175F;
    }

    

    @Override
    public String getInventoryName() {
        return "EMD SW1500";
    }

    

    
    

}
