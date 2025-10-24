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

public class DieselRS1 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRS1;
    }
    public DieselRS1(World world) {
        super(world, EnumTrains.RS1.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "she ann on my arbor till i bankruptcy");
        InsertTexture(1, "she wabash on my lake till i ann arbor");
        InsertTexture(2, "Tidewater Southern");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "DLMR (Early)");
        InsertTexture(5, "DLMR (Late)");
        InsertTexture(6, "FMSR", LockoutGroup.FMSR);
        InsertTexture(7, "ATSF");
        InsertTexture(8, "Glontch");
        InsertTexture(9, "AGW");
        InsertTexture(10, "CYDZ");

    }
    public DieselRS1(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.4, 0.35, -0.35); }
    

    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    

    @Override
    public String getInventoryName() {
        return "ALCo RS-1";
    }



    


}
