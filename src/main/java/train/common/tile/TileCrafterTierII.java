package train.common.tile;

import train.common.library.Info;

public class TileCrafterTierII extends TileCrafterTierAbstract {

	public TileCrafterTierII() {
		super(2);
	}

	@Override
	public String getInventoryName() {
		return "TierII";
	}

	@Override
	public String getGUIName() {
		return "Steel age";
	}

	@Override
	public String getGUITexture() {
		return Info.TEX_TIER_II;
	}

	// @Override
	// public void updateEntity() {
	// }
}