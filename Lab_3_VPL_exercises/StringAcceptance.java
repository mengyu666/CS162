package Lab_3_VPL_exercises;

/*
 * CS162-Introduction to Computer Science II Lab 3 VPL Exercises
 * Mengyu Rao
 * 2020.4.16
 * HF.China
 */
import java.util.Scanner;

public class StringAcceptance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();// input a string
		// call the checkStr method from the main method
		if (checkStr(s)) { // the String contains 0's and 1's only
			System.out.println("true");
		} else { // the String does not contain 0's and 1's only
			System.out.println("false");
		}
	}

	// checkStr method
	public static boolean checkStr(String s) {
		boolean check = s.matches("[0,1]+");//
		if (check) { //check the String contains 0's and 1's or not
			return true;
		} else {
			return false;

		}
	}

}
