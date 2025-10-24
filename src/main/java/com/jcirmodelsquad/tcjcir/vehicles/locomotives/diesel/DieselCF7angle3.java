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


public class DieselCF7angle3 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCF7angle3;
    }
    public DieselCF7angle3(World world) {
        super(world, EnumTrains.CF7angle3.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "ANE");
        InsertTexture(1, "FNCC (CEE Rebuilt)", LockoutGroup.FNCC);
        InsertTexture(2, "FNCC (Ex CEE Ne WP)", LockoutGroup.FNCC);
        InsertTexture(3, "FNCC 27", LockoutGroup.FNCC);
        InsertTexture(4, "KCRC 2601 (FNCC 28)", LockoutGroup.FNCC);
        InsertTexture(5, "KCRC 2583 (FNCC 29)", LockoutGroup.FNCC);
        InsertTexture(6, "SNCT 102 (Post 1983) (Protolance)", LockoutGroup.SNCT);
        InsertTexture(7, "SNCT 103 (Post 1983) (Protolance)", LockoutGroup.SNCT);
        InsertTexture(8, "SGPR 582");
        InsertTexture(9, "SGPR 585");
        InsertTexture(10, "SGPR 587");
        InsertTexture(11, "SGPR 590");
        InsertTexture(12, "SGPR 924/925 (Arrival Scheme)");
        InsertTexture(13, "SGPR 924/925 (Repaint)");
        InsertTexture(14, "ARSR 2497");
        InsertTexture(15, "ARSR 2610");
        InsertTexture(16, "C&PV", LockoutGroup.CPV);
        InsertTexture(17, "CFW 1504", LockoutGroup.BIDA);
        InsertTexture(18, "FURRX");
        InsertTexture(19, "GLNT");
        InsertTexture(20, "CNRC 4100 (Ex FNCC 41)", LockoutGroup.CNRC);
        InsertTexture(21, "CNRC 4101-4102 (Ex ATSF)", LockoutGroup.CNRC);
        InsertTexture(22, "");
        InsertTexture(23, "");
        InsertTexture(24, "");
        InsertTexture(25, "");
        InsertTexture(26, "");
        InsertTexture(27, "");
        InsertTexture(28, "");
        InsertTexture(29, "");
        InsertTexture(30, "");
        InsertTexture(31, "");
        InsertTexture(32, "");
        InsertTexture(33, "");
        InsertTexture(34, "");
        InsertTexture(35, "");
        InsertTexture(36, "");
        InsertTexture(37, "");
        InsertTexture(38, "");
    }
    public DieselCF7angle3(World world, double d, double d1, double d2){
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
        double distance = 2.5; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
        double distanceLR = -0.35; //how far left/right on the entity you ride; left > 0; right < 0;
        double yOffset = 0.2;
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }



    @Override
    public String getInventoryName() {
        return "EMD CF7 (Angle Cab)";
    }







}
