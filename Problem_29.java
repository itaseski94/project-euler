import java.util.*;
import static java.lang.System.out;
import java.math.BigInteger;

class Problem_29 {

   public static void main(String args[]) {

      List<BigInteger> sequence = new ArrayList<BigInteger>();
      for (int a = 2; a <= 100; ++a) {
      	  for (int b = 2; b <= 100; ++b) {
              BigInteger temp = new BigInteger(Integer.toString(a)).pow(b);
              if(!sequence.contains(temp)) {
              	sequence.add(temp);
              }   	  	
      	  }
      }
      out.println(sequence.size());
   }

}