package train.common.tile;

import train.common.library.Info;

public class TileCrafterTierIII extends TileCrafterTierAbstract {

	public TileCrafterTierIII() {
		super(3);
	}

	@Override
	public String getInventoryName() {
		return "TierIII";
	}

	@Override
	public String getGUIName() {
		return "Advanced age";
	}

	@Override
	public String getGUITexture() {
		return Info.TEX_TIER_III;
	}
	
	@Override
	public void updateEntity() {
	}
}