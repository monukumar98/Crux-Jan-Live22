package Lec25;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		int no_oqueen = 2;
		Queen(board, no_oqueen, 0, "",0);

	}

	public static void Queen(boolean[] board, int tq, int qpsf, String ans,int idx) {
		// tq --> total Queen
		// qpsf--> Queen place sooooooo far
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {// queen placed nhi hai 

				board[i] = true;// queen place
				
				Queen(board, tq, qpsf +1, ans+"b"+i+"q"+qpsf+" ",i);
				board[i]=false;// un do 
			}

		}

	}
}