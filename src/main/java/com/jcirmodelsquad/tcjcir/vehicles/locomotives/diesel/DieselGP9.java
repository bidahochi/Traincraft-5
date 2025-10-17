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

public class DieselGP9 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP9;
    }
    public DieselGP9(World world) {
        super(world, EnumTrains.GP9.getTankCapacity(), LiquidManager.dieselFilter());
        initLoco();
        InsertTexture(0, "BN 1783");
        InsertTexture(1, "Southern Pacific (Black Widow Passenger)");
        InsertTexture(2, "Southern Pacific (Black Widow)");
        InsertTexture(3, "Western Pacific");
        InsertTexture(4, "Western Pacific");
        InsertTexture(5, "Avanste Northeastern (Late)");
        InsertTexture(6, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(7, "Lisha & Watson (High Hood)", LockoutGroup.LW);
        InsertTexture(8, "Lisha & Watson (Chop Nose)", LockoutGroup.LW);
        InsertTexture(9, "Blandsville & Blankerston");
        InsertTexture(10, "Nomansi & Eastern Pacific (Early)");
        InsertTexture(11, "Nomansi & Eastern Pacific");
        InsertTexture(12, "Milwaukee Road");
        InsertTexture(13, "Canadian Pacific (Script)");
        InsertTexture(14, "Denver & Rio Grande Western (Early)");
        InsertTexture(15, "Denver & Rio Grande Western");
        InsertTexture(16, "Denver & Rio Grande Western (Big Logo)");
        InsertTexture(17, "Spokane Portland & Seattle (Early)");
        InsertTexture(18, "Spokane Portland & Seattle (Middle Era)");
        InsertTexture(19, "Spokane Portland & Seattle (Late)");
        InsertTexture(20, "Magnolia Acres");
        InsertTexture(21, "New York Central (Early)");
        InsertTexture(22, "New York Central (Lightning Bolt)");
        InsertTexture(23, "New York Central (Late)");
        InsertTexture(24, "New York Central (Grey Lighting Bolt)");
        InsertTexture(25, "ATSF (Pinstripe)");
        InsertTexture(26, "ATSF (Zebrastripe)");
        InsertTexture(27, "Penn Central");
        InsertTexture(28, "Union Pacific");
        InsertTexture(29, "Consolidated Rail Corporation");
        InsertTexture(30, "Western Pacific");
        InsertTexture(31, "ADT (Ex UP)");
        InsertTexture(32, "ADT");
        InsertTexture(33, "Northern Pacific");
        InsertTexture(34, "BN 1742");
        InsertTexture(35, "BN 1755");
        InsertTexture(36, "BN 1918");
        InsertTexture(37, "BN 1949");
        InsertTexture(38, "NP (Phase II)");
        InsertTexture(39, "NP (Phase II no DB)");
        InsertTexture(40, "NP (Phase III)");
        InsertTexture(41, "NP (Phase III no DB)");
        InsertTexture(42, "DLMR (Early)");
        InsertTexture(43, "DLMR (Late)");
        InsertTexture(44, "DLMR (MOW)");
        InsertTexture(45, "MMID (High Nose)");
        InsertTexture(46, "MMID (Chop Nose)");
        InsertTexture(47, "SGPR 25 (Patch)");
    }
    public DieselGP9(World world, double d, double d1, double d2){
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
        double distance = 2.55; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
        double distanceLR = -0.35; //how far left/right on the entity you ride; left > 0; right < 0;
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }



    @Override
    public String getInventoryName() {
        return "EMD GP9";
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