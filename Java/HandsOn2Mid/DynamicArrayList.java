import java.util.*;

public class DynamicArrayList {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the size of the ArrayList? ");
        int n = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>(n);
        System.out.println("Enter the values:");

        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        System.out.println("\nPress the letter for specific operation.");
        System.out.println("A – Adding element to List/ Add element");
        System.out.println("C- Changing elements/ Set element");
        System.out.println("R- Removing elements/Delete element");
        System.out.println("I- Iterating elements");
        System.out.println("G- get elements");
        System.out.println("E- add elements in between two numbers");
        System.out.println("S- Sorting elements");
        System.out.println("Z - ArrayList size\n");

        System.out.print("Type your option: ");
        char choice = input.next().charAt(0);

        switch (choice) {
            case 'a':
            case 'A':
                System.out.println("You want to add a new element.");
                System.out.print("Enter the element you want to add: ");
                list.add(input.nextInt());

                System.out.println("\nThe ArrayList elements now are:");
                System.out.println(list);
                break;
            case 'c':
            case 'C':
                System.out.println("You want to change new element.");
                System.out.print("Enter the index of the element you want to change: ");
                int index = input.nextInt();
                System.out.print("Enter the new value: ");
                int value = input.nextInt();
                list.set(index, value);

                System.out.println("\nThe ArrayList elements now are:");
                System.out.println(list);
                break;
            case 'r':
            case 'R':
                System.out.println("You will remove or delete the element.");
                System.out.print("Enter the index of the element you want to delete: ");
                list.remove(input.nextInt());

                System.out.println("\nThe ArrayList elements now are:");
                System.out.println(list);
                break;
            case 'i':
            case 'I':
                System.out.println("You want to iterate the ArrayList elements.");

                System.out.println("\nThe ArrayList elements are:");
                System.out.println(list);
                break;
            case 'g':
            case 'G':
                System.out.println("You want to get the ArrayList elements.");

                System.out.println("\nThe ArrayList elements are:");
                for (int i = 0; i < n; i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
                break;
            case 'e':
            case 'E':
                System.out.println("You want to add elements in between two numbers.");
                System.out.print("Beginning index: "); 
                int first = input.nextInt();
                System.out.print("Bxng index: "); 
                int last = input.nextInt();
                System.out.print("Enter the value of the element to be inserted: "); 
                int insert = input.nextInt();
                list.add(last - 1, insert);

                System.out.println("\nThe ArrayList elements are:");
                System.out.println(list);
                break;
            case 's':
            case 'S':
                System.out.println("You want to sort the elements of the Array List.");

                System.out.print("\nThe original arrangements: ");
                System.out.println(list);
                System.out.print("Sorted ArrayList: ");
                Collections.sort(list);
                System.out.println(list);
                break;
            case 'z':
            case 'Z':
                System.out.println("You want to know the size of the ArrayList");

                System.out.println("\nThe ArrayList size is: " + n);
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }
    }
}
