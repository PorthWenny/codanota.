import java.util.*;

public class StackSearchValues {
    public static void main (String[] args) {
        Stack<Integer> elements = new Stack<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the stack integer elements: ");

        int pos = 0, neg = 0, odd = 0, even = 0, zero = 0;
        for (int i = 0; i < 10; i++) {
            elements.push(input.nextInt());

            if (elements.get(i) > 0) {
                pos++;
            }
            else if (elements.get(i) == 0) {
                zero++;
            }
            else {
                neg++;
            }
            
            if (elements.get(i) % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        
        System.out.println("Inputted stack elements: " + elements);
        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + (even - zero));
        System.out.println("Number of 0s: " + zero);
    }
}
