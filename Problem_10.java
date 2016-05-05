import java.util.*;
import static java.lang.System.out;

class Problem_10 {

   private static final int NUMBER = 2000000;

   public static void main(String args[]) {
   
      long sum = 0;
      for (int i = 2; i < NUMBER; ++i) {
      	  if (isPrime(i)) {
      	  	 sum += i;
      	  }
      }
      out.println(sum);
   }

   public static boolean isPrime(int number) {
      for (int i = 2; i <= number / 2; ++i) {
          if (number % i == 0) return false;
      }
      return true;
   }

}