package HandsOn3;
import java.util.*;

public class ArraySearch {
    public static void main (String[] coderakizkiz) {

        Scanner holabels = new Scanner(System.in);
        int[] num = new int[15];
        int pos=0, neg=0, odd=0, even=0, zero=0;

        System.out.println("Enter 15 values of the array: ");
        for (int i = 0; i < 15; i++) {
            num[i] = holabels.nextInt();

            // for positive, negative, and zero counters.
            if (num[i] > 0) {
                pos++;
            }
            else if (num[i] == 0) {
                zero++;
            }
            else {
                neg++;
            }

            // for odd or even counters.
            if (num[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: "+ odd);
        System.out.println("Number of even numbers: "+ even);
        System.out.println("Number of 0s: " + zero);
    }
}
