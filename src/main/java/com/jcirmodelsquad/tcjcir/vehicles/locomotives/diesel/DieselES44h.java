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
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;


public class DieselES44h extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselES44h;
    }
    public DieselES44h(World world) {
        super(world, EnumTrains.ES44h.getTankCapacity(), LiquidManager.dieselFilter());
        initLoco();
        InsertTexture(0, "NS 8025 (Monongahela)");
        InsertTexture(1, "NS 8098 (Conrail)");
        InsertTexture(2, "NS 8099 (Southern)");
        InsertTexture(3, "NS 8100 (NKP)");
        InsertTexture(4, "NS 8101 (Central of Georgia)");
        InsertTexture(5, "NS 8102 (Pennsylvania)");
        InsertTexture(6, "NS 8103 (Norfolk & Western)");
        InsertTexture(7, "NS 8104 (LV Pre Jun 2012)");
        InsertTexture(8, "NS 8104 (LV Post Jun 2012)");
        InsertTexture(9, "NS 8105 (Interstate)");
        InsertTexture(10, "NS 8114 (NS 1942-1982)");
        InsertTexture(11, "CSX 1976 (Conrail)");
        InsertTexture(12, "CSX 1973 (Chessie)");
        InsertTexture(13, "CSX 1827 (Baltimore & Ohio)");
        InsertTexture(14, "CSX 1869 (Chesapeake & Ohio)");
        InsertTexture(15, "CSX 1982 (Seaboard)");
        InsertTexture(16, "CSX 1850 (Louisville & Nashville)");
        InsertTexture(17, "CSX 1871 (Atlantic Coast Line)");
        InsertTexture(18, "CSX 1853 (New York Central)");
        InsertTexture(19, "CSX 1897 (Monon)");
        InsertTexture(20, "CSX 1836 (Richmond Fredericksburg & Potomac)");
        InsertTexture(21, "CSX 1972 (Family Lines)");
        InsertTexture(22, "CSX 1852 (Western Maryland)");
        InsertTexture(23, "CSX 1899 (Pere Marquette)");
        InsertTexture(24, "CSX 1967 (Seaboard Coast Line)");
        InsertTexture(25, "CSX 1875 (Pittsburgh & Lake Erie)");
        InsertTexture(26, "CSX 1834 (Georgia Railroad)");
        InsertTexture(27, "CSX 1877 (Chicago & Eastern Illinois)");
        InsertTexture(28, "CSX 1901 (Seaboard Air Line)");
        InsertTexture(29, "CSX 1851 (Nashville Chattanooga & St Louis)");
        InsertTexture(30, "CSX 1902 (Clinchfield)");
        InsertTexture(31, "CSX 1981 (Pan Am Railways)");
        InsertTexture(32, "CSX 911 (Fire)");
        InsertTexture(33, "CSX 1776 (Military)");
        InsertTexture(34, "CSX 3194 (Police)");
        InsertTexture(35, "IAIS (513)");
        InsertTexture(36, "IAIS (516)");
    }
    public DieselES44h(World world, double d, double d1, double d2){
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
        double distance = 3.9; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
        double distanceLR = -0.35; //how far left/right on the entity you ride; left > 0; right < 0;
        double yOffset = 0.4;
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    

    @Override
    public String getInventoryName() {
        return "GE ES44 (Hertiable Units)";
    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        playerEntity = entityplayer;
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!worldObj.isRemote) {
            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
                return true;
            }
            entityplayer.mountEntity(this);
        }
        return true;
    }
    @Override
    public boolean canBeAdjusted(EntityMinecart cart) {
        return canBeAdjusted;
    }

}
