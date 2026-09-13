/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import train.common.Traincraft;
import train.common.library.Info;

import java.io.File;

import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

public class ConfigHandler {
	public static final String CATEGORY_TRAIN_LIFECYCLE_DIAGNOSTICS = "CATEGORY_TRAIN_LIFECYCLE_DIAGNOSTICS";

	public static boolean ORE_GEN;
	public static boolean COPPER_ORE_GEN;
	public static boolean ENABLE_ZEPPELIN;
	public static boolean SOUNDS;
	public static boolean FLICKERING;
	public static boolean ENABLE_STEAM;
	public static boolean ENABLE_DIESEL;
	public static boolean ENABLE_ELECTRIC;
	public static boolean ENABLE_BUILDER;
	public static boolean ENABLE_TENDER;
	public static boolean CHUNK_LOADING;
	public static boolean SHOW_POSSIBLE_COLORS;
	public static boolean ENERGYTRACK_USES_RF;
	public static int TRAINCRAFT_VILLAGER_ID;
	public static int WINDMILL_CHECK_RADIUS;
	public static boolean REAL_TRAIN_SPEED;
	public static boolean RETROGEN_CHUNKS;
	public static boolean MAKE_MODPACKS_GREAT_AGAIN;
	public static boolean FORCE_TEXTURE_BINDING;
	public static boolean DISABLE_NEI_RECIPES;
	public static boolean DISABLE_TRAIN_WORKBENCH;
	public static boolean ENABLE_WAGON_REMOVAL_NOTICES;
	public static boolean ENABLE_LOGGING;
	public static boolean ENABLE_TRAIN_SAVE_LIFECYCLE_LOGGING;
	public static boolean ENABLE_TRAIN_ATTACK_REMOVAL_GUARD;
	public static boolean ALLOW_MOB_DAMAGE_ROLLING_STOCK;
	public static boolean LOG_DENIED_TRAIN_REMOVAL;
	public static double MAX_TRAIN_REMOVAL_DISTANCE;
	public static boolean FIRST_RUN;
	public static boolean ALLOW_ATO_ON_STEAMERS;
	public static boolean ENABLE_TILT_HANDLER;
	public static boolean DISABLE_PAINTBRUSH_GUI_ANIMATION;
	public static boolean DISABLE_PAINTBRUSH_GUI_MODELS;
	public static boolean ENABLE_BAP_SPLIT_TABS;
	public static boolean CREATIVE_DROP_ROLLINGSTOCK;
	public static boolean ENABLE_DSS_WEBUI;
	public static boolean ENGINEERGAMING;
	public static boolean ENABLE_TMT_MODEL_BATCHING;
    /** Compatibility mirror for integrations that still treat enhanced lighting as a boolean. */
    public static boolean ENABLE_ADVANCED_LIGHTING = true;
    /** Active three-tier client lighting quality. */
    public static LightingMode LIGHTING_MODE = LightingMode.FULL;
    public static int MAX_TRUSTEES_ON_PADLOCK;
	public static String[] ROLLINGSTOCK_INVENTORY_BLACKLIST_RAW;

	public static boolean ROLLINGSTOCK_INVENTORY_BAN_OPEN_FLUID_CONTAINERS;

	public static boolean ROLLINGSTOCK_PLAYER_SCALING;
    private static final String ADVANCED_LIGHTING_KEY = "Enable_Advanced_Lighting";
    private static final String LIGHTING_MODE_KEY = "Lighting_Mode";
    private static final String ADVANCED_LIGHTING_COMMENT =
        "Enables Traincraft's enhanced client lighting effects. Disable to use the original "
        + "1.7 model lighting path on lower-spec or incompatible hardware.";
    private static final String LIGHTING_MODE_COMMENT =
        "Client lighting quality: ORIGINAL uses the original 1.7 renderer, ENHANCED keeps "
        + "illuminated fixtures and glows without projected cones, and FULL enables cones, "
        + "hotspots, rolling-stock occlusion, and shadows.";
    private static File activeConfigFile;

