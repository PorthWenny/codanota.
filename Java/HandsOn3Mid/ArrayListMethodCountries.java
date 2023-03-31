import java.util.*;

public class ArrayListMethodCountries {
    public static void main (String[] args) {
        ArrayList<String> countries = new ArrayList<>(10);

        // add 9 String of countries for our ArrayList 
        storeList(countries);

        System.out.println("List of Countries");
        // print out every values from the ArrayList with new line after each index
        printList(countries);
    }

    static void  storeList (ArrayList<String> countries) {
        countries.add("Japan");
        countries.add("US");
        countries.add("Philippines");
        countries.add("Kuwait");
        countries.add("Oman");
        countries.add("Singapore");
        countries.add("Hong Kong");
        countries.add("Malaysia");
        countries.add("Great Britain");
    }

    static void printList (ArrayList<String> countries) {
        // print out every values from the ArrayList with new line after each index
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}