import java.util.*;

public class StringSearch {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        // gets all input needed for the array size.
        System.out.print("Enter the number of table: ");
        int z = input.nextInt();
        System.out.print("Enter the number of rows of an array: ");
        int x = input.nextInt();
        System.out.print("Enter the number of columns of an array: ");
        int y = input.nextInt();

        String[][][] names = new String[z][x][y];
        String[] name_compare = new String[(x*y*z)];
        System.out.println("You need to input a total of " + (x*y*z) + " names, Input them now.");
        int count = 0;
        // getting values for each index.
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < y; k++) {
                    names[i][j][k] = input.next();
                    names[i][j][k] += input.nextLine();
                    name_compare[count] = names[i][j][k];
                    count++;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            int name_counter = 0;
            for (int j = 0; j < count; j++) {
                    if (name_compare[i].equalsIgnoreCase(name_compare[j]) && !name_compare[i].equals("")) {
                        name_counter++;

                        if (name_counter > 1) {
                            name_compare[j] = "";
                        }

                    }
                }
            if (name_counter > 0) {
                System.out.println(name_compare[i]+ " repeats " + name_counter + " time");
            }
        }
    }
}