package Lab_3_VPL_exercises;
/*
 * CS162-Introduction to Computer Science II Lab 3 VPL Exercises
 * Mengyu Rao
 * 2020.4.16
 * HF.China
 */

import java.util.Scanner;

public class ValidName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String name = sc.next();// input the first name
			// verify that the user enters a correct first name
			boolean check = name.matches("[A-Z]{1}[a-z]+");
			System.out.println(name);
			if (check && name.length() >= 2 && name.length() <= 25) {
				System.out.println("Name is valid");// Name is valid
				System.exit(0);
			} else {
				System.out.println("Name is NOT valid");// Name is NOT valid
			}
		}
	}

}
