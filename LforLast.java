import java.util.*;

public class LforLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> bad = new ArrayList<Integer>();

        for (int i = 1; i <= 20; i++) {
            bad.add(i);
        }

        HashMap<Integer, Integer> sussy = new HashMap<Integer, Integer>();

        int trusted = 0;

        for (int i = 1; i < 19; i+=2) {
            System.out.println("QUERY " + i + " " + (i+1));

            String ans = scanner.next();
            ans += scanner.nextLine();

            if (ans.equals("YES NO")) {
                trusted = i;
                bad.remove(bad.indexOf(i));
                bad.remove(bad.indexOf((i+1)));
            } else if (ans.equals("NO IDK")) {
                trusted = i;
                System.out.println("QUERY " + (i+1) + " " + i);
                
                String second_ans = scanner.next();
                second_ans += scanner.nextLine();

                if (!second_ans.equals("YES YES")) {
                    bad.remove(bad.indexOf(i));
                    bad.remove(bad.indexOf((i+1)));
                } else {
                    bad.remove(bad.indexOf(i));
                }
            } else if (ans.equals("YES YES")) {
                sussy.put(i, (i+1));
            }
        }

        if (sussy.size() < 5) {
            System.out.println("QUERY 19 " + trusted);

            String second_ans = scanner.next();
            second_ans += scanner.nextLine();

            if (!second_ans.equals("YES YES")) {
                bad.remove(bad.indexOf(19));
            } else {
                bad.remove(bad.indexOf(20));
            }
        } else {
            bad.remove(bad.indexOf(20));
            bad.remove(bad.indexOf(19));
        }

        if (bad.size() == 5) {
            printans(bad);
        }

        for (Map.Entry<Integer, Integer> s : sussy.entrySet()) {
            int key = s.getKey();
            int value = s.getValue();

            System.out.println("QUERY " + key + " " + trusted);
            
            String second_ans = scanner.next();
            second_ans += scanner.nextLine();

            if (!second_ans.equals("YES YES")) {
                bad.remove(bad.indexOf(key));
            }

            if (bad.size() == 5) {
                printans(bad);
            }

            System.out.println("QUERY " + value + " " + trusted);
            
            second_ans = scanner.next();
            second_ans += scanner.nextLine();

            if (!second_ans.equals("YES YES")) {
                bad.remove(bad.indexOf(value));
            }
        }

        if (bad.size() > 5) {
            bad.remove(bad.size()-1);
        }
        printans(bad);
    }

    public static void printans(List<Integer> crew) {
        System.out.print("ANSWER ");

        for (int i = 0; i < 5; i++) {
            System.out.print(crew.get(i) + " ");
        }

        System.exit(0);
    }
}