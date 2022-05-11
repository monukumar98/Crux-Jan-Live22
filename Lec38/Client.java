package Lec38;

import Lec37.Stack;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		

		// Case 1
//		P obj = new P();
//	   System.out.println(obj.d);//1
//	   System.out.println(obj.d1);//10
//	   obj.fun();
//	   obj.fun1();

		// Case 2
//		P obj = new C();
//		System.out.println(obj.d);// 1
//		System.out.println(obj.d1);// 10
//		System.out.println(((C) (obj)).d2);// 20
//		System.out.println(((C) (obj)).d);// 2
//
//		obj.fun();
//		obj.fun1();
//		((C) (obj)).fun2();
		
//		// Case 3
//		C obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);//p
//		System.out.println(obj.d2);//c
//		obj.fun();
		
		// Case 4
		
		C obj = new C();
		System.out.println(obj.d);//c
		System.out.println(obj.d1);//p
		System.out.println(obj.d2);//c
		System.out.println(((P)obj).d);//P
		obj.fun();
		obj.fun1();
		obj.fun2();
		

	}

}
