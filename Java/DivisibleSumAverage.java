public class DivisibleSumAverage {
  public static void main(String args[]) {
    
      System.out.println("The first 10 whole numbers divisible by 4 are: ");
      int limit = 0, sum = 0;
      
      for (int i = 1; i > 0; i++) {
          // limits the printing to 10 whole numbers only.
          if (limit == 10) {
              break;
          }

          // checks if 'i' value is divisible by 4, then run the if statements.
          if (i % 4 == 0) {
              System.out.println(i);

              sum = sum + i;
              limit++;
          }
      }

       System.out.println("The sum is: "+sum);
      int avg = sum/limit;
      System.out.println("The average is: "+avg);

    }
}