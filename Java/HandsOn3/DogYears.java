package HandsOn3;

public class DogYears {
    public static void main (String[] coderakizkiz) {
        int dyear = 1;
        
        System.out.println("Human    Dog");
        for (int i = 1; i <= 10; i++) {
            dyear = i * 7;

            // this if condition is just for cleaning up the printing for double digit integers.
            if (i == 10) {
                System.out.println(i + "       " + dyear);
                break;
            }

            // normally prints the output.
            System.out.println(i + "        " + dyear);
        }
    }
}
