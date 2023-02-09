import java.util.*;

public class Main {
  public static void main(String args[]) {

        Scanner holabels = new Scanner(System.in);
        int n;
       
      System.out.print("Input value of n: ");
        n = holabels.nextInt();

        // initialize variables to be used.
        int count = n, num1 = 1;
        // main for loop
        for (int i = 1; i <= n; i++) {
            
            // for spacing
            for (int a = count; a >= 1; a--) {
                System.out.print(" ");
            }
           
            int num = num1;
            // for left side design
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num--;
            }

            int num2 = num+1;
            //for right side design
             if (i > 1) {
                for (int j = 1; j < i; j++) {
                    System.out.print(num2+1);
                    num2++;
                }
            }
           
            count--;
            num1++;
            System.out.println(" ");
        }
    }
}
