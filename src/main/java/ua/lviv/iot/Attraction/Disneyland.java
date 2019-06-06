package ua.lviv.iot.Attraction;

import ua.lviv.iot.Attraction.Attraction;

public class Disneyland extends Attraction {
	private double area;
	private double location;
	private double numberAttractions;


	public final double getArea() {
		return area;
	}

	public final void setArea(final double area) {
		this.area = area;
	}

	public Disneyland() {
	}

	public Disneyland(final double priceOfTicket, final int maxNumberOfVisitors, final DangerLevel dangerLevel,
			final double area, final double location, final double numberAttractions) {
		super(priceOfTicket, maxNumberOfVisitors, dangerLevel);
		this.area = area;
		this.location = location;
		this.numberAttractions = numberAttractions;
	}
	@Override
	public String getHeaders() {
		return super.getHeaders() + "area, " + "location, " + "numberAttractions";
	}

	@Override
	public String toCSV() {
		return super.toCSV() + ", " + this.getArea() + ", " + this.getLocation() + ", " + this.getNumberAttractions();
	}
	public final void setLocation(final double location) {
		this.location = location;
	}

	public final void setNumberAttractions(final double numberAttractions) {
		this.numberAttractions = numberAttractions;
	}

	public final double getLocation() {
		return location;
	}

	public final double getNumberAttractions() {
		return numberAttractions;
	}
}
