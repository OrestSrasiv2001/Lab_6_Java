package ua.lviv.iot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.Attraction.*;
import ua.lviv.iot.DisneylandDisneylandManager.AttractionManagerImpl;
import ua.lviv.iot.DisneylandDisneylandManager.AttractionWtite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

    class WriteTest {
        private File file = new File("output.csv");
        private AttractionWtite writer = new AttractionWtite();
        private List<Attraction> list = new ArrayList<>();
        private AttractionManagerImpl manager = new AttractionManagerImpl();

        @BeforeEach
        final void setUp(){
            list = new ArrayList<>();

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
        final void testWriteToFile() throws IOException {
            writer.writeToFile(list, file);
            Assertions.assertNotEquals(file.length(), 0);
        }
    }

