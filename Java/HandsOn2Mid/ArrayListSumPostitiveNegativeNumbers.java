import java.util.*;

public class ArrayListSumPostitiveNegativeNumbers {
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(10);
        Scanner input = new Scanner(System.in);

        int even = 0, odd = 0, pos = 0, neg = 0;
        System.out.println("Enter the 10 values of the ArrayList ");
        for (int i = 0; i < 10; i++) {
            nums.add(input.nextInt());

            if (nums.get(i) % 2 == 0) {
                even += nums.get(i);
            }
            else {
                odd += nums.get(i);
            }

            if (nums.get(i) > 0) {
                pos += nums.get(i);
            }
            else {
                neg += nums.get(i);
            }
        }
        
        System.out.println("The sum of even numbers is: " + even);
        System.out.println("The sum of odd numbers is: " + odd);
        System.out.println("The sum of positive numbers is: " + pos);
        System.out.println("The sum of negative numbers is: " + neg);
    }
}
