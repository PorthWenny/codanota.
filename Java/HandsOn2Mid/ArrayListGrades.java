import java.util.*;

public class ArrayListGrades {
    public static void main (String[] args) {
        ArrayList<Integer> grades = new ArrayList<>(10);

        // add values for our ArrayList
        grades.add(86);
        grades.add(90);
        grades.add(90);
        grades.add(86);
        grades.add(88);
        grades.add(84);
        grades.add(92);
        grades.add(88);
        grades.add(88);
        grades.add(88);

        int sum = 0, avg = 0, min = grades.get(0), max = grades.get(0);
        System.out.println("The Array List values are: ");
        // print out every values from the ArrayList with new line after each index
        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));

            sum += grades.get(i);

            if (grades.get(i) > max) {
                max = grades.get(i);
            }

            if (grades.get(i) < min) {
                min = grades.get(i);
            }
        }

        avg = sum / grades.size();

        // print out the sum, avg, highest, and lowest values from the integer ArrayList
        System.out.println("The sum is: " +sum);
        System.out.println("The average is: " +avg);
        System.out.println("The highest value is: " +max);
        System.out.println("The lowest value is: " +min);
    }
}
