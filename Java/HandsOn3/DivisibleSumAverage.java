package HandsOn3;

public class DivisibleSumAverage {
    public static void main (String[] coderakizkiz) {

        int sum = 0, avg = 0;

        System.out.println("The first 10 numbers divisible by 8 are: ");
        for (int i = 0; i <= 80; i++) {
            if (i % 8 == 0) {
                System.out.println(i);

                sum = sum +i;
                avg = sum/10;
            }

        }

        System.out.println("The sum is: " +sum);
        System.out.println("The average is: " +avg);
    }
}
