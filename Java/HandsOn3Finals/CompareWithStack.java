import java.util.*;

public class CompareWithStack {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int comp = input.nextInt();
        System.out.print("Enter the size of the stack: ");
        int n = input.nextInt();

        // stack elements initialization
        Stack<Integer> stack = new Stack<>();
        int eq = 0, more = 0, less = 0;
        System.out.println("Enter the elements of the stack: ");
        for (int i = 0; i < n; i++) {
            stack.push(input.nextInt());

            if (stack.get(i) == comp) {
                eq++;
            }
            else if (stack.get(i) > comp) {
                more++;
            }
            else {
                less++;
            }
        }

        System.out.println("Inputted stack elements: " + stack);
        System.out.println("Number/s equal to the inputted value from the stack: " + eq);
        System.out.println("Number/s greater than the inputted value from the stack: " + more);
        System.out.println("Number/s smaller than the inputted value from the stack: " + less);
    }
}
