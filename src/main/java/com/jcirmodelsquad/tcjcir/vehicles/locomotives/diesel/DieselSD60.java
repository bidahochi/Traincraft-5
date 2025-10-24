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
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;


public class DieselSD60 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD60;
    }
    public DieselSD60(World world) {
        super(world, EnumTrains.SD60.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Oakway Lease");
        InsertTexture(1, "Oakway Lease");
        InsertTexture(2, "CN (Ex Oakway i think?)");
        InsertTexture(3, "Uncle Pete");
        InsertTexture(4, "NS (Ex Soup)");
        InsertTexture(5, "CR (ohe now thats quality -demoman tf2)");
        InsertTexture(6, "Blandsville & Blanklands Terminal Railroad Association");
        InsertTexture(7, "GLoNT");
        InsertTexture(8, "BN (Tiger Stripe)");
        InsertTexture(9, "CSXT (Yn3)");
        InsertTexture(10, "CSXT (Yn2)");
        InsertTexture(11, "CSXT (Yn1)");
        InsertTexture(12, "CSXT (Stealth)");
        InsertTexture(13, "SOO (White)");
        InsertTexture(14, "SOO (Red)");

    }
    public DieselSD60(World world, double d, double d1, double d2){
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
        return "EMD SD60";
    }

    

    
    

}
