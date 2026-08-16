package train.client.render;

import train.common.api.RollingStockLightFunction;

/** Perceptual beam dimension math. */
final class BeamVisibilityScaling {
    private BeamVisibilityScaling() {}

    static float fixtureReach(
            float fixtureIntensity, RollingStockLightFunction.LampResponse response) {
        if (response != RollingStockLightFunction.LampResponse.INCANDESCENT) {
            return 1.0F;
        }
        float clamped = Math.max(0.0F, Math.min(1.0F, fixtureIntensity));
        return (float) Math.sqrt(clamped);
    }

    static float effectiveDimension(
            float configuredDimension, float daylightScale, float fixtureReach) {
        return configuredDimension * daylightScale * fixtureReach;
    }
}
