package train.common.appearance;

import train.common.utils.SharedJsonParser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import train.common.api.LightFixtureType;
import train.common.api.LightFunctionOverride;
import train.common.api.RollingStockLightOverride;
import train.common.api.RollingStockDitchHornMode;
import train.common.api.RollingStockLightActivationPolicy;
import train.common.api.RollingStockLightBehaviorOverride;
import train.common.api.RollingStockLightChannel;
import train.common.api.RollingStockLightDefinition;
import train.common.api.RollingStockLightFunction;
import train.common.api.RollingStockSkinLighting;

/**
 * Portable parser and property-wise merger for V1 rolling-stock appearance lighting.
 *
 * <p>Unknown object members survive merging because the raw merged tree is retained. Known
 * lighting members are validated before a physical contribution is accepted, preventing one
 * malformed higher-priority pack from corrupting valid lower-priority data.</p>
 */
public final class RollingStockAppearanceJson
{
    public static final int SCHEMA_VERSION = 1;

    private static final Pattern NAMESPACED_ID =
        Pattern.compile("[a-z0-9_.-]+:[a-z0-9_./-]+");
    private static final Pattern FIXTURE_ID =
        Pattern.compile("[A-Za-z0-9_:./-]+");

    private RollingStockAppearanceJson()
    {
    }

    /**
     * Validates and merges physical resource contributions in ascending pack priority.
     *
     * @param expectedStockId namespaced stock id requested by the renderer
     * @param contributions ordered low-to-high resource contributions
     * @return parsed effective lighting, merged raw JSON, and rejected-contribution diagnostics
     */
    public static Result merge(
        String expectedStockId, List<Contribution> contributions)
    {
        requireNamespacedId(expectedStockId, "stock id");
        JsonObject merged = new JsonObject();
        List<String> diagnostics = new ArrayList<String>();
        int accepted = 0;
        if (contributions != null)
        {
            for (Contribution contribution : contributions)
            {
                try
                {
                    validateHeader(expectedStockId, contribution.json());
                    JsonObject candidate = cloneObject(merged);
                    mergeObject(candidate, contribution.json());
                    validateContribution(expectedStockId, candidate);
                    merged = candidate;
                    accepted++;
                }
                catch (IllegalArgumentException exception)
                {
                    diagnostics.add(
                        contribution.sourceName() + ": " + exception.getMessage());
                }
            }
        }
        if (accepted == 0)
        {
            return new Result(null, null, diagnostics, 0);
        }
        RollingStockAppearanceLighting lighting = parseLighting(expectedStockId, merged, diagnostics);
        return new Result(lighting, cloneObject(merged), diagnostics, accepted);
    }

    /**
     * Parses one already merged object, primarily for editor validation before atomic replacement.
     *
     * @param expectedStockId namespaced target stock id
     * @param json merged or single-contribution appearance object
     * @return validated lighting document
     */
    public static RollingStockAppearanceLighting parse(
        String expectedStockId, JsonObject json)
    {
        validateContribution(expectedStockId, json);
        return parseLighting(
            expectedStockId, cloneObject(json), new ArrayList<String>());
    }

    /** Recursively overlays explicitly present source properties onto a target object. */
    public static void mergeObject(JsonObject target, JsonObject source)
    {
        for (Entry<String, JsonElement> entry : source.entrySet())
        {
            String key = entry.getKey();
            JsonElement sourceValue = entry.getValue();
            JsonElement targetValue = target.get(key);
            if (sourceValue != null
                    && sourceValue.isJsonObject()
                    && targetValue != null
                    && targetValue.isJsonObject())
            {
                mergeObject(targetValue.getAsJsonObject(), sourceValue.getAsJsonObject());
            }
            else
            {
                target.add(key, cloneElement(sourceValue));
            }
        }
    }

    private static void validateContribution(String expectedStockId, JsonObject json)
    {
        validateHeader(expectedStockId, json);
        parseLighting(expectedStockId, json, new ArrayList<String>());
    }