	public static void changeFirstLoad(){
		Configuration cf = new Configuration(new File(Traincraft.configDirectory, Info.modName + ".cfg"), "1.0");
		cf.load();
		cf.get(CATEGORY_GENERAL, "FIRST_RUN", true).set(false);
		cf.save();
	}

	public static void init(File configFile) {
        activeConfigFile = configFile;
		Configuration cf = new Configuration(configFile, "1.0");

		try
		{
			final String CATEGORY_INVENTORY = "CATEGORY_INVENTORY";
			cf.load();
			/* General */
			SOUNDS = cf.get(CATEGORY_GENERAL, "ENABLE_SOUNDS", true).getBoolean(true);
			FLICKERING = cf.get(CATEGORY_GENERAL, "DISABLE_FLICKERING", true).getBoolean(true);
			ORE_GEN = cf.get(CATEGORY_GENERAL, "ENABLE_FUEL_ORES_SPAWN", true).getBoolean(true);
			COPPER_ORE_GEN = cf.get(CATEGORY_GENERAL, "ENABLE_COPPER_SPAWN", true).getBoolean(true);
			ENABLE_ZEPPELIN = cf.get(CATEGORY_GENERAL, "ENABLE_ZEPPELIN", true).getBoolean(true);
			ENABLE_STEAM = cf.get(CATEGORY_GENERAL, "ENABLE_STEAM_TRAINS", true).getBoolean(true);
			ENABLE_DIESEL = cf.get(CATEGORY_GENERAL, "ENABLE_DIESEL_TRAINS", true).getBoolean(true);
			ENABLE_ELECTRIC = cf.get(CATEGORY_GENERAL, "ENABLE_ELECTRIC_TRAINS", true).getBoolean(true);
			ENABLE_BUILDER = cf.get(CATEGORY_GENERAL, "ENABLE_TRACKS_BUILDER", true).getBoolean(true);
			ENABLE_TENDER = cf.get(CATEGORY_GENERAL, "ENABLE_TENDERS", true).getBoolean(true);
			CHUNK_LOADING = cf.get(CATEGORY_GENERAL, "ENABLE_CHUNK_LOADING", true).getBoolean(true);
			TRAINCRAFT_VILLAGER_ID = cf.get(CATEGORY_GENERAL, "TRAINCRAFT_VILLAGER_ID", 86).getInt();
			Property SHOW_POSSIBLE_COLORS_PROP = cf.get(CATEGORY_GENERAL, "SHOW_POSSIBLE_TRAINS_COLORS_IN_CHAT", true);
			SHOW_POSSIBLE_COLORS_PROP.comment = "This will disable the chat messages telling you the possible colors when spawning new trains and when coloring them with dye";
			SHOW_POSSIBLE_COLORS = SHOW_POSSIBLE_COLORS_PROP.getBoolean(true);
			REAL_TRAIN_SPEED = cf.get(CATEGORY_GENERAL, "REAL_TRAIN_SPEED", false).getBoolean(false);
			ENERGYTRACK_USES_RF = cf.getBoolean("ENERGYTRACK_USES_RF", CATEGORY_GENERAL, true, "Here you can define, if electric tracks should be powered by redstone (false) or use 'real' RF-power (true) [Default: true]");
			RETROGEN_CHUNKS = cf.getBoolean("ENABLE_RETROGEN", CATEGORY_GENERAL, false, "This will generate ores in existing chunks prior to installing Traincraft 5. Do note that if this is off chunks that are loaded will not retrogen later, no matter what.");
			MAKE_MODPACKS_GREAT_AGAIN = cf.getBoolean("MAKE_MODPACKS_GREAT_AGAIN", CATEGORY_GENERAL, false,
					"This will disable some of Traincrafts easier recipes to balance Modpacks");
			WINDMILL_CHECK_RADIUS = cf.getInt("WINDMILL_CHECK_RADIUS", CATEGORY_GENERAL, 1, -1, 10, "This sets the radius for the can-see-the-sky-check area around the windmill. 0=only location of windmill, 1=3x3, 2=5x5 etc. Use -1 to turn of this check completely. DEFAULT: 1");
			FORCE_TEXTURE_BINDING = cf.get(CATEGORY_GENERAL, "Force_Texture_Binding", true, "Enable this if trains and rollingstock are using block/item textures").getBoolean(true);
			ENABLE_TMT_MODEL_BATCHING = cf.get(CATEGORY_GENERAL, "Enable_TMT_Model_Batching", true, "Batches compatible static rollingstock model boxes into fewer display-list calls. Disable if a custom model renders incorrectly.").getBoolean(true);
            Property previousAdvancedLightingProperty = advancedLightingProperty(cf);
            boolean hasLightingMode = cf.hasKey(CATEGORY_GENERAL, LIGHTING_MODE_KEY);
            // Migrate the historical boolean only when the explicit quality key does not exist.
            // Both values are then written so older integrations continue to see a coherent flag.
            LIGHTING_MODE = hasLightingMode
                            ? LightingMode.parse(lightingModeProperty(cf).getString())
                            : previousAdvancedLightingProperty.getBoolean(true)
                              ? LightingMode.FULL
                              : LightingMode.ORIGINAL;
            ENABLE_ADVANCED_LIGHTING = LIGHTING_MODE.enhancedFixtures();
            lightingModeProperty(cf).set(LIGHTING_MODE.name());
            previousAdvancedLightingProperty.set(ENABLE_ADVANCED_LIGHTING);
			DISABLE_NEI_RECIPES = cf.get(CATEGORY_GENERAL, "DISABLE_NEI_RECIPES", false, "disables our system of registering recipes with NEI").getBoolean(false);
			DISABLE_TRAIN_WORKBENCH = cf.get(CATEGORY_GENERAL, "DISABLE_TRAIN_WORKBENCH", false, "disables the train workbench, for those of you who want to use a custom part builder").getBoolean(false);
			ENABLE_WAGON_REMOVAL_NOTICES = cf.get(CATEGORY_GENERAL, "ENABLE_WAGON_REMOVAL_NOTICES", true, "When OP and creative mode, tells you the owner of the train or rollingstock you just removed").getBoolean(true);
			ENABLE_LOGGING = cf.get(CATEGORY_GENERAL, "ENABLE_TRANSPORT_LOGGING", true, "Logs the data for trains and rollingstock, turning this off will improve performance but break the admin book").getBoolean(true);
			ENABLE_TRAIN_SAVE_LIFECYCLE_LOGGING = cf.get(CATEGORY_GENERAL, "ENABLE_TRAIN_SAVE_LIFECYCLE_LOGGING", false, "Diagnostic-only logging for Traincraft entity chunk save/load decisions, especially writeToNBTOptional skips.").getBoolean(false);
			ENABLE_TRAIN_SAVE_LIFECYCLE_LOGGING = cf.get(CATEGORY_TRAIN_LIFECYCLE_DIAGNOSTICS, "ENABLE_TRAIN_SAVE_LIFECYCLE_LOGGING", false, "Diagnostic-only logging for Traincraft entity chunk save/load decisions, especially writeToNBTOptional skips.").getBoolean(false);
			ENABLE_TRAIN_ATTACK_REMOVAL_GUARD = cf.get(CATEGORY_TRAIN_LIFECYCLE_DIAGNOSTICS, "ENABLE_TRAIN_ATTACK_REMOVAL_GUARD", true, "Requires train removal damage to come from a nearby real server-side player, preventing fake/player-context server damage from deleting rolling stock.").getBoolean(true);
			ALLOW_MOB_DAMAGE_ROLLING_STOCK = cf.get(CATEGORY_TRAIN_LIFECYCLE_DIAGNOSTICS, "ALLOW_MOB_DAMAGE_ROLLING_STOCK", true, "Allows non-player mob projectiles and creeper explosions to damage unlocked Traincraft rolling stock. Mob melee, server, fake-player, generic, and environmental sources remain blocked by this option.").getBoolean(true);
			MAX_TRAIN_REMOVAL_DISTANCE = cf.get(CATEGORY_TRAIN_LIFECYCLE_DIAGNOSTICS, "MAX_TRAIN_REMOVAL_DISTANCE", 8.0D, "Maximum distance in blocks for player damage to be allowed to permanently remove rolling stock.").getDouble(8.0D);
			LOG_DENIED_TRAIN_REMOVAL = cf.get(CATEGORY_TRAIN_LIFECYCLE_DIAGNOSTICS, "LOG_DENIED_TRAIN_REMOVAL", true, "Logs denied Traincraft rolling stock damage-removal attempts to the save lifecycle log when lifecycle logging is enabled.").getBoolean(true);

			FIRST_RUN = cf.get(CATEGORY_GENERAL, "FIRST_RUN", true).getBoolean(true);
			ALLOW_ATO_ON_STEAMERS = cf.get(CATEGORY_GENERAL, "ALLOW_ATO_ON_STEAMERS", false, "Allows Minecraft Train Control's ATO system to be used on steam trains").getBoolean(true);
			ENABLE_TILT_HANDLER = cf.get(CATEGORY_GENERAL, "ENABLE_TILT_HANDLER", false, "Allows certain trains to tilt into curves, as a visual effect. As of 1.6, it isn't perfect and there could be issues. Try it if you want, though. [default: false]").getBoolean(false);
			DISABLE_PAINTBRUSH_GUI_ANIMATION = cf.get(CATEGORY_GENERAL, "DISABLE_PAINTBRUSH_GUI_ANIMATION", false, "Defaults to pausing animation in paintbrush menu.").getBoolean(false);
			DISABLE_PAINTBRUSH_GUI_MODELS = cf.get(CATEGORY_GENERAL, "DISABLE_PAINTBRUSH_GUI_MODELS", false, "Defaults to hiding models in the paintbrush menu. Potentially useful on lower-spec machines.").getBoolean(false);
			ENABLE_BAP_SPLIT_TABS = cf.get(CATEGORY_GENERAL, "ENABLE_BAP_SPLIT_TABS", true).getBoolean(true);
			CREATIVE_DROP_ROLLINGSTOCK = cf.get(CATEGORY_GENERAL, "CREATIVE_DROP_ROLLINGSTOCK", true).getBoolean(true);
			ENGINEERGAMING = cf.get(CATEGORY_GENERAL, "ENGINEERGAMING", false).getBoolean(false);
            MAX_TRUSTEES_ON_PADLOCK = cf.get(CATEGORY_GENERAL, "MAX_TRUSTEES_ON_PADLOCK", false, "Defaults to hiding models in the paintbrush menu. Potentially useful on lower-spec machines.").getInt(30);
			ROLLINGSTOCK_INVENTORY_BLACKLIST_RAW = cf.get(CATEGORY_INVENTORY, "ROLLINGSTOCK_INVENTORY_BLACKLIST_RAW",
					new String[]
					{
							"ThermalFoundation:Storage:0-15",
							"ThermalExpansion:Cache",
							"ThermalExpansion:Strongbox",
							"etfuturum:shulker_box",
							"ImmersiveEngineering:woodenDevice"
					},
					"List of banned INVENTORY items").getStringList();
			ROLLINGSTOCK_INVENTORY_BAN_OPEN_FLUID_CONTAINERS = cf.get(CATEGORY_INVENTORY, "ROLLINGSTOCK_INVENTORY_BAN_OPEN_FLUID_CONTAINERS",
					false, "Blocks open fluid containers from being stored in Freight Cars").getBoolean(false);
			ROLLINGSTOCK_PLAYER_SCALING = cf.get(CATEGORY_GENERAL, "ROLLINGSTOCK_PLAYER_SCALING",
					true, "Toggles player scaling").getBoolean(true);
		} catch (Exception e) {
			Traincraft.tcLog.fatal("Traincraft had a problem loading its configuration\n" + e);
		} finally {
			if(cf.hasChanged()) {
				cf.save();
			}
		}
	}

