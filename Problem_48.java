import java.util.*;
import static java.lang.System.out;
import java.math.BigInteger;

class Problem_48 {

   public static void main(String args[]) {

      BigInteger series = new BigInteger("0");
      for (int i = 1; i <= 1000; ++i) {
          series = series.add(new BigInteger(Integer.toString(i)).pow(i));
      }
      String sp = series.toString();
      out.println(sp.substring(sp.length()-10,sp.length()));
   }

}