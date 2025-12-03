package Task_19.Stream;

import java.util.Comparator;
import java.util.List;

import static java.util.Collections.max;


public class Main {
    public static void main(String[] args) {
        List<City> cities = List.of(
                new City(1, "Paris", 400000, Continent.EUROPE),
                new City(2, "Nurnberg", 1500000, Continent.EUROPE),
                new City(3, "Atalanta", 2000000, Continent.NORTH_AMERICA),
                new City(4, "Minsk", 500000, Continent.EUROPE),
                new City(5, "Madrid", 1000000, Continent.EUROPE),
                new City(6, "Tokio", 2500000, Continent.ASIA)
        );
        cities.stream()
                .filter(c -> c.getContinent() == Continent.EUROPE)
                .max(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println("Самый густонаселённый город в Европе: " + city));
    }
}
