import java.util.*;
import static java.lang.System.out;

class Problem_9 {

   public static void main(String args[]) {
    
      outerloop:
      for (int a = 1; a < 1000; a++) {
      	 for (int b = a + 1; b < 1000; b++) {
      	  	  for (int c = b + 1; c < 1000; c++) {
                  if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
                  	if ((a + b + c) == 1000) { 
                        out.println(a * b * c);
                        break outerloop;
                     }
                  }
      	  	  }
      	 }
      }

   }

}