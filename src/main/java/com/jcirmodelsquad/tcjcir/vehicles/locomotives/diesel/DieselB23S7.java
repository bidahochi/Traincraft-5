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

public class DieselB23S7 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselB23S7;
    }
    public DieselB23S7(World world) {
        super(world, EnumTrains.B23S7.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "GECX 2000");
        InsertTexture(1, "GECX 2002");
        InsertTexture(2, "Monongahela");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(5, "WP (Early)");
        InsertTexture(6, "WP (Late)");
        InsertTexture(7, "CSXT (Yn3)");

    }
    public DieselB23S7(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.1, 0.25, -0.35); }
    

    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }



    @Override
    public String getInventoryName() {
        return "GE B23-S7";
    }






}
