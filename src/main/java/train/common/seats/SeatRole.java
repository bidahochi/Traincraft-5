package train.common.seats;

/** Operational purpose of a seat, used by boarding rules and the seat picker. */
public enum SeatRole
{
	DRIVER,
	CREW,
	PASSENGER,
	LIVESTOCK;

	public SeatFunction[] getDefaultFunctions()
	{
		switch (this)
		{
			case DRIVER:
				return new SeatFunction[] { SeatFunction.DRIVE, SeatFunction.EMERGENCY_BRAKE };
			case CREW:
				return new SeatFunction[] { SeatFunction.EMERGENCY_BRAKE };
			default:
				return new SeatFunction[0];
		}
	}
}
