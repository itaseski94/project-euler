import java.util.*;
import static java.lang.System.out;

class Problem_32 {

   public static void main(String args[]) {


      Set<Integer> products = new HashSet<Integer>();
      List<Integer> current = new ArrayList<Integer>();
      for (int i = 1; i < 10000; ++i) {
      	  for (int j = 1; j < 10000; ++j) {
              int product = i * j;
              if (parseInt(i,current) && parseInt(j,current) && parseInt(product,current) && current.size() == 9) {
                 products.add(product);
              }
      	      current.subList(0,current.size()).clear();
          }
      }
      
      int sum = 0;
      for (Integer i : products) sum += i;
          
      out.println(sum);

   }
   
   public static boolean parseInt(int number, List<Integer> current) {
      while (number != 0) {
          int digit = number % 10;
          if (current.contains(digit) || digit == 0) return false;
          current.add(digit);
          number = number / 10;
      }
      return true;
   }


}