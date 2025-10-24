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

public class DieselF3A extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF3A;
    }
    public DieselF3A(World world) {
        super(world, EnumTrains.F3A.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Phase 2 Early");
        InsertTexture(1, "FMSR", LockoutGroup.FMSR);
        InsertTexture(2, "DES", LockoutGroup.DES);
        InsertTexture(3, "CDC&S");
        InsertTexture(4, "OC&G 25A, 26B");
        InsertTexture(5, "BAR 49");
        InsertTexture(6, "DRGW (Black with yellow stripes)");
        InsertTexture(7, "DRGW (4 stripe)");
        InsertTexture(8, "DRGW (4 stripe, late)");
        InsertTexture(9, "DRGW (1 stripe)");
        InsertTexture(10, "MON (passenger scheme, early)");
        InsertTexture(11, "MON (passenger scheme)");
        InsertTexture(12, "MON (freight scheme, passenger)");
        InsertTexture(13, "MON (freight scheme, passenger, 203)");
        InsertTexture(14, "MON (freight scheme)");
        InsertTexture(15, "MON (freight scheme, late)");
        InsertTexture(16, "Amtrak (Ex NP)");
        InsertTexture(17, "ATSF (As Delivered)");
        InsertTexture(18, "ATSF (Early)");
        InsertTexture(19, "ATSF (Rebuilt)");
        InsertTexture(20, "ATSF Late)");
        InsertTexture(21, "EMD Freight Demo");
        InsertTexture(22, "NYC (Early)");
        InsertTexture(23, "NYC (Grey)");
        InsertTexture(24, "NYC (Late)");
        InsertTexture(25, "EMD Passenger Demo");
        InsertTexture(26, "WM (Speed Lettering)");
        InsertTexture(27, "WM (Circus)");
        InsertTexture(28, "WM (Fireball)");
    }

    public DieselF3A(World world, double d, double d1, double d2){
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
        return "EMD F3a";
    }

    




}
