import java.util.*;

public class PyramidFull {
    public static void main(String[] coderakizkiz) {

        try (Scanner holabels = new Scanner(System.in)) {
            int row;
      
            System.out.print("Input the number of rows (or asterisks): ");
            row = holabels.nextInt();

            for (int i = 1; i <= row; i++) {
                // loop for spacing.
                for (int k = row; k >= i+1; k--) {
                    System.out.print(" ");
                }
                // loop for asterisk (left).
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // loop for asterisk (right).
                if (i != 1) {
                    for (int j = 2; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println(""); 
            }
        }
    }
}
