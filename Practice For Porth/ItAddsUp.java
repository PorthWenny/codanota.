import java.util.*;

public class ItAddsUp {
    public static void main (String[] args) {

        Scanner holabels = new Scanner(System.in);

        // getting user inputs
        System.out.print("Enter desired sum: ");
        int sum = holabels.nextInt();
        System.out.print("Enter number of elements: ");
        int n = holabels.nextInt();
        System.out.print("Enter each elements: ");
        int[] numArr = new int[n];
        for(int i = 0; i < n; i++) {
            numArr[i] = holabels.nextInt();
        }

        // determining the two numbers equivalent to sum
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (numArr[i] + numArr[j] == sum) {
                    System.out.println("("+numArr[i]+","+numArr[j]+") found at ["+(i+1)+"]["+(j+1)+"]");
                }
            }
        }
    }
}
