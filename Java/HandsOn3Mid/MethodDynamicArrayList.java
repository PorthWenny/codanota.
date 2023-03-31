import java.io.*;
import java.util.*;

public class MethodDynamicArrayList {
    public static Scanner input = new Scanner(System.in);
    public static int size;

    public static void main (String[] args) {
        String repeat = "y";
        while (repeat.equalsIgnoreCase("y")) {
        System.out.print("\033[H\033[2J");
        System.out.print("Enter the number size of the ArrayList: ");
        size = input.nextInt();

        
        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.println("Enter the values:");

        for (int i = 0; i < size; i++) {
            list.add(input.nextInt());
        }

        printRules();
        System.out.print("Type your option: ");
        char choice = input.next().charAt(0);

        switch (choice) {
            case 'a':
            case 'A':
                caseA(list);
                break;
            case 'c':
            case 'C':
                caseC(list);
                break;
            case 'r':
            case 'R':
                caseR(list);
                break;
            case 'i':
            case 'I':
                caseI(list);
                break;
            case 'g':
            case 'G':
                caseG(list);
                break;
            case 'e':
            case 'E':
                caseE(list);
                break;
            case 's':
            case 'S':
                caseS(list);
                break;
            case 'z':
            case 'Z':
                caseZ(list);
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }

        // to repeat the program again
        System.out.print("\nDo you want to try again (Y/n) ? ");
        
        repeat = input.next();
        repeat += input.nextLine();
        }
    }

    public static void printRules () {
        System.out.println("\nPress the letter for specific operation.");
        System.out.println("A – Adding element to List/ Add element");
        System.out.println("C- Changing elements/ Set element");
        System.out.println("R- Removing elements/Delete element");
        System.out.println("I- Iterating elements");
        System.out.println("G- get elements");
        System.out.println("E- add elements in between two numbers");
        System.out.println("S- Sorting elements");
        System.out.println("Z - ArrayList size\n");
    }

    public static void caseA (ArrayList<Integer> list) {
        System.out.println("You want to add a new element.");
        System.out.print("Enter the element you want to add: ");
        list.add(input.nextInt());

        System.out.println("\nThe ArrayList elements now are:");
        System.out.println(list);
    }

    public static void caseC (ArrayList<Integer> list) {
        System.out.println("You want to change new element.");
        System.out.print("Enter the index of the element you want to change: ");
        int index = input.nextInt();
        System.out.print("Enter the new value: ");
        int value = input.nextInt();
        list.set(index, value);

        System.out.println("\nThe ArrayList elements now are:");
        System.out.println(list);
    }

    public static void caseR (ArrayList<Integer> list) {
        System.out.println("You will remove or delete the element.");
        System.out.print("Enter the index of the element you want to delete: ");
        list.remove(input.nextInt());

        System.out.println("\nThe ArrayList elements now are:");
        System.out.println(list);
    }

    public static void caseI (ArrayList<Integer> list) {
        System.out.println("You want to iterate the ArrayList elements.");

        System.out.println("\nThe ArrayList elements are:");
        System.out.println(list);
    }

    public static void caseG (ArrayList<Integer> list) {
        System.out.println("You want to get the ArrayList elements.");

        System.out.println("\nThe ArrayList elements are:");
        for (int i = 0; i < size; i++) {
             System.out.print(list.get(i) + " ");
            }
        System.out.println();
    }

    public static void caseE (ArrayList<Integer> list) {
        System.out.println("You want to add elements in between two numbers.");
        System.out.print("Beginning index: "); 
        int first = input.nextInt();
        System.out.print("Ending index: "); 
        int last = input.nextInt();
        System.out.print("Enter the value of the element to be inserted: "); 
        int insert = input.nextInt();
        list.add(last - 1, insert);

        System.out.println("\nThe ArrayList elements are:");
        System.out.println(list);
    }

    public static void caseS (ArrayList<Integer> list) {
        System.out.println("You want to sort the elements of the Array List.");

        System.out.print("\nThe original arrangements: ");
        System.out.println(list);
        System.out.print("Sorted ArrayList: ");
        Collections.sort(list);
        System.out.println(list);
    }

    public static void caseZ (ArrayList<Integer> list) {
        System.out.println("You want to know the size of the ArrayList");

        System.out.println("\nThe ArrayList size is: " + size);
    }

}
