package Lec18;

public class Wrapper_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a = 100;
		int a1 = 10;
		System.out.println(a);
		System.out.println(a1);
		Short s1 = 78;// Class
		// Byte b1 = 19;// Class
		System.out.println(s1);
		// System.out.println(b1);

		a = a1;// int---> Integer AutoBoxing
		System.out.println(a);
		Integer ii = 100;
		int i = 10;
		i = ii;// Integer --> int unboxing
		System.out.println(i);

		// Important
		Integer b1 = 19;// -128 to 127
		Integer b2 = 19;
		System.out.println(b1 == b2);// adresss
		Integer c1 = 190;// 2k
		Integer c2 = 190;// 4k
		System.out.println(c1 == c2);
		Byte bb = 12;
		Byte bb1 = 12;
		System.out.println(bb == bb1);
		Long l1 = 128l;
		Long l2 = 128l;
		System.out.println(l1 == l2);

	}

}
