import java.util.*;

class BasicStackOperations {
    public static void main (String[] args) {
        Stack<Integer> nigerian = new Stack<>();

        nigerian.push(67);
        nigerian.push(12);
        nigerian.push(3);
        nigerian.push(4);
        nigerian.push(5);
        nigerian.push(6);
        nigerian.push(7);
        nigerian.push(8);
        nigerian.push(67);
        nigerian.push(89);

        System.out.println("Original stack elements: " + nigerian);

        nigerian.pop();
        nigerian.pop();
        nigerian.pop();
        System.out.println("Stack after pop operations: " + nigerian);
        System.out.println("The top element is: " + nigerian.peek());
        System.out.println("Is stack empty? " + nigerian.isEmpty());
    }
}