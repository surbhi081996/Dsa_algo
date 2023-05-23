package Strings;

import java.util.Scanner;

//input --A single string, .

//Output Format
//On the first line, print an integer, , 
//denoting the number of tokens in string  (they do not need to be unique). 
//Next, print each of the  tokens on a new line in the same order as they appear in input string .

public class StringsToken {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
      String b = s.trim();  
      String[] as = b.split("[ !,?._'@]+");
      System.out.println(as.length);
      for(String a :as)
      {
          System.out.println(a);
      }
        scan.close();
        
    }

}
