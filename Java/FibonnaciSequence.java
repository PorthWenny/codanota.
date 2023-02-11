import java.io.*;
import java.util.*;

public class FibonnaciSequence {
  public static void main(String args[]) {
    
      Scanner holabels = new Scanner(System.in);

      // gets input.
      System.out.print("Enter a number to create a Fibonacci sequence: ");
      int num = holabels.nextInt();

      // initialize variables needed.
      System.out.print("The Fibonacci sequence is: 0 1 ");

      int fibo1 = 0, fibo2 = 1, fibo3 = 101010101;
      for (int i = 0; i <= num-3; i++) {
          fibo3 = fibo1 + fibo2;
          System.out.print(fibo3+" ");

          fibo1 = fibo2;
          fibo2 = fibo3;
      }
      
    }
}
