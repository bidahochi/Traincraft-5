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
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class DieselGP35 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP35;
    }
    public DieselGP35(World world) {
        super(world, EnumTrains.GP35.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Ann Arbor");
        InsertTexture(1, "Ann Arbor (Ferry in the Fog)");
        InsertTexture(2, "Southern");
        InsertTexture(3, "Western Pacific");
        InsertTexture(4, "Western Pacific");
        InsertTexture(5, "Southern Pacific (Early)");
        InsertTexture(6, "Southern Pacific (Late)");
        InsertTexture(7, "Conrail");
        InsertTexture(8, "Blandsville & Blankerston");
        InsertTexture(9, "Port of Latona Terminal Railroad");
        InsertTexture(10, "Great Lakes Central");
        InsertTexture(11, "Union Pacific (Ex-WP)");
        InsertTexture(12, "Conway Scenic");
        InsertTexture(13, "DRGW (Small logo)");
        InsertTexture(14, "DRGW (Big logo)");
        InsertTexture(15, "New York Central");
        InsertTexture(16, "New York Central");
        InsertTexture(17, "Avanste Northeastern");
        InsertTexture(18, "AMEX 2019");
        InsertTexture(19, "Great Lakes & North Territories");
        InsertTexture(20, "Ann Arbor (OLS)");
        InsertTexture(21, "Ann Arbor (Ex SouP)");
        InsertTexture(22, "GLC (Cigar Band)");
        InsertTexture(23, "GLC 385");
        InsertTexture(24, "GLC 391");
        InsertTexture(25, "GLC (Ex Sou)");
        InsertTexture(26, "TSBY");
        InsertTexture(27, "BN 2521");
        InsertTexture(28, "BN 2535");
        InsertTexture(29, "BN 2552 (Ex SLSF)");
        InsertTexture(30, "BN 2576 (Ex SLSF)");
        InsertTexture(31, "GLC 393");
        InsertTexture(32, "CSXT (Blue Down)");
        InsertTexture(33, "CSXT (Yn1)");
        InsertTexture(34, "Seaboard System");
        InsertTexture(35, "Chessie System");
        InsertTexture(36, "WM (Speed Lettering)");
        InsertTexture(37, "WM (Circus)");
    }
    public DieselGP35(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.7, 0.15, -0.325); }
    



    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F;
    }



    @Override
    public String getInventoryName() {
        return "EMD GP35 (Phase 1)";
    }

    


    

}
