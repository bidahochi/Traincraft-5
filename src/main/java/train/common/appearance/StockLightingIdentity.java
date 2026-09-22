package train.common.appearance;

import org.apache.logging.log4j.LogManager;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.minecraft.item.Item;
import train.common.library.Info;
import train.common.library.register.ITrainRecord;

/**
 * Caches stock resource identities for lighting without registering canonical skins.
 * Each entity class must represent one stock record with a stable stock ID and namespace.
 * Records without an explicit ID retain normalized internal-name compatibility.
 * Callers must register identities during single-threaded startup, before runtime lookups;
 * these mutable maps do not support concurrent registration or changing an established identity.
 * Cached identities live for the process lifetime and survive resource reloads because asset
 * changes do not change stock registration metadata. This is not Delta's stock registry contract.
 */
public final class StockLightingIdentity
{
    private static final Map<Class<?>, String> NAMESPACES = new HashMap<Class<?>, String>();
    private static final Map<Class<?>, String> IDS = new HashMap<Class<?>, String>();
    private static final Map<String, Class<?>> OWNERS = new HashMap<String, Class<?>>();

    private StockLightingIdentity()
    {
    }

    /**
     * Records the content namespace and immediately resolves its lighting identity during startup.
     * Call before the record's first lookup. Equivalent repeats are no-ops; conflicting repeats
     * are diagnosed without changing any cache, including identities established by fallback lookup.
     * A previously disabled identity remains disabled until restart.
     * The record and namespace must be non-null, and the internal name remains unchanged.
     * Invalid identities or collisions are diagnosed and cached as disabled JSON lighting lookups.
     */
    public static void register(ITrainRecord record, String namespace)
    {
        Class<?> type = record.getEntityClass();
        String cached = IDS.get(type);
        if (cached != null)
        {
            String requestedId;
            try
            {
                requestedId = recordId(namespace, record);
            }
            catch (IllegalArgumentException exception)
            {
                LogManager.getLogger("Traincraft").warn(
                    "Rejected lighting registration for {} in namespace {}: {}; existing identity retained",
                    type.getName(), namespace, exception.getMessage());
                return;
            }
            if (cached.equals(requestedId) == false)
            {
                LogManager.getLogger("Traincraft").warn(
                    "Rejected lighting identity {} for {}: existing identity '{}' retained (empty means disabled). "
                        + "Register one stable namespace and stock ID before the first lookup",
                    requestedId, type.getName(), cached);
            }
            return;
        }
        NAMESPACES.put(record.getEntityClass(), namespace.toLowerCase(Locale.ROOT));
        resolve(record);
    }

    /**
     * Supplies the registering mod's namespace during startup unless a content group declared one.
     * An existing namespace is left untouched, so the BAP content namespace takes precedence over
     * its registering mod. Otherwise the registration requirements of {@link #register} apply.
     */
    public static void registerIfAbsent(ITrainRecord record, String namespace)
    {
        if (NAMESPACES.containsKey(record.getEntityClass()) == false)
        {
            register(record, namespace);
        }
    }

    /** Builds a validated identity; slashes in internal names become underscores, not folders. */
    public static String normalizedId(String namespace, String internalName)
    {
        String id = namespace.trim().toLowerCase(Locale.ROOT) + ":"
            + internalName.trim().toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9_.-]", "_");
        LegacySkinMapping.requireId(id);
        return id;
    }

    /** Explicit record IDs are stable authored keys; only absent IDs use name normalization. */
    public static String recordId(String namespace, ITrainRecord record)
    {
        String localId = record.getStockId();
        if (localId == null || localId.isEmpty())
        {
            return normalizedId(namespace, record.getInternalName());
        }
        String id = namespace.trim().toLowerCase(Locale.ROOT) + ":" + localId;
        LegacySkinMapping.requireId(id);
        return id;
    }

    /**
     * Resolves and caches a stock's lighting resource identity, never its profile scope.
     * An uncached record uses its declared content namespace, or the registered item's namespace
     * with Traincraft's mod ID as the final fallback. Invalid identities are diagnosed once;
     * a collision disables lookups for both entity classes instead of sharing their resources.
     * Disabled results are also cached, avoiding repeated diagnostics during rendering.
     *
     * @param record stock metadata, or null when no registered record is available
     * @return namespaced stock ID, or an empty string for absent, invalid, or conflicting records;
     *     callers must skip JSON lighting for an empty result and use no stock-specific overrides
     */
    public static String resolve(ITrainRecord record)
    {
        if (record == null)
        {
            return "";
        }
        Class<?> type = record.getEntityClass();
        String cached = IDS.get(type);
        if (cached != null)
        {
            return cached;
        }
        String namespace = NAMESPACES.get(type);
        if (namespace == null)
        {
            String itemName = Item.itemRegistry.getNameForObject(record.getItem());
            namespace = Info.modID;
            if (itemName != null && itemName.contains(":"))
            {
                namespace = itemName.substring(0, itemName.indexOf(':'));
            }
        }
        String id;
        try
        {
            id = recordId(namespace, record);
        }
        catch (IllegalArgumentException exception)
        {
            LogManager.getLogger("Traincraft").warn(
                "Cannot resolve lighting identity for {}: {}", type.getName(), exception.getMessage());
            IDS.put(type, "");
            return "";
        }
        Class<?> owner = OWNERS.get(id);
        if (owner != null && owner != type)
        {
            LogManager.getLogger("Traincraft").warn(
                "Conflicting lighting identity {} for {} and {}; JSON disabled for both",
                id, owner.getName(), type.getName());
            IDS.put(owner, "");
            IDS.put(type, "");
            return "";
        }
        OWNERS.put(id, type);
        IDS.put(type, id);
        return id;
    }
}
