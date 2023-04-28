import java.util.*;

public class QueueWithMathOperations {

    static void sumOddAll (Queue<Integer> num) {
        int sumAll = 0, sumOdd = 0;
        for (int curr : num) {
            sumAll += curr;

            if (curr % 2 != 0) {
                sumOdd += curr;
            }
        }

        System.out.println("The sum of odd numbers is: " + sumOdd);
        System.out.println("The sum of all inputted numbers is: " + sumAll);
    }
    public static void main (String[] args) {
        Queue<Integer> num = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);

        // getting queue size
        System.out.print("Enter the length of the queue: ");
        int n = input.nextInt();

        // getting user input
        System.out.println(n + " elements of the queues are: ");
        for (int i = 0; i < n; i++) {
            num.add(input.nextInt());
        }

        sumOddAll(num);
    }
}
