package HandsOn3;
import java.util.*;

public class BiggestSmallest {
    public static void main (String[] coderakizkiz) {

        try (Scanner holabels = new Scanner(System.in)) {
            int[] num = new int[10];
            int high = 0, low = 2_147_483_647;

            System.out.println("Enter the 10 values of the array: ");
            for (int i = 0; i < 10; i++) {
                num[i] = holabels.nextInt();

                if (num[i] > high) {
                    high = num[i];
                }

                if (num[i] < low) {
                    low = num[i];
                }
            }

            System.out.println("The highest value is " + high);
        }
        System.out.println("The smallest value is " + low);

    }
}
