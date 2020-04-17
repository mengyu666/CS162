package text;

import java.util.Scanner;

public class LinearSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// input the size of the square array
//		String str = sc.next();// input a string
		String[][] arr = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.next();
			}
		}
		String str1 = "";
		str1 = sc.next();
		int m = 0;
		boolean find = countStrings(arr, str1, m, n);// write a new method
		if (find) {
			System.out.println(str1 + " is contained " + m + " times in the array");
		} else {
			System.out.println(str1 + " was NOT found in the array");
		}
	}

	public static boolean countStrings(String[][] arr, String str, int m, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (str.equalsIgnoreCase(arr[i][j])) {
					m = m++;
					return true;
				}
			}
		}
		return false;
	}
}
