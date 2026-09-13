package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class DieselGP15T extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp15t")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "rear_marker_body_391", "rear_marker_body_392")
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_178", "marker_body_179", "marker_body_189",
            "marker_body_190", "marker_nose")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_24", "numberboard_body_25", "numberboard_body_91",
            "numberboard_body_92")
        .build();

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.DieselGP15T;
	}
	public DieselGP15T(World world) {
		super(world, LiquidManager.dieselFilter());
		
		InsertTexture(0, "Chessie System");
		InsertTexture(1, "CSXT (Bluedown)");
		InsertTexture(2, "CSXT (Stripe)");
		InsertTexture(3, "CSXT (Yn1)");
		InsertTexture(4, "CSXT (Yn2)");
		InsertTexture(5, "CSXT (Yn3)");
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = 2.5;
		double yOffset = 0.2;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
		if(side.isServer()){
			rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
			rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
			anglePitchClient = serverRealPitch*60;
		}
		float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
				+ riddenByEntity.getYOffset() + yOffset);
		float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
		double bogieX1 = (this.posX + (rotationCos1 * distance));
		double bogieZ1 = (this.posZ + (rotationSin1* distance));
		if(anglePitchClient>20 && rotationCos1 == 1){
			bogieX1 -= pitchRads * 2;
			pitch-=pitchRads*1.2;
		}
		if(anglePitchClient>20 && rotationSin1 == 1){
			bogieZ1 -= pitchRads * 2;
			pitch-=pitchRads*1.2;
		}
		if (pitchRads == 0.0) {
			riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
		}
		if (pitchRads > -1.01 && pitchRads < 1.01) {
			riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
		}
	}

	@Override
	public String getInventoryName() {
		return "EMD GP15T";
	}

	@Override
	public String transportYear() { return "1976-1983";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.0F);
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}