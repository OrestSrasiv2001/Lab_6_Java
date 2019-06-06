package ua.lviv.iot.Attraction;

import ua.lviv.iot.Attraction.Attraction;

public class RollerCoaster extends Attraction {
	private int speed;
	private int height;
	private String typeOfMaterial;

	public RollerCoaster() {
	}

	public RollerCoaster(final double priceOfTicket, final int maxNumberOfVisitors, final DangerLevel dangerLevel,
			final int speed, final int height, final String typeOfMaterial) {
		super(priceOfTicket, maxNumberOfVisitors, dangerLevel);
		this.speed = speed;
		this.height = height;
		this.typeOfMaterial = typeOfMaterial;
	}
	@Override
	public String getHeaders() {
		return super.getHeaders() + "speed, " + "height, " + "typeOfMaterial";
	}

	@Override
	public String toCSV() {
		return super.toCSV() + ", " + this.getSpeed() + ", " + this.getHeight() + ", " + this.getTypeOfMaterial();
	}
	public final int getSpeed() {
		return speed;
	}

	public final void setSpeed(final int speed) {
		this.speed = speed;
	}

	public final int getHeight() {
		return height;
	}

	public final void setHeight(final int height) {
		this.height = height;
	}

	public final String getTypeOfMaterial() {
		return typeOfMaterial;
	}

	public final void setTypeOfMaterial(final String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}

}
