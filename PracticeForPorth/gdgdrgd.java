public import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Input number of pookies: ");
        int n = input.nextInt();
        System.out.print("Input pookies given: ");
        ArrayList<Integer> initial = new ArrayList<>();
        Queue<Integer> pookie = new LinkedList<>();
        int m = input.nextInt();

        System.out.print("Input cookies in each pookie: ");
        for (int i = 0; i < m; i++) {
            initial.add(input.nextInt());
            pookie.add(initial.get(i));
        }
        for (int i = 0; i < n - m; i++) {
            pookie.add(initial.get(i));
        }

        
        System.out.println("The cookies inside are: " + pookie);



    }
} gdgdrgd {
    
}
