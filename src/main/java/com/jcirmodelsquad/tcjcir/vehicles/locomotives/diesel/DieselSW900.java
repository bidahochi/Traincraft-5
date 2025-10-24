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


public class DieselSW900 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW900;
    }
    public DieselSW900(World world) {
        super(world, EnumTrains.SW900.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Electric Fuels Corporation");
        InsertTexture(1, "Conrail Shared Assets");
        InsertTexture(2, "Avanste Northeastern");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "Deadwood & La Mesa");
        InsertTexture(5, "New York Central");
        InsertTexture(6, "New York Central");
        InsertTexture(7, "Great Lakes & Northern Territories");
        InsertTexture(8, "Wesser Valley");
        InsertTexture(9, "Falcon Area Rapid Transit MOW");
        InsertTexture(10, "Sacramento Northern (Ex FNCC)");
        InsertTexture(11, "SP Tigerstripe");
    }
    public DieselSW900(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.08, 0.2, -0.35); }


    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    

    @Override
    public String getInventoryName() {
        return "EMD SW900";
    }






}
