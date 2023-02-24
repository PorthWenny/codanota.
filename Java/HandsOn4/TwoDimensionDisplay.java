import java.io.*;

public class TwoDimensionDisplay {
  public static void main(String args[]) {

    int[][] numArr = {{80,90,50},{-80,-90,-50},{70,-80,-60}};

    System.out.println();
    System.out.println("2-D Array values ");
    System.out.println();
    for (int i = 0; i < numArr.length; i++) {
        for (int j = 0; j < numArr.length; j++) {
            System.out.print(numArr[i][j]+" ");
        }
        System.out.println();
    }
  }
}
