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


public class DieselF7A extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF7A;
    }
    public DieselF7A(World world) {
        super(world, EnumTrains.F7A.getTankCapacity(), LiquidManager.dieselFilter());
        
        //when the benis sus
        InsertTexture(0, "PC (Ex NYC)");
        InsertTexture(1, "Mesa Desert");
        InsertTexture(2, "DRGW (Black with yellow stripes)");
        InsertTexture(3, "DRGW (4 stripe)");
        InsertTexture(4, "DRGW (4 stripe, late)");
        InsertTexture(5, "DRGW (1 stripe)");
        InsertTexture(6, "Amtrak (Ex NP)");
        InsertTexture(7, "Amtrak (Ex NP)");
        InsertTexture(8, "ATSF (Bluebonnet)");
        InsertTexture(9, "ATSF (As Delivered)");
        InsertTexture(10, "ATSF (Early)");
        InsertTexture(11, "ATSF (Rebuilt)");
        InsertTexture(12, "ATSF (Yellowbonnet 1)");
        InsertTexture(13, "ATSF (Yellowbonnet 2)");
        InsertTexture(14, "MMID 100");
        InsertTexture(15, "MMID 101");
        InsertTexture(16, "NYC (Early)");
        InsertTexture(17, "NYC (Black)");
        InsertTexture(18, "EMD Demonstrator");
        InsertTexture(19, "WM (Speed Lettering)");
        InsertTexture(20, "WM (Circus");
        InsertTexture(21, "WM (Fireball)");
        InsertTexture(22, "CB&Q (With coupler cover)");
        InsertTexture(23, "CB&Q");
        InsertTexture(24, "CB&Q (Late, with coupler cover)");
        InsertTexture(25, "CB&Q (Late)");
        InsertTexture(26, "MILW (Grey scheme)");
    }
    public DieselF7A(World world, double d, double d1, double d2){
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
        double distance = 2.4; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
        double distanceLR = -0.35; //how far left/right on the entity you ride; left > 0; right < 0;
        double yOffset = 0.19;
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
    public float getOptimalDistance(EntityMinecart cart) { return 0.91F;
    }

    @Override
    public String getInventoryName() {
        return "EMD F7a";
    }

    


    

}