    /** Checks each physical resource before merging; function inheritance is validated on the candidate. */
    private static void validateHeader(String expectedStockId, JsonObject json)
    {
        if (json == null)
        {
            throw new IllegalArgumentException("appearance root must be an object");
        }
        int schemaVersion = requiredInt(json, "schemaVersion");
        if (schemaVersion != SCHEMA_VERSION)
        {
            throw new IllegalArgumentException(
                "unsupported schemaVersion " + schemaVersion);
        }
        String stockId = json.has("stock") ? requiredString(json, "stock") : expectedStockId;
        requireNamespacedId(stockId, "stock");
        if (expectedStockId.equals(stockId) == false)
        {
            throw new IllegalArgumentException(
                "stock '" + stockId + "' does not match requested '" + expectedStockId + "'");
        }
    }

    private static RollingStockAppearanceLighting parseLighting(
        String stockId, JsonObject root, List<String> diagnostics)
    {
        JsonObject lightingObject = optionalObject(root, "lighting");
        RollingStockSkinLighting defaults = RollingStockSkinLighting.EMPTY;
        Map<String, RollingStockSkinLighting> profiles =
            new LinkedHashMap<String, RollingStockSkinLighting>();
        if (lightingObject != null)
        {
            JsonObject defaultsObject = optionalObject(lightingObject, "defaults");
            defaults = parseLayer(defaultsObject, "lighting.defaults");
            JsonObject profilesObject = optionalObject(lightingObject, "profiles");
            if (profilesObject != null)
            {
                for (Entry<String, JsonElement> entry : profilesObject.entrySet())
                {
                    requireNamespacedId(entry.getKey(), "lighting profile id");
                    JsonObject profileObject =
                        requiredObject(entry.getValue(), "lighting profile " + entry.getKey());
                    profiles.put(
                        entry.getKey(),
                        parseLayer(profileObject, "lighting.profiles." + entry.getKey()));
                }
            }
        }

        Map<String, RollingStockAppearanceLighting.Skin> skins =
            new LinkedHashMap<String, RollingStockAppearanceLighting.Skin>();
        JsonObject skinsObject = optionalObject(root, "skins");
        if (skinsObject != null)
        {
            for (Entry<String, JsonElement> entry : skinsObject.entrySet())
            {
                String skinId = entry.getKey();
                requireNamespacedId(skinId, "skin id");
                JsonObject skinObject =
                    requiredObject(entry.getValue(), "skin " + skinId);
                List<String> aliases = parseAliases(skinObject, skinId);
                JsonObject skinLighting = optionalObject(skinObject, "lighting");
                String profileId =
                    skinLighting == null ? null : optionalString(skinLighting, "profile");
                if (profileId != null)
                {
                    requireNamespacedId(profileId, "skin profile reference");
                    if (profiles.containsKey(profileId) == false)
                    {
                        diagnostics.add(
                            "skin '" + skinId + "' references missing profile '" + profileId + "'");
                    }
                }
                RollingStockSkinLighting local =
                    parseLayer(skinLighting, "skins." + skinId + ".lighting");
                skins.put(
                    skinId,
                    new RollingStockAppearanceLighting.Skin(
                        skinId, aliases, profileId, local));
            }
        }
        RollingStockAppearanceLighting result = new RollingStockAppearanceLighting(stockId, defaults, profiles, skins);
        validateFunctions(defaults);
        for (RollingStockSkinLighting profile : profiles.values())
        {
            validateFunctions(RollingStockSkinLighting.immutableComposite(defaults, profile));
        }
        for (String skin : skins.keySet())
        {
            validateFunctions(result.resolve(skin));
        }
        return result;
    }

    /** Rejects invalid combined function settings before a document reaches render-time caches. */
    private static void validateFunctions(RollingStockSkinLighting lighting)
    {
        for (Entry<String, RollingStockLightOverride> entry : lighting.lightOverrides().entrySet())
        {
            String group = entry.getValue().group();
            RollingStockLightOverride shared = lighting.lightOverrides().get(group);
            if (shared != null && shared.group() != null && shared.group().isEmpty() == false)
            {
                throw new IllegalArgumentException("Fixture " + entry.getKey() + " references group " + group
                    + " which is itself a group member; physical groups cannot be nested");
            }
            if (entry.getValue().behavior() != null)
            {
                entry.getValue().behavior().apply(RollingStockLightDefinition.headlight(entry.getKey(), 0, 0, 0));
            }
        }
    }

