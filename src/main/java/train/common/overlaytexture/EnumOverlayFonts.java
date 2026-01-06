package train.common.overlaytexture;

import train.common.library.Info;

public enum EnumOverlayFonts implements IOverlayFont {
    /**
     * Recommended Java font size: 16f.
     */
    OxygenSansSmall(Info.modID, "OxygenSansSmall.ttf"),
    /**
     * Recommended Java font size: 7f.
     * <p>Graciously created and provided by everyone's favorite fox, Bidahochi.</p>
     */
    BapSansSmall(Info.modID, "BapSans.ttf"),
    /**
     * Recommended Java font size: 16f.
     */
    OxygenSansMid(Info.modID, "OxygenSansMid.ttf");

    private final String resourcePath;
    private final String fileName;

    EnumOverlayFonts(String resourcePath, String fileName) {
        this.resourcePath = resourcePath;
        this.fileName = fileName;
    }

    @Override
    public String getName() {
        return this.name();
    }

    @Override
    public String getResourceDomain() {
        return this.resourcePath;
    }

    @Override
    public String getFileName() {
        return this.fileName;
    }
}