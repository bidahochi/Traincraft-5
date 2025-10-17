package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.AbstractControlCar;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class S1BL extends AbstractControlCar
{
    public S1BL(World world) {
        super(world);
    }

    /*private int update = 8;
    private LiquidManager.StandardTank theTank;

    public S1BL(World world) {
        super(world, EnumTrains.S1BL.getTankCapacity());
        initFreightWater();
        this.theTank = LiquidManager.getInstance().new FilteredTank(EnumTrains.S1BL.getTankCapacity(), LiquidManager.dieselFilter());
    }*/

    public S1BL(World world, double d, double d1, double d2) {
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
    public SoundRecord getSoundRecord()
    {
        return null;
    }


    @Override
    public void onUpdate() {
        super.onUpdate();
        if ((motionX>0.1 || motionZ>0.1) && ticksExisted % 40 == 0) {
            setDefaultMass(-EnumTrains.SMSC1.getMass() * 1.75);//this should be S1BL
        }
    }

    @Override
    public String getInventoryName()
    {
        return null;
    }

    @Override
    public void updateRiderPosition() {
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.2, posZ);
        }
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
        return 2.85F;
    }
}
