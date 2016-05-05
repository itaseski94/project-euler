import java.util.*;
import static java.lang.System.out;


class Problem_45 {
   

   public static void main(String args[]) {

      Map<Long, Long> triangle = new HashMap<Long, Long>();
      Map<Long, Long> pentagonal = new HashMap<Long, Long>();
      Map<Long, Long> hexagonal = new HashMap<Long, Long>();
      int count = 0;
      for (long i = 1; ; ++i) {
          long triangle_number = (i * (i + 1)) / 2;
          long pentagonal_number = (i * (3 * i - 1)) / 2;
          long hexagonal_number = i * (2 * i - 1);
          triangle.put(i,triangle_number);
          pentagonal.put(i,pentagonal_number);
          hexagonal.put(i,hexagonal_number);
          if (pentagonal.containsValue(triangle_number) && hexagonal.containsValue(triangle_number)) { 
          	 ++count;
          	 if (count == 3) {
          	    out.println(triangle_number);
                break ;
             }
          }
      }
   }

}