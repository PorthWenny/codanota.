import java.util.*;

class Records {
    String id;
    String name;
    String loc;
    String age;
    String course;
}

public class DynamicLinkedListOperations {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Records rec = new Records();

        ArrayList<Records> list = new ArrayList<>();

        System.out.print("What is the size of the Linkedlist? ");
        int n = input.nextInt();
        System.out.print("Enter the values of the LinkedList\n");

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Record #" + n);
            System.out.println("Enter student number: ");
            input.next();
            rec.id = input.nextLine();
            System.out.print("Enter Name: ");
            rec.name = input.nextLine();
            System.out.print("Enter Address: ");
            rec.loc = (input.nextLine());
            System.out.print("Enter Age: ");
            rec.age = (input.nextLine());
            System.out.print("Enter Course: ");
            rec.course = (input.nextLine());

            list.add(rec);
            printRules();

            System.out.print("Type your option: ");
            char choice = input.next().charAt(0);

            switch (choice) {
                case 'A':
                    caseA();
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