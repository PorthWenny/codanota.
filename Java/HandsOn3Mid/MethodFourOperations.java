import java.util.*;

public class MethodFourOperations {

    static int add(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multi(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
    public static void main (String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        a = input.nextInt();
        System.out.println("Enter num2 : ");
        b = input.nextInt();

        System.out.println("The sum is: " + add(a,b));
        System.out.println("The difference is: " + minus(a,b));
        System.out.println("The product is: " + multi(a,b));
        System.out.println("The quotient is: " + (double)divide(a,b));
        
        
    }
}
