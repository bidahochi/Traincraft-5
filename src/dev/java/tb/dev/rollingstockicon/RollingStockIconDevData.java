package tb.dev.rollingstockicon;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import cpw.mods.fml.common.Loader;
import net.minecraft.item.ItemStack;
import train.common.Traincraft;
import train.common.items.ItemAbstractRollingStock;
import train.common.library.Info;
import train.common.library.register.ITrainRecord;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File IO for the dev-only rollingstock icon generator.
 *
 * Settings and generated PNGs live under devdata/rollingstock_icons so production jars do not
 * need to ship table tooling or generated test artifacts.
 */
public class RollingStockIconDevData {
	public static final int GENERATOR_VERSION = 1;
	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

	private RollingStockIconDevData() {
	}

	public static File getBaseDirectory() {
		return new File(getProjectDirectory(), "devdata/rollingstock_icons");
	}

	private static File getProjectDirectory() {
		// In a normal Forge dev run, configDir is <project>/run/config.
		return new File(Loader.instance().getConfigDir(), "../..");
	}

	public static File getSettingsDirectory() {
		return new File(getBaseDirectory(), "settings");
	}

	public static File getIconsDirectory() {
		return new File(getBaseDirectory(), "icons");
	}

	public static File getSettingsFile(ITrainRecord record, int color) {
		return new File(getSettingsDirectory(), getIconId(record, color) + ".json");
	}

	public static File getIconFile(ITrainRecord record, int color) {
		return new File(getIconsDirectory(), getIconId(record, color) + ".png");
	}

	public static boolean hasSettings(ITrainRecord record, int color) {
		return getSettingsFile(record, color).isFile();
	}

	public static BufferedImage loadIcon(ITrainRecord record, int color) {
		File iconFile = getIconFile(record, color);
		if (!iconFile.isFile()) {
			return null;
		}

		try {
			return ImageIO.read(iconFile);
		} catch (IOException ignored) {
			return null;
		}
	}

	public static String getIconId(ITrainRecord record, int color) {
		return "v" + GENERATOR_VERSION + "_" + GeneratedRollingStockIconRenderer.getIconBaseName(record) + "_c" + color;
	}

	public static GeneratedRollingStockIconRenderer.CaptureSettings loadOrDefault(ItemStack stack, ITrainRecord record, int color) {
        GeneratedRollingStockIconRenderer.CaptureSettings defaults =
                GeneratedRollingStockIconRenderer.getDefaultSettings();
		File file = getSettingsFile(record, color);
		if (!file.isFile()) {
			return defaults;
		}

		FileReader reader = null;
		try {
			reader = new FileReader(file);
			JsonObject json = Traincraft.jsonParser.parse(reader).getAsJsonObject();
			return new GeneratedRollingStockIconRenderer.CaptureSettings(
					getFloat(json, "yaw", defaults.yaw),
					getFloat(json, "pitch", defaults.pitch),
					// Older settings files stored scale and scaleMultiplier separately.
					getFloat(json, "scale", defaults.scale) * getFloat(json, "scaleMultiplier", 1.0F),
					getFloat(json, "screenX", defaults.screenX),
					getFloat(json, "screenY", defaults.screenY),
					getFloat(json, "modelOffset", defaults.modelOffset),
					getInt(json, "cargoSelection", defaults.cargoSelection)
			);
		} catch (Exception ignored) {
			return defaults;
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException ignored) {
				}
			}
		}
	}

	public static boolean saveSettings(ItemStack stack, ITrainRecord record, int color, GeneratedRollingStockIconRenderer.CaptureSettings settings) {
		File directory = getSettingsDirectory();
		if (!directory.exists() && !directory.mkdirs()) {
			return false;
		}

		JsonObject json = new JsonObject();
		json.addProperty("generatorVersion", GENERATOR_VERSION);
		json.addProperty("trainInternalName", record.getInternalName());
		json.addProperty("itemResourceName", GeneratedRollingStockIconRenderer.getItemResourceName(record));
		json.addProperty("itemName", record.getItem() == null ? "" : record.getItem().getUnlocalizedName());
		json.addProperty("color", color);
		json.addProperty("yaw", settings.yaw);
		json.addProperty("pitch", settings.pitch);
		json.addProperty("scale", settings.scale);
		json.addProperty("screenX", settings.screenX);
		json.addProperty("screenY", settings.screenY);
		json.addProperty("modelOffset", settings.modelOffset);
		json.addProperty("cargoSelection", settings.cargoSelection);

		FileWriter writer = null;
		try {
			writer = new FileWriter(getSettingsFile(record, color));
			GSON.toJson(json, writer);
			return true;
		} catch (IOException ignored) {
			return false;
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException ignored) {
				}
			}
		}
	}

	public static boolean saveIcon(ITrainRecord record, int color, BufferedImage image) {
		if (image == null) {
			return false;
		}

		File directory = getIconsDirectory();
		if (!directory.exists() && !directory.mkdirs()) {
			return false;
		}

		try {
			return ImageIO.write(image, "png", getIconFile(record, color));
		} catch (IOException ignored) {
			return false;
		}
	}

	public static boolean saveIconToResourceSource(ITrainRecord record, BufferedImage image) {
		/*
		 * Generate writes to two places:
		 * - devdata/rollingstock_icons/icons for quick reload/inspection by this tool
		 * - src/main/resources/... so the production jar can ship normal item textures
		 */
		if (image == null) {
			return false;
		}

		File iconFile = getResourceSourceIconFile(record);
		if (iconFile == null) {
			return false;
		}

		File directory = iconFile.getParentFile();
		if (!directory.exists() && !directory.mkdirs()) {
			return false;
		}

		try {
			return ImageIO.write(image, "png", iconFile);
		} catch (IOException ignored) {
			return false;
		}
	}

	public static File getResourceSourceIconFile(ITrainRecord record) {
		// Convert the same item texture id used by registerIcons into its source PNG path.
		String texturePath = getItemTexturePath(record);
		if (texturePath.length() == 0) {
			return null;
		}

		String domain = Info.modID.toLowerCase();
		String iconPath = texturePath;
		int separator = texturePath.indexOf(':');
		if (separator >= 0) {
			domain = texturePath.substring(0, separator);
			iconPath = texturePath.substring(separator + 1);
		}

		if (domain.length() == 0 || iconPath.length() == 0 || iconPath.contains("..")) {
			return null;
		}

		if (iconPath.endsWith(".png")) {
			iconPath = iconPath.substring(0, iconPath.length() - 4);
		}

		File itemTextureRoot = new File(getProjectDirectory(), "src/main/resources/assets/" + domain + "/textures/items");
		return new File(itemTextureRoot, iconPath.replace('/', File.separatorChar) + ".png");
	}

	private static String getItemTexturePath(ITrainRecord record) {
		if (record == null || !(record.getItem() instanceof ItemAbstractRollingStock)) {
			return "";
		}

		return ((ItemAbstractRollingStock) record.getItem()).GetTexturePath();
	}

	private static float getFloat(JsonObject json, String key, float fallback) {
		return json.has(key) ? json.get(key).getAsFloat() : fallback;
	}

	private static int getInt(JsonObject json, String key, int fallback) {
		return json.has(key) ? json.get(key).getAsInt() : fallback;
	}
}
