import java.util.*;

public class TrailingDigits {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int price = input.nextInt();
        int trail = input.nextInt();
        int bundle = input.nextInt();

        int k = 0, max_trail = 0;
        while ((k++ * price) < bundle) {
            max_trail = 0;
            int curr_bundle = (k * price);

            while (curr_bundle != 0) {
                int digit = curr_bundle % 10;

                if (digit == trail) {
                    max_trail++;
                }

                curr_bundle /= 10;
            }
        }

        System.out.print(max_trail);
    }
}
