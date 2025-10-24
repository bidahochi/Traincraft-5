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


public class DieselRF16 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRF16;
    }
    public DieselRF16(World world) {
        super(world, EnumTrains.RF16.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Pennsylvania (1 Stipe)");
        InsertTexture(1, "Delaware & Hudson");
        InsertTexture(2, "Michigan Northern");
        InsertTexture(3, "Baltimore & Ohio");
        InsertTexture(4, "Baltimore & Ohio (Late)");
        InsertTexture(5, "Baltimore & Ohio (Late, with plow)");
        InsertTexture(6, "New York Central");
        InsertTexture(7, "New York Central (Late)");
        InsertTexture(8, "Monongahela");
        InsertTexture(9, "Blandsville & Blankerston");
        InsertTexture(10, "A-Team");

    }
    public DieselRF16(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.8, 0.3, -0.37); }


    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.08F;
    }

    

    @Override
    public String getInventoryName() {
        return "BLH RF-16";
    }

    




}
