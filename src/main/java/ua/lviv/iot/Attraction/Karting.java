package ua.lviv.iot.Attraction;

import ua.lviv.iot.Attraction.Attraction;


public class Karting extends Attraction {
    private int numberOfCars;
	private String name;
	private String typeOfCovering;


	public Karting() {
	}

	public Karting(final double priceOfTicket, final int maxNumberOfVisitors, final DangerLevel dangerLevel,
			final int numberOfCars, final String name, final String typeOfCovering) {
		super(priceOfTicket, maxNumberOfVisitors, dangerLevel);
		this.numberOfCars = numberOfCars;
		this.name = name;
		this.typeOfCovering = typeOfCovering;
	}
	@Override
	public String getHeaders() {
		return super.getHeaders() + "numberOfCars, " + "name, " + "typeOfCovering";
	}

	@Override
	public String toCSV() {
		return super.toCSV() + ", " + this.getNumberOfCars() + ", " + this.getName() + ", " + this.getTypeOfCovering();
	}

	public final int getNumberOfCars() {
		return numberOfCars;
	}

	public final void setNumberOfCars(final int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}

	public  final String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final String getTypeOfCovering() {
		return typeOfCovering;

	}

	public final void setTypeOfCovering(final String typeOfCovering) {
		this.typeOfCovering = typeOfCovering;
	}
}
