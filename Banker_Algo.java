package self_study;
import java.util.*;

public class Banker_Algo {
    static Scanner inp = new Scanner(System.in);
    static int done = 0;
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number of resources: ");
        int r = inp.nextInt();
        System.out.print("Enter number of processes: ");
        int p = inp.nextInt();

        System.out.println("Enter allocations: ");
        int[][] alloc = new int[p][r];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                alloc[i][j] = inp.nextInt();
            }
        }

        System.out.println("Enter maximum resources: ");
        int[][] max = new int[p][r];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                max[i][j] = inp.nextInt();
            }
        }

        int[] avail = new int[r];
        System.out.print("Enter available resources: ");
        for (int i = 0; i < r; i++) {
            avail[i] = inp.nextInt();
        }

        int[][] need = new int[p][r];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                need[i][j] = max[i][j] - alloc[i][j];
            } 
        }

        // show table of matrix
        PrintMatrix(r, p, alloc, max, avail, need);

        System.out.print("\n\nWould you like to: \n 1) See a safe state. \n 2) Input your own process sequence. \nYour choice: ");
        int c = inp.nextInt();

        switch (c) {
            case 1:
                // solve for safe sequence
                boolean[] finish = new boolean[p];
                for (int i = 0; i < p; i++) {
                    finish[i] = false;
                }

                int done = p;
                while (done != 0) {
                    for (int i = 0; i < p; i++) {
                        if (!finish[i]) {
                            boolean canProcessResource = true;
            
                            for (int j = 0; j < r; j++) {
                                if (need[i][j] > avail[j]) {
                                    canProcessResource = false;
                                    break;
                                }
                            }
            
                            if (canProcessResource) {
                                System.out.print("P" + (i+1));
                                if (done - 1 != 0) {
                                    System.out.print(" --> ");
                                }
                                finish[i] = true;
                                for (int j = 0; j < r; j++) {
                                    avail[j] += alloc[i][j];
                                }
                                done--;
                            }
                        }
                    }

                    if (done == p) {
                        System.out.print("None. System has no safe state.");
                        break;
                    }
                }
                break;
            case 2:
                // input your own process sequence
                System.out.println("\nInput process sequence: ");
                int[] seq = new int[p];
                for (int i = 0; i < p; i++) {
                    seq[i] = inp.nextInt();
                }

                boolean dead = false;
                for (int i = 0; i < seq.length; i++) {
                    for (int j = 0; j < r; j++) {
                        if (need[seq[i]-1][j] > avail[j]) {
                            System.out.print("\nP" + seq[i] + " cannot be processed. System is in an unsafe state.");
                            dead = true;
                            break;
                        }
                    }

                    if (!dead) {
                        for (int j = 0; j < r; j++) {
                            avail[j] += alloc[seq[i]-1][j];
                        }
                    } else {
                        break;
                    }
                }
                
                if (!dead) {
                    System.out.println("\nSystem is in a safe state.");
                }
                break;
            default:
                System.out.print("Invalid choice.");
        }
    }

    public static void PrintMatrix (int r, int p, int[][] alloc, int[][] max, int[] avail, int[][] need) {
        
        System.out.println("\nP --> Allocated --> Maximum --> Need");
        for (int i = 0; i < p; i++) {
            System.out.print("|  P" + (i+1) + "  |  ");
            for (int j = 0; j < r; j++) {
                System.out.print(alloc[i][j] + " ");
            }
            System.out.print("    |    ");
            for (int j = 0; j < r; j++) {
                System.out.print(max[i][j] + " ");
            }
            System.out.print("    |    ");
            for (int j = 0; j < r; j++) {
                System.out.print(need[i][j] + " ");
            }
            System.out.println("    |    ");
        }
  
        System.out.print("Available resources: ");
        for (int x : avail) {
            System.out.print(x + " ");
        }

        return;
    }
}
