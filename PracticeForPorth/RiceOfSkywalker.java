import java.util.*;

public class RiceOfSkywalker {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int w = input.nextInt();

        if (r * 3 == w) {
            System.out.println("THE RICE IS RIGHT!");
        }
        else if (r * 3 < w) {
            System.out.println("WE NEED MORE RICE.");
        }
        else if (r * 3 > w) {
            System.out.println("WE NEED MORE WATER.");
        }
    }
}
