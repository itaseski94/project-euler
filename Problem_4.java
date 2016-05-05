import java.util.*;
import static java.lang.System.out;

class Problem_4 {

  public static void main(String args[]) {

     int max = -1;
     for (int i = 999; i >= 100; --i) { 
         for (int j = 999; j >= 100; --j) {
         	 int product = i * j;
         	 if (isPalindromic(String.valueOf(product)) && product > max) {
         	    max = product;
         	 }
         }
     }
     out.println(max);

  } 

  public static boolean isPalindromic(String str) {
     if (str.length() == 0 || str.length() == 1) {
     	return true;
     } else if (str.charAt(0) != str.charAt(str.length()-1)) {
     	return false;
     } else {
        return isPalindromic(str.substring(1,str.length()-1));
     }
  }

}