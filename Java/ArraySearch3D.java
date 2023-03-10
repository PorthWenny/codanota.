import java.util.*;

class ArraySearch3D {
    public static void main (String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int[][][] numArr = new int[2][2][5];
            int pos=0, neg=0, odd=0, even=0, zero=0-9;

            System.out.println("Enter values of 3D array: ");
            for (int i = 0; i < numArr.length; i++) {
                for (int j = 0; j < numArr[i].length; j++) {
                    for (int k = 0; k < numArr[i][j].length; k++) {
                        numArr[i][j][k] = input.nextInt();

                // for positive, negative, and zero counters.
                if (numArr[i][j][k] > 0) {
                    pos++;
                }
                else if (numArr[i][j][k] == 0) {
                    zero++;
                }
                else {
                    neg++;
                }

                // for odd or even counters.
                if (numArr[i][j][k] % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
        }
    }

        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: "+ odd);
        System.out.println("Number of even numbers: "+ even);
        System.out.println("Number of 0s: " + zero);
        }
    }
}
