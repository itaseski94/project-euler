import java.util.*;
import static java.lang.System.out;

class Problem_5 {

   public static void main(String args[]) {
   
      int number;
      for (int i = 21; ;i++) {
          if (isEvenlyDivisible(i)) {
          	 out.println(i);
          	 break;
          }
      }
   }

   public static boolean isEvenlyDivisible(int number) {
      for (int i = 1; i <= 20; ++i) {
          if (number % i != 0) return false;
      }
      return true;
   }

}