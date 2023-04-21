import java.util.*;

public class StackCountries {
    public static void main (String[] args) {
        Stack<String> countries = new Stack<>();

        countries.push("South Korea");
        countries.push("USA");
        countries.push("Mauritius");
        countries.push("Japan");
        countries.push("China");
        countries.push("Taiwan");
        countries.push("Nigeria");
        countries.push("UK");
        countries.push("Thailand");
        countries.push("Germany");

        System.out.println("Stack elements are:");
        System.out.println(countries);
        
        System.out.println("Topmost element is: " + countries.peek());
        System.out.println("First element is: " + countries.get(0));

        for (int i = 0; i < 5; i++) {
            countries.pop();
        }

        System.out.print("Updated stack elements: ");
        System.out.println(countries);
    }
}