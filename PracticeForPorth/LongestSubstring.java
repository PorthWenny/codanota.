import java.util.*;

public class LongestSubstring {
    public static void main (String[] hi) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("s = ");
        String text = input.nextLine();

        int count = 0;
        int lastc = 1;

        for (int i = 0; i < text.length(); i++) {
            for (int j = i+1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    text = text.substring(0, j) + "" + text.substring(j+1);
                }
            }
        }


        for (int i = 0; i < text.length(); i++) {
            if (i+1 != text.length()) {
                if (text.charAt(i) != text.charAt(i+1)) {
                    count++;
                    lastc = count;
                    continue;
                }
                else {
                    count = 0;
                    continue;
                }
            }
        }

        System.out.println(lastc);

    }
}
