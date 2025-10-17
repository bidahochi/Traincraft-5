package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import com.jcirmodelsquad.tcjcir.models.pantos.Modelpanto_gm6c_down;
import com.jcirmodelsquad.tcjcir.models.pantos.Modelpanto_gm6c_downup;
import com.jcirmodelsquad.tcjcir.models.pantos.Modelpanto_gm6c_up;
import com.jcirmodelsquad.tcjcir.models.pantos.Modelpanto_gm6c_updown;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class ElectricGM6C_2 extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricGM6C_2;
    }
    public ElectricGM6C_2(World world) {
        super(world);
        InsertTexture(0, "EMDX Demo");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Conrail");
        InsertTexture(3, "Norfolk Southern");
        InsertTexture(4, "Norfolk Southern (Later in Life)");
        InsertTexture(5, "FNCC (KIT-Lm, Non Canon)", LockoutGroup.FNCC);
        InsertTexture(6, "FNCC E630 (TNRJ 6 Years Celebration Unit, Non Canon)", LockoutGroup.FNCC);

        setCargoManager(new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(Modelpanto_gm6c_down.class, "pantopart_gm6c",
                        "Pantograph (Both Down)", 0, 3.085, 0)},
                { new CargoSpecification(Modelpanto_gm6c_updown.class, "pantopart_gm6c",
                        "Pantograph (Up Down)", 0, 3.085, 0)},
                { new CargoSpecification(Modelpanto_gm6c_downup.class, "pantopart_gm6c",
                        "Pantograph (Down Up)", 0, 3.085, 0)},
                { new CargoSpecification(Modelpanto_gm6c_up.class, "pantopart_gm6c",
                        "Pantograph (Both Up)", 0, 3.085, 0)},

        }));
    }

    public ElectricGM6C_2(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + (double) yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d ;
        prevPosY = d1;
        prevPosZ = d2;
    }

    @Override
    public void updateRiderPosition() {
        if (riddenByEntity == null) {return;}
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = 3.8; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
        double distanceLR = -0.35; //how far left/right on the entity you ride; left > 0; right < 0;
        double yOffset = -0.10;
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
    public void pressKey(int i) {
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX + 2, (int) this.posY, (int) this.posZ);
        }
    }





    @Override
    public String getInventoryName() {
        return "EMD GM6C";
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
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.45F;
    }

    @Override
    public boolean canBeAdjusted(EntityMinecart cart) {
        return canBeAdjusted;
    }
    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return true;
    }
}
