import java.util.*;
import static java.lang.System.out;

class Problem_3 {

  private static final long NUMBER = 600851475143L;
   
  public static void main(String args[]) {
     for (long i = 2; i <= NUMBER / 2; ++i) { 
         if (NUMBER % i == 0) {
            if (isPrime(i)) out.println(i);   
         }
     }   
  }

  public static boolean isPrime(long number) { 
     for (int i = 2; i <= number / 2; ++i) {
         if (number % i == 0) return false;
     }
     return true;
  }

}
