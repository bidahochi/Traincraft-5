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


public class DieselSD70ACe_H extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD70ACe_H;
    }
    public DieselSD70ACe_H(World world) {
        super(world, EnumTrains.SD70ACe_H.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "hey louis");
        InsertTexture(1, "NS 1065 (Savannah & Atlanta)");
        InsertTexture(2, "NS 1066 (New York Central)");
        InsertTexture(3, "NS 1067 (Reading)");
        InsertTexture(4, "NS 1068 (Erie)");
        InsertTexture(5, "NS 1069 (Virginian)");
        InsertTexture(6, "NS 1070 (Wabash)");
        InsertTexture(7, "NS 1071 (Central Railroad of New Jersey)");
        InsertTexture(8, "NS 1072 (Illinois Terminal)");
        InsertTexture(9, "NS 1073 (Penn Central)");
        InsertTexture(10, "NS 1074 (Delaware Lackawanna & Western)");
    }
    public DieselSD70ACe_H(World world, double d, double d1, double d2){
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
