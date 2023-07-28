import java.util.List;

public class individualPlanet {
    private String planetName;
    private List<String> atmosphereicGases;
    private int moons;
    private String rings;

    public individualPlanet(String planetName, List<String> atmosphereicGases, int moons, String rings) {
        this.planetName = planetName;
        this.atmosphereicGases = atmosphereicGases;
        this.moons = moons;
        this.rings = rings;
    }

public String getPlanetName() {
        return planetName;
    }

    public List<String> getAtmosphereicGases() {
        return atmosphereicGases;
    }

    public int getMoons() {
        return moons;
    }

    public String getRings() {
        return rings;
    }
}
