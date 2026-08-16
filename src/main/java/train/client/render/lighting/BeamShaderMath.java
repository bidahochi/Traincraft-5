package train.client.render.lighting;

/** Pure Java counterpart of the legacy beam fragment shader. */
final class BeamShaderMath
{
    private BeamShaderMath() {}

    static float fade(float fraction)
    {
        return 1.0F - clamp(fraction);
    }

    static float alpha(float fraction, float opacity)
    {
        return (BeamColorCompositing.SOURCE_ALPHA / 255.0F) * clamp(opacity) * fade(fraction);
    }

    static float directChannel(float channel, float fraction)
    {
        return clamp(channel) * fade(fraction);
    }

    static float premultipliedChannel(float channel, float fraction, float opacity)
    {
        return clamp(channel) * alpha(fraction, opacity);
    }

    private static float clamp(float value)
    {
        return Math.max(0.0F, Math.min(1.0F, value));
    }
}
