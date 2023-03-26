import java.util.*;

public class ArrayListSumofNumbers {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the ArrayList: ");
        int size = input.nextInt();
        
        ArrayList<Integer> nums = new ArrayList<>(size);


        int odd = 0, all = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("The value of an ArrayList at index " + i + ": ");
            nums.add(input.nextInt());

            if (nums.get(i) % 2 != 0) {
                odd += nums.get(i);
            }
            all += nums.get(i);
        }

        System.out.println("The sum of odd numbers is: " + odd);
        System.out.println("The sum of all inputted numbers is: " + all);

    }
}
