import java.util.*;
import static java.lang.System.out;

class Problem_12 {

   public static void main(String args[]) {

      int triangle_number = 0;
      for(int i = 1; ;++i) {
         triangle_number += i;
         if (numberOfDivisors(triangle_number) > 500) {
         	out.println(triangle_number);
         	break;
         }    
      }
   }
   
   private static int numberOfDivisors(int number) {
		int no_divisors = 0;
		int limit = (int)Math.sqrt(number);
		for (int i = 1; i < limit; i++) {
			if (number % i == 0) no_divisors += 2;
		}
		return limit * limit == number ? no_divisors + 1 : no_divisors;
	}

}