import java.util.*;

public class Main {
  public static void main(String args[]) {

        Scanner holabels = new Scanner(System.in);
        int row;
       
      System.out.print("Input value of n: ");
        row = holabels.nextInt();

        // initialize variables to be used.
        int space = row-1, placeholder = 1;
        // main for loop
        for (int i = 1; i <= row; i++) {
            
            // for spacing
            for (int a = space; a >= 1; a--) {
                System.out.print(" ");
            }
           
            int num = placeholder;
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
           
            space--;
            placeholder++;
            System.out.println(" ");
        }
    }
}
