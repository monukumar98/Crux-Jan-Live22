package Lec18;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);

		// Add -- last me add krega
		list.add(10);
		list.add(20);
		System.out.println(list);

		// add at index
		// range 0 to size
		list.add(2, 30);
		System.out.println(list);

		// System.out.println(list.size());

		// delete
		// range 0 to size -1
		System.out.println(list.remove(1));
		System.out.println(list);

		list.add(60);
		list.add(-20);
		System.out.println(list);

		// Get
		// range 0 to size -1
		System.out.println(list.get(3));
		System.out.println(list);

		// Set --> update index pe jaa kr
		list.set(1, -5);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");// arr[i]
		}
		System.out.println();

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");// arr[i]
		}
		System.out.println();
		// E_F_Loop

		for (int val : list) {
			System.out.print(val + " ");
		}
		System.out.println();
		int[] arr = { 10, 20, 30 };
		for (int Sumaiya : arr) {
			System.out.print(Sumaiya + " ");
		}
		System.out.println();
		
		// Arrays.sort(arr)
		Collections.sort(list);// sort 
		

//		// 2 D Array
//		int [][] a = new int [2][3];
//		for(int [] a1:a) {
//			for(int i:a1) {
//				System.out.println(i);
//			}
//		}

	}

}
