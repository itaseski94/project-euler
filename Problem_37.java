import java.util.*;
import static java.lang.System.out;

class Problem_37 {

   public static void main(String args[]) {

      int sum = 0;
      for (int i = 11; i <= 739397; ++i) { 
          if (isLeftTruncatable(i) && isRightTruncatable(i)) {
             sum += i;
          }
      }
      out.println(sum);
   }

   public static boolean isLeftTruncatable(int number) {
      int size = 0;
      int current = number;
      while (current > 0) {
      	  current = current / 10;
      	  ++size;
      }   
      int[] digits = new int[size];
      current = number;
      for (int i = size - 1; i >= 0; --i) {
          int digit = current % 10;
          digits[i] = digit;
          current = current / 10;
      }
      current = number;
      for (int i = 0; i < size; ++i) {
      	  if (!isPrime(current)) return false;
      	     current -= digits[i] * Math.pow(10,size - (i + 1));
      }
      return true;
   }

   public static boolean isRightTruncatable(int number) {
      while (number > 0) {
          if (!isPrime(number)) return false;
          number = number / 10;
      }
      return true;
   }
   
   public static boolean isPrime(int number) {
      if (number <= 1) return false;
      for (int i = 2; i <= number / 2; ++i) {
          if (number % i == 0) {
          	 return false;
          }
      }
      return true;
   }



}