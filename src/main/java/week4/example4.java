package week4;
import java.util.*;

public class example4 {
    public static void objectsExample(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        ArrayList<String> countries = new ArrayList<String>();

        countries.add("Finland");
        countries.add("Germany");
        countries.add("Netherlands");

        cities.add("Berliini");
        cities.add("Nijmegen");
        cities.add("Turku");
        cities.add("Helsinki");

        System.out.println("Number of countries: " + countries.size());
        System.out.println("Number of cities: " + cities.size());
    }
}
