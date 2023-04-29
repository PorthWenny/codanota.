import java.util.*;

public class DynamicQueueOperations {
    public static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        String repeat = "y";
        while (repeat.equalsIgnoreCase("y")) {

        System.out.print("What is the size of the queue? ");
        int n = input.nextInt();

        System.out.println("Enter the values of the queue:");
        Queue<Integer> num = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            num.add(input.nextInt());
        }

        // adding temp storage
        LinkedList<Integer> temp = new LinkedList<>();
        for (int curr : num) {
            temp.add(curr);
        }

        printRules();
        System.out.print("Type your option: ");
        char choice = input.next().charAt(0);

        switch (choice) {
            case 'a':
            case 'A':
                caseA(num);
                break;
            case 'c':
            case 'C':
                caseC(temp);
                break;
            case 'r':
            case 'R':
                caseR(temp);
                break;
            case 'i':
            case 'I':
                caseI(num);
                break;
            case 'g':
            case 'G':
                caseG(num);
                break;
            case 's':
            case 'S':
                caseS(temp);
                break;
            case 'z':
            case 'Z':
                caseZ(num);
                break;
            case 't':
            case 'T':
                caseT(num);
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
        System.out.println("S- Sorting elements");
        System.out.println("Z - ArrayList size");
        System.out.println("T – Top element\n");
    }

    public static void caseA (Queue<Integer> num) {
        System.out.println("You want to add a new element.");
        System.out.print("Enter the element you want to add: ");
        num.add(input.nextInt());

        System.out.println("\nThe queue elements now are: ");
        System.out.println(num);
    }

    public static void caseC (LinkedList<Integer> temp) {
        System.out.println("You want to change new element.");
        System.out.print("Enter the index of the element you want to change: ");
        int index = input.nextInt();
        System.out.print("Enter the new value: ");
        temp.set(index, input.nextInt());
        System.out.println("\nThe queue elements now are:");
        System.out.println(temp);
    }

    public static void caseR (LinkedList<Integer> temp) {
        System.out.println("You will remove or delete the element.");
        System.out.print("Enter the index of the element you want to delete: ");
        temp.remove(input.nextInt());
        System.out.println("\nThe queue elements now are:");
        System.out.println(temp);
    }

    public static void caseI (Queue<Integer> num) {
        System.out.println("You want to iterate the queue elements.");

        System.out.println("\nThe Queue elements are:");
        System.out.println(num);
    }

    public static void caseG (Queue<Integer> num)  {
        System.out.println("You want to get the ArrayList elements.");

        System.out.println("\nThe Queue elements are:");
        for (int curr : num) {
            System.out.print(curr + " ");
        }
        System.out.println();
    }

    public static void caseS (LinkedList<Integer> temp)  {
        System.out.println("You want to sort the elements of the queue.");

        System.out.print("\nThe original arrangements: ");
        System.out.println(temp);
        System.out.print("Sorted queue elements: ");
        Collections.sort(temp);
        System.out.println(temp);
    }

    public static void caseZ (Queue<Integer> num)  {
        System.out.println("You want to know the size of the ArrayList");

        System.out.println("\nThe queue size is: " + num.size());
    }

    public static void caseT (Queue<Integer> num)  {
        System.out.println("You want to know the top element of the queue.");

        System.out.println("\nThe top element of the queue is: " + num.peek());
    }
}

