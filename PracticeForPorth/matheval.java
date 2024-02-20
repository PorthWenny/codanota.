import java.util.*;


public matheval {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        String eq = scanner.next();
        eq += scanner.nextLine();
        int x = 0, y = 0;

        for (char c : eq.toCharArray()) {
            if (c == "(") {
                x = eq.indexOf(c);
            }
            if (c == ")") {
                y = eq.indexOf(c);
            }
        }

        eq.replace(eq.substring(x, y+1), repComputed(eq,x,y));
    }

    public static int repComputed(String eq, int x, int y) {
        int calc = 0;

        calc = eval(eq.substring(x, y+1));
        return calc;
    }
}