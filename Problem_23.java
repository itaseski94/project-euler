import java.util.*;
import static java.lang.System.out;

class Problem_23 {

   public static void main(String args[]) {
 
      for (int i = 1; i <= 28123 ;++i) {
      	  if (isAbundant(i)) out.println(i);
      }
      
   }

   public static boolean isAbundant(int n) {
      int sum = 0;
      for (int i = 1; i <= n / 2; ++i) {
          if (n % i == 0) sum += i;
      }
      return sum > n ;
   }


}