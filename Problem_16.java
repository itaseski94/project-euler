import java.util.*;
import static java.lang.System.out;
import java.math.*;

class Problem_16 {

   public static void main(String args[]) {

      String str = pow(2,1000).toString(); 
      int sum = 0;
      for (int i = 0; i < str.length(); ++i) {
          sum += Character.getNumericValue(str.charAt(i));
      }
      out.println(sum);
   }

   public static BigInteger pow(int base, int exponent) {
      BigInteger numb = new BigInteger("1");
      for (int i = 1; i <= exponent; ++i) {
          numb = numb.multiply(new BigInteger(Integer.toString(base)));
      }   
      return numb;
   }

}