    /**
     * Compatibility setter that maps the historical boolean to the two endpoint quality modes.
     *
     * @param enabled {@code true} for {@link LightingMode#FULL}, otherwise
     *     {@link LightingMode#ORIGINAL}
     */
    public static void setAdvancedLightingEnabled(boolean enabled)
    {
        setLightingMode(enabled ? LightingMode.FULL : LightingMode.ORIGINAL);
    }

    /**
     * Persists and applies a client lighting quality mode.
     *
     * @param mode requested mode; {@code null} safely restores {@link LightingMode#FULL}
     */
    public static void setLightingMode(LightingMode mode)
    {
        LIGHTING_MODE = mode == null ? LightingMode.FULL : mode;
        ENABLE_ADVANCED_LIGHTING = LIGHTING_MODE.enhancedFixtures();
        File configFile = activeConfigFile == null
                          ? new File(Traincraft.configDirectory, Info.modName + ".cfg")
                          : activeConfigFile;
        Configuration configuration = new Configuration(configFile, "1.0");
        configuration.load();
        lightingModeProperty(configuration).set(LIGHTING_MODE.name());
        advancedLightingProperty(configuration).set(ENABLE_ADVANCED_LIGHTING);
        configuration.save();
    }

    /** @return whether enhanced emissive fixture and glow rendering is enabled */
    public static boolean enhancedLightingEnabled()
    {
        return ENABLE_ADVANCED_LIGHTING && LIGHTING_MODE.enhancedFixtures();
    }

