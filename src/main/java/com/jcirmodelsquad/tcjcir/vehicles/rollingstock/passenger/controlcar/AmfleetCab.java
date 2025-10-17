package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.controlcar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.api.AbstractControlCar;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class AmfleetCab extends AbstractControlCar
{
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.AmfleetCab;
    }
    public AmfleetCab(World world) {
        super(world);
        InsertTexture(0, "AMTK (Phase 3)");
        InsertTexture(1, "AMTK (Phase 4)");
        InsertTexture(2, "AMTK (Phase 4B Door 1)");
        InsertTexture(3, "AMTK (Phase 4B Door 2)");
        InsertTexture(4, "AMTK (Phase 4B Conference Car)");
        InsertTexture(5, "Generic");
        InsertTexture(6, "JCTransit");
        InsertTexture(7, "CCRL (Chatham and Crator River Lines)");
        InsertTexture(8, "CRL (Crator River Lines)");
    }

    public AmfleetCab(World world, double d, double d1, double d2) {
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
    public String getInventoryName()
    {
        return EnumTrains.amfleetcab.getInternalName();
    }

    @Override
    public void updateRiderPosition() {
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.2, posZ);
        }
    }

    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        playerEntity = entityplayer;
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!worldObj.isRemote) {
            ItemStack itemstack = entityplayer.inventory.getCurrentItem();
            if(lockThisCart(itemstack, entityplayer))return true;
            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
                return true;
            }
            if (!worldObj.isRemote) {
                entityplayer.mountEntity(this);
            }
        }
        return true;
    }

    @Override
    public boolean canBeRidden() {
        return true;
    }

    @Override
    public boolean isStorageCart() {
        return false;
    }

    @Override
    public boolean isPoweredCart() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.6F;
    }
}
