import java.util.*;
import static java.lang.System.out;

class Problem_6 {

   public static void main(String args[]) {

      int sum_of_squares = 0;
      int square_of_sum = 0;
      
      for (int i = 1; i <= 100; ++i) {
          sum_of_squares += (int)Math.pow(i,2);
          square_of_sum += i;
      }
      square_of_sum = (int)Math.pow(square_of_sum,2);
      
      out.println(square_of_sum - sum_of_squares);
   }

}