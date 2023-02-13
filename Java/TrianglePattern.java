import java.util.*;

public class TrianglePattern {
    public static void main(String[] coderakizkiz) {

        try (Scanner holabels = new Scanner(System.in)) {
            int size;

            System.out.print("Input integer size of triangle: ");
            size = holabels.nextInt();

            System.out.println("");
            System.out.println("YOUR TRIANGLE LOOKS LIKE: ");
            for (int i = 1; i <= size; i++) {
                if (i == 1) {
                    for (int line = 1; line < size; line++) {
                        // prints the top of the inverted triangle.
                        System.out.print("- ");
                    }
                    System.out.println("");
                }
                else if (i > 1) {
                    for (int space = 2; space < i; space++) {
                        System.out.print(" ");
                    }
                    // prints the left side of the inverted triangle.
                    System.out.print("\\");

                    for (int inside = 2 * (size - i); inside >= 1; inside--) {
                        System.out.print(" ");
                    }
                    // prints the right side of the inverted triangle.
                    System.out.println("/");
                }
            }
        }
    }
}
