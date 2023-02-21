import java.util.*;

public class twodarraynotes {
    public static void main(String[] coderakizkiz) {
        double computation=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();
        int[][] multidimensionalArray = new int[rows][columns];
        // Now you can use the array like a regular 2-dimensional array
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
        System.out.println("Enter the value of the array for: " + i + " " + j );
        multidimensionalArray[i][j]  scan.nextInt();
        computation = computation + multidimensionalArray[i][j];
        }
        }
        System.out.println("The computation is: " + computation);
        scan.close();
    }
}