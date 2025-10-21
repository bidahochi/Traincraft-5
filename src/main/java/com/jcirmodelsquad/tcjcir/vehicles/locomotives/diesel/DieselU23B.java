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

public class DieselU23B extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU23B;
    }
    public DieselU23B(World world) {
        super(world, EnumTrains.U23B.getTankCapacity(), LiquidManager.dieselFilter());
        initLoco();
        InsertTexture(0, "Union Pacific");
        InsertTexture(1, "Fox Union Rail Resources (FURRX)");
        InsertTexture(2, "Conrail");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "Deep Rock Railroad", LockoutGroup.BIDA);
        InsertTexture(5, "Deep Rock Railroad (C&PV Patch)", LockoutGroup.CPV);
        InsertTexture(6, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(7, "ATSF (Pinstripe)");
        InsertTexture(8, "ATSF (Freightbonnet)");
        InsertTexture(9, "Deleware & Hudson");
        InsertTexture(10, "Southern");
        InsertTexture(11, "MoPac");
        InsertTexture(12, "Western Pacific");
        InsertTexture(13, "Western Pacific");
        InsertTexture(14, "Deadwood & La Mesa");
        InsertTexture(15, "Penn Central");
        InsertTexture(16, "Seaboard System");
        InsertTexture(17, "CFW 558", LockoutGroup.BIDA);
        InsertTexture(18, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(19, "Milwaukee Road");
        InsertTexture(20, "Nomansi & Eastern Pacific");
        InsertTexture(21, "ADT");
        InsertTexture(22, "ADT (Ex UP)");
        InsertTexture(23, "Suffern Hoboken Interstate Transfer 211");
        InsertTexture(24, "Detroit Export System", LockoutGroup.DES);
        InsertTexture(25, "Magnolia Properties");
        InsertTexture(26, "AGW");
        InsertTexture(27, "CNRC 5001 & 5002", LockoutGroup.CNRC);
        InsertTexture(28, "CSXT (Bluedown)");
        InsertTexture(29, "CSXT (Stealth)");
        InsertTexture(30, "CSXT (YN1)");
        InsertTexture(31, "CSXT (YN2)");
        InsertTexture(32, "Chessie System");
    }
    public DieselU23B(World world, double d, double d1, double d2){
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    public void initLoco() {
        fuelTrain = 0;
        locoInvent = new ItemStack[inventorySize];
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
    public void onUpdate() {
        checkInvent(locoInvent[0]);
        super.onUpdate();
    }



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }

    

    @Override
    public String getInventoryName() {
        return "GE U23B";
    }

    

    


}
