import java.util.*;

public class SantaList {
    public static void main (String[] args) {
        String name1, name2;
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<String> answer = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            ArrayList<String> name = new ArrayList<>(2);
            name1 = input.next();
            name1 += input.nextLine();

            name2 = input.next();
            name2 += input.nextLine();

            name.add(name1);
            name.add(name2);

            if (name1.equalsIgnoreCase(name2)) {
                answer.add("SAME!");
            }
            else {
            Collections.sort(name);
            answer.add(name.get(0));
            }
        }

        for (String list : answer) {
            System.out.println(list);
        }
    }
}