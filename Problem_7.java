import java.util.*;
import static java.lang.System.out;

class Problem_7 {

   public static void main(String args[]) {

     int count = 0;
     int i;
     for (i = 2; ;++i) {
         if (isPrime(i)) count++;
         if (count == 10001) break;
     }   
     out.println(i);
   }

   public static boolean isPrime(int number) {
      for (int i = 2; i <= number / 2; ++i) {
          if (number % i == 0) return false;
      }
      return true;
   }


}