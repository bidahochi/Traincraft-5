package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2Handler;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.HydrogenTrain;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class PCH100H extends HydrogenTrain{

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.PCH100H;
    }
    public AutoTrain2Handler autoTrainHandler;
    public PCH100H(World world)
    {
        super(world);
        autoTrainHandler = new AutoTrain2Handler();
        initLoco();
    }
        public void initLoco() {
        fuelTrain = 0;
        inventorySize = 10;
        locoInvent = new ItemStack[inventorySize];
    }


    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.4797F, 0.2F, 0F, SeatRole.DRIVER)
        };
    }
    /*@Override
    public void updateRiderPosition() {
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX +2.5, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.5, posZ + 0.3);
            riddenByEntity.setPosition(posX +0, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.5, posZ + 0.3);
        }
    }*/

    @Override
    public void onUpdate() {
        checkInvent(locoInvent[0]);
        super.onUpdate();

      //  autoTrainHandler.operateAutoTrain(this);
    }

    @Override
    public void setLocoTurnedOnFromPacket(boolean set) {
        super.setLocoTurnedOnFromPacket(set);
        if (set) {
       /*     ArrayList<TrackSection> testDatabase = new ArrayList<>();
            testDatabase.add(new TrackSection(new Position(270, 4, 473), new Position(175, 4, 517), 15, false, "normal"));
            testDatabase.add(new TrackSection(new Position(189, 4, 518), new Position(177, 4, 518),15, false, "station"));
            testDatabase.add(new TrackSection(new Position(174, 4, 517), new Position(54, 4, 612), 40, false, "normal"));
            testDatabase.add(new TrackSection(new Position(54, 4, 612), new Position(-35, 4, 642), 15, false, "normal"));
            autoTrainHandler.loadedModule = new PassengerTrainModule();
            System.out.println(autoTrainHandler.startAutoTrain(testDatabase, this));
*/

        }
        /*this.bogieLoco = new EntityBogie(worldObj,
                (posX - Math.cos(this.serverRealRotation * TraincraftUtil.radian) * this.bogieShift),
                posY + ((Math.tan(this.renderPitch * TraincraftUtil.radian) * -this.bogieShift) + getMountedYOffset()),
                (posZ - Math.sin(this.serverRealRotation * TraincraftUtil.radian) * this.bogieShift), this, this.uniqueID, 0, this.bogieShift);*/
       /*System.out.println(autoTrainHandler.initialise
               AutoTrain(this, new Position(280, 4, 430)));*/


    }


    @Override
    public boolean canBeRidden() {
        return true;
    }

    @Override
    public boolean isStorageCart() {
        return false;
    }

    @Override
    public boolean isPoweredCart() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0.9F;
    }

    @Override
    public void pressKey(int i)
    {
        if (i == 7 && getActiveDriver() instanceof EntityPlayer)
        {
            ((EntityPlayer) getActiveDriver()).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }



    @Override
    public String getInventoryName() {
        return "PCH-100H";
    }

    



    @Override
    public int refuelingSlurpAmount() {
        return 1;
    }



}
