import java.util.*;

public class MethodArrayListArraySearch {
    public static void main (String[] args) {

        int [] numArr = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter values of the Array List");
        for (int i = 0; i < 10; i++) {
            numArr[i] = input.nextInt();
        }

        numPosAndNeg (numArr);
        numEvenAndOdd(numArr);
        numZero(numArr);
    }

    static void numEvenAndOdd (int[] numArr) {
        int even = 0, odd = 0;
        for (int i = 0; i < 10; i++) {
            if (numArr[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
    }

    static void numPosAndNeg (int[] numArr) {
        int pos = 0, neg = 0;
        for (int i = 0; i < 10; i++) {
            if (numArr[i] > 0) {
                pos++;
            }
            else if (numArr[i] < 0) { 
                neg++;
            }
        }

        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
    }

    static void numZero (int[] numArr) {
        int zero = 0;
        for (int i = 0; i < 10; i++) {
            if (numArr[i] == 0) {
                zero++;
            }
        }

        System.out.println("Number of 0s: " + zero);
    }
}