    /** @return whether projected cones, hotspots, occlusion, and shadows are enabled */
    public static boolean projectedLightingEnabled()
    {
        return ENABLE_ADVANCED_LIGHTING && LIGHTING_MODE.projectedEffects();
    }

    private static Property advancedLightingProperty(Configuration configuration)
    {
        return configuration.get(
                   CATEGORY_GENERAL,
                   ADVANCED_LIGHTING_KEY,
                   true,
                   ADVANCED_LIGHTING_COMMENT);
    }

    /** Returns the persisted three-tier lighting quality property from one configuration. */
    private static Property lightingModeProperty(Configuration configuration)
    {
        return configuration.get(
                   CATEGORY_GENERAL,
                   LIGHTING_MODE_KEY,
                   LightingMode.FULL.name(),
                   LIGHTING_MODE_COMMENT);
    }

    /** Client lighting quality ordered from compatibility rendering to complete projection. */
    public enum LightingMode
    {
        /** Original Traincraft 1.7 model lighting with no enhanced fixture effects. */
        ORIGINAL(false, false),
        /** Emissive fixtures and glows without projected cones or their occlusion costs. */
        ENHANCED(true, false),
        /** Complete enhanced lighting including cones, hotspots, occlusion, and shadows. */
        FULL(true, true);

