import java.util.*;

public class MethodArrayListSumofNumbers {
    public static ArrayList<Integer> num = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static int n;
    public static void main (String[] args) {

        System.out.print("Enter the length of the ArrayList: ");
        n = input.nextInt();

        valueGetArr(n);

        System.out.println("The sum of odd numbers is: " + sumOdd(num));
        System.out.println("The sum of  all inputted numbers is: " + sumAll(num));
    }

    static void valueGetArr (int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("The value of an ArrayList at index " + i + ": ");
            num.add(input.nextInt());
        }
    }
    
    public static int sumOdd (ArrayList<Integer> num) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (num.get(i) % 2 != 0) {
            sum += num.get(i);
            }
        }
        return sum;
    }

    public static int sumAll (ArrayList<Integer> num) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += num.get(i);
        }
        return sum;
    }
}
