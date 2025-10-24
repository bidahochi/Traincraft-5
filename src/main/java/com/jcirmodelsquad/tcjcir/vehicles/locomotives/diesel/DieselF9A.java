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

public class DieselF9A extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF9A;
    }
    public DieselF9A(World world) {
        super(world, EnumTrains.F9A.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "BN 814");
        InsertTexture(1, "FMSR", LockoutGroup.FMSR);
        InsertTexture(2, "EMD Demonstrator");
        InsertTexture(3, "Norfolk Southern");
        InsertTexture(4, "DRGW (4 stripe)");
        InsertTexture(5, "DRGW (4 stripe, late)");
        InsertTexture(6, "DRGW (1 stripe)");
    }
    public DieselF9A(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.4, 0.19, -0.35); }
    

    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.91F;
    }

    

    @Override
    public String getInventoryName() {
        return "EMD F9a";
    }






}
