import java.util.*;
import static java.lang.System.out;

class Problem_14 {

   
   private static Map<Integer,Integer> hash;

   public static void main(String args[]) {

      hash = new HashMap<Integer,Integer>();
      int vMax = -1;
      int starting_number = 0;
      int sequence_length = 0;
      for (int i = 1; i <= 999999; ++i) {
          sequence_length = calculateSequenceLength(i,hash);
          if (sequence_length > vMax) { 
          	 vMax = sequence_length;
             starting_number = i;
          }
      }
      
      /*
      for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
          System.out.println(entry.getKey() + "/" + entry.getValue());
      }  
      */
      out.println(starting_number);
      //out.println("Longest sequence length = " + vMax);
     
   }
   
   public static int calculateSequenceLength(int number, Map<Integer, Integer> hash) {
      int sequence_length = 1;
      for (long i = number; i != 1;) {
          if (i % 2 == 0) {
             i = i / 2;
             if (hash.containsKey(i)) { 
                hash.put(number,hash.get(i) + sequence_length);
                return hash.get(i) + sequence_length;
             }
          } else {
             i = 3 * i + 1;
             if (hash.containsKey(i)) {
              	 hash.put(number,hash.get(i) + sequence_length);
             	 return hash.get(i) + sequence_length;
             }
          } 	  
          ++sequence_length;
      }
      hash.put(number,sequence_length);
      return sequence_length;
   }   



}
