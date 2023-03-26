import java.util.*;

public class ArrayListBiggestSmallest {
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(15);
        Scanner input = new Scanner(System.in);

        int min = 0, max = 0;
        System.out.println("Enter the values of the ArrayList:");
        for (int i = 0; i < 15; i++) {
            nums.add(input.nextInt());

            if (i == 0) {
                min = nums.get(0);
                max = nums.get(0);
            }

            if (nums.get(i) > max) {
                max = nums.get(i);
            }

            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        
        System.out.println("The highest value is: " + max);
        System.out.println("The smallest value is: " + min);
    }
}
