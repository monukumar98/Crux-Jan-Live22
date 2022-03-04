package Lec15;

public class String_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdef";

		System.out.println(str.charAt(3));
		System.out.println(str.substring(0, 5));
		String s1 = str.substring(2, 6);
		System.out.println(s1);
		System.out.println(str.substring(2));
		System.out.println(str.substring(1, 1));

		System.out.println(str.concat(s1));
		String s2 = "1bz";
		if (str.compareTo(s2) > 0) {
			System.out.println(str);
		} else {
			System.out.println(s2);
		}

	}

}
