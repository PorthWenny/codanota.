import java.util.Scanner;

public class BiggestSmallestArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][][] numArr = new int[3][2][3];
        int high = numArr[0][0][0];
        int small = numArr[0][0][0];

        System.out.println("Enter the value of the 3-D array: ");

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                for (int k = 0; k < numArr[i][j].length; k++) {
                    numArr[i][j][k] = input.nextInt();

                    if (numArr[i][j][k] > high) {
                        high = numArr[i][j][k];
                    }
                    
                    if (numArr[i][j][k] < small) {
                        small = numArr[i][j][k];
                    }
                }
            }
        }

        System.out.println("The highest value is: " + high);
        System.out.println("The smallest value is: " + small);
    }
}