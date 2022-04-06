package Lec23;

public class Key_Paid {

	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12";
		printKeyPaid(str, "");

	}

	public static void printKeyPaid(String ques, String ans) {// 12
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);// '1'--> 49
		String pressString = key[ch - 48];// ch-->49

		for (int i = 0; i < pressString.length(); i++) {
			printKeyPaid(ques.substring(1), ans + pressString.charAt(i));

		}

	}

}
