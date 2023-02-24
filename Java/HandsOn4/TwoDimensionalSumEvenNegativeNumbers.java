import java.io.*;
import java.util.Scanner;

public class TwoDimensionalSumEvenNegativeNumbers {
  public static void main(String args[]) {

    Scanner holabels = new Scanner(System.in);
    int[][] numArr = new int[5][2];
    int neg = 0, even = 0;

    System.out.println("Enter the 10 values of the 2D-array: ");
    for (int i = 0; i < numArr.length; i++) {
        for (int j = 0; j < numArr[i].length; j++) {
            numArr[i][j] = holabels.nextInt();

            if (numArr[i][j] % 2 == 0) {
                even+=numArr[i][j];
            }
            if (numArr[i][j] < 0) {
                neg+=numArr[i][j];
            }
        }
    }
1
    System.out.println("\nThe sum of even numbers is: " +even);
    System.out.println("The sum of negative numbers is: " +neg);

  }
}