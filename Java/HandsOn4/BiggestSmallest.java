import java.util.Scanner;

public class BiggestSmallest {
  public static void main(String[] args) {

    try (Scanner holabels = new Scanner(System.in)) {
        int[][] numArr = new int[4][2];
        int small = Integer.MAX_VALUE;
        int high = 0;

        System.out.println("Enter the 10 values of the 2D-array: ");
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                numArr[i][j] = holabels.nextInt();

                if (i == 0 && j == 0) {
                    high = numArr[i][j];
                    small = numArr[i][j];
                }

                if (numArr[i][j] > high) {
                    high = numArr[i][j];
                }
                if (numArr[i][j] < small) {
                    small = numArr[i][j];
                }
            }
        }

        System.out.println("\nThe highest value is: " +high);
        System.out.println("The smallest value is: " +small);
    }

  }
}