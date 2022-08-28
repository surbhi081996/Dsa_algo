package array;

public class Array2d {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 }};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("elements are :" + arr[i][j]);
				System.out.println();
			}
			
		}
	}
}
