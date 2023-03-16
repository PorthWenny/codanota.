import java.util.*;

public class LongestSubstring {   
    public static int lengthOfLongestSubstring (String s) {
        Set<Character> set = new HashSet();

        int max = 0;
        int left = 0;

        /* starts a while loop that checks if the character at the current index 
        is already in the set of characters. If it is, the loop removes the character 
        at the left index of the substring from the set and increments left. */

        for (int i = 0; i < s.length(); i++) {
            while(!set.add(s.charAt(i))) {
                set.remove(s.charAt(left++));
            }
            // update max value between max & substring length + 1
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
    
    public static void main (String[] hi) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("s = ");
        String s = input.nextLine();

        System.out.println(lengthOfLongestSubstring(s));
    }
}