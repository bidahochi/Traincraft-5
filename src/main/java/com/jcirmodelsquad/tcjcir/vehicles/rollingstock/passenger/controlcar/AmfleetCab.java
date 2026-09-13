package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.controlcar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.AbstractControlCar;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class AmfleetCab extends AbstractControlCar
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:amfleetcab")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_109", "marker_body_110")
        .build();

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

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}
