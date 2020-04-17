/*
 * CS162-Introduction to Computer Science II Lab 3 VPL Exercises
 * Mengyu Rao
 * 2020.4.16
 * HF.China
 */

package Lab_3_VPL_exercises;

import java.util.Scanner;

public class WhichExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		checkStr(s); // call the checkStr method from the main method
	}

	public static void checkStr(String s) {
		boolean a = s.matches("a(b|a)b"); // conform to Regular Expression1
		boolean b = s.matches("(ab)*b"); // conform to Regular Expression2
		boolean c = s.matches("a(b|a)*");// conform to Regular Expression3
		boolean d = s.matches("((a|b)a)*");// conform to Regular Expression4

		if (a) {
			System.out.println(1);
		}
		if (b) {
			System.out.println(2);
		}
		if (c) {
			System.out.println(3);
		}
		if (d) {
			System.out.println(4);
		}
		if (!a && !b && !c && !d) {
			System.out.println("Not in the language");
		}
	}

}