    private static List<String> parseAliases(JsonObject skinObject, String skinId)
    {
        JsonElement aliasesElement = skinObject.get("legacyAliases");
        if (aliasesElement == null)
        {
            return Collections.emptyList();
        }
        if (aliasesElement.isJsonArray() == false)
        {
            throw new IllegalArgumentException(
                "skin '" + skinId + "' legacyAliases must be an array");
        }
        List<String> aliases = new ArrayList<String>();
        JsonArray array = aliasesElement.getAsJsonArray();
        for (JsonElement element : array)
        {
            if (element.isJsonPrimitive() == false
                    || element.getAsJsonPrimitive().isString() == false
                    || element.getAsString().trim().isEmpty())
            {
                throw new IllegalArgumentException(
                    "skin '" + skinId + "' contains an invalid legacy alias");
            }
            aliases.add(element.getAsString());
        }
        return aliases;
    }

    private static RollingStockSkinLighting parseLayer(
        JsonObject layerObject, String path)
    {
        if (layerObject == null)
        {
            return RollingStockSkinLighting.EMPTY;
        }
        JsonObject fixturesObject = optionalObject(layerObject, "fixtures");
        if (fixturesObject == null)
        {
            return RollingStockSkinLighting.EMPTY;
        }
        RollingStockSkinLighting lighting = new RollingStockSkinLighting();
        for (Entry<String, JsonElement> entry : fixturesObject.entrySet())
        {
            String fixtureId = entry.getKey();
            if (FIXTURE_ID.matcher(fixtureId).matches() == false || "cull".equalsIgnoreCase(fixtureId))
            {
                throw new IllegalArgumentException(
                    path + " contains invalid fixture id '" + fixtureId + "'");
            }
            JsonObject fixture =
                requiredObject(entry.getValue(), path + ".fixtures." + fixtureId);
            parseFixture(lighting, fixtureId, fixture, path);
        }
        return RollingStockSkinLighting.immutableComposite(null, lighting);
    }

