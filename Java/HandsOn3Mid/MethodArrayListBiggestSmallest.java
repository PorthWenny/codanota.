import java.util.*;

public class MethodArrayListBiggestSmallest {
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(15);
        Scanner input = new Scanner(System.in);

        int min = 0, max = 0;
        System.out.println("Enter the values of the ArrayList:");
        for (int i = 0; i < 15; i++) {
            nums.add(input.nextInt());
        }
        
        System.out.println("The highest value is: " + getMax(nums));
        System.out.println("The smallest value is: " + getMin(nums));
    }

    static int getMax (ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int i = 0; i < 15; i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    static int getMin (ArrayList<Integer> nums) {
        int min = nums.get(0);
        for (int i = 0; i < 15; i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return min;
    }
}
