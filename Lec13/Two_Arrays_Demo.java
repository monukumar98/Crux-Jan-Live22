package Lec13;

public class Two_Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		int[][] ar = new int[3][];
		System.out.println(ar);
		System.out.println(arr);
		int[][] other = arr;
		System.out.println(other);

		// row
		System.out.println(arr.length);
		
		// col
		System.out.println(arr[0].length);
		

	}

}
