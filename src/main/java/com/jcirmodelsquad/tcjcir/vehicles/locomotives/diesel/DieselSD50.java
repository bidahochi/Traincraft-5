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
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;


public class DieselSD50 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD50;
    }
    public DieselSD50(World world) {
        super(world, EnumTrains.SD50.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "CSX (YN1)");
        InsertTexture(1, "CSX (YN2)");
        InsertTexture(2, "CSX (YN3)");
        InsertTexture(3, "CR (First Order)");
        InsertTexture(4, "NS (Ex CR)");
        InsertTexture(5, "DRGW");
        InsertTexture(6, "ANE (1st & 2nd Orders)");
        InsertTexture(7, "Blandsville & Blanklands Terminal Railroad Association");
        InsertTexture(8, "HBRY");
        InsertTexture(9, "FNCC KIT-L", LockoutGroup.FNCC);
        InsertTexture(10, "Seaboard System");
        InsertTexture(11, "Chessie System");
    }
    public DieselSD50(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.7, 0.2, -0.35); }
    



    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.425F;
    }



    @Override
    public String getInventoryName() {
        return "EMD SD50";
    }






}
