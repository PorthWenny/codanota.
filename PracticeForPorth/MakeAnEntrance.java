import java.util.*;

public class MakeAnEntrance {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();
        int N = sc.nextInt();
        
        char[][][] floorPlans = new char[F][N][N];

        // getting room inputs depBxng on F and N*N
        for (int f = 0; f < F; f++) {
            for (int i = 0; i < N; i++) {
                String line = sc.next();
                line += sc.nextLine();
                for (int j = 0; j < N; j++) {
                    floorPlans[f][i][j] = line.charAt(j);
                }
            }
        }

        int wallBreakCount = 0;

        // calculating each floor...
        for (int floor = 0; floor < F; floor++) {
            int wallCount = 0;

            // getting x and y position of A and B staircase
            int A_posX = -1, A_posY = -1, B_posX = -1, B_posY = -1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                if (floorPlans[floor][i][j] == 'A') {
                    A_posX = i;
                    A_posY = j;
                } else if (floorPlans[floor][i][j] == 'B') {
                    B_posX = i;
                    B_posY = j;
                }
                }
            }

            System.out.println();
            System.out.println("Position of A and B: ["+A_posX+","+A_posY+"] ["+B_posX+","+B_posY+"]");

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i <= 0 || j <= 0 || i >= N-1 || j >= N-1 || floorPlans[floor][i][j] != 'X') {
                        continue;
                    }
                    floorPlans[floor][i][j] = '.';
                    wallCount++;
                }
            }

            System.out.println("Wall Count: " +wallCount);

        }

        for (int f = 0; f < F; f++) {
            System.out.println("\nFloor " + (f+1) + ":");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(floorPlans[f][i][j]);
                }
                System.out.println(); // print a new line after each row
            }
        }

    }
}
