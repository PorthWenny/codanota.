import java.util.*;

public class QueueSearchValues {

    static void searchValues(Queue<Integer> num) {
        int pos = 0, neg = 0, odd = 0, even = 0, zero = 0;

        for (int current : num) {

            // for positive-negative
            if (current > 0) {
                pos++;
            }
            else if (current < 0) {
                neg++;
            }
            else {
                zero++;
            }

            // for odd-even
            if (current % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + (even - zero));
        System.out.println("Number of 0s: " + zero);
    }
    public static void main (String[] args) {
        Queue<Integer> num = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        // getting user input
        System.out.println("Enter the queue integer elements: ");
        for (int i = 0; i < 10; i++) {
            num.add(input.nextInt());
        }

        System.out.println("Inputted queue elements: " + num);

        searchValues(num);
    }
}
