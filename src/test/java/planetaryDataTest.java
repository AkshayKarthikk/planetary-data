import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class planetaryDataTest {
    private planetaryData planets;

    private individualPlanet mercury;
    private individualPlanet venus;
    private individualPlanet earth;
    private individualPlanet jupitor;
    private individualPlanet saturn;
    private individualPlanet uranus;


    @BeforeMethod
    public void initialize() {
        planets = new planetaryData();

        mercury = new individualPlanet("mercury", null, 0, "No");
        venus = new individualPlanet("venus", List.of("Carbon Dioxide", "Nitrogen"), 0, "No");
        earth = new individualPlanet("earth", List.of("Nitrogen", "Oxygen"), 1, "No");
        jupitor = new individualPlanet("jupitor", List.of("Hydrogen", "Helium"), 79, "Yes");
        saturn = new individualPlanet("saturn", List.of("Hydrogen", "Helium"), 83, "Yes");
        uranus = new individualPlanet("uranus", List.of("Hydrogen", "Helium", "Methane"), 27, "Yes");
        planets.addPlanetsToList(mercury, venus, earth, jupitor, saturn, uranus);

    }

    @Test
    public void addPlanetsToListTest() {
//        planets.addPlanetsToList(mercury, venus, earth, jupitor, saturn, uranus);

        Assertions.assertEquals(planets.getPlanetList().size(), 6);
    }

    @Test
    public void removePlanetsFromListTest() {
        planets.addPlanetsToList(mercury, venus, earth, jupitor, saturn, uranus);
        planets.removePlanetsFromList(mercury, venus);

        Assertions.assertEquals(planets.getPlanetList().size(), 4);
    }

    @Test
    public void getMoonCountTest() {
//        planetaryData planets = new planetaryData();
//
//        individualPlanet mercury = new individualPlanet("mercury", null,0,"No");
//        individualPlanet venus = new individualPlanet("venus", List.of("Carbon Dioxide","Nitrogen"),0,"No");
//        individualPlanet earth = new individualPlanet("earth", List.of("Nitrogen","Oxygen"),1,"No");
//        individualPlanet jupitor = new individualPlanet("jupitor", List.of("Hydrogen","Helium"),79,"Yes");
//        individualPlanet saturn = new individualPlanet("saturn", List.of("Hydrogen","Helium"),83,"Yes");
//        individualPlanet uranus = new individualPlanet("uranus", List.of("Hydrogen","Helium","Methane"),27,"Yes");

        planets.addPlanetsToList(mercury, venus, earth, jupitor, saturn, uranus);

        Assertions.assertEquals(planets.getMoonCount(), 189);
    }
}
