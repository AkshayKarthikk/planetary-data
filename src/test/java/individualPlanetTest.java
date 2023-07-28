import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class individualPlanetTest {
    @Test
    public void planetCreationTest(){

        individualPlanet mercury = new individualPlanet("mercury", null,0,"No");
        Assertions.assertEquals(mercury.getPlanetName(),"mercury");
        Assertions.assertNull(mercury.getAtmosphereicGases());
        Assertions.assertEquals(mercury.getMoons(),0);
        Assertions.assertEquals(mercury.getRings(),"No");

    }

    @Test
    public void planetCreationTest1(){
        individualPlanet jupitor = new individualPlanet("jupitor", List.of("Hydrogen","Helium"),79,"Yes");

        Assertions.assertEquals(jupitor.getPlanetName(),"jupitor");
        Assertions.assertEquals(jupitor.getAtmosphereicGases(),List.of("Hydrogen","Helium"));
        Assertions.assertEquals(jupitor.getMoons(),79);
        Assertions.assertEquals(jupitor.getRings(),"Yes");

    }
}
