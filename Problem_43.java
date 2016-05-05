import java.util.*;
import static java.lang.System.out;
import java.math.*;

class Problem_43 {

   private static long sum = 0;

   public static void main(String args[]) {

      int[] array = new int[10];
      sumPermutations(array,0);
      out.println(sum);

   }

   public static void sumPermutations(int[] array, int depth) {
      if (depth == array.length) {
         if (isDivisible(array)) {
            sum += convertToLong(array,0,array.length-1);
         }
      } else {
         for (int i = 0; i < array.length; ++i) {
             if (add(array,depth,i)) {
                array[depth] = i;
                sumPermutations(array,depth+1);
             }
         }
      }
   }

   public static boolean add(int[] array, int index, int element) {
      for (int i = 0; i < index; ++i) {
          if (array[i] == element) return false;
      }
      return true;
   }

   public static long convertToLong(int[] array, int beginIndex, int endIndex) {
      long number = 0;
      long multiplier = 1;
      for (int i = endIndex; i >= beginIndex; --i) {
          number += multiplier * array[i];
          multiplier *= 10;
      }
      return number;
   }

   public static boolean isDivisible(int[] array) {
      int[] divisor = {2,3,5,7,11,13,17};
      int index = 0;
      for (int i = 1; i < array.length - 2; ++i) {
          int dividend = (int)convertToLong(array,i,i+2);
          if (dividend % divisor[index++] != 0) return false;
      }
      return true;
   }

}