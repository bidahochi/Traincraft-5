package train.common.slots.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;

/** An immutable item selector and a compiled path to numeric container contents. */
public final class NbtContentsRule
{
    /** Distinguishes verified empty contents from contents that must be blocked. */
    public enum Result
    {
        /** The configured reader established an ordinary empty state. */
        EMPTY,
        /** At least one numeric contents amount is positive. */
        FILLED,
        /** No valid reader or well-formed contents representation established emptiness. */
        UNVERIFIED
    }

    private static final int MAX_PATH_LENGTH = 256;
    private static final int MAX_PATH_DEPTH = 16;
    private final ItemKey selector;
    private final String path;
    private final String[] keys;
    private final boolean[] lists;
    private final boolean valid;

    /**
     * Compiles dot-separated compound keys and [] list traversal once at loading.
     * The final key must name a number. Invalid paths retain the selector so the
     * policy can ban that item instead of silently dropping its protection.
     *
     * @param selector resolved registry item and metadata to which this reader applies
     * @param path case-sensitive NBT keys, with [] for lists; null is an invalid reader
     */
    public NbtContentsRule(ItemKey selector, String path)
    {
        if (selector == null || selector.item == null)
        {
            throw new IllegalArgumentException("A contents reader requires a resolved item selector.");
        }
        this.selector = new ItemKey(selector.item, selector.meta);
        String normalized = path == null ? "" : path.trim();
        this.path = normalized.length() <= MAX_PATH_LENGTH ? normalized : "";
        String[] segments = this.path.split("\\.", -1);
        keys = new String[segments.length];
        lists = new boolean[segments.length];
        boolean parsed = this.path.isEmpty() == false && segments.length <= MAX_PATH_DEPTH;
        for (int index = 0; index < segments.length; index++)
        {
            String segment = segments[index];
            lists[index] = segment.endsWith("[]");
            keys[index] = lists[index] ? segment.substring(0, segment.length() - 2) : segment;
            if (keys[index].matches("[A-Za-z0-9_:-]+") == false)
            {
                parsed = false;
            }
        }
        valid = parsed && lists[lists.length - 1] == false;
    }

    /** Returns the immutable registry item and metadata selector for synchronization. */
    public ItemKey getSelector()
    {
        return selector;
    }

    /** Returns the normalized path; an invalid oversized path is represented as empty. */
    public String getPath()
    {
        return path;
    }

    /** Reports whether the configured path can be evaluated by the supported grammar. */
    public boolean isValid()
    {
        return valid;
    }

    /** Matches only the item identity and metadata, independent of its contents. */
    public boolean matches(ItemStack stack)
    {
        return selector.matches(stack);
    }

    /**
     * Reads current NBT without mutation. Absent container compounds/lists and no
     * NBT are ordinary empty states for valid rules. Wrong types and saved item
     * entries missing their numeric count cannot establish emptiness.
     */
    public Result inspect(NBTTagCompound tag)
    {
        if (valid == false)
        {
            return Result.UNVERIFIED;
        }
        return tag == null ? Result.EMPTY : inspectCompound(tag, 0);
    }

    /**
     * Follows one compiled path segment, requiring compounds between keys and
     * compound entries within lists. Missing inventory compounds/lists represent
     * ordinary empty containers; once a stored entry exists, its numeric amount
     * must be present and finite. Each list is read directly without copying NBT.
     * An unverified entry takes priority over filled entries so malformed saved
     * data cannot acquire an empty-container exception.
     *
     * @param depth zero-based path segment, bounded by the compiled path length
     */
    private Result inspectCompound(NBTTagCompound tag, int depth)
    {
        String key = keys[depth];
        boolean last = depth == keys.length - 1;
        if (tag.hasKey(key) == false)
        {
            if (last && depth > 0)
            {
                return Result.UNVERIFIED;
            }
            return Result.EMPTY;
        }
        if (last)
        {
            if (tag.hasKey(key, Constants.NBT.TAG_ANY_NUMERIC) == false)
            {
                return Result.UNVERIFIED;
            }
            double count = tag.getDouble(key);
            if (Double.isNaN(count) || Double.isInfinite(count))
            {
                return Result.UNVERIFIED;
            }
            return count > 0 ? Result.FILLED : Result.EMPTY;
        }
        if (lists[depth])
        {
            if (tag.hasKey(key, Constants.NBT.TAG_LIST) == false)
            {
                return Result.UNVERIFIED;
            }
            NBTTagList inventory = (NBTTagList) tag.getTag(key);
            if (inventory.tagCount() > 0 && inventory.func_150303_d() != Constants.NBT.TAG_COMPOUND)
            {
                return Result.UNVERIFIED;
            }
            Result contents = Result.EMPTY;
            for (int slot = 0; slot < inventory.tagCount(); slot++)
            {
                Result entry = inspectCompound(inventory.getCompoundTagAt(slot), depth + 1);
                if (entry == Result.UNVERIFIED)
                {
                    return entry;
                }
                if (entry == Result.FILLED)
                {
                    contents = entry;
                }
            }
            return contents;
        }
        if (tag.hasKey(key, Constants.NBT.TAG_COMPOUND) == false)
        {
            return Result.UNVERIFIED;
        }
        return inspectCompound(tag.getCompoundTag(key), depth + 1);
    }
}
