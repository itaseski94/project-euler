import java.util.*;
import static java.lang.System.out;
import java.math.*;

class Problem_25 {

   public static void main(String args[]) {

      BigInteger previous_term = new BigInteger("1");
      BigInteger current_term = new BigInteger("1");
      BigInteger temp;
      int current_index = 2;
      while (current_term.toString().length() != 1000) {
          temp = previous_term;
          previous_term = current_term;
          current_term = current_term.add(temp);
          ++current_index;
      }   
      out.println(current_index); 
   }

}