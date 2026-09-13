package tmt;

/** Dependency-free policy for Minecraft's packed block/sky light value in the TMT backend. */
public final class IlluminatedSurfaceLighting
{
    private static final int LIGHT_FLOOR = 10;
    private IlluminatedSurfaceLighting() { }

    /** Raises only the packed block-light component to the default floor, preserving sky light. */
    public static int applyLightFloor(int ambientLight)
    {
        return applyLightFloor(ambientLight, LIGHT_FLOOR);
    }

    /** Maps normalized emission intensity to a block-light floor while preserving sky light. */
    public static int applyEmissionIntensity(int ambientLight, float intensity)
    {
        float clamped = Math.max(0.0F, Math.min(1.0F, intensity));
        return applyLightFloor(ambientLight, Math.round(15.0F * clamped));
    }

    private static int applyLightFloor(int ambientLight, int floor)
    {
        int block = Math.max(ambientLight >> 4 & 0xFFFF, floor);
        int sky = ambientLight >> 20 & 0xFFFF;
        return block << 4 | sky << 20;
    }
}
