import java.util.*;

public class StackMathOperations {
    public static void main (String[] args) {
        Stack<Integer> elements = new Stack<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the stack integer elements: ");

        float sum = 0;
        int high = Integer.MIN_VALUE, low = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            elements.push(input.nextInt());
            sum += elements.get(i);

            if (elements.get(i) > high) {
                high = elements.get(i);
            }

            if (elements.get(i) < low) {
                low = elements.get(i);
            }
        }

        float avg = sum/10;
        
        System.out.println("Inputted stack elements: " + elements);
        System.out.println("The sum is: " + sum);
        System.out.printf("The average is %.1f \n", avg);
        System.out.println("The highest value is: " + high);
        System.out.println("The lowest value is: " + low);
    }
}
