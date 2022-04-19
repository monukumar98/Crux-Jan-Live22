package Lec28;

import java.util.Scanner;

public class Rat_Chases{
    static boolean f=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);

			}

		}

		int[][] ans = new int[n][m];
		PrintPath(maze, 0, 0, ans);
        if(f==false){
            System.out.println("NO PATH FOUND");
        }

	}

	public static void PrintPath(char[][] maze, int cr, int cc, int[][] ans) {
		// TODO Auto-generated method stub
		if (cc == maze[0].length - 1 && cr == maze.length - 1) {
			if (maze[cr][cc] == 'O') {
                f=true;
				ans[cr][cc] = 1;
				display(ans);
				ans[cr][cc] = 0;
			}
			return;
		}

		if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc] == 'X') {
			return;
		}

		int r[] = { 0, -1, 0, 1 };
		int c[] = { 1, 0, -1, 0 };

//		PrintPath(maze, cr, cc + 1, ans);// right
//		PrintPath(maze, cr - 1, cc, ans);// up
//		PrintPath(maze, cr, cc - 1, ans);// left
//		PrintPath(maze, cr + 1, cc, ans);// down
		 maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		for (int i = 0; i < c.length; i++) {
			PrintPath(maze, cr + r[i], cc + c[i], ans);

		}
		 maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();

		}

	}

}
