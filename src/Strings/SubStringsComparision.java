package Strings;

import java.util.Scanner;

//Given a string, , and an integer, , complete the function so that it finds the 
//lexicographically smallest and largest substrings of length .

//Returns

//string: the string ' + "\n" + ' where and are the two substrings
//Input Format

//The first line contains a string denoting .
//The second line contains an integer denoting .



public class SubStringsComparision {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();
  
    System.out.println(getSmallestAndLargest(s, k));
}
public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0,k);
    String largest = "";
    
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
   
    for(int i=0;i<s.length()-k+1;i++)
    {
        String a  = s.substring(i,i+k);
        if(a.compareTo(largest)>0)
        {
            largest=a;
        }
        String b = s.substring(i,i+k);
        if(b.compareTo(smallest)<0)
        {
            smallest=b;
        }
        
    }
    return smallest + "\n" + largest;
}

}
