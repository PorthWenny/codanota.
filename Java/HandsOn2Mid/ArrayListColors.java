import java.util.*;

public class ArrayListColors {
    public static void main(String[] args) {
        ArrayList<String> colorlist = new ArrayList<>(10);

        // add 11 String for our ArrayList 
        colorlist.add("Red");
        colorlist.add("Yellow");
        colorlist.add("Green");
        colorlist.add("Pink");
        colorlist.add("White");
        colorlist.add("Magenta");
        colorlist.add("Brown");
        colorlist.add("Orange");
        colorlist.add("Yellow Orange");
        colorlist.add("Cream");
        colorlist.add("Violet");

        System.out.println("List of colors are: ");
        // print out every values from the ArrayList with new line after each index
        for (int i = 0; i < colorlist.size(); i++) {
            System.out.println(colorlist.get(i));
        }
    }
}