import java.util.*;

public class TrailingDigits {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int price = input.nextInt();
        int trail = input.nextInt();
        int bundle = input.nextInt();

        int k = 0, max_trail = 0;
        while ((k++ * price) < bundle) {
            int curr_trail = 0;
            int curr_bundle = (k * price);

            while (curr_bundle != 0) {
                int digit = curr_bundle % 10;

                if (digit == trail) {
                    curr_trail++;
                }

                curr_bundle /= 10;
            }

            if (curr_trail > max_trail) {
                max_trail = curr_trail;
            }
        }

        System.out.print(max_trail);
    }
}
