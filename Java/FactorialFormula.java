import java.util.*;

public class FactorialFormula {
  public static void main(String args[]) {
    
      try (Scanner holabels = new Scanner(System.in)) {
        // gets input.
          System.out.print("Enter a positive integer: ");
          int num = holabels.nextInt();

          // initialize variables needed.
          int fac = 1, counter = num;
          System.out.print("The factorial value is: ");

          // for loop for factorial.
          for (int i = num; i >= 1; i--) {
              fac *= i;

              // counter for printing the factorial formula.
              System.out.print(counter+" ");
              counter--;
              // stops printing the asterisk when it's the last digit (1).
              if (counter != 0) {
                  System.out.print("* ");
              }
          }

          System.out.println("= "+fac);
    }

    }
}
