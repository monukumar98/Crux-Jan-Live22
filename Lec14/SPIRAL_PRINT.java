package Lec14;

public class SPIRAL_PRINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 },  { 13, 14, 15, 16 } };
		SprialPrint(arr);

	}

	public static void SprialPrint(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int toatal=arr.length*arr[0].length;
		int count=0;
		while(count<toatal) {
		for (int i = minc; i <= maxc && count<toatal; i++) {
			System.out.print(arr[minr][i] + " ");
			count++;

		}
		minr++;
		for (int i = minr; i <= maxr && count<toatal; i++) {
			System.out.print(arr[i][maxc] + " ");
			count++;
		}
		maxc--;

		for (int i = maxc; i >= minc && count<toatal; i--) {
			System.out.print(arr[maxr][i] + " ");
			count++;

		}

		maxr--;

		for (int i = maxr; i >= minr && count<toatal; i--) {
			System.out.print(arr[i][minc]+" ");
			count++;
		}
		minc++;
		
		}

	}

}
