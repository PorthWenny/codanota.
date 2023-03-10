import java.util.Scanner;

public class StudentsNameAndGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[2];
        int[][][] grades = new int[2][2][2];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter name of a student: ");
            names[i] = input.next();
            names[i] += input.nextLine();

            System.out.println(names[i]);
            int count = 1;
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                for (int k = 0; k < grades[i][j].length; k++) {
                    System.out.print("Enter grade " + count + ": ");
                    grades[i][j][k] = input.nextInt();
                    count++;

                    sum += grades[i][j][k];
                }
            }

            System.out.println("The average is: " + (sum/4));
        }
    }
}
