import java.util.*;

class BasicQueueOperations {
    public static void main (String[] args) {
        Queue<Integer> el = new LinkedList<>();

        // add elements
        el.add(67);
        el.add(12);
        el.add(3);
        el.add(4);
        el.add(5);
        el.add(6);
        el.add(7);
        el.add(8);
        el.add(67);
        el.add(89);

        // printing
        System.out.println("Original queue elements: " + el);
        el.remove();
        el.remove();
        System.out.println("Queue after dequeue operations: " + el);
        System.out.println("The top element is: " + el.peek());
        System.out.println("Is queue empty? " + el.isEmpty());
    }
}