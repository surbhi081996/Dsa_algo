package array;

import java.util.Arrays;
import java.util.HashMap;

//Given an array of integers nums and an integer target, 
 //return indices of the two numbers such that they add up to target.
//time complexity = O(n2) , space = O(1)
public class Twosum {
	public static void main(String args[]) {
		System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,5},9)));
	}
	
	
	 //time - O(n) , space  - O(n)
		public static int[] twoSum(int[] array, int target) {
			HashMap<Integer, Integer> indexMap = new HashMap<>();
			for(int i=0;i< array.length;i++)
			{
				Integer requiredNumber  = target - array[i];
				if(indexMap.containsKey(requiredNumber))
				{
					int[] toreturn = {indexMap.get(requiredNumber),i}; 
					System.out.println(toreturn);
					return toreturn;
				}
				indexMap.put(array[i],i);	
			}
			return null;
			
			
		}
//			for (int i = 0; i < array.length; i++) {
//				for (int j = i + 1; j < array.length; j++) {
//					if (target == array[i] + array[j])
//						return new int[] { i, j };
//				}
//			}
//			return null;
//		}

	}

