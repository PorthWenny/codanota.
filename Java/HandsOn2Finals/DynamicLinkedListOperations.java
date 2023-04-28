import java.util.*;

public Records () {
    List<String> id = new LinkedList<>();
    List<String> name = new LinkedList<>();
    List<String> loc = new LinkedList<>();
    List<String> age = new LinkedList<>();
    List<String> course = new LinkedList<>();
};

public class DynamicLinkedListOperations {
    public static void main (String[] args) {
        Records rec = new Records();

        System.out.print("What is the size of the Linkedlist? ");
        int n = input.nextInt();
        System.out.print("Enter the values of the LinkedList\n");

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Record #" + n);
            System.out.println("Enter student number: ");
            input.next();
            id.add(input.nextLine());
            System.out.print("Enter Name: ");
            name.add(input.nextLine());
            System.out.print("Enter Address: ");
            loc.add(input.nextLine());
            System.out.print("Enter Age: ");
            age.add(input.nextLine());
            System.out.print("Enter Course: ");
            course.add(input.nextLine());

            printRules();

            System.out.print("Type your option: ");
            char choice = input.next().charAt(0);

            switch (choice) {
                case 'A':
                    caseA()
            }
        }
    }
    
    public static void printRules () {
        System.out.println("\nPress the letter for specific operation.");
        System.out.println("A – Adding element to linked list/ Add element");
        System.out.println("C- Changing elements/ Set element of Linkedlist by Student Number");
        System.out.println("R- Removing elements/Delete element by Student Number");
        System.out.println("S – Searching elements in the linked list by Student Number");
        System.out.println("X – Exit or End the Program\n");
    }

}