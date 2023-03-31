import java.io.CharArrayWriter;
import java.util.*;

public class MakeAnEntrance {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int floors = input.nextInt();
        int size = input.nextInt();
        char[][] floorplan = new char[size][size];

        // for the no. of floor currently at
        for (int i = 0; i < floors; i++) {
            // for the rooms itself
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    floorplan[j][k] = input.next().charAt(0);
                }
            }

            for (int j < 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.print(floorplan[j][k]);
                }
                System.out.println();
            }
        }
    }
}