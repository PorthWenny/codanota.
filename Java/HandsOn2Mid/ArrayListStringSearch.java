import java.util.*;

public class ArrayListStringSearch {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number the size of the ArrayList: ");
        int n = input.nextInt();
        ArrayList<String> names = new ArrayList<>(n);

        System.out.println("You need to input a total of " + n + " names, Input them now.");

        for (int i = 0; i < n; i++) {
        String curr = input.next();
        names.add(curr += input.nextLine());  
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (!names.get(i).equalsIgnoreCase("   ")){
            for (int j = i; j < n; j++) {
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
