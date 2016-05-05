import java.util.*;
import static java.lang.System.out;

class Problem_17 {

   
   private static final String[][] NUMBERS = { {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"},
                                               {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"},                                                                        
                                               {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"},                                                                                                     
                                               };

   
   public static void main(String args[]) {

      int length = 0;
      for (int i = 1; i <= 1000; ++i) {
          if (i >= 1 && i <= 9) {
             length += NUMBERS[0][i].length();	
          } else if (i >= 10 && i <= 99) {
             if (i >= 11 && i <= 19) {
             	length += NUMBERS[1][i%10].length();
             } else {
                length += NUMBERS[0][i%10].length() + NUMBERS[2][(i/10)%10].length();
             }
          } else if (i >= 100 && i <= 999) {
              if (i >= 111 && i <= 119) {
                 length += NUMBERS[1][i%10].length() + "onehundred".length() + "and".length(); 
              } else {
                 int numb = i;
                 length += NUMBERS[0][numb%10].length();
                 numb /= 10;
                 length += NUMBERS[2][numb%10].length();
                 numb /= 10;
                 length += NUMBERS[0][numb%10].length();
                 length += "hundred".length();
                 if (i > 100) length += "and".length();
              } 
          } else {
             length += "onethousand".length();
          }
      }
      out.println(length);
   }
}