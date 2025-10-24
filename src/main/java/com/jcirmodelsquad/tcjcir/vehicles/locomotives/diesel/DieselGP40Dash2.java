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

public class DieselGP40Dash2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP40Dash2;
    }
    public DieselGP40Dash2(World world) {
        super(world, EnumTrains.GP40Dash2.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Florida East Coast");
        InsertTexture(1, "Paradox Rail");
        InsertTexture(2, "Western Pacific");
        InsertTexture(3, "Western Pacific");
        InsertTexture(4, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(5, "Avanste Northeastern");
        InsertTexture(6, "Avanste Northeastern (Snow Service)");
        InsertTexture(7, "Amtrak (PH III)");
        InsertTexture(8, "Norfolk Southern");
        InsertTexture(9, "Athearn RTR GP40 (Avanste Northeastern)");
        InsertTexture(10, "DRGW (big logo)");
        InsertTexture(11, "Seaboard System");
        InsertTexture(12, "CSXT (YN3)");
        InsertTexture(13, "CSXT (YN2)");
        InsertTexture(14, "JRN");
        InsertTexture(15, "Chessie System");
        InsertTexture(16, "");
        InsertTexture(17, "");
        InsertTexture(18, "");
        InsertTexture(19, "");
        InsertTexture(20, "");
        InsertTexture(21, "");
        InsertTexture(22, "");
        InsertTexture(23, "");
        InsertTexture(24, "");
        InsertTexture(25, "");
        InsertTexture(26, "");
        InsertTexture(27, "");
        InsertTexture(28, "");
        InsertTexture(29, "");
        InsertTexture(30, "");
        InsertTexture(31, "");
    }
    public DieselGP40Dash2(World world, double d, double d1, double d2){
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
        return "EMD GP40";
    }

    

    
    

}
