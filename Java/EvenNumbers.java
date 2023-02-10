import java.io.*;
import java.util.*;

public class EvenNumbers {
  public static void main(String args[]) {
    
      System.out.println("The first 10 even numbers are: ");
        int limit = 0;
      
      // loop for printing even numbers.
      for (int i = 2; i > 0; i++) {
          // check if the it is still inputting <= 10 numbers.
          if (limit == 10) {
              break;
          }
          // checks if the value of 'i' is even, then prints.
          if (i % 2 == 0) {
              System.out.println(i);
              limit++;
          }
      }
        
    }
}
