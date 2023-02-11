import java.util.*;

public class RightPyramid {
    public static void main(String[] coderakizkiz) {

        Scanner holabels = new Scanner(System.in);
        int row;
       
        System.out.print("Input the number of rows: ");
        row = holabels.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
