import java.util.*;
import static java.lang.System.out;
import java.math.*;

class Problem_20 {

   public static void main(String args[]) {

      BigInteger n = factorial(100);
      String str = n.toString();
      int sum = 0;
      for (int i = 0; i < str.length(); ++i) {
          sum += Character.getNumericValue(str.charAt(i));
      }
      out.println(sum);
   
   }
   
   public static BigInteger factorial(int n) {
      BigInteger numb = new BigInteger("1");
      for (int i = 2; i <= n; ++i) {
      	  numb = numb.multiply(new BigInteger(Integer.toString(i)));
      }   
      return numb;
   }

}