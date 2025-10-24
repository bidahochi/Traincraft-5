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


public class DieselSD70ACe extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD70ACe;
    }
    public DieselSD70ACe(World world) {
        super(world, EnumTrains.SD70ACe.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Blandsville & Blankerston");
        InsertTexture(1, "FURRX Lease");
        InsertTexture(2, "CSXT Thundercab");
        InsertTexture(3, "PRLX C&O Heritable");
        InsertTexture(4, "CSXT What If Whispercab, Hunter Harrison Killed it");
        InsertTexture(5, "BNSF Whispercab");
        InsertTexture(6, "BNSF Thundercab");
        InsertTexture(7, "KCS Grey Ghost Thundercab");
        InsertTexture(8, "KCS Belle Thundercab");
        InsertTexture(9, "KCS Belle Whispercab");
        InsertTexture(10, "UP Flag Whispercab");
        InsertTexture(11, "UP Flag Thundercab");
        InsertTexture(12, "UP Lettering Whispercab");
        InsertTexture(13, "UP Lettering Thundercab");
        InsertTexture(14, "NS Second Order");
        InsertTexture(15, "Montana Rail Link");
        InsertTexture(16, "EMDX Demonstrator Whispercab");
        InsertTexture(17, "CN Demonstrator Whispercab");
    }
    public DieselSD70ACe(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.15, 0.4, -0.35); }
    
    
    
    
    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.45F;
    }
    
    @Override
    public String getInventoryName() {
        return "EMD SD70ACe";
    }



}
