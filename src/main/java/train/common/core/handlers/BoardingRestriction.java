package train.common.core.handlers;

import net.minecraft.item.ItemStack;
import train.common.slots.util.NbtContentsRule;

/** Captures a denied boarding decision so its warning can use the same contents verdict. */
public final class BoardingRestriction
{
    /** The original carried stack, retained only for the immediate boarding warning. */
    public final ItemStack stack;
    /** The inspected verdict, retained even if the stack's NBT changes afterward. */
    public final NbtContentsRule.Result verdict;

    /**
     * Retains the carried stack and its blocking verdict for the immediate warning.
     * The stack is referenced directly; its NBT is not copied or inspected again.
     */
    public BoardingRestriction(ItemStack stack, NbtContentsRule.Result verdict)
    {
        this.stack = stack;
        this.verdict = verdict;
    }
}
