import java.util.*;
import static java.lang.System.out;

class Problem_21 {

   public static void main(String args[]) {

      int sum = 0;
      for (int i = 1; i < 10000; ++i) {
          if (isAmicable(i)) sum += i;
      }   
      out.println(sum);
   
   }

   public static boolean isAmicable(int n) {
      int m = divisorSum(n);
	  return m != n && divisorSum(m) == n;
   }

   public static int divisorSum(int n) {
      int sum = 0;
      for (int i = 1; i <= n / 2; ++i) {
      	  if (n % i == 0) sum += i;
      }
      return sum;
   }

}