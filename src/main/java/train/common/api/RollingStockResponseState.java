package train.common.api;

/** A named, transient response window owned by one stock entity on its server thread. */
public final class RollingStockResponseState
{
    /** Lifecycle notifications are changes, not per-tick actions. */
    public enum Transition
    {
        /** An inactive response became active. */
        ACTIVATED,
        /** An accepted trigger reset an already active response, including within the same tick. */
        RETRIGGERED,
        /** The active countdown reached zero. */
        EXPIRED
    }

    private final String id;
    private int remainingTicks;

    /** Creates an inactive response under a stable namespaced identifier. */
    public RollingStockResponseState(String id)
    {
        if (id == null || id.matches("[a-z0-9_.-]+:[a-z0-9_./-]+") == false)
        {
            throw new IllegalArgumentException("Response requires a namespaced identifier");
        }
        this.id = id;
    }

    /** Returns the response identity, independent of any consumer or policy preset. */
    public String id()
    {
        return id;
    }

    /** Returns the authoritative countdown; zero means inactive. */
    public int remainingTicks()
    {
        return remainingTicks;
    }

    /** Accepts a positive duration; a rejected trigger leaves the active window untouched. */
    public Transition trigger(int durationTicks)
    {
        if (durationTicks <= 0)
        {
            return null;
        }
        Transition transition = remainingTicks > 0 ? Transition.RETRIGGERED : Transition.ACTIVATED;
        remainingTicks = durationTicks;
        return transition;
    }

    /** Advances one tick, returning an expiration exactly once and null otherwise. */
    public Transition tick()
    {
        if (remainingTicks <= 0)
        {
            return null;
        }
        remainingTicks--;
        return remainingTicks == 0 ? Transition.EXPIRED : null;
    }
}
