package train.common.slots.util;

import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Applies configured contents rules and fully bans listed items that cannot be verified. */
public final class NonemptyContainerBlacklist
{
    private final Set<ItemKey> entries;
    private final List<NbtContentsRule> rules;

    /** Copies both policy collections; rules and item selectors are immutable. */
    public NonemptyContainerBlacklist(Set<ItemKey> entries, List<NbtContentsRule> rules)
    {
        this.entries = Collections.unmodifiableSet(new HashSet<ItemKey>(entries));
        this.rules = Collections.unmodifiableList(new ArrayList<NbtContentsRule>(rules));
    }

    /** Returns an immutable snapshot of the conditional blacklist selectors. */
    public Set<ItemKey> getEntries()
    {
        return entries;
    }

    /** Returns immutable resolved rules for server-to-client synchronization. */
    public List<NbtContentsRule> getRules()
    {
        return rules;
    }

    /** Blocks either positive contents or an inability to verify a listed item. */
    public boolean isBanned(ItemStack stack)
    {
        return inspect(stack) != NbtContentsRule.Result.EMPTY;
    }

    /**
     * Tests list membership before reading NBT. Every matching rule must verify
     * emptiness; missing readers, invalid paths, and malformed payloads fail closed.
     * Items outside the conditional list are unaffected.
     */
    public NbtContentsRule.Result inspect(ItemStack stack)
    {
        if (entries.isEmpty() || stack == null)
        {
            return NbtContentsRule.Result.EMPTY;
        }
        boolean listed = false;
        for (ItemKey entry : entries)
        {
            if (entry.matches(stack))
            {
                listed = true;
                break;
            }
        }
        if (listed == false)
        {
            return NbtContentsRule.Result.EMPTY;
        }
        NbtContentsRule.Result contents = NbtContentsRule.Result.UNVERIFIED;
        for (NbtContentsRule rule : rules)
        {
            if (rule.matches(stack))
            {
                NbtContentsRule.Result result = rule.inspect(stack.stackTagCompound);
                if (result == NbtContentsRule.Result.UNVERIFIED)
                {
                    return result;
                }
                if (contents != NbtContentsRule.Result.FILLED)
                {
                    contents = result;
                }
            }
        }
        return contents;
    }
}
