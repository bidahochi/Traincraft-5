package train.common.seats;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** Converts centered-model X/Z seats to Eta's legacy entity frame; leaves height alone. */
public final class SeatHorizontalAlignment
{
	private static final Logger LOGGER = LogManager.getLogger("Traincraft");
	private static final Map<String, SeatHorizontalAlignment> ALIGNMENTS = loadAlignments();
	private final double forwardOrigin;
	private final double leftOrigin;

	public SeatHorizontalAlignment(double forwardOrigin, double leftOrigin)
	{
		this.forwardOrigin = forwardOrigin;
		this.leftOrigin = leftOrigin;
	}

	public void transform(double[] position)
	{
		position[0] += forwardOrigin;
		// The centered renderer's Z axis runs opposite Eta's seat-left axis.
		position[2] = leftOrigin - position[2];
	}

	public static SeatHorizontalAlignment get(String entityClassName)
	{
		return ALIGNMENTS.get(entityClassName);
	}

	private static Map<String, SeatHorizontalAlignment> loadAlignments()
	{
		Map<String, SeatHorizontalAlignment> alignments = new HashMap<>();
		try (InputStream stream = SeatHorizontalAlignment.class.getResourceAsStream("/assets/tc/seat-alignments.properties"))
		{
			if (stream == null)
			{
				LOGGER.error("[Seats] Generated alignment data is missing; run generateSeatAlignments before packaging");
				return alignments;
			}
			Properties properties = new Properties();
			properties.load(stream);
			for (String entityClassName : properties.stringPropertyNames())
			{
				String[] values = properties.getProperty(entityClassName).split(",");
				if (values.length != 2)
				{
					LOGGER.error("[Seats] Invalid generated alignment for " + entityClassName);
					continue;
				}
				try
				{
					double forward = Double.parseDouble(values[0]);
					double left = Double.parseDouble(values[1]);
					if (Double.isFinite(forward) && Double.isFinite(left))
					{
						alignments.put(entityClassName, new SeatHorizontalAlignment(forward, left));
						continue;
					}
					LOGGER.error("[Seats] Non-finite generated alignment for " + entityClassName);
				}
				catch (NumberFormatException exception)
				{
					LOGGER.error("[Seats] Invalid generated alignment for " + entityClassName, exception);
				}
			}
		}
		catch (IOException exception)
		{
			LOGGER.error("[Seats] Could not read generated alignment data", exception);
		}
		return alignments;
	}
}
