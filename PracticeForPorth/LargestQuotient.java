import java.util.*;

public class LargestQuotient {
    public static void main (String[] args) {

        int i, max = 0;
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numArr = new ArrayList<Integer>();

        // get input from user to store in the numArr.
        do {
            i = input.nextInt();
            numArr.add(i);
        } while (i != 0);

        // remove the 0.
        numArr.remove(numArr.size() - 1);

        // calculate the quotients of each numbers.
        for (int compare_initial : numArr) {
            for ( int compare_each : numArr) {
                int quot = compare_initial / compare_each;
                
                if (quot > max) {
                    max = quot;
                }
            }
        }

        System.out.println(max);
    }
}