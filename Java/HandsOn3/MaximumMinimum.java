package HandsOn3;
import java.util.*;

public class MaximumMinimum {
    public static void main (String[] coderakizkiz) {
        
        Scanner holabels = new Scanner(System.in);

         System.out.print("Enter the length of the array: ");
         int len = holabels.nextInt();

         int[] num = new int[len];
         int high = 0, low = 2_147_483_647, sec = 2_147_483_647;

         System.out.println("Enter the " +len+ " elements of the array: ");
         // loop for the highest and lowest integer.
         for (int i = 0; i < len; i++) {
            num[i] = holabels.nextInt();

            if (num[i] > high) {
                high = num[i];
            }

            if (num[i] < low) {
                low = num[i];
            }
         }

         // loop for getting the second lowest integer.
         for (int i = 0; i < len; i++) {
            if (num[i] < sec && num[i] != low) {
            sec = num[i];
            }
        }

        System.out.println("Maximum difference: " +high+ " - " +low+ " = " + (high - low));
        System.out.println("Minimum difference: " +sec+ " - " +low+ " = " + (sec - low));
    }
}
