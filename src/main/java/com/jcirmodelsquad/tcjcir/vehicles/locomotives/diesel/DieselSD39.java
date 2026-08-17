package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSD39 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sd39")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_nar_body_524", "marker_nar_body_525", "marker_two_body_150",
            "marker_two_body_219", "marker_two_body_221", "marker_two_body_532")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_530", "front_numberboard_body_531", "rear_numberboard_body_209",
            "rear_numberboard_body_210")
        .build();

    @Override
    public SoundRecord getSoundRecord() {
        return EnumSounds.DieselSD39;
    }

    public DieselSD39(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "BNSF");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "TORE");
        InsertTexture(3, "NEP", LockoutGroup.CUBED);
        InsertTexture(4, "NEP", LockoutGroup.CUBED);
        InsertTexture(5, "NEP", LockoutGroup.CUBED);
        InsertTexture(6, "FURRX");
        InsertTexture(7, "Carbondale & Pine Valley", LockoutGroup.CPV);

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() {
        if (riddenByEntity == null) {
            return;
        }
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = 3.25;
        double yOffset = 0.15;
        float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
        float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
        if (side.isServer()) {
            rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
            rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
            anglePitchClient = serverRealPitch * 60;
        }
        float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
                + riddenByEntity.getYOffset() + yOffset);
        float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (this.posX + (rotationCos1 * distance));
        double bogieZ1 = (this.posZ + (rotationSin1 * distance));
        //System.out.println(rotationCos1+" "+rotationSin1);
        if (anglePitchClient > 20 && rotationCos1 == 1) {
            bogieX1 -= pitchRads * 2;
            pitch -= pitchRads * 1.2;
        }
        if (anglePitchClient > 20 && rotationSin1 == 1) {
            bogieZ1 -= pitchRads * 2 + 1;
            pitch -= pitchRads * 1.2;
        }
        if (pitchRads == 0.0) {
            riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1 - 0.0);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            riddenByEntity.setPosition(bogieX1, pitch, bogieZ1 + 0.0);
        }
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.4F;
    }

    @Override
    public String transportYear() {
        return "1968-1970";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD39";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
