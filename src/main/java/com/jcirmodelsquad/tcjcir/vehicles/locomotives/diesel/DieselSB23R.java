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

public class DieselSB23R extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSB23R;
    }
    public DieselSB23R(World world) {
        super(world, EnumTrains.SB23R.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "BMC (Plant Switcher)");
        //InsertTexture(1, "Western Pacific (Early)");
        //InsertTexture(2, "Western Pacific (Late)");
        InsertTexture(1, "FNCC 335 (Dar80)", LockoutGroup.FNCC);
        InsertTexture(2, "Morristown Tennava & Southern", LockoutGroup.MTS);
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "");
        InsertTexture(5, "");
        InsertTexture(6, "");
    }
    public DieselSB23R(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }
    



    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }



    @Override
    public String getInventoryName() {
        return "CEE SB23R";
    }

    




}
