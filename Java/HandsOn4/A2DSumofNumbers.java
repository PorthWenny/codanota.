import java.util.Scanner;

public class A2DSumofNumbers {
    public static void main(String[] args) {
        
        try (Scanner holabels = new Scanner(System.in)) {
            int row;
            int col;
            System.out.print("Enter number of rows of an array: ");
            row = holabels.nextInt();
            System.out.print("Enter number of columns of an array: ");
            col = holabels.nextInt();

            int[][] numArr = new int[row][col];
            int all = 0;
            int odd = 0;
            for (int i = 0; i < numArr.length; i++) {
                for (int j = 0; j < numArr[i].length; j++) {
                    System.out.print("The value of an array at index "+i+" "+j+": ");
                    numArr[i][j] = holabels.nextInt();

                    all += numArr[i][j];

                    if (numArr[i][j] % 2 != 0)
                        odd++;
                }
            }

            System.out.println("The sum of odd numbers is: " +odd);
            System.out.println("The sum of all inputted numbers is: " +all);
        }
    }
}
