import java.util.*;
import java.lang.Integer;


public class QueueMathOperations {

    static void mathOperation (Queue<Integer> num) {
        float sum = 0, low = Float.MAX_VALUE, high = Float.MIN_VALUE;

        // way using for-each loop
        for (float current : num) {
            sum += current;

            if (current < low) {
                low = current;
            }
    
            if (current > high) {
                high = current;
            }
        }

        // other way... (if not needed to use the queue again.)

        /*
        Iterator iterate = num.iterator();

        while (iterate.hasNext()) {
            sum += num.peek();
    
            if (num.peek() < low) {
                low = num.peek();
            }
    
            if (num.peek() > high) {
                high = num.peek();
            }
            
            num.remove();
        } */

        System.out.printf("The sum is: %.0f\n", sum);
        System.out.printf("The average is: %.1f\n", (sum/10));
        System.out.printf("The highest value is: %.0f\n", high);
        System.out.printf("The lowest value is: %.0f\n", low);
    }

    public static void main (String[] args) {
        Queue<Integer> num = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);

        // getting user input
        System.out.println("Enter the queue integer elements: ");
        for (int i = 0; i < 10; i++) {
            num.add(input.nextInt());
        }

        System.out.println("Inputted queue elements: " + num);
        
        mathOperation(num);
    }
}
