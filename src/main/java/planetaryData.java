import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class planetaryData {
    private List<individualPlanet> planetList;

    public planetaryData() {
    }

    public planetaryData(List<individualPlanet> planetList) {
        this.planetList = planetList;
    }

    public List<individualPlanet> getPlanetList() {
        return planetList;
    }

    public void addPlanetsToList(individualPlanet... planets){
        for (individualPlanet planet : planets) {
            planetList.add(planet);
        }
    }

    public int getMoonCount(){
        int moonCount = 0;
        for (individualPlanet individualPlanet : planetList) {
            if(individualPlanet.getRings().equals("Yes")){
                moonCount+=individualPlanet.getMoons();
            }
        }
        return moonCount;
    }
    public void removePlanetsFromList(individualPlanet... planets){
//        for (individualPlanet planet : planets) {
//            planetList.remove(planet);
//        }
        planetList.removeAll(Arrays.asList(planets));
    }
}
