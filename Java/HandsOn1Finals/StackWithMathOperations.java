import java.util.*;

public class StackWithMathOperations {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of stack: ");
        int n = input.nextInt();

        Stack<Integer> elements = new Stack<>();
        int sum_odd = 0, sum_all = 0;
        System.out.println(n + " elements of the stack are: ");
        for (int i = 0; i < n; i++) {
            elements.push(input.nextInt());

            if (elements.get(i) % 2 != 0) {
                sum_odd += elements.get(i);
            }

            sum_all += elements.get(i);
        }

        System.out.println("The sum of odd numbers is: " + sum_odd);
        System.out.println("The sum of all inputted numbers is: " + sum_all);
    }
}
