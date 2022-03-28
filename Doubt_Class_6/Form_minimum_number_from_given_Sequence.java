package Doubt_Class_6;

public class Form_minimum_number_from_given_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "DDIDDID";
		form_minimum_number(str);

	}

	public static void form_minimum_number(String str) {
		int[] ans = new int[str.length() + 1];
		int count = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
					ans[j] = count;
					count++;
				}
			}

		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}

	}

}
