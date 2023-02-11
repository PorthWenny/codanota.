import java.util.*;

public class PyramidMirror {
  public static void main(String args[]) {

        try (Scanner holabels = new Scanner(System.in)) {
            int row;
      
            System.out.print("Input value of n: ");
            row = holabels.nextInt();

            // main loop
            for (int i = 1; i <= row; i++) {
                
                // for spacing
                for (int k = row; k >= i+1; k--) {
                    System.out.print(" ");
                }

                int num = i;
                // for left side design
                for (int j = 1; j <= i; j++) {
                    System.out.print(num);
                    num--;
                }

                //for right side design
                 if (i > 1) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(num+2);
                        num++;
                    }
                }
                
                System.out.println(" ");
            }
        }
    }
}
