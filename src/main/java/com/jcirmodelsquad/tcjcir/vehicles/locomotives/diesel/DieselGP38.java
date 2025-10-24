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

public class DieselGP38 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP38;
    }
    public DieselGP38(World world) {
        super(world, EnumTrains.GP38.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Fox Union Rail Resources (FURRX)");
        InsertTexture(1, "FNCC (GP38ac, Kit-L)", LockoutGroup.FNCC);
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Nomansi & Eastern Pacific");
        InsertTexture(4, "Nomansi & Eastern Pacific (GP38R)");
        InsertTexture(5, "ATSF (Pinstripe)");
        InsertTexture(6, "ATSF (Freightbonnet)");
        InsertTexture(7, "ATSF (Kodachrome)");
        InsertTexture(8, "Penn Central");
        InsertTexture(9, "Great Lakes & Northern Territories");
        InsertTexture(10, "SNCT 301 (Protolance)", LockoutGroup.SNCT);
        InsertTexture(11, "SNCT 302 (Protolance)", LockoutGroup.SNCT);
        InsertTexture(12, "GLNT JCIR 6 years");
        InsertTexture(13, "ANW");
        InsertTexture(14, "ANW (Chevrons)");
        InsertTexture(15, "Georgia Northeastern");
        InsertTexture(16, "Monongahela (Early)");
        InsertTexture(17, "Monongahela (Late)");
        InsertTexture(18, "AA (Fog)");
        InsertTexture(19, "CSXT (Yn1)");
        InsertTexture(20, "CSXT (Stealth)");
        InsertTexture(21, "CSXT (Bluedown)");
        InsertTexture(22, "Seaboard System");
        InsertTexture(23, "Chessie System");
    }
    public DieselGP38(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.9, 0.15, -0.325); }


    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.25F;
    }



    @Override
    public String getInventoryName() {
        return "EMD GP38";
    }






}
