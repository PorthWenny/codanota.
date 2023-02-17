package HandsOn3;
import java.util.*;

public class ArrayDifferenceFirstLast {
    public static void main (String[] coderakizkiz) {

        try (Scanner holabels = new Scanner(System.in)) {
            int[] num = new int[10];

            System.out.println("Enter the 10 values of the array: ");
            for (int i = 0; i < 10; i++) {
                num[i] = holabels.nextInt();
            }
            System.out.println("");
            System.out.println("The difference of the first and last number is: " + (num[0] - num[9]));
        }
    }
}
