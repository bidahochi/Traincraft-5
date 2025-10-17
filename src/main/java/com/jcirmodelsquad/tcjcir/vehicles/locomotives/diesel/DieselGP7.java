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

public class DieselGP7 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP7;
    }
    public DieselGP7(World world) {
        super(world, EnumTrains.GP7.getTankCapacity(), LiquidManager.dieselFilter());
        initLoco();
        InsertTexture(0, "Avanste Northeastern (Late)");
        InsertTexture(1, "Burlington Northern (Ex CBQ)");
        InsertTexture(2, "Butte, Anaconda & Pacific (Early)");
        InsertTexture(3, "Chicago Northwestern");
        InsertTexture(4, "Avanste Northeastern (As Delivered)");
        InsertTexture(5, "Fox Union Resources (FURRX)");
        InsertTexture(6, "Bangor & Aroostook (Early)");
        InsertTexture(7, "Bangor & Aroostook (Late)");
        InsertTexture(8, "West Creek Pacific");
        InsertTexture(9, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(10, "Carbondale & Pine Valley (CSWR Buyout)", LockoutGroup.CPV);
        InsertTexture(11, "waltuh white gp7");
        InsertTexture(12, "Deadwood & La Mesa (Early)");
        InsertTexture(13, "Deadwood & La Mesa (Late)");
        InsertTexture(14, "Blandsville & Blankerston");
        InsertTexture(15, "Amtrak MOW");
        InsertTexture(16, "Seaboard Coast Line");
        InsertTexture(17, "Denver & Rio Grande Western (Early)");
        InsertTexture(18, "Denver & Rio Grande Western (Early 2?)");
        InsertTexture(19, "Denver & Rio Grande Western (Late Small Logo)");
        InsertTexture(20, "Denver & Rio Grande Western (Late Big Logo)");
        InsertTexture(21, "US Army");
        InsertTexture(22, "Great Northern (Emp Builder)");
        InsertTexture(23, "Great Northern (EB Simp)");
        InsertTexture(24, "Great Northern (BSB)");
        InsertTexture(25, "Washaska & Old Fox RR Co 21");
        InsertTexture(26, "Washaska & Old Fox RR Co 26");
        InsertTexture(27, "New York Central (Early)");
        InsertTexture(28, "New York Central (Lightning Bolt)");
        InsertTexture(29, "New York Central (Late)");
        InsertTexture(30, "New York Central (Grey Lighting Bolt)");
        InsertTexture(31, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(32, "ATSF (Pinstripe)");
        InsertTexture(33, "ATSF (Zebrastripe)");
        InsertTexture(34, "MKT");
        InsertTexture(35, "Penn Central");
        InsertTexture(36, "Northern Pacific");
        InsertTexture(37, "Northern Pacific");
        InsertTexture(38, "Cotton Belt/ Southern Pacific");
        InsertTexture(39, "Cotton Belt/ Southern Pacific");
        InsertTexture(40, "Southern Pacific");
        InsertTexture(41, "Western Pacific");
        InsertTexture(42, "Deadwood & Northern");
        InsertTexture(43, "CNW 1518");
        InsertTexture(44, "Great Lakes & Northern Territories (Ex FNCC)");
        InsertTexture(45, "Monongahela");
        InsertTexture(46, "WCP (stupid bozo chop)");
        InsertTexture(47, "CDCS");
        InsertTexture(48, "JRN");
        InsertTexture(49, "GCCR");
    }
    public DieselGP7(World world, double d, double d1, double d2){
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
        return "EMD GP7";
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