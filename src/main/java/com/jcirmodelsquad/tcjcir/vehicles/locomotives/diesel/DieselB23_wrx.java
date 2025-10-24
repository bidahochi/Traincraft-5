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

public class DieselB23_wrx extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselB23_wrx; }

    public DieselB23_wrx(World world) {
        super(world, EnumTrains.B23_wrx.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "WRXR Washaskan Woods RR", LockoutGroup.BIDA);
        InsertTexture(1, "WRXR Washaskan Woods RR (Extended DB)", LockoutGroup.BIDA);
    }

    public DieselB23_wrx(World world, double d, double d1, double d2){
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F; }

    @Override
    public String getInventoryName() { return "CEE B23-7 (WRX special order)"; }

}
