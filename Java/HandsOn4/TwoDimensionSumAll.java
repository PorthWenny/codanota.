public class TwoDimensionSumAll {
    public static void main(String[] args) {

        // initialize the array
        int[][] numArr = {{80, 60, 50, 40, 50}, {2, 3, 5, 6, 10}, 
                          {-4, -6, 12, 13, 16}, {12, 10, 5, 4, 1}};

        //print outputs and sum using one nested loop
        for (int i = 0; i < numArr.length; i++) {
            int line_sum = 0;
            for (int j = 0; j < numArr[i].length; j++) {
                System.out.print(numArr[i][j]+" ");
                line_sum+=numArr[i][j];
            }
            System.out.println("= " +line_sum);
            }

        // prints the column summation
        System.out.print("= " );
        for (int i = 0; i < numArr[0].length; i++) {
            int col_sum = 0;
            for (int j = 0; j < numArr.length; j++) {
                col_sum += numArr[j][i];
            }
            System.out.print(col_sum+ " ");
        }

        }                
    }