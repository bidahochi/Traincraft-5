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

public class DieselU23C extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU23C;
    }
    public DieselU23C(World world) {
        super(world, EnumTrains.U23C.getTankCapacity(), LiquidManager.dieselFilter());//its like magic guys trust me

        InsertTexture(0, "Consolidate DeeZ NUTS");
        InsertTexture(1, "Nautilus");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "ATSF Pinstripe");
        InsertTexture(4, "ATSF Freightbonnet");
        InsertTexture(5, "");
        InsertTexture(6, "");
        InsertTexture(7, "");
    }
    public DieselU23C(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.6, 0.3, -0.35); }


    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.65F;
    }

    

    @Override
    public String getInventoryName() {
        return "GE U23C";
    }



    


}
