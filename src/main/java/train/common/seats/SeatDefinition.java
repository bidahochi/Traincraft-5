package train.common.seats;

import java.util.EnumSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** Immutable body-relative position and permissions for one named seat. */
public final class SeatDefinition
{
    private static final Logger LOGGER = LogManager.getLogger("Traincraft");
    private final String seatId;
    private final String sectionId;
    private final float forward;
    private final float up;
    private final float left;
    private final String controlStationId;
    private final SeatRole role;
    private final EnumSet<SeatFunction> functions;

    public SeatDefinition(String id, float forward, float up, float left, SeatRole role)
    {
        this(id, forward, up, left, role, null);
    }

    public SeatDefinition(String id, float forward, float up, float left, SeatRole role, String station)
    {
        this(id, forward, up, left, role, station, (SeatFunction[]) null);
    }

    /** Null functions use role defaults; an explicit empty array grants no functions. */
    public SeatDefinition(String id, float forward, float up, float left, SeatRole role,
            String station, SeatFunction... functions)
    {
        this(id, "body", forward, up, left, role, station, functions);
    }

    /** Section-bound offsets remain in the straight body's coordinate frame. */
    public SeatDefinition(String id, String section, float forward, float up, float left, SeatRole role)
    {
        this(id, section, forward, up, left, role, null, (SeatFunction[]) null);
    }

    public SeatDefinition(String id, String section, float forward, float up, float left, SeatRole role,
            String station)
    {
        this(id, section, forward, up, left, role, station, (SeatFunction[]) null);
    }

    public SeatDefinition(String id, String section, float forward, float up, float left, SeatRole role,
            String station, SeatFunction... functions)
    {
        if (id == null || id.trim().isEmpty())
        {
            LOGGER.warn("[Seats] Blank seat ID; using seat");
            id = "seat";
        }
        if (role == null)
        {
            LOGGER.warn("[Seats] Seat " + id + " has no role; using passenger");
            role = SeatRole.PASSENGER;
        }
        seatId = id.trim();
        sectionId = section == null || section.trim().isEmpty() ? "body" : section.trim();
        this.role = role;
        this.forward = finiteOffset(forward, id);
        this.up = finiteOffset(up, id);
        this.left = finiteOffset(left, id);
        this.functions = EnumSet.noneOf(SeatFunction.class);
        SeatFunction[] selected = functions == null ? role.getDefaultFunctions() : functions;
        for (SeatFunction function : selected)
        {
            if (function == null)
            {
                LOGGER.warn("[Seats] Seat " + id + " has a null function; ignoring it");
                continue;
            }
            this.functions.add(function);
        }
        String cab = station == null ? "" : station.trim();
        controlStationId = cab.isEmpty() && (role == SeatRole.DRIVER || role == SeatRole.CREW || hasFunction(SeatFunction.DRIVE))
                ? "cab" : cab;
    }

    public String getSeatId()
    {
        return seatId;
    }

    public String getSectionId()
    {
        return sectionId;
    }

    public float getForwardOffset()
    {
        return forward;
    }

    public float getUpOffset()
    {
        return up;
    }

    public float getLeftOffset()
    {
        return left;
    }

    public String getControlStationId()
    {
        return controlStationId;
    }

    public SeatRole getRole()
    {
        return role;
    }

    public boolean hasFunction(SeatFunction function)
    {
        return functions.contains(function);
    }

    /** A station label alone never grants cab recovery permissions. */
    public boolean isCabSeat()
    {
        return controlStationId.isEmpty() == false && (role == SeatRole.CREW || hasFunction(SeatFunction.DRIVE));
    }

    public EnumSet<SeatFunction> getFunctions()
    {
        return EnumSet.copyOf(functions);
    }

    private static float finiteOffset(float value, String id)
    {
        if (Float.isNaN(value) || Float.isInfinite(value))
        {
            LOGGER.warn("[Seats] Seat " + id + " has a non-finite offset; using zero");
            return 0.0F;
        }
        return value;
    }
}
