package train.common.seats;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** Validated snapshot of the stock's Java seat definitions. */
public final class RollingStockSeatLayout
{
    private static final Logger LOGGER = LogManager.getLogger("Traincraft");
    private final SeatDefinition[] definitions;

    public RollingStockSeatLayout(SeatDefinition[] seats)
    {
        List<SeatDefinition> valid = new ArrayList<SeatDefinition>();
        Set<String> ids = new HashSet<String>();
        if (seats != null)
        {
            for (SeatDefinition seat : seats)
            {
                if (seat == null || ids.add(seat.getSeatId()) == false)
                {
                    LOGGER.warn("[Seats] Null or duplicate seat definition; ignoring it");
                    continue;
                }
                valid.add(seat);
            }
        }
        definitions = valid.toArray(new SeatDefinition[valid.size()]);
    }

    public int getSeatCount()
    {
        return definitions.length;
    }

    public boolean hasLivestockSeats()
    {
        for (SeatDefinition seat : definitions)
        {
            if (seat.getRole() == SeatRole.LIVESTOCK)
            {
                return true;
            }
        }
        return false;
    }

    /** Determines whether riders need reconciliation after a Java-defined skin change. */
    public boolean hasSameSeats(RollingStockSeatLayout other)
    {
        if (this == other)
        {
            return true;
        }
        if (other == null || definitions.length != other.definitions.length)
        {
            return false;
        }
        for (int index = 0; index < definitions.length; index++)
        {
            SeatDefinition seat = definitions[index];
            SeatDefinition next = other.definitions[index];
            if (seat.getSeatId().equals(next.getSeatId()) == false
                    || seat.getSectionId().equals(next.getSectionId()) == false
                    || seat.getForwardOffset() != next.getForwardOffset()
                    || seat.getUpOffset() != next.getUpOffset()
                    || seat.getLeftOffset() != next.getLeftOffset()
                    || seat.getControlStationId().equals(next.getControlStationId()) == false
                    || seat.getRole() != next.getRole()
                    || seat.getFunctions().equals(next.getFunctions()) == false)
            {
                return false;
            }
        }
        return true;
    }

    public float[] getOffset(int seatIndex)
    {
        return new float[] { getForwardOffset(seatIndex), getUpOffset(seatIndex), getLeftOffset(seatIndex) };
    }

    public float getForwardOffset(int seatIndex)
    {
        SeatDefinition seat = getDefinition(seatIndex);
        return seat == null ? 0.0F : seat.getForwardOffset();
    }

    public float getUpOffset(int seatIndex)
    {
        SeatDefinition seat = getDefinition(seatIndex);
        return seat == null ? 0.0F : seat.getUpOffset();
    }

    public float getLeftOffset(int seatIndex)
    {
        SeatDefinition seat = getDefinition(seatIndex);
        return seat == null ? 0.0F : seat.getLeftOffset();
    }

    public SeatDefinition getDefinition(int seatIndex)
    {
        return seatIndex >= 0 && seatIndex < definitions.length ? definitions[seatIndex] : null;
    }

    public int findSeatIndex(String seatId)
    {
        for (int index = 0; index < definitions.length; index++)
        {
            if (definitions[index].getSeatId().equals(seatId))
            {
                return index;
            }
        }
        return -1;
    }
}
