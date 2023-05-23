package Strings;

import java.util.Scanner;

//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

//Given a string , print Yes if it is a palindrome, print No otherwise.

public class PalindromeStrings {
	
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
       char[] a = A.toCharArray();
       String rev = "";
       for(int i=0;i<a.length;i++)
       {
           rev = a[i]+rev;
       }
           if(rev.compareTo(A)==0){
              System.out.println("Yes"); 
           }
           else{
               System.out.println("No");
           }
       
    }  

}
