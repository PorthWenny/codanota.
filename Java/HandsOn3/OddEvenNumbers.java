package HandsOn3;

class OddEvenNumbers {
    public static void main (String[] coderakizkiz) {

        int sum = 0;

        System.out.println("The first 15 even numbers are: ");
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            else {
                sum = sum + i;
            }
        }

        System.out.println("The sum of the first 15 odd numbers are: " +sum);
    }
}