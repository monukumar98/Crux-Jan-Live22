package Lec23;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		Printpath(m - 1, n - 1, 0, 0, "");

	}

	public static void Printpath(int er, int ec, int cr, int cc, String ans) {
		// er = end row, ec=end column , cc = current column ,cr =current row
		if (cc == ec && cr == er) {
			System.out.print(ans + " ");
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}

		Printpath(er, ec, cr, cc + 1, ans + "H");
		Printpath(er, ec, cr + 1, cc, ans + "V");

	}

}
