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

public class DieselB36 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselB36; }

    public DieselB36(World world) {
        super(world, EnumTrains.B36.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "CNRC 7772 & 7773", LockoutGroup.CNRC);
        InsertTexture(1, "CNRC 7771", LockoutGroup.CNRC);
        InsertTexture(2, "CNRC 7774", LockoutGroup.CNRC);
        InsertTexture(3, "CSXT (Yn2)");
        InsertTexture(4, "CSXT (Yn1)");
        InsertTexture(5, "CSXT (Stealth)");
        InsertTexture(6, "CSXT (Bluedown)");
        InsertTexture(7, "Seaboard");
    }

    public DieselB36(World world, double d, double d1, double d2){
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
    public String getInventoryName() { return "GE B36-7"; }

}
