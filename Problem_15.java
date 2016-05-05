import java.util.*;
import static java.lang.System.out;
import java.math.*;

class Problem_15 {
 
   public static void main(String args[]) {

      BigInteger n = new BigInteger("40"); 
      BigInteger k = new BigInteger("20");

     out.println(factorial(n).divide(factorial(n.subtract(k)).multiply(factorial(k))));    
    
   
   }

   public static BigInteger factorial(BigInteger n) {
      BigInteger numb = new BigInteger("1");
      for (int i = 2; i <= n.intValue(); ++i) {
      	  numb = numb.multiply(new BigInteger(Integer.toString(i)));
      }   
      return numb;
   }

}