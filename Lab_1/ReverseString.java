package Lab_1;
/*
 * CS162-Introduction to Computer Science II new Lab1
 * Mengyu Rao
 * 2020.3.23
 * HF.China
 */
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();// input a String
		String str1 = reverseString(str); // call the reverseString() method from the main method and return a String
		System.out.println(str1);
	}

	// reverseString() method
	public static String reverseString(String str) {
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}
}
