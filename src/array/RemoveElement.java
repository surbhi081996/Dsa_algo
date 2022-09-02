package array;

public class RemoveElement {
	
	 public static void main(String[] args)
	    {
	        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
	        int n = arr.length;
	        int k=4;
	 
	        n = removeElements(arr, n,k);
	 
	        // Print updated array
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	    }
	 static int removeElements(int arr[], int n,int k) {
		 int j=0;
		 for(int i=0;i<n;i++)
		 {
			 if(k!=arr[i])
			 {
				 arr[j++] = arr[i];
			 }
		 }
		return j;
		 
		 
	 }
}
