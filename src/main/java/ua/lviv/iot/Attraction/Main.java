package ua.lviv.iot.Attraction;

import java.util.List;

import ua.lviv.iot.DisneylandDisneylandManager.AttractionManagerImpl;

import java.util.ArrayList;

import ua.lviv.iot.Attraction.Child;
import ua.lviv.iot.Attraction.Disneyland;
import ua.lviv.iot.Attraction.Karting;
import ua.lviv.iot.Attraction.RollerCoaster;

public class Main {

    public static final void main(String[] args) {
		List<Attraction> list = new ArrayList<>();
		AttractionManagerImpl attractionManager = new AttractionManagerImpl();

		Attraction Child = new Child(100, 3, DangerLevel.HIGH, 10, 65, 120);
		Attraction disneyland = new Disneyland(120, 20, DangerLevel.LOW, 2000, 51.3456d, 4.5);
		Attraction karting = new Karting(150.50, 20, DangerLevel.MAXIMUM, 10, "Mazda", "Carbon");
		Attraction rollerCoaster = new RollerCoaster(200, 50, DangerLevel.MIDDLE, 100, 15, "plastic");

		list.add(Child);
		list.add(disneyland);
		list.add(karting);
		list.add(rollerCoaster);

		attractionManager.sortAttractionByPrice(list, false);
		System.out.println("");
		attractionManager.sortAttractionByPrice(list, true);

		System.out.println(attractionManager.findAttraction(DangerLevel.HIGH));

	}
}
