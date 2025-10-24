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

public class DieselGP7f extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP7f;
    }
    public DieselGP7f(World world) {
        super(world, EnumTrains.GP7f.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "ARR 1803");
        InsertTexture(1, "ARR 1807");
        InsertTexture(2, "ARR 1802");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "SNCT 401 (Protolance)", LockoutGroup.SNCT);
        InsertTexture(5, "SNCT 402 (Protolance)", LockoutGroup.SNCT);
    }
    public DieselGP7f(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.55, 0.1, -0.35); }








    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    

    @Override
    public String getInventoryName() {
        return "ARR GP7u";
    }



    


}