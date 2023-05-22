public class LessOrMore {
    public static void main (String[] args) {

    System.out.println("The Armstrong numbers from 1 - 500 are...");
    for (int i = 1; i <= 500; i++) {
        int sum = 0;
        int num = i;
        while (num!=0) {
            int current = num%10;
            num = i / 10;

            sum += current;
        }
        
        // checks if final sum is equal to i.
        if (sum == i) {
            System.out.print(i + " ");
        }
    }
}
}