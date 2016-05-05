import java.util.*;
import static java.lang.System.out;

class Problem_2 { 

   private static final int NUMBER = 4000000;

   public static void main(String args[]) {

      int pre_term = 1;
      int next_term = 2;
      int temp;
      int sum = 2;
      for (;;) {
          temp = pre_term;
          pre_term = next_term;
          next_term = temp + pre_term;
          if (next_term > VALUE) break;
          if (next_term % 2 == 0) sum += next_term;
      }
      out.println(sum);

    }

}