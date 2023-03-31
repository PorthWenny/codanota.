import java.util.*;

public class MethodArrayListGrades {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList <Integer> num = new ArrayList<>(10);

    static ArrayList<Integer> getInput () {
        for (int i = 0; i < 10; i++) {
            num.add(input.nextInt());
        }
        return(num);
    }

    static int forSum (ArrayList<Integer> num) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += num.get(i);
        }
        return sum;
    }

    static int forAvg (int sum) {
        return sum / 10;
    }

    static void MinMax (ArrayList<Integer> num) {
        int min = num.get(0);
        int max = num.get(0);
        for (int i = 0; i < 10; i++) {
            if (num.get(i) > max) {
                max = num.get(i);
            }
            if (num.get(i) < min) {
                min = num.get(i);
            }
        }
        
        System.out.println("The highest value is: " + max);
        System.out.println("The lowest value is: " + min);
    }
    
    public static void main (String[] args) {
        
        System.out.println("The Array list values are: ");
        getInput();

        System.out.println("The sum is: " + forSum(num));
        System.out.println("The average is: " + forAvg(forSum(num)));
        MinMax(num);

    }
}
