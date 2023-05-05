import java.util.*;

public class CompareTwoQueues {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of your first queue: ");
        int n1 = input.nextInt();
        Queue<Integer> q1 = new LinkedList<>();

        // initialized comparator values
        int big = Integer.MIN_VALUE, small = Integer.MAX_VALUE;
        System.out.println("Enter the elements of the queue: ");
        for (int i = 0; i < n1; i++) {
            q1.add(input.nextInt());
        }
        System.out.println("The elements of the first queue are: " + q1);

        // greatest checker (copied also for 2nd queue)
        for (int curr : q1) {
            if (curr > big) {
                big = curr;
            }

            if (curr < small) {
                small = curr;
            }
        }

        System.out.print("Enter the size of your second queue: ");
        int n2 = input.nextInt();
        Queue<Integer> q2 = new LinkedList<>();
        System.out.println("Enter the elements of the queue: ");
        for (int i = 0; i < n2; i++) {
            q2.add(input.nextInt());
        }
        System.out.println("The elements of the second queue are: " + q2);

        for (int curr : q2) {
            if (curr > big) {
                big = curr;
            }

            if (curr < small) {
                small = curr;
            }
        }

        if (q1.contains(big)) {
            System.out.println("Queue 1 has the biggest value: " + big);
        }
        else {
            System.out.println("Queue 2 has the biggest value: " + big);
        }

        if (q1.contains(small)) {
            System.out.println("Queue 1 has the smallest value: " + small);
        }
        else {
            System.out.println("Queue 2 has the biggest value: " + small);
        }
    }
}
