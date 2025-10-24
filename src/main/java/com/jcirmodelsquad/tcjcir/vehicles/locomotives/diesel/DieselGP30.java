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

public class DieselGP30 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP30;
    }
    public DieselGP30(World world) {
        super(world, EnumTrains.GP30.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "ICG");
        InsertTexture(1, "ACL");
        InsertTexture(2, "CSX (YN1)");
        InsertTexture(3, "CSX (YN2)");
        InsertTexture(4, "CSX (MoW)");
        InsertTexture(5, "CR");
        InsertTexture(6, "DRGW (Small Logo)");
        InsertTexture(7, "ARR (Rebuilt)");
        InsertTexture(8, "UP");
        InsertTexture(9, "BN 2206");
        InsertTexture(10, "BN 2222");
        InsertTexture(11, "FNCC 250", LockoutGroup.FNCC);
        InsertTexture(12, "OC&G 35");
        InsertTexture(13, "MAG 84");
        InsertTexture(14, "KCS i mean CGW");
        InsertTexture(15, "DLMR");
        InsertTexture(16, "B&B");
        InsertTexture(17, "WV");
        InsertTexture(18, "GLNT");
        InsertTexture(19, "GN (Big Sky Blue)");
        InsertTexture(20, "CB&Q");
        InsertTexture(21, "CNW");
        InsertTexture(22, "Seaboard System");
        InsertTexture(23, "Chessie System");
    }
    public DieselGP30(World world, double d, double d1, double d2){
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
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F;
    }

    

    @Override
    public String getInventoryName() {
        return "EMD GP30";
    }






}
