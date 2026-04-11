package train.common.tile;

import train.common.library.Info;

public class TileCrafterTierI extends TileCrafterTierAbstract {


	public TileCrafterTierI() {
		super(1);
	}

	@Override
	public String getInventoryName() {
		return "TierI";
	}

	@Override
	public String getGUIName() {
		return "Iron age";
	}

	@Override
	public String getGUITexture() {
		return Info.TEX_TIER_I;
	}


	/*
	@Override // Just no.
	public void updateEntity() {
		super.updateEntity();
	}*/
}