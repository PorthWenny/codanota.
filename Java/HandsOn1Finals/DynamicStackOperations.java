import java.util.*;

public class DynamicStackOperations {

    public static Stack<Integer> sorter_stack (Stack<Integer> el) {
        for (int i = 0; i < el.size(); i++) {
            for (int j = i; j < el.size(); j++) {
                if (el.get(j) < el.get(i)) {
                    int temp = el.get(i);
                    el.set(i, el.get(j));
                    el.set(j, temp);
                }
            }
        }
        return el;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the size of the stack? ");
        int n = input.nextInt();

        System.out.println("Enter the values of the stack:");
        Stack<Integer> el = new Stack<>();
        for (int i = 0; i < n; i++) {
            el.push(input.nextInt());
        }

        System.out.println("\nPress the letter for specific operation.");
        System.out.println("A – Adding element to stack/ Add element");
        System.out.println("C- Changing elements/ Set element of stack");
        System.out.println("R- Removing elements/Delete element");
        System.out.println("I- Iterating elements");
        System.out.println("G- get elements");
        System.out.println("S- Sorting elements");
        System.out.println("Z - Stack size");
        System.out.println("T – top element\n");

        System.out.print("What is your choice?: ");
        char choice = input.next().charAt(0);

        switch (choice) {
            case 'a':
            case 'A':
                System.out.println("You want to add a new element.");
                System.out.print("Enter the element you want to add: ");
                el.push(input.nextInt());
                System.out.println("The stack elements now are:");
                System.out.println(el);
                break;
            case 'c':
            case 'C':
                System.out.println("You want to change new element.");
                System.out.print("Enter the index of the element you want to change: ");
                int index = input.nextInt();
                System.out.print("Enter the new value: ");
                el.set(index, input.nextInt());
                System.out.println("The stack elements now are:");
                System.out.println(el);
                break;
            case 'r':
            case 'R':
                System.out.println("You will remove or delete the element.");
                System.out.print("Enter the index of the element you want to delete: ");
                el.remove(input.nextInt());
                System.out.println("The stack elements now are:");
                System.out.println(el);
                break;
            case 'i':
            case 'I':
                System.out.println("You want to iterate the stack elements.");
                System.out.println("The stack elements are:");
                System.out.println(el);
                break;
            case 'g':
            case 'G':
                System.out.println("You want to get the stack elements.");
                System.out.println("The stack elements are:");
                for (int i = 0; i < el.size(); i++) {
                    System.out.print(el.get(i) + " ");
                }
                System.out.println();
                break;
            case 'S':
                System.out.println("You want to sort the elements of the stack elements.");
                System.out.println("The original arrangements: " + el);
                sorter_stack(el);
                System.out.println("Sorted stack elements: " + el);
                break;
            case 'Z':
                System.out.println("You want to know the size of the Stack.");
                System.out.println("The stack size is: " + el.size());
                break;
            case 'T':
                System.out.println("You want to know the top element of the Stack.");
                System.out.println("The top element of the stack is: " + el.peek());
                break;
            default:
                System.out.println("That is not one of the options, please try again.");
            }
    }
}