import java.util.*;

public class ArrayListArraySearch {
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(10);
        Scanner input = new Scanner(System.in);

        int even = 0, odd = 0, pos = 0, neg = 0, zero = 0;
        System.out.println("Enter values of the Array List");
        for (int i = 0; i < 10; i++) {
            nums.add(input.nextInt());

            if (nums.get(i) % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }

            if (nums.get(i) > 0) {
                pos++;
            }
            else if (nums.get(i) == 0) {
                zero++;
            }
            else {
                neg++;
            }
        }
        
        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of 0s: " + zero);
    }
}