        private final boolean enhancedFixtures;
        private final boolean projectedEffects;

        LightingMode(boolean enhancedFixtures, boolean projectedEffects)
        {
            this.enhancedFixtures = enhancedFixtures;
            this.projectedEffects = projectedEffects;
        }

        /** @return whether emissive fixtures and glow surfaces use the enhanced path */
        public boolean enhancedFixtures()
        {
            return enhancedFixtures;
        }

        /** @return whether projected effects and their occlusion paths are enabled */
        public boolean projectedEffects()
        {
            return projectedEffects;
        }

        /** @return next mode in the GUI cycle, wrapping from FULL to ORIGINAL */
        public LightingMode next()
        {
            switch (this)
            {
                case ORIGINAL:
                    return ENHANCED;
                case ENHANCED:
                    return FULL;
                default:
                    return ORIGINAL;
            }
        }

        /** Returns a case-insensitive persisted mode, defaulting safely to {@link #FULL}. */
        static LightingMode parse(String value)
        {
            if (value != null)
            {
                try
                {
                    return valueOf(value.trim().toUpperCase(java.util.Locale.ROOT));
                }
                catch (IllegalArgumentException ignored)
                {
                    // Preserve the full feature set when a hand-edited value is unrecognized.
                }
            }
            return FULL;
        }
    }
}
