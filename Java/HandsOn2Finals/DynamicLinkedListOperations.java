import java.util.*;

class Records {
    String id;
    String name;
    String loc;
    String age;
    String course;
}

public class DynamicLinkedListOperations {

    //needed syntax for method
    public static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        ArrayList<Records> list = new ArrayList<>();

        System.out.print("What is the size of the Linkedlist? ");
        int n = input.nextInt();
        System.out.println("\nEnter the values of the LinkedList:");

        Records rec = new Records();

        // adding different records to a list
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter Record #" + i);
            System.out.print("Enter student number: ");
            rec.id = input.next();
            rec.id += input.nextLine();
            System.out.print("Enter Name: ");
            rec.name = input.nextLine();
            System.out.print("Enter Address: ");
            rec.loc = (input.nextLine());
            System.out.print("Enter Age: ");
            rec.age = (input.nextLine());
            System.out.print("Enter Course: ");
            rec.course = (input.nextLine());

            list.add(rec);
        }

        System.out.println(rec.id + rec.name + rec.loc + rec.age + rec.course);
        
        String repeat = "y";
        while (repeat.equalsIgnoreCase("y")) {
            printRules();

            System.out.print("Type your option: ");
            char choice = input.next().charAt(0);

            switch (choice) {
                case 'A':
                    caseA(list, n);
                    break;
                case 'C':
                    caseC(list, n);
                    break;
                case 'R':
                    caseR(list, n);
                    break;
                case 'S':
                    caseS(list, n);
                    break;
                case 'X':
                    break;
                default:
                    System.out.print("Choice not valid, please try again.");
                    break;
            }

        System.out.print("\nDo you want to try again (Y/n) ? ");
        
        repeat = input.next();
        repeat += input.nextLine();
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

    public static void caseA (ArrayList<Records> list, int n) {
        Records rec1 = new Records();
        System.out.println("You want to add a new element.");
        System.out.print("Enter student number: ");
            rec1.id = input.next();
            rec1.id += input.nextLine();
            for (int i = 0; i < n; i++) {
                if (rec1.id.compareToIgnoreCase(list.get(i).id) == 0) {
                    System.out.println("A duplicate student number has been detected, record cannot be added successfully");
                    return;
                }
            }
            System.out.print("Enter Name: ");
            rec1.name = input.nextLine();
            System.out.print("Enter Address: ");
            rec1.loc = (input.nextLine());
            System.out.print("Enter Age: ");
            rec1.age = (input.nextLine());
            System.out.print("Enter Course: ");
            rec1.course = (input.nextLine());
            list.add(rec1);
    }

    public static void caseC (ArrayList<Records> list, int n) {
        Records rec = new Records();
        System.out.println("You want to change new element.");
        System.out.print("Enter the index of the element you want to change: ");
        int index = input.nextInt();

        // listing the record to change
        System.out.println("\nRecords you want to change are:");
        System.out.println("Student number: " + list.get(index).id);
        System.out.println("Name: " + list.get(index).name);
        System.out.println("Address: " + list.get(index).loc);
        System.out.println("Age: " + list.get(index).age);
        System.out.println("Course: " + list.get(index).course);

        // to change
        System.out.println("\nEnter the new values: ");
        System.out.print("Enter student number: ");
            rec.id = input.next();
            rec.id += input.nextLine();
            for (int i = 0; i < n; i++) {
                if (rec.id.compareToIgnoreCase(list.get(i).id) == 0) {
                    System.out.println("A duplicate student number has been detected, please try again.");
                    return;
                }
            }
            System.out.print("Enter Name: ");
            rec.name = input.nextLine();
            System.out.print("Enter Address: ");
            rec.loc = (input.nextLine());
            System.out.print("Enter Age: ");
            rec.age = (input.nextLine());
            System.out.print("Enter Course: ");
            rec.course = (input.nextLine());
        list.set(index, rec);
    }

    public static void caseR (ArrayList<Records> list, int n) {
        Records rec = new Records();
        System.out.print("Enter the student number you want to delete:");
        String num = input.next();
        num += input.nextLine();
        for (int i = 0; i < n; i++) {
            if (num.compareToIgnoreCase(list.get(i).id) == 0) {
                list.remove(i);
                System.out.println("Record successfully deleted");
                return;
            }
        }
        System.out.println("No record found");
        return;
    }

    public static void caseS (ArrayList<Records> list, int n) {
        System.out.print("Enter Student Number to search: ");
        String num = input.next();
        num += input.nextLine();
        System.out.println(num);
        for (int i = 0; i < n; i++) {
            if (num.compareToIgnoreCase(list.get(i).id) == 0) {
                System.out.println("Record exists");
                System.out.println("\nStudent number: " + list.get(i).id);
                System.out.println("Name: " + list.get(i).name);
                System.out.println("Address: " + list.get(i).loc);
                System.out.println("Age: " + list.get(i).age);
                System.out.println("Course: " + list.get(i).course);
                return;
            }
        }
        System.out.println("No record found");
        return;
    }
}