package Lec22;

public class SubSequnce_Count {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		//printSubSeq(str, "");
		//System.out.println(count);
		System.out.println("\n"+printSubSeq1(str, ""));

	}

// 1st ways 
	public static void printSubSeq(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;

			return;
		}

		char ch = ques.charAt(0);// a
		printSubSeq(ques.substring(1), ans);
		printSubSeq(ques.substring(1), ans + ch);

	}

	// 2nd ways
	public static int printSubSeq1(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans+" ");

			return 1;
		}

		char ch = ques.charAt(0);// a
		int f1 = printSubSeq1(ques.substring(1), ans);
		int f2 = printSubSeq1(ques.substring(1), ans + ch);
		return f1 + f2;

	}

}
