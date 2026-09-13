package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.FakePlayer;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

import java.util.Random;

public class DieselGP49 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp49")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_164", "marker_body_165", "marker_body_189",
            "marker_body_190")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_19", "numberboard_body_20", "numberboard_body_81",
            "numberboard_body_82")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP49;
    }
    public DieselGP49(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "Alaska Railroad");
        InsertTexture(1, "Fox Union Rail Resources (FURRX)");
        InsertTexture(2, "Great Lakes & Northern Territories"); // Great Lakes & Northern Testicles
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.95, 0.15, -0.325); }

    private static final double[][]	blockpos	= { { 4, 0, 1 }, { 4, 0, -1 }, { 4, 0, 0 }};
    private double[] point1;
    private FakePlayer fakePlayer = null;
    private int rotation =0;

    private static final float radianF = (float) Math.PI / 180.0f;
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (worldObj.isRemote || bogieLoco==null) {
            return;
        }

        if (fakePlayer == null){
            fakePlayer = new FakePlayer(worldObj);
        }
        rotation = MathHelper.floor_double(Math.toDegrees(Math.atan2(
                bogieLoco.posZ - posZ,
                bogieLoco.posX - posX)));

        point1 = rotateVec3(blockpos[0], getPitch(), rotation);
        point1[0] += posX;point1[1] += posY;point1[2] += posZ;
        mineSnow(worldObj, point1, locoInvent, fakePlayer);
        point1[1]++;
        mineSnow(worldObj, point1, locoInvent, fakePlayer);
        point1[1]++;
        mineSnow(worldObj, point1, locoInvent, fakePlayer);


        point1 = rotateVec3(blockpos[1], getPitch(), rotation);
        point1[0] += posX;point1[1] += posY;point1[2] += posZ;
        mineSnow(worldObj, point1, locoInvent, fakePlayer);
        point1[1]++;
        mineSnow(worldObj, point1, locoInvent, fakePlayer);
        point1[1]++;
        mineSnow(worldObj, point1, locoInvent, fakePlayer);


        point1 = rotateVec3(blockpos[2], getPitch(), rotation);
        point1[0] += posX;point1[1] += posY+1;point1[2] += posZ;
        mineSnow(worldObj, point1, locoInvent, fakePlayer);
        point1[1]++;
        mineSnow(worldObj, point1, locoInvent, fakePlayer);

    }

    private static void mineSnow(World worldObj, double[] point, ItemStack[] locoInvent, FakePlayer fakePlayer){
        Block b = worldObj.getBlock(MathHelper.floor_double(point[0]),MathHelper.floor_double(point[1]),MathHelper.floor_double(point[2]));
        int blockMeta = worldObj.getBlockMetadata(MathHelper.floor_double(point[0]), MathHelper.floor_double(point[1]),
                MathHelper.floor_double(point[2]));

        if((b == Blocks.snow || b == Blocks.snow_layer) && b.canHarvestBlock(fakePlayer, blockMeta)){
            worldObj.setBlockToAir(MathHelper.floor_double(point[0]),MathHelper.floor_double(point[1]),MathHelper.floor_double(point[2]));
            int snowballs = new Random().nextInt(9);
            for(int i=2; i<locoInvent.length && snowballs>0; i++){
                if (locoInvent[i] == null){
                    locoInvent[i] = new ItemStack(Items.snowball, snowballs);
                    snowballs--;
                } else if (locoInvent[i].getItem() == Items.snowball && locoInvent[i].stackSize < Items.snowball.getItemStackLimit()){
                    while (locoInvent[i].stackSize < locoInvent[i].getMaxStackSize() && snowballs >0){
                        locoInvent[i].stackSize++;
                        snowballs--;
                    }
                }
                if (snowballs ==0){
                    break;
                }
            }
            if (snowballs >0){
                EntityItem entityitem = new EntityItem(worldObj, point[0], point[1] + 1, point[2], new ItemStack(Items.snowball, snowballs));
                entityitem.delayBeforeCanPickup = 10;
                worldObj.spawnEntityInWorld(entityitem);

            }
        }
    }

    private static double[] rotateVec3(double[] offset, float pitch, float yaw) {
        double[] xyz = new double[]{offset[0],offset[1],offset[2]};
        //rotate pitch
        if (pitch != 0.0F) {
            pitch *= radianF;

            xyz[0] = (offset[0] * Math.cos(pitch));
            xyz[1] = (offset[0] * Math.sin(pitch));
        }
        //rotate yaw
        if (yaw != 0.0F) {
            yaw *= radianF;
            double cos = MathHelper.cos(yaw);
            double sin = MathHelper.sin(yaw);

            xyz[0] = (offset[0] * cos) - (offset[2] * sin);
            xyz[2] = (offset[0] * sin) + (offset[2] * cos);
        }
        return xyz;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String transportYear() {
        return "1983-1985";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP49";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}