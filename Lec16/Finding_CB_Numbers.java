package Lec16;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "81615";
		System.out.println(PrintSubtring(str));

	}

	public static int PrintSubtring(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int si = 0; si <= str.length() - len; si++) {
				int ei = si + len;
				String s = str.substring(si, ei);// CB Number
				// Integer.parseInt(s);// string to Integer
				// Long.parseLong(s);// String to long
				if (iscbnumber(Long.parseLong(s)) == true && isvistied(visited, si, ei - 1) == false) {
                      // visited marked 
					for (int i = si; i <= ei - 1; i++) {
						visited[i] = true;

					}
					count++;
				}

			}

		}

		return count;

	}

	public static boolean isvistied(boolean[] visited, int si, int ei) {
		// TODO Auto-generated method stub
		for (int i = si; i <= ei; i++) {
			if (visited[i] == true) {
				return true;
			}

		}
		return false;

	}

	public static boolean iscbnumber(long n) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		// point 1
		if (n == 0 || n == 1) {
			return false;
		}
		// point 2

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}

		// point 3
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}

		return true;

	}

}
