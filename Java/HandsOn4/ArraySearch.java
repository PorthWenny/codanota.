import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        int[][] numArr = new int[3][5];
        int pos = 0;
        int neg = 0;
        int even = 0;
        int odd = 0;
        
        try (Scanner holabels = new Scanner(System.in)) {
            System.out.println("Enter 15 values of array: ");
            for (int i = 0; i < numArr.length; i++) {
                for (int j = 0; j < numArr[i].length; j++) {
                numArr[i][j] = holabels.nextInt();

                if (numArr[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
                
                if (numArr[i][j] > 0) 
                    pos++;
                
                else if (numArr[i][j] < 0) 
                    neg++;
                }
            }
        }

        System.out.println("Number of positive numbers: " +pos);
        System.out.println("Number of negative numbers: "+neg);
        System.out.println("Number of odd numbers: "+odd);
        System.out.println("Number of even numbers: "+even);
    }
}