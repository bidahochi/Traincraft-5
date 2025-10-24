package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class ElectricCEEslug extends ElectricTrain
{
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricCEESlug;
    }

    public ElectricCEEslug(World world) {
        super(world);
        InsertTexture(0, "NEP SUB-4");
        InsertTexture(1, "FNCC S111, S112, & S114", LockoutGroup.FNCC);
        InsertTexture(2, "FNCC S113", LockoutGroup.FNCC);
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "");
    }

    public ElectricCEEslug(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + (double) yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d ;
        prevPosY = d1;
        prevPosZ = d2;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }

    
    @Override
    public String getInventoryName() {
        return "CEE rebuilt slug (U23B core)";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.3F;
    }

    
    
}
