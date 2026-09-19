package tb.dev;

/**
 * Classpath marker for development-only source output.
 * Normal production jars omit src/dev, so main code can safely use this marker
 * as a fallback when Forge's deobfuscated-environment blackboard flag is wrong.
 */
public final class DevEnvironmentMarker
{
    private DevEnvironmentMarker()
    {
    }
}
