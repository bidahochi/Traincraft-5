package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class SteamSkook extends SteamTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.SteamSkook;
    }
    public SteamSkook(World world) {
        super(world, LiquidManager.WATER_FILTER);
        
    }

    /*@Override//todo THIS METHOD DOES NOT WORK
    public void updateRiderPosition() {
        if(riddenByEntity==null){return;}
        riddenByEntity.setPosition(posX-0.35F, posY + getMountedYOffset() + riddenByEntity.getYOffset()+0.2F, posZ-1.1F);// default
    }*/

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -1.1, 0.2, -0.35); }

    /*@Override
    public void updateRiderPosition() {
        if (riddenByEntity == null) {
            return;
        }
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = -1.1;
        double yOffset = 0.25;
        float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
        float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
        if (side.isServer()) {
            rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
            rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
            anglePitchClient = serverRealPitch * 60;
        }
        float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
                + riddenByEntity.getYOffset() + yOffset);
        float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (this.posX + (rotationCos1 * distance));
        double bogieZ1 = (this.posZ + (rotationSin1 * distance));
        if (anglePitchClient > 20 && rotationCos1 == 1) {
            bogieX1 -= pitchRads * 2;
            pitch -= pitchRads * 1.2;
        }
        if (anglePitchClient > 20 && rotationSin1 == 1) {
            bogieZ1 -= pitchRads * 2 + 1;
            pitch -= pitchRads * 1.2;
        }
        if (pitchRads == 0.0) {
            riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }
    }*/

    @Override
    public float transportMetricHorsePower()
    {
        return 1470;
    }

    @Override
    public String getInventoryName() {
        return "Skookum 2-4-4-2";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.4F;
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public int getWaterConsumption()
    {
        return 75;
    }

    @Override
    public int getTankCapacity()
    {
        return 2000;
    }
}