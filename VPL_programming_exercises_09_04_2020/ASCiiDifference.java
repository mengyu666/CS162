package VPL_programming_exercises_09_04_2020;
/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.8
 * HF.China
 */

import java.util.Scanner;

public class ASCiiDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(); // String s1
		String s2 = sc.next(); // String s2
		int difference = difference(s1, s2); // call the difference() method from the main method
		System.out.println(difference);
	}

	// difference() method
	public static int difference(String s1, String s2) {
		int sum1 = 0, sum2 = 0;
		// The sum of ASCII Values for s1
		for (int i = 0; i < s1.length(); i++) {
			sum1 += (int) s1.charAt(i);
		}
		// The sum of ASCII Values for s2
		for (int i = 0; i < s2.length(); i++) {
			sum2 += (int) s2.charAt(i);
		}
		return Math.abs(sum1 - sum2);
	}
	
}
