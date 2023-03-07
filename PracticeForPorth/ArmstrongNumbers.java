public class ArmstrongNumbers {
    public static void main (String[] args) {

    int sum, num, current;
    System.out.println("The Armstrong numbers from 1 - 500 are...");
    for (int i = 1; i <= 500; i++) {

        // re-initializes variables each iteration.
        sum = 0;
        num = i;

        // calculate each numbers to cube and add.
        while (num != 0) {
            current = num % 10;
            sum += Math.pow(current,3);
            num /= 10;
        }

        // checks if final sum is equal to i.
        if (sum == i) {
            System.out.print(i + " ");
        }
        
    }
}
}