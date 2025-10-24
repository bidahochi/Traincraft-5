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

public class DieselDD55 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDD55;
    }
    public DieselDD55(World world) {
        super(world, EnumTrains.DD55.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "West Creek Pacific");
        InsertTexture(1, "Steampunk Rail", LockoutGroup.SPR);
        InsertTexture(2, "LA Switcher Company Primer");
        InsertTexture(3, "CSX (but awesome)");
        InsertTexture(4, "CSX (but awesome)");

    }
    public DieselDD55(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.75, 0.125, -0.35); }








    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }



    @Override
    public String getInventoryName() {
        return "LASC DD55";
    }






}
