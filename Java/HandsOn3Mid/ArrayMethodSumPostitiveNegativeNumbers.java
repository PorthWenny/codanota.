import java.util.*;

public class ArrayMethodSumPostitiveNegativeNumbers {
    public static void main (String[] args) {

        int [] numArr = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 10 values of the array");
        for (int i = 0; i < 10; i++) {
            numArr[i] = input.nextInt();
        }

        sumEvenAndOdd(numArr);
        sumPosAndNeg (numArr);
    }

    static void sumEvenAndOdd (int[] numArr) {
        int even = 0, odd = 0;
        for (int i = 0; i < 10; i++) {
            if (numArr[i] % 2 == 0) {
                even += numArr[i];
            }
            else {
                odd += numArr[i];
            }
        }

        System.out.println("The sum of even numbers is: " + even);
        System.out.println("The sum of odd numbers is: " + odd);
    }

    static void sumPosAndNeg (int[] numArr) {
        int pos = 0, neg = 0;
        for (int i = 0; i < 10; i++) {
            if (numArr[i] > 0) {
                pos += numArr[i];
            }
            else {
                neg += numArr[i];
            }
        }

        System.out.println("The sum of positive numbers is: " + pos);
        System.out.println("The sum of negative numbers is: " + neg);
    }
}
