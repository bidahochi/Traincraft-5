package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;


import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2;
import com.jcirmodelsquad.tcjcir.features.autotrain.IAT2Compatible;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class PCH130Commute2 extends ElectricTrain implements IAT2Compatible {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.PCH130Commute2;
    }

    AutoTrain2 script2;


    public PCH130Commute2(World world) {
        super(world);
        dataWatcher.addObject(29, "");
        renderRefs.addProperty("doors", true);
        script2 = new AutoTrain2(this);
    }


    public PCH130Commute2(World world, double d, double d1, double d2) {
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
        if (riddenByEntity == null) {
            return;
        }
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = 3.8;
        double yOffset = -0.2;
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
        //System.out.println(rotationCos1+" "+rotationSin1);
        if (anglePitchClient > 20 && rotationCos1 == 1) {
            bogieX1 -= pitchRads * 2;
            pitch -= pitchRads * 1.2;
        }
        if (anglePitchClient > 20 && rotationSin1 == 1) {
            bogieZ1 -= pitchRads * 2;
            pitch -= pitchRads * 1.2;
        }
        if (pitchRads == 0.0) {
            riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }
    }

    @Override
    public String getInventoryName() {
        return "PCH-130 Commute 2";
    }


    


    @Override
    public void onUpdate() {
        super.onUpdate();

        //Drive with AutoTrain2.

        if (!worldObj.isRemote) {
            if (script2.active) script2.drive();
        }
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1F;
    }

    

    

    @Override
    public void setLocoTurnedOnFromPacket(boolean set) {
        super.setLocoTurnedOnFromPacket(set);
       script2.init();
    }

    @Override
    public void stationStopComplete() {
        super.stationStopComplete();
        script2.stationStop();
    }


    @Override
    public AutoTrain2 getDriver() {
        return script2;
    }
}