    private static void parseFixture(
        RollingStockSkinLighting lighting,
        String fixtureId,
        JsonObject fixture,
        String path)
    {
        if (fixture.has("group"))
        {
            String group = "";
            if (fixture.get("group").isJsonNull() == false)
            {
                if (fixture.get("group").isJsonPrimitive() == false
                    || fixture.getAsJsonPrimitive("group").isString() == false)
                {
                    throw new IllegalArgumentException(path + "." + fixtureId + ".group must be a string or null");
                }
                group = fixture.get("group").getAsString();
                if (group.isEmpty() == false && group.matches("[a-z0-9_:.\\-/]+") == false)
                {
                    throw new IllegalArgumentException(path + "." + fixtureId + ".group is invalid");
                }
                if (group.equals(fixtureId) || "cull".equals(group))
                {
                    throw new IllegalArgumentException(path + "." + fixtureId
                        + ".group cannot reference itself or the reserved cull name");
                }
            }
            lighting.setLightGroup(fixtureId, group);
        }
        if (fixture.has("enabled"))
        {
            lighting.setLightEnabled(
                fixtureId, requiredBoolean(fixture, "enabled"));
        }
        if (fixture.has("fixtureType"))
        {
            LightFixtureType fixtureType =
                enumValue(
                    LightFixtureType.class,
                    requiredString(fixture, "fixtureType"),
                    path + "." + fixtureId + ".fixtureType");
            lighting.setLightFixtureType(fixtureId, fixtureType);
        }
        if (fixture.has("preset"))
        {
            lighting.setLightPreset(fixtureId, requiredString(fixture, "preset"));
        }

        RollingStockLightBehaviorOverride.Builder behavior =
            RollingStockLightBehaviorOverride.builder();
        boolean authoredBehavior = false;
        if (fixture.has("controlCircuit"))
        {
            behavior.controlCircuit(
                enumValue(
                    RollingStockLightChannel.class,
                    requiredString(fixture, "controlCircuit"),
                    path + "." + fixtureId + ".controlCircuit"));
            authoredBehavior = true;
        }
        if (fixture.has("function"))
        {
            behavior.functionOverride(parseFunctionOverride(fixture.get("function"), fixture, "function"));
            authoredBehavior = true;
        }
        if (fixture.has("color"))
        {
            behavior.color(parseColor(fixture.get("color"), path + "." + fixtureId + ".color"));
            authoredBehavior = true;
        }
        if (fixture.has("effect"))
        {
            behavior.effect(
                enumValue(
                    RollingStockLightDefinition.Effect.class,
                    requiredString(fixture, "effect"),
                    path + "." + fixtureId + ".effect"));
            authoredBehavior = true;
        }
        if (fixture.has("beamLength"))
        {
            behavior.beamLength(finiteFloat(fixture, "beamLength", 0.0F, null));
            authoredBehavior = true;
        }
        if (fixture.has("beamWidth"))
        {
            behavior.beamWidth(finiteFloat(fixture, "beamWidth", 0.0F, null));
            authoredBehavior = true;
        }
        if (fixture.has("sourceGlowRadius"))
        {
            behavior.sourceGlowRadius(
                finiteFloat(fixture, "sourceGlowRadius", 0.0F, null));
            authoredBehavior = true;
        }
        if (fixture.has("sourceGlowIntensity"))
        {
            behavior.sourceGlowIntensity(
                finiteFloat(fixture, "sourceGlowIntensity", 0.0F, 1.0F));
            authoredBehavior = true;
        }
        if (fixture.has("sourceGlowWidthScale"))
        {
            behavior.sourceGlowWidthScale(
                finiteFloat(fixture, "sourceGlowWidthScale", Float.MIN_VALUE, null));
            authoredBehavior = true;
        }
        if (fixture.has("sourceGlowHeightScale"))
        {
            behavior.sourceGlowHeightScale(
                finiteFloat(fixture, "sourceGlowHeightScale", Float.MIN_VALUE, null));
            authoredBehavior = true;
        }
        if (fixture.has("sourceGlowRightOffset"))
        {
            behavior.sourceGlowRightOffset(
                finiteFloat(fixture, "sourceGlowRightOffset", null, null));
            authoredBehavior = true;
        }
        if (fixture.has("sourceGlowUpOffset"))
        {
            behavior.sourceGlowUpOffset(
                finiteFloat(fixture, "sourceGlowUpOffset", null, null));
            authoredBehavior = true;
        }
        if (fixture.has("hotspotEnabled"))
        {
            behavior.hotspotEnabled(requiredBoolean(fixture, "hotspotEnabled"));
            authoredBehavior = true;
        }
        if (fixture.has("clientProjectorEligible"))
        {
            behavior.clientProjectorEligible(
                requiredBoolean(fixture, "clientProjectorEligible"));
            authoredBehavior = true;
        }
        if (fixture.has("beamRotation"))
        {
            JsonObject rotation =
                requiredObject(
                    fixture.get("beamRotation"),
                    path + "." + fixtureId + ".beamRotation");
            behavior.beamRotation(
                finiteFloat(rotation, "pitchDegrees", null, null),
                finiteFloat(rotation, "yawDegrees", null, null));
            authoredBehavior = true;
        }
        if (fixture.has("activationPolicy"))
        {
            behavior.activationPolicy(
                enumValue(
                    RollingStockLightActivationPolicy.class,
                    requiredString(fixture, "activationPolicy"),
                    path + "." + fixtureId + ".activationPolicy"));
            authoredBehavior = true;
        }
        if (fixture.has("hornResponse"))
        {
            JsonObject horn =
                requiredObject(
                    fixture.get("hornResponse"),
                    path + "." + fixtureId + ".hornResponse");
            RollingStockDitchHornMode mode = null;
            if (horn.has("scope"))
            {
                mode = enumValue(
                    RollingStockDitchHornMode.class,
                    requiredString(horn, "scope"),
                    path + "." + fixtureId + ".hornResponse.scope");
            }
            LightFunctionOverride hornFunction =
                horn.has("function")
                ? parseFunctionOverride(horn.get("function"), horn, "horn function")
                : null;
            Integer phase = horn.has("phase")
                            ? Integer.valueOf(requiredInt(horn, "phase"))
                            : null;
            behavior.ditchHornResponse(mode, null, phase);
            if (phase != null && "horn_alternating_ditch".equalsIgnoreCase(optionalString(fixture, "preset")))
            {
                LightFunctionOverride phaseOverride = new LightFunctionOverride(null, null, null, null,
                    null, phase, null, null, null);
                hornFunction = phaseOverride.merge(hornFunction);
            }
            behavior.hornFunctionOverride(hornFunction);
            authoredBehavior = true;
        }
        if (fixture.has("lightmapFloor"))
        {
            behavior.lightmapFloor(
                boundedInt(fixture, "lightmapFloor", 0, 240));
            authoredBehavior = true;
        }
        if (authoredBehavior)
        {
            lighting.setLightBehavior(fixtureId, behavior.build());
        }
    }

    /** Patternless objects retain only authored properties, allowing lower layers to supply the rest. */
    private static LightFunctionOverride parseFunctionOverride(
        JsonElement element, JsonObject containingObject, String description)
    {
        if (element.isJsonObject() == false || element.getAsJsonObject().has("pattern"))
        {
            return LightFunctionOverride.replacing(parseFunction(element, containingObject, description));
        }
        JsonObject settings = element.getAsJsonObject();
        RollingStockLightFunction.HeadlightRequirement requirement = null;
        if (settings.has("headlightRequirement"))
        {
            requirement = enumValue(RollingStockLightFunction.HeadlightRequirement.class,
                requiredString(settings, "headlightRequirement"), description);
        }
        Float cycle = optionalPatchFloat(settings, "cycleTicks", Float.MIN_VALUE, null);
        Float horizontal = optionalPatchFloat(settings, "horizontalSweepDegrees", null, null);
        Float vertical = optionalPatchFloat(settings, "verticalSweepDegrees", null, null);
        Float duty = optionalPatchFloat(settings, "dutyCycle", 0.0F, 1.0F);
        Integer phase = null;
        if (settings.has("phase"))
        {
            phase = boundedInt(settings, "phase", 0, Integer.MAX_VALUE);
        }
        if (settings.has("phaseIndex"))
        {
            phase = boundedInt(settings, "phaseIndex", 0, Integer.MAX_VALUE);
        }
        Integer count = settings.has("phaseCount") ? boundedInt(settings, "phaseCount", 1, Integer.MAX_VALUE) : null;
        Float fadeIn = null;
        Float fadeOut = null;
        if (settings.has("lampResponse"))
        {
            JsonElement response = settings.get("lampResponse");
            if (response.isJsonObject())
            {
                fadeIn = optionalPatchFloat(response.getAsJsonObject(), "fadeInTicks", 0.0F, null);
                fadeOut = optionalPatchFloat(response.getAsJsonObject(), "fadeOutTicks", 0.0F, null);
            }
            else
            {
                RollingStockLightFunction.LampResponse parsed = parseLampResponse(settings, null);
                fadeIn = parsed.fadeInTicks();
                fadeOut = parsed.fadeOutTicks();
            }
        }
        return new LightFunctionOverride(requirement, cycle, horizontal, vertical, duty, phase, count, fadeIn, fadeOut);
    }

    /** Unlike ordinary defaults, absent patch fields must remain absent through composition. */
    private static Float optionalPatchFloat(JsonObject settings, String key, Float minimum, Float maximum)
    {
        return settings.has(key) ? finiteFloat(settings, key, minimum, maximum) : null;
    }

