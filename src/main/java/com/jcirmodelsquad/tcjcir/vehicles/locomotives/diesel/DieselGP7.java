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

public class DieselGP7 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP7;
    }
    public DieselGP7(World world) {
        super(world, EnumTrains.GP7.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Avanste Northeastern (Late)");
        InsertTexture(1, "Burlington Northern (Ex CBQ)");
        InsertTexture(2, "Butte, Anaconda & Pacific (Early)");
        InsertTexture(3, "Chicago Northwestern");
        InsertTexture(4, "Avanste Northeastern (As Delivered)");
        InsertTexture(5, "Fox Union Resources (FURRX)");
        InsertTexture(6, "Bangor & Aroostook (Early)");
        InsertTexture(7, "Bangor & Aroostook (Late)");
        InsertTexture(8, "West Creek Pacific");
        InsertTexture(9, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(10, "Carbondale & Pine Valley (CSWR Buyout)", LockoutGroup.CPV);
        InsertTexture(11, "Carbondale & Pine Valley 11", LockoutGroup.CPV);
        InsertTexture(12, "waltuh white gp7");
        InsertTexture(13, "Deadwood & La Mesa (Early)");
        InsertTexture(14, "Deadwood & La Mesa (Late)");
        InsertTexture(15, "Blandsville & Blankerston");
        InsertTexture(16, "Amtrak MOW");
        InsertTexture(17, "Seaboard Coast Line");
        InsertTexture(18, "Denver & Rio Grande Western (Early)");
        InsertTexture(19, "Denver & Rio Grande Western (Early 2?)");
        InsertTexture(10, "Denver & Rio Grande Western (Late Small Logo)");
        InsertTexture(21, "Denver & Rio Grande Western (Late Big Logo)");
        InsertTexture(22, "US Army");
        InsertTexture(23, "Great Northern (Emp Builder)");
        InsertTexture(24, "Great Northern (EB Simp)");
        InsertTexture(25, "Great Northern (BSB)");
        InsertTexture(26, "Washaska & Old Fox RR Co 21");
        InsertTexture(27, "Washaska & Old Fox RR Co 26");
        InsertTexture(28, "New York Central (Early)");
        InsertTexture(29, "New York Central (Lightning Bolt)");
        InsertTexture(30, "New York Central (Late)");
        InsertTexture(31, "New York Central (Grey Lighting Bolt)");
        InsertTexture(32, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(33, "ATSF (Pinstripe)");
        InsertTexture(34, "ATSF (Zebrastripe)");
        InsertTexture(35, "MKT");
        InsertTexture(36, "Penn Central");
        InsertTexture(37, "Northern Pacific");
        InsertTexture(38, "Northern Pacific");
        InsertTexture(39, "Cotton Belt/ Southern Pacific");
        InsertTexture(40, "Cotton Belt/ Southern Pacific");
        InsertTexture(41, "Southern Pacific");
        InsertTexture(42, "Western Pacific");
        InsertTexture(43, "Deadwood & Northern");
        InsertTexture(44, "CNW 1518");
        InsertTexture(45, "Great Lakes & Northern Territories (Ex FNCC)");
        InsertTexture(46, "Monongahela");
        InsertTexture(47, "WCP (stupid bozo chop)");
        InsertTexture(48, "CDCS");
        InsertTexture(49, "JRN");
        InsertTexture(50, "GCCR");
        InsertTexture(51, "WM (As Delivered)");
        InsertTexture(52, "WM (Chop Nose)");
        InsertTexture(53, "WM (Chop Nose Circus Scheme)");
    }
    public DieselGP7(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.55, 0.15, -0.35); }
    







    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    

    @Override
    public String getInventoryName() {
        return "EMD GP7";
    }

    


    

}