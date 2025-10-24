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

public class DieselU23B extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU23B;
    }
    public DieselU23B(World world) {
        super(world, EnumTrains.U23B.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Union Pacific");
        InsertTexture(1, "Fox Union Rail Resources (FURRX)");
        InsertTexture(2, "Conrail");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "Deep Rock Railroad", LockoutGroup.BIDA);
        InsertTexture(5, "Deep Rock Railroad (C&PV Patch)", LockoutGroup.CPV);
        InsertTexture(6, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(7, "ATSF (Pinstripe)");
        InsertTexture(8, "ATSF (Freightbonnet)");
        InsertTexture(9, "Deleware & Hudson");
        InsertTexture(10, "Southern");
        InsertTexture(11, "MoPac");
        InsertTexture(12, "Western Pacific");
        InsertTexture(13, "Western Pacific");
        InsertTexture(14, "Deadwood & La Mesa");
        InsertTexture(15, "Penn Central");
        InsertTexture(16, "Seaboard System");
        InsertTexture(17, "CFW 558", LockoutGroup.BIDA);
        InsertTexture(18, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(19, "Milwaukee Road");
        InsertTexture(20, "Nomansi & Eastern Pacific");
        InsertTexture(21, "ADT");
        InsertTexture(22, "ADT (Ex UP)");
        InsertTexture(23, "Suffern Hoboken Interstate Transfer 211");
        InsertTexture(24, "Detroit Export System", LockoutGroup.DES);
        InsertTexture(25, "Magnolia Properties");
        InsertTexture(26, "AGW");
        InsertTexture(27, "CNRC 5001 & 5002", LockoutGroup.CNRC);
        InsertTexture(28, "CSXT (Bluedown)");
        InsertTexture(29, "CSXT (Stealth)");
        InsertTexture(30, "CSXT (YN1)");
        InsertTexture(31, "CSXT (YN2)");
        InsertTexture(32, "Chessie System");
    }
    public DieselU23B(World world, double d, double d1, double d2){
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
        return "GE U23B";
    }

    

    


}
