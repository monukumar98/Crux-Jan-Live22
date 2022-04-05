package Lec22;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println("\n" + Boardpath1(n, 0, ""));

	}

	public static int Boardpath(int end, int curr, String ans) {
		if (curr == end) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int fp = Boardpath(end, curr + 1, ans + 1);
		int sp = Boardpath(end, curr + 2, ans + 2);
		int tp = Boardpath(end, curr + 3, ans + 3);

		return fp + sp + tp;

	}

	public static int Boardpath1(int end, int curr, String ans) {
		if (curr == end) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}
//		int fp = Boardpath1(end, curr + 1, ans + 1);
//		int sp = Boardpath1(end, curr + 2, ans + 2);
//		int tp = Boardpath1(end, curr + 3, ans + 3);
		int count = 0;
		for (int dice = 1; dice <= 3; dice++) {
			count = count + Boardpath1(end, curr + dice, ans + dice);
		}

		return count;

	}

}
