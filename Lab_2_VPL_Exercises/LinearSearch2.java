package Lab_2_VPL_Exercises;

/*
 * CS162-Introduction to Computer Science II Lab 2 VPL Exercises
 * Mengyu Rao
 * 2020.3.30
 * HF.China
 */
import java.util.Scanner;

public class LinearSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// where n is the size of the square array
		String[][] array = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = sc.next();
			}
		}
		String searchWord = sc.next();// the string that is being searched for
		int count = countStrings(array, searchWord);
		if (count != 0) {
			System.out.println(searchWord + " is contained " + count + " times in the array");
		} else {
			System.out.println(searchWord + " was NOT found in the array");
		}
	}

	// countStrings() method
	public static int countStrings(String array[][], String x) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (x.equalsIgnoreCase(array[i][j])) {
					count++;
				}
			}
		}
		return count;
	}

}
