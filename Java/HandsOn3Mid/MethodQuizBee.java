import java.util.*;

public class MethodQuizBee {
    public static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        String name;
        System.out.print("Enter your name: ");
        name = input.next();
        name += input.nextLine();

        ArrayList<String> question = new ArrayList<>(5);
        question.add("Question 1: What is the capital of the Philippines? \n A. Manila B. Canberra C. Quezon City D. Tokyo");
        question.add("Question 2: Who coined the phrase \"I shall return.\"? \n A. Lapu-Lapu B. Johnny Bravo C. Douglas MacArthur D. Rihanna");
        question.add("Question 3: What is 77 + 33? \n A. 100 B. 110 C. 99 D. 100 but better");
        question.add("Question 4: When is this quiz created? \n A. 03/31/2023 B. 02/14/2023 C. 12/25/2023 D. 09/01/2023");
        question.add("Question 5: When is Angelo Bayla's Birthday? \n A. 03/31/2023 B. 02/14/2004 C. 12/25/2004 D. 09/01/2004");

        System.out.println( name + "'s total score is: " + quiz(question));
    }

    static int quiz (ArrayList<String> question) {
        int score = 0;
    for (int i = 0; i < 5; i++) {
        String[] ans = new String[5];
        String[] key = {"A", "C", "B", "A", "D"};

        System.out.println(question.get(i));
        ans[i] = input.next();
        ans[i] += input.nextLine();

        if (ans[i].equalsIgnoreCase(key[i])) {
            System.out.println("That is correct.");
            score++;
        }
        else {
            System.out.println("That is incorrect.");
        }
    }

    return score;
}

}