    private static RollingStockLightFunction parseFunction(
        JsonElement element, JsonObject containingObject, String description)
    {
        JsonObject settings;
        String type;
        if (element.isJsonPrimitive()
                && element.getAsJsonPrimitive().isString())
        {
            type = element.getAsString();
            settings = containingObject;
        }
        else if (element.isJsonObject())
        {
            settings = element.getAsJsonObject();
            type = requiredString(settings, "pattern");
        }
        else
        {
            throw new IllegalArgumentException(description + " must be a string or object");
        }

        String normalized = normalizeEnum(type);
        RollingStockLightFunction baseline;
        if (normalized.startsWith("PRIME_"))
        {
            int phase = parseTrailingInteger(normalized, "prime function");
            baseline = RollingStockLightFunction.prime(phase);
        }
        else
        {
            RollingStockLightFunction.Pattern pattern =
                enumValue(
                    RollingStockLightFunction.Pattern.class,
                    normalized,
                    description + " pattern");
            switch (pattern)
            {
                case GYRALITE:
                    baseline = RollingStockLightFunction.gyralite();
                    break;
                case MARS:
                    baseline = RollingStockLightFunction.mars();
                    break;
                case ALTERNATING:
                    baseline =
                        RollingStockLightFunction.alternatingDitch(
                            optionalInt(settings, "phase", 0),
                            parseLampResponse(settings, RollingStockLightFunction.LampResponse.INCANDESCENT));
                    break;
                case FLASH:
                    baseline = RollingStockLightFunction.commander();
                    break;
                case PHASED:
                    baseline =
                        RollingStockLightFunction.prime(
                            optionalInt(settings, "phase", 1));
                    break;
                case STEADY:
                default:
                    baseline = RollingStockLightFunction.STEADY;
                    break;
            }
        }

        RollingStockLightFunction.Pattern pattern =
            enumValue(
                RollingStockLightFunction.Pattern.class,
                optionalString(settings, "pattern") == null
                ? baseline.pattern().name()
                : optionalString(settings, "pattern"),
                description + " pattern");
        RollingStockLightFunction.HeadlightRequirement requirement =
            settings.has("headlightRequirement")
            ? enumValue(
                RollingStockLightFunction.HeadlightRequirement.class,
                requiredString(settings, "headlightRequirement"),
                description + " headlightRequirement")
            : baseline.headlightRequirement();
        float cycleTicks =
            optionalFiniteFloat(settings, "cycleTicks", baseline.cycleTicks());
        float horizontal =
            optionalFiniteFloat(
                settings, "horizontalSweepDegrees", baseline.horizontalSweepDegrees());
        float vertical =
            optionalFiniteFloat(
                settings, "verticalSweepDegrees", baseline.verticalSweepDegrees());
        float dutyCycle =
            optionalBoundedFloat(settings, "dutyCycle", baseline.dutyCycle(), 0.0F, 1.0F);
        int phaseIndex = settings.has("phaseIndex")
                         ? requiredInt(settings, "phaseIndex")
                         : settings.has("phase") && pattern != RollingStockLightFunction.Pattern.PHASED
                           ? requiredInt(settings, "phase")
                           : baseline.phaseIndex();
        int phaseCount =
            optionalInt(settings, "phaseCount", baseline.phaseCount());
        RollingStockLightFunction.LampResponse response =
            parseLampResponse(settings, baseline.lampResponse());
        return new RollingStockLightFunction(
            pattern,
            requirement,
            cycleTicks,
            horizontal,
            vertical,
            dutyCycle,
            phaseIndex,
            phaseCount,
            response);
    }

    private static RollingStockLightFunction.LampResponse parseLampResponse(
        JsonObject object, RollingStockLightFunction.LampResponse fallback)
    {
        JsonElement element = object.get("lampResponse");
        if (element == null)
        {
            return fallback;
        }
        if (element.isJsonPrimitive()
                && element.getAsJsonPrimitive().isString())
        {
            String preset = normalizeEnum(element.getAsString());
            if ("INSTANT".equals(preset))
            {
                return RollingStockLightFunction.LampResponse.INSTANT;
            }
            if ("LED".equals(preset))
            {
                return RollingStockLightFunction.LampResponse.LED;
            }
            if ("HALOGEN".equals(preset))
            {
                return RollingStockLightFunction.LampResponse.HALOGEN;
            }
            if ("INCANDESCENT".equals(preset))
            {
                return RollingStockLightFunction.LampResponse.INCANDESCENT;
            }
            throw new IllegalArgumentException("unknown lampResponse '" + preset + "'");
        }
        JsonObject response = requiredObject(element, "lampResponse");
        return RollingStockLightFunction.LampResponse.custom(
            response.has("fadeInTicks") ? finiteFloat(response, "fadeInTicks", 0.0F, null) : fallback.fadeInTicks(),
            response.has("fadeOutTicks") ? finiteFloat(response, "fadeOutTicks", 0.0F, null) : fallback.fadeOutTicks());
    }

    private static int parseColor(JsonElement element, String path)
    {
        if (element == null || element.isJsonPrimitive() == false)
        {
            throw new IllegalArgumentException(path + " must be a number or RGB string");
        }
        JsonPrimitive primitive = element.getAsJsonPrimitive();
        if (primitive.isNumber())
        {
            return primitive.getAsInt();
        }
        if (primitive.isString())
        {
            String value = primitive.getAsString().trim();
            if (value.startsWith("#"))
            {
                value = value.substring(1);
            }
            else if (value.startsWith("0x") || value.startsWith("0X"))
            {
                value = value.substring(2);
            }
            if (value.matches("[0-9A-Fa-f]{6}") == false)
            {
                throw new IllegalArgumentException(path + " must contain exactly six hexadecimal digits");
            }
            return (int)Long.parseLong(value, 16);
        }
        throw new IllegalArgumentException(path + " must be a number or RGB string");
    }

    private static <T extends Enum<T>> T enumValue(
        Class<T> enumType, String value, String path)
    {
        try
        {
            return Enum.valueOf(enumType, normalizeEnum(value));
        }
        catch (IllegalArgumentException exception)
        {
            throw new IllegalArgumentException(path + " has unknown value '" + value + "'");
        }
    }

    private static String normalizeEnum(String value)
    {
        return value.trim().replace('-', '_').toUpperCase(Locale.ROOT);
    }

    private static void requireNamespacedId(String value, String description)
    {
        if (value == null || NAMESPACED_ID.matcher(value).matches() == false)
        {
            throw new IllegalArgumentException(
                description + " must be a lowercase namespaced id");
        }
    }

    private static JsonObject optionalObject(JsonObject parent, String key)
    {
        JsonElement element = parent.get(key);
        if (element == null)
        {
            return null;
        }
        return requiredObject(element, key);
    }

    private static JsonObject requiredObject(JsonElement element, String path)
    {
        if (element == null || element.isJsonObject() == false)
        {
            throw new IllegalArgumentException(path + " must be an object");
        }
        return element.getAsJsonObject();
    }

    private static String requiredString(JsonObject object, String key)
    {
        String value = optionalString(object, key);
        if (value == null || value.trim().isEmpty())
        {
            throw new IllegalArgumentException(key + " must be a non-empty string");
        }
        return value;
    }

    private static String optionalString(JsonObject object, String key)
    {
        JsonElement element = object.get(key);
        if (element == null)
        {
            return null;
        }
        if (element.isJsonPrimitive() == false
                || element.getAsJsonPrimitive().isString() == false)
        {
            throw new IllegalArgumentException(key + " must be a string");
        }
        return element.getAsString();
    }

    private static boolean requiredBoolean(JsonObject object, String key)
    {
        JsonElement element = object.get(key);
        if (element == null
                || element.isJsonPrimitive() == false
                || element.getAsJsonPrimitive().isBoolean() == false)
        {
            throw new IllegalArgumentException(key + " must be a boolean");
        }
        return element.getAsBoolean();
    }

    private static int requiredInt(JsonObject object, String key)
    {
        JsonElement element = object.get(key);
        if (element == null
                || element.isJsonPrimitive() == false
                || element.getAsJsonPrimitive().isNumber() == false)
        {
            throw new IllegalArgumentException(key + " must be an integer");
        }
        double value = element.getAsDouble();
        int integer = element.getAsInt();
        if (finite(value) == false || value != integer)
        {
            throw new IllegalArgumentException(key + " must be an integer");
        }
        return integer;
    }

    private static int boundedInt(
        JsonObject object, String key, int minimum, int maximum)
    {
        int value = requiredInt(object, key);
        if (value < minimum || value > maximum)
        {
            throw new IllegalArgumentException(
                key + " must be in the range " + minimum + ".." + maximum);
        }
        return value;
    }

    private static int optionalInt(JsonObject object, String key, int fallback)
    {
        return object.has(key) ? requiredInt(object, key) : fallback;
    }

    private static float finiteFloat(
        JsonObject object, String key, Float minimum, Float maximum)
    {
        JsonElement element = object.get(key);
        if (element == null
                || element.isJsonPrimitive() == false
                || element.getAsJsonPrimitive().isNumber() == false)
        {
            throw new IllegalArgumentException(key + " must be a finite number");
        }
        float value = element.getAsFloat();
        if (finite(value) == false
                || minimum != null && value < minimum
                || maximum != null && value > maximum)
        {
            throw new IllegalArgumentException(key + " is outside its valid range");
        }
        return value;
    }

    private static float optionalFiniteFloat(
        JsonObject object, String key, float fallback)
    {
        return object.has(key)
               ? finiteFloat(object, key, null, null)
               : fallback;
    }

    private static float optionalBoundedFloat(
        JsonObject object,
        String key,
        float fallback,
        float minimum,
        float maximum)
    {
        return object.has(key)
               ? finiteFloat(object, key, minimum, maximum)
               : fallback;
    }

    private static boolean finite(double value)
    {
        return Double.isNaN(value) == false && Double.isInfinite(value) == false;
    }

    private static boolean finite(float value)
    {
        return Float.isNaN(value) == false && Float.isInfinite(value) == false;
    }

    private static int parseTrailingInteger(String value, String description)
    {
        int separator = value.lastIndexOf('_');
        if (separator < 0 || separator == value.length() - 1)
        {
            throw new IllegalArgumentException(description + " requires a numeric phase");
        }
        try
        {
            return Integer.parseInt(value.substring(separator + 1));
        }
        catch (NumberFormatException exception)
        {
            throw new IllegalArgumentException(description + " requires a numeric phase");
        }
    }

    private static JsonElement cloneElement(JsonElement element)
    {
        return element == null ? null : SharedJsonParser.INSTANCE.parse(element.toString());
    }

    private static JsonObject cloneObject(JsonObject object)
    {
        return cloneElement(object).getAsJsonObject();
    }

    /** One physical pack contribution plus its diagnostic display name. */
    public static final class Contribution
    {
        private final String sourceName;
        private final JsonObject json;

        /**
         * @param sourceName resource-pack or file name used in diagnostics
         * @param json root appearance object
         */
        public Contribution(String sourceName, JsonObject json)
        {
            this.sourceName = sourceName == null ? "<unknown>" : sourceName;
            this.json = cloneObject(json);
        }

        /** @return diagnostic display name */
        public String sourceName()
        {
            return sourceName;
        }

        /** @return detached physical contribution tree */
        public JsonObject json()
        {
            return cloneObject(json);
        }
    }

    /** Immutable result of validating and merging ordered physical contributions. */
    public static final class Result
    {
        private final RollingStockAppearanceLighting lighting;
        private final JsonObject mergedJson;
        private final List<String> diagnostics;
        private final int acceptedContributionCount;

        private Result(
            RollingStockAppearanceLighting lighting,
            JsonObject mergedJson,
            List<String> diagnostics,
            int acceptedContributionCount)
        {
            this.lighting = lighting;
            this.mergedJson = mergedJson;
            this.diagnostics =
                Collections.unmodifiableList(new ArrayList<String>(diagnostics));
            this.acceptedContributionCount = acceptedContributionCount;
        }

        /** @return parsed lighting, or {@code null} when no contribution was usable */
        public RollingStockAppearanceLighting lighting()
        {
            return lighting;
        }

        /** @return detached merged raw document, or {@code null} when no contribution was usable */
        public JsonObject mergedJson()
        {
            return mergedJson == null ? null : cloneObject(mergedJson);
        }

        /** @return immutable rejected-contribution and missing-profile diagnostics */
        public List<String> diagnostics()
        {
            return diagnostics;
        }

        /** @return number of accepted physical pack contributions */
        public int acceptedContributionCount()
        {
            return acceptedContributionCount;
        }
    }
}
