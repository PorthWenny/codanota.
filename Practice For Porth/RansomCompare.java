import java.io.*;
import java.util.*;

class RansomCompare {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int counter = 0;

        outer:
        for (int i = 0; i < ransomNote.length();i++) {
            for (int j = 0; j < magazine.length();j++) {
                if (ransomNote.charAt(i) == magazine.charAt(j)) {
                    magazine = magazine.substring(0, j) + "" + magazine.substring(j+1);
                    counter++;
                    continue outer;
                }
             }
        }

        return (counter == ransomNote.length());
}

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String ransomNote = sc.nextLine();
        System.out.print("Enter magazine: ");
        String magazine = sc.nextLine();
        boolean result = canConstruct(ransomNote, magazine);

        canConstruct(ransomNote, magazine);

        System.out.println("\n"+result);
    }
}
