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

public class DieselC424 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselC424; }

    public DieselC424(World world) {
        super(world, EnumTrains.C424.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Spokane, Portland & Seattle");
        InsertTexture(1, "Morristown & Erie");
        InsertTexture(2, "Western New York & Pennsylvania");
        InsertTexture(3, "Washaska & Old Fox RR");
        InsertTexture(4, "Latrans Range RR", LockoutGroup.LRR);
        InsertTexture(5, "NdeM");
        InsertTexture(6, "NdeM");
        InsertTexture(7, "Blandsville & Blankerston");
        InsertTexture(8, "Nautilus");
        InsertTexture(9, "Deadwood & La Mesa");
        InsertTexture(10, "Penn Central");
        InsertTexture(11, "FNCC 2nd order(KIT-L)", LockoutGroup.FNCC);
        InsertTexture(12, "Burlington Northern");
        InsertTexture(13, "Great Lakes & Northern Territories");
    }

    public DieselC424(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String getInventoryName() { return "ALCo C424"; }

    

    
    

}
