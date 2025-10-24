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


public class DieselCF7round extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCF7round;
    }
    public DieselCF7round(World world) {
        super(world, EnumTrains.CF7round.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "ATSF (Pinstripe)");
        InsertTexture(1, "ATSF (2568)");
        InsertTexture(2, "ATSF (2640)");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "");
        InsertTexture(5, "");
        InsertTexture(6, "");
        InsertTexture(7, "");
        InsertTexture(8, "");
        InsertTexture(9, "");
        InsertTexture(10, "");
        InsertTexture(11, "");
        InsertTexture(12, "");
        InsertTexture(13, "");
    }
    public DieselCF7round(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.5, 0.2, -0.35); }
    


    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    

    @Override
    public String getInventoryName() {
        return "EMD CF7 Roundcab";
    }

    

    

    

}
