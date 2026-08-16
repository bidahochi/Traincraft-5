package train.client.render;

/** Pure color math shared by the direct and offscreen beam renderers. */
final class BeamColorCompositing {
    static final int SOURCE_ALPHA = 90;

    private BeamColorCompositing() {}

    static int premultipliedChannel(int channel, int sourceAlpha, float intensity) {
        float clamped = Math.max(0.0F, Math.min(1.0F, intensity));
        return Math.round(channel * (sourceAlpha / 255.0F) * clamped);
    }

    static float opacity(float ambientAlpha, float fixtureIntensity) {
        float ambient = Math.max(0.0F, Math.min(1.0F, ambientAlpha));
        float fixture = Math.max(0.0F, Math.min(1.0F, fixtureIntensity));
        return ambient * fixture;
    }
}
