import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] coderakizkiz) {
        
        try (Scanner holabels = new Scanner(System.in)) {
            
            int num;
            System.out.print("Input integer: ");
            num = holabels.nextInt();

            System.out.println("");
            System.out.println("OUTPUT: ");
            for (int column = 1; column <= num; column++) {
                for (int row = 1; row <= num; row++) {
                    System.out.print(row+" ");
                }
                System.out.println("");
            }

        }
    }
}