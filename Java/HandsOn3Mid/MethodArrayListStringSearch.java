import java.util.*;

public class MethodArrayListStringSearch {
    public static int size;
    public static Scanner input = new Scanner (System.in);
    public static void main (String[] args) {
        System.out.print("Enter the number size of the ArrayList: ");
        size = input.nextInt();

        nameCompare(nameInput(size));
    }

    static ArrayList<String> nameInput (int size) {
        ArrayList<String> names = new ArrayList<>(size);

        System.out.println("You need to input a total of " + size + " names, Input them now.");

        for (int i = 0; i < size; i++) {
        String curr = input.next();
        names.add(curr += input.nextLine());  
        }

        return names;
    }

    static void nameCompare (ArrayList<String> names) {
        for (int i = 0; i < size; i++) {
            int count = 1;
            if (!names.get(i).equalsIgnoreCase("   ")){
            for (int j = i; j < size; j++) {
                if (i != j) {
                    if (names.get(i).equalsIgnoreCase(names.get(j))) {
                        count++;
                        names.set(j, "   ");
                    }
                }
            }
            System.out.println(names.get(i) + " repeats " + count + " time");
            }
        }
    }
}
