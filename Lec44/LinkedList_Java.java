package Lec44;

import java.util.LinkedList;

public class LinkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,90);
		list.add(40);
		list.add(50);
		list.add(60);// last
		System.out.println(list);
		System.out.println(list.remove());// first 

	}

}
