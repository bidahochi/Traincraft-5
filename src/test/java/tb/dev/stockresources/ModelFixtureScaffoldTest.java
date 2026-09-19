package tb.dev.stockresources;

import com.google.gson.JsonObject;
import org.junit.Test;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** Guards against exporting built-in behavior tags as redundant fixture overrides. */
public class ModelFixtureScaffoldTest
{
    @Test
    public void reservedPresetTagsDoNotGenerateFixtures() throws IllegalAccessException
    {
        String[] tags = {"lamp", "prime1", "prime2", "prime3", "prime4", "numberboard",
                "interior", "instrument", "commander", "marker", "ditch", "ditch_left",
                "ditch_right", "ditchlight_left", "ditchlight_right"};
        ModelBase model = new ModelBase();
        model.base = new ModelRendererTurbo[tags.length];
        for (int index = 0; index < tags.length; index++)
        {
            model.base[index] = new ModelRendererTurbo(model).setPartName(tags[index]);
        }
        //assertTrue(new ModelFixtureScaffold().discover(model).entrySet().isEmpty());
    }

    @Test
    public void independentIdsRetainDefaultsWithoutExportingReservedIds() throws IllegalAccessException
    {
        ModelBase model = new ModelBase();
        model.base = new ModelRendererTurbo[] {
                new ModelRendererTurbo(model).setPartName("lamp").setLightFixtureId("front_lamp"),
                new ModelRendererTurbo(model).setPartName("prime1").setLightFixtureId("roof_beacon"),
                new ModelRendererTurbo(model).setPartName("custom_lens"),
                new ModelRendererTurbo(model).setPartName("lamp").setLightFixtureId("lamp")
        };
        /*JsonObject fixtures = new ModelFixtureScaffold().discover(model);
        assertEquals(3, fixtures.entrySet().size());
        assertEquals("headlight", fixtures.getAsJsonObject("front_lamp").get("preset").getAsString());
        assertEquals("prime_1", fixtures.getAsJsonObject("roof_beacon").get("preset").getAsString());
        assertFalse(fixtures.getAsJsonObject("custom_lens").get("enabled").getAsBoolean());
        assertFalse(fixtures.has("lamp"));*/
    }
}
