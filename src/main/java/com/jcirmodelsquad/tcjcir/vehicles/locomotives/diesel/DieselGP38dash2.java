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

public class DieselGP38dash2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP38dash2;
    }
    public DieselGP38dash2(World world) {
        super(world, EnumTrains.GP38Dash2.getTankCapacity(), LiquidManager.dieselFilter());
        initLoco();
        InsertTexture(0, "Butte, Anaconda & Pacific");
        InsertTexture(1, "MKT (Stripes)");
        InsertTexture(2, "MKT (Solids)");
        InsertTexture(3, "Norfolk Southern (Ex-Sou)");
        InsertTexture(4, "Norfolk Southern");
        InsertTexture(5, "Southern Port Belt");
        InsertTexture(6, "Southern Port Belt (NS Patch)");
        InsertTexture(7, "Milwaukee Road");
        InsertTexture(8, "Milwaukee Road (Billboard)");
        InsertTexture(9, "GLC (Cigar Band)");
        InsertTexture(10, "GLC (Ex SPB)");
        InsertTexture(11, "GLC (Ex NS)");
        InsertTexture(12, "CSXT (Yn3)");
        InsertTexture(13, "CSXT (Yn2)");
        InsertTexture(14, "Seaboard System");
        InsertTexture(15, "");
        InsertTexture(16, "");
        InsertTexture(17, "");
        InsertTexture(18, "");
        InsertTexture(19, "");
        InsertTexture(20, "");
    }
    public DieselGP38dash2(World world, double d, double d1, double d2){
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
        double distance = 2.9; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
        double distanceLR = -0.325; //how far left/right on the entity you ride; left > 0; right < 0;
        double yOffset = 0.15;
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.25F;
    }



    @Override
    public String getInventoryName() {
        return "EMD GP38-2";
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
