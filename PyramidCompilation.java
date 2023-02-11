import java.util.Scanner;

public class PyramidCompilation {
    public static void main(String[] kwentoakizkiz) {
        try (Scanner holabels = new Scanner(System.in)) {
            int row;
      
            System.out.print("Input the number of rows: ");
            row = holabels.nextInt();

            System.out.println("");
            System.out.println("=== 10 ASTERISKS PER ROW ===");
            System.out.println("");
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

            System.out.println("");
            System.out.println("=== RIGHT TRIANGLE ===");
            System.out.println("");
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

            System.out.println("");
            System.out.println("=== MIRRORED RIGHT TRIANGLE ===");
            System.out.println("");
            for (int i = 1; i <= row; i++) {
                // loop for spacing.
                for (int k = row; k >= i+1; k--) {
                    System.out.print(" ");
                }
                // loop for asterisk.
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(""); 
            }

            System.out.println("");
            System.out.println("=== ASTERISK PYRAMID ===");
            System.out.println("");
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

            System.out.println("");
            System.out.println("=== PYRAMID WITH REPEATING NUMBER BY ROW ===");
            System.out.println("");
            for (int i = 1; i <= row; i++) {
                // loop for spacing.
                for (int k = row; k >= i+1; k--) {
                    System.out.print(" ");
                }
                // loop for asterisk (left).
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                // loop for asterisk (right).
                if (i != 1) {
                    for (int j = 2; j <= i; j++) {
                        System.out.print(i);
                    }
                }
                System.out.println(""); 
            }

            System.out.println("");
            System.out.println("=== PYRAMID WITH MIRRORING NUMBERS ===");
            System.out.println("");
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
