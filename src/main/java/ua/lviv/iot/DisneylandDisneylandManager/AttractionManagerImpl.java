package ua.lviv.iot.DisneylandDisneylandManager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.Attraction.Attraction;
import ua.lviv.iot.Attraction.DangerLevel;

public class AttractionManagerImpl {
	private List<Attraction> attractions = new LinkedList<>();

	public final List<Attraction> sortAttractionByPrice(final List<Attraction> list, final boolean ascending) {
		if (ascending) {
			list.sort(Comparator.comparing(Attraction::getPriceOfTicket));
		} else {
			list.sort(Comparator.comparing(Attraction::getPriceOfTicket).reversed());
		}
		list.forEach(System.out::println);
		return list;
	}

	public List<Attraction> findAttraction(final DangerLevel dangerLevel) {
		return attractions.stream().filter(attraction -> (attraction.getDangerLevel() == dangerLevel))
				.collect(Collectors.toList());

	}

	public final void addAttraction(final Attraction attraction) {
		this.attractions.add(attraction);

	}

	public final List<Attraction> sortAttractinByMaxChildrenCount(final List<Attraction> list, final boolean sortOrder) {
		if (sortOrder) {
			Collections.sort(attractions, Comparator.comparing(Attraction::getMaxNumberOfVisitors));

		} else {
			Collections.sort(attractions, Comparator.comparing(Attraction::getMaxNumberOfVisitors).reversed());
		}
		list.forEach(System.out::println);
		return list;
	}
}