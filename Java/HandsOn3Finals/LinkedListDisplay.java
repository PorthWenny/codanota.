import java.util.*;

public class LinkedListDisplay {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the size of the stack: ");
        int n = input.nextInt();

        // initializing comparator variables
        int small = Integer.MAX_VALUE, big = Integer.MIN_VALUE;
        int neg = 0;
        LinkedList<Integer> neglist = new LinkedList<>();
        LinkedList<Integer> odd = new LinkedList<>();
        LinkedList<Integer> even = new LinkedList<>();
        LinkedList<Integer> great = new LinkedList<>();
        // initialization of LinkedList elements
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the elements of the linkedlist:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());

            // smallest or greatest
            if (list.get(i) > big) {
                big = list.get(i);
            }
            if (list.get(i) < small) {
                small = list.get(i);
            }

            // negative
            if (list.get(i) < 0) {
                neg++;
                neglist.add(list.get(i));
            }

            // odd or even
            if (list.get(i) % 2 == 0) {
                even.add(list.get(i));
            }
            else {
                odd.add(list.get(i));
            }

            // greater than first value
            if (list.get(i) > list.get(0)) {
                great.add(list.get(i));
            }
        }

        System.out.println("Inputted linkedlist elements: " + list);
        System.out.println("The smallest value: " + small);
        System.out.println("The biggest value: " + big);
        System.out.println("Number of negative numbers: " + neg);
        System.out.print("Even numbers are: ");
        list_printer(even);
        System.out.print("Odd numbers are:");
        list_printer(odd);
        System.out.print("Negative numbers are:");
        list_printer(neglist);
        System.out.print("Numbers greater than -9 are ");
        list_printer(great);
    }


static void list_printer (LinkedList<Integer> wow) {
    for (int curr : wow) {
        System.out.print(curr);
        if (curr != wow.get(wow.size() - 1)) {
            System.out.print(", ");
        }
        else {
            System.out.println();
        }
    }
}

}