package collection.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetQuestions {
	
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<>();
		hs.add("abc");
		hs.add("kjgsjkd");
		hs.add("kjhsdjk");
		hs.add("sjhd");
		System.out.println(hs);
		
		Iterator I = hs.iterator();  //using iterator
		while(I.hasNext())
		{
			System.out.println(I.next());
			
		}
		
		for(String element : hs)   //using for each loop
		{
			System.out.println(element);
		}
		
		//to empty an hashset we need to use removeAll method
		
		//to test if the hashset is empty or not use hs.isEmpty
		
		//to clone a hashset use hs.clone()
		
		HashSet<String> hs1 = new HashSet<>();
		hs1 = (HashSet<String>) hs.clone();
		System.out.println(hs1);
		
		//convert hs into array
		String[] new_array  = new String[hs1.size()];
		hs1.toArray();
	}

}
