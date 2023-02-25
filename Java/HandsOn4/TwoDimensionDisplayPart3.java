public class TwoDimensionDisplayPart3 {
  public static void main(String[] args) {
    // declare variables
    int[][] numArr = new int[5][5];
    int value = -25;

    // initializes values into the array
    for (int i = 0; i < numArr.length; i++) {
      for (int j = 0; j < numArr.length; j++) {

        if (value == -21) {value++;}
        
           numArr[i][j] = value;
           value++;
      }
  }

   // prints the values and shows what the 2D array looks like.
    System.out.println("2-D Array values ");
    for (int i = 0; i < numArr.length; i++) {
        for (int j = 0; j < numArr.length; j++) {
            System.out.print(numArr[i][j]+" ");
        }
        System.out.println();
    }
  }
}