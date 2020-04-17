package VPL_Exercises_from_Lab_2_to_Lab_3;

/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.7
 * HF.China
 */

import java.util.Scanner;

public class PalindromeDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		if (text.length() != 5 || !isallNumbers(text)) { // to check if is a 5 digit numbers string
			System.out.println(text + " is NOT 5 digits"); // not a 5 digit numbers string
			System.exit(0);// terminate the program
		} else {
			boolean ifpalindrome = itispalindrome(text); // call the itispalindrome()from main method
			if (ifpalindrome) { // it is a 5 digit numbers palindrome
				System.out.println(text + " is a palindrome");
			} else {
				System.out.println(text + " is NOT a palindrome");
			}
		}
	}

	// itispalindrome() method
	public static boolean itispalindrome(String str) { // to check if it is a palindrome string
		String s = reverse(str); 
		if (str.compareTo(s) == 0) {
			return true;
		} else {
			return false;
		}
	}

	// isNumber() method
	public static boolean isallNumbers(String str) { // to check the string only contains digit numbers
		boolean isnumber = str.matches("[0-9]*");
		return isnumber;
	}

	// reverse() method to make check if is a palindrome easier
	public static String reverse(String str) { // to reverse the string
		return new StringBuilder(str).reverse().toString();
	}

}
