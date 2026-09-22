package train.common.utils;

import com.google.gson.JsonParser;

/** Project parser holder without Forge initialization; Traincraft.jsonParser aliases this instance. */
public final class SharedJsonParser
{
    /** Stateless parser shared by production loading and development tools. */
    public static final JsonParser INSTANCE = new JsonParser();

    private SharedJsonParser()
    {
    }
}
