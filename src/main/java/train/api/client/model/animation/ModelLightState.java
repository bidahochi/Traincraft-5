package train.api.client.model.animation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Immutable map of logical placed-model lighting controls to normalized intensity levels.
 *
 * <p>Missing controls resolve to zero. Input maps are defensively copied and every value must be
 * finite and between zero and one, allowing instances to be shared safely between render calls.</p>
 */
public final class ModelLightState
{
    public static final ModelLightState OFF = new ModelLightState(
        Collections.<String, Float>emptyMap());
    private final Map<String, Float> levels;

    /** @param levels non-blank control names mapped to intensities from zero through one */
    public ModelLightState(Map<String, Float> levels)
    {
        if (levels == null)
        {
            throw new NullPointerException("levels");
        }
        Map<String, Float> copy = new HashMap<String, Float>();
        for (Map.Entry<String, Float> entry : levels.entrySet())
        {
            String key = entry.getKey();
            Float value = entry.getValue();
            if (key == null || key.trim().isEmpty() || value == null || Float.isNaN(value) || Float.isInfinite(value) ||
                    value < 0 || value > 1)
            {
                throw new IllegalArgumentException("Model light controls require non-blank names and levels in 0..1");
            }
            copy.put(key, value);
        }
        this.levels = Collections.unmodifiableMap(copy);
    }
    /** Returns a state with one control at full intensity. */
    public static ModelLightState on(String control)
    {
        Map<String, Float> values = new HashMap<String, Float>();
        values.put(control, 1.0F);
        return new ModelLightState(values);
    }
    /** Returns a state containing one control at the requested normalized intensity. */
    public static ModelLightState level(String control, float level)
    {
        if (level <= 0)
        {
            return OFF;
        }
        Map<String, Float> values = new HashMap<String, Float>();
        values.put(control, level);
        return new ModelLightState(values);
    }
    public Map<String, Float> levels()
    {
        return levels;
    }
    public float level(String control)
    {
        Float value = levels.get(control);
        return value == null ? 0 : value;
    }
    @Override public boolean equals(Object other)
    {
        return this == other || other instanceof ModelLightState && levels.equals(((ModelLightState)other).levels);
    }
    @Override public int hashCode()
    {
        return Objects.hash(levels);
    }
}
