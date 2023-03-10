package HandsOn1Mid;
import java.util.Scanner;

public class TwoDimensionalSumEvenNegativeNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[][][] numbers = new int[3][2][2];
        int even = 0, neg = 0;

        System.out.println("Enter the values of the 3D-array: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    numbers[i][j][k] = input.nextInt();

                    if (numbers[i][j][k] % 2 == 0) {
                        even += numbers[i][j][k];
                    }
                    
                    if (numbers[i][j][k] < 0) {
                        neg += numbers[i][j][k];
                    }
                }
            }
         }

         System.out.println("The sum of even numbers is: " + even);
         System.out.println("The sum of negative numbers is: " + neg);

    }
}
