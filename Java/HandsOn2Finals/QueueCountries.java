import java.util.*;

public class QueueCountries {
    public static void main (String[] args) {
        Queue<String> countries = new LinkedList<>();

        // add elements
        countries.add("South Korea");
        countries.add("USA");
        countries.add("Mauritius");
        countries.add("Japan");
        countries.add("China");
        countries.add("Taiwan");
        countries.add("Nigeria");
        countries.add("UK");
        countries.add("Thailand");
        countries.add("Germany");

        System.out.println("Queue elements are:");
        System.out.println(countries);
        System.out.println("Topmost element is: " + countries.peek());

        // remove 5 countries
        for (int i = 0; i < 5; i++) {
            countries.remove();
        }

        System.out.println("Updated queue elements: " + countries);
    }
}
