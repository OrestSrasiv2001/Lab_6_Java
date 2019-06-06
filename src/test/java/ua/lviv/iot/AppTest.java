package ua.lviv.iot;

import ua.lviv.iot.DisneylandDisneylandManager.AttractionManagerImpl;
import ua.lviv.iot.Attraction.Attraction;
import ua.lviv.iot.Attraction.Child;
import ua.lviv.iot.Attraction.Disneyland;
import ua.lviv.iot.Attraction.Karting;
import ua.lviv.iot.Attraction.RollerCoaster;
import org.junit.jupiter.api.Assertions;
import ua.lviv.iot.Attraction.DangerLevel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class AppTest {

    private AttractionManagerImpl manager = new AttractionManagerImpl();
    private List<Attraction> list = new ArrayList();

    @BeforeEach
    final void setApp() {
        manager.addAttraction(new Child(100, 3, DangerLevel.HIGH, 10, 65, 120));
        manager.addAttraction(new Disneyland(120, 20, DangerLevel.LOW, 2000, 51.3456d, 4.5));
        manager.addAttraction(new Karting(150.50, 20, DangerLevel.MAXIMUM, 10, "Mazda", "Carbon"));
        manager.addAttraction(new RollerCoaster(200, 50, DangerLevel.MIDDLE, 100, 15, "plastic"));

        Attraction Child = new Child(100, 3, DangerLevel.HIGH, 10, 65, 120);
        Attraction disneyland = new Disneyland(120, 20, DangerLevel.LOW, 2000, 51.3456d, 4.5);
        Attraction karting = new Karting(150.50, 20, DangerLevel.MAXIMUM, 10, "Mazda", "Carbon");
        Attraction rollerCoaster = new RollerCoaster(200, 50, DangerLevel.MIDDLE, 100, 15, "plastic");

        list.add(Child);
        list.add(disneyland);
        list.add(karting);
        list.add(rollerCoaster);
    }

    @Test
    final void sortAttractionByPriceByAscending() {
        manager.sortAttractionByPrice(list, true);
        Assertions.assertEquals(100, list.get(0).getPriceOfTicket());
        Assertions.assertEquals(120, list.get(1).getPriceOfTicket());
        Assertions.assertEquals(150.50, list.get(2).getPriceOfTicket());
        Assertions.assertEquals(200, list.get(3).getPriceOfTicket());

    }

    @Test
    final void sortAttractionByPriceByDescending() {
        manager.sortAttractionByPrice(list, false);
        Assertions.assertEquals(200, list.get(0).getPriceOfTicket());
        Assertions.assertEquals(150.50, list.get(1).getPriceOfTicket());
        Assertions.assertEquals(120, list.get(2).getPriceOfTicket());
        Assertions.assertEquals(100, list.get(3).getPriceOfTicket());


    }

    @Test
    final void sortAttractinByMaxChildrenCountByAscending() {
        manager.sortAttractinByMaxChildrenCount(list, true);
        Assertions.assertEquals(3, list.get(0).getMaxNumberOfVisitors());
        Assertions.assertEquals(20, list.get(1).getMaxNumberOfVisitors());
        Assertions.assertEquals(20, list.get(2).getMaxNumberOfVisitors());
        Assertions.assertEquals(50, list.get(3).getMaxNumberOfVisitors());

    }

    @Test
    final void sortAttractinByMaxChildrenCountByDescending() {
        manager.sortAttractinByMaxChildrenCount(list, false);
        Assertions.assertEquals(50, list.get(3).getMaxNumberOfVisitors());
        Assertions.assertEquals(20, list.get(2).getMaxNumberOfVisitors());
        Assertions.assertEquals(20, list.get(1).getMaxNumberOfVisitors());
        Assertions.assertEquals(3, list.get(0).getMaxNumberOfVisitors());

    }

    @Test
    final void testFindAttraction() {
        Assertions.assertEquals(list.get(0).getDangerLevel(),
                manager.findAttraction(DangerLevel.HIGH).get(0).getDangerLevel());

    }
}
