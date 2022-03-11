package Lec16;

public class SubString_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		printSubString(str);

	}

	public static void printSubString(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));

			}

		}

	}

}
