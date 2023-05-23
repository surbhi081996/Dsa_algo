package Object.Oriented.programming.Questions;

//Hackerrank question link - https://www.hackerrank.com/challenges/java-inheritance-2/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

public class InheritanceQuestion2 {
	
	 public static void main(String []args){
	        // Create a new Adder object
	        Adder a = new Adder();
	        
	        // Print the name of the superclass on a new line
	        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
	        
	        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
	        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
	     }


}
class Arithmetic{
    public int add(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
}
 class Adder extends Arithmetic  {
    
}

