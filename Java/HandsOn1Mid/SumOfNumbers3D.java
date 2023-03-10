package HandsOn1Mid;
import java.util.*;

public class SumOfNumbers3D {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of table: ");
        int z = input.nextInt();
        System.out.print("Enter the number of rows of an array: ");
        int x = input.nextInt();
        System.out.print("Enter the number of columns of an array: ");
        int y = input.nextInt();

        int[][][] numArr = new int[x][y][z];
        int sum_odd = 0;
        int sum_all = 0;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                for (int k = 0; k < numArr[i][j].length; k++) {
                    numArr[i][j][k] = input.nextInt();

                    sum_odd += numArr[i][j][k];
                    sum_all += numArr[i][j][k];
                }
            }
        }

        System.out.println("The sum of odd numbers is: " + sum_odd);
        System.out.println("The sum of all inputted numbers is: " + sum_all);
    }
}