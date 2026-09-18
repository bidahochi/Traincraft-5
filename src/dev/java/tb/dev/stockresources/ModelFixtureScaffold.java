package tb.dev.stockresources;

import com.google.gson.JsonObject;
import fexcraft.fvtm.ModelDetailInformation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

/** Cold development adapter for model formats that expose TMT parts; never renders geometry. */
public final class ModelFixtureScaffold
{
    private final Map<Class<?>, List<Field>> fieldsByType = new HashMap<Class<?>, List<Field>>();

    /** Creates a discovery session whose field metadata is reused across the startup scan. */
    public ModelFixtureScaffold()
    {
    }

    /**
     * Collects explicit fixture IDs, recognized plain identifiers and built-in preset tags from
     * supported model containers and child parts without changing shared models. Plain identifiers
     * must match [a-z][a-z0-9_]*; arbitrary box names are not included.
     * Repeated IDs share one entry. Conflicting defaults abort generation instead of picking
     * an arbitrary part. Plain identifiers have no lighting role and start disabled.
     */
    public JsonObject discover(ModelBase model) throws IllegalAccessException
    {
        Map<String, JsonObject> fixtures = new TreeMap<String, JsonObject>();
        Set<Object> visited = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
        collect(model, fixtures, visited);
        JsonObject result = new JsonObject();
        for (Map.Entry<String, JsonObject> fixture : fixtures.entrySet())
        {
            result.add(fixture.getKey(), fixture.getValue());
        }
        return result;
    }

    /** Traverses only model/part containers, never arbitrary entity or renderer state. */
    private void collect(Object value, Map<String, JsonObject> fixtures, Set<Object> visited)
            throws IllegalAccessException
    {
        if (value == null || visited.add(value) == false)
        {
            return;
        }
        if (value instanceof ModelRendererTurbo)
        {
            ModelRendererTurbo part = (ModelRendererTurbo) value;
            addPart(part, fixtures);
            collect(part.childModels, fixtures, visited);
        }
        else if (value instanceof ModelBase)
        {
            for (Field field : fields(value.getClass()))
            {
                collect(field.get(value), fixtures, visited);
            }
        }
        else if (value instanceof ModelDetailInformation)
        {
            collect(((ModelDetailInformation) value).models, fixtures, visited);
        }
        else if (value.getClass().isArray())
        {
            for (int index = 0; index < Array.getLength(value); index++)
            {
                collect(Array.get(value, index), fixtures, visited);
            }
        }
        else if (value instanceof Iterable<?>)
        {
            for (Object member : (Iterable<?>) value)
            {
                collect(member, fixtures, visited);
            }
        }
        else if (value instanceof Map<?, ?>)
        {
            for (Object member : ((Map<?, ?>) value).values())
            {
                collect(member, fixtures, visited);
            }
        }
    }

    /** Legacy Java geometry has no common enumeration API; cache its relevant fields once. */
    private List<Field> fields(Class<?> type)
    {
        List<Field> cached = fieldsByType.get(type);
        if (cached != null)
        {
            return cached;
        }
        List<Field> discovered = new ArrayList<Field>();
        for (Class<?> current = type; current != null && current != Object.class; current = current.getSuperclass())
        {
            for (Field field : current.getDeclaredFields())
            {
                Class<?> fieldType = field.getType();
                while (fieldType.isArray())
                {
                    fieldType = fieldType.getComponentType();
                }
                if (Modifier.isStatic(field.getModifiers()) == false
                    && (ModelBase.class.isAssignableFrom(fieldType)
                        || ModelDetailInformation.class.isAssignableFrom(fieldType)
                        || ModelRendererTurbo.class.isAssignableFrom(fieldType)
                        || Iterable.class.isAssignableFrom(fieldType) || Map.class.isAssignableFrom(fieldType)))
                {
                    field.setAccessible(true);
                    discovered.add(field);
                }
            }
        }
        Collections.sort(discovered, Comparator.comparing(Field::getName));
        fieldsByType.put(type, discovered);
        return discovered;
    }

    /** Bare preset tags are shared defaults; an independent ID takes precedence when present. */
    private static void addPart(ModelRendererTurbo part, Map<String, JsonObject> fixtures)
    {
        String preset = preset(part.legacyLightName());
        String id = part.lightFixtureId;
        if (id == null)
        {
            id = part.partIdentifier();
        }
        if (id == null && preset != null)
        {
            id = part.boxName;
        }
        if (id == null || "cull".equals(id))
        {
            return;
        }
        JsonObject settings = new JsonObject();
        if (preset != null)
        {
            settings.addProperty("preset", preset);
        }
        else if (part.lightFixtureId == null)
        {
            settings.addProperty("enabled", false);
        }
        JsonObject previous = fixtures.put(id, settings);
        if (previous != null && previous.equals(settings) == false)
        {
            throw new IllegalArgumentException("Conflicting model defaults for fixture '" + id + "'");
        }
    }

    /** Maps only exact built-in tags to existing JSON presets; never guesses from a part ID. */
    private static String preset(String name)
    {
        if (name == null)
        {
            return null;
        }
        switch (name)
        {
            case "lamp": return "headlight";
            case "ditch":
            case "ditch_left":
            case "ditch_right":
            case "ditchlight_left":
            case "ditchlight_right": return "ditch_light";
            case "marker": return "marker_light";
            case "numberboard": return "numberboard";
            case "interior": return "interior_light";
            case "instrument": return "instrument";
            case "commander": return "commander";
            case "prime1": return "prime_1";
            case "prime2": return "prime_2";
            case "prime3": return "prime_3";
            case "prime4": return "prime_4";
            default: return null;
        }
    }
}
