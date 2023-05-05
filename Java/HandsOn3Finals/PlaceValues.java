import java.util.*;

class PlaceValues {
public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of your chosen data structure: ");
        int n = input.nextInt();
        ArrayList<Integer> num = new ArrayList<>(n);

        // initialize counter values
        int one = 0, ten = 0, hun = 0, thou = 0, tenthou = 0, hunthou = 0, mil = 0, tenmil = 0, hunmil = 0;

        // get each ArrayList elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num.add(input.nextInt());
            
            switch (counter(num, i)) {
                case 1:
                    one++;
                    break;
                case 2:
                    ten++;
                    break;
                case 3:
                    hun++;
                    break;
                case 4:
                    thou++;
                    break;
                case 5:
                    tenthou++;
                    break;
                case 6:
                    hunthou++;
                    break;
                case 7:
                    mil++;
                    break;
                case 8:
                    tenmil++;
                    break;
                case 9:
                    hunmil++;
                    break;
                default:
                    System.out.println("current value out of range.");
                    break;
            }
        }

        System.out.println("Ones: " + one);
        System.out.println("Tens: " + ten);
        System.out.println("Hundreds: " + hun);
        System.out.println("Thousands: " + thou);
        System.out.println("Ten thousand: " + tenthou);
        System.out.println("Hundred thousand: " + hunthou);
        System.out.println("Million: " + mil);
        System.out.println("Ten million: " + tenmil);
        System.out.println("Hundred million: " + hunmil);
    }   

    static int counter (ArrayList<Integer> num, int i) {
        int count = 0, curr = num.get(i);
        for (int j = 0; j < 9; j++) {
            curr /= 10;
            count++;

            if (curr == 0) {
                break;
            }
        }

        return count;
    }

}