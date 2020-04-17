package Lab_3_VPL_exercises;
/*
 * CS162-Introduction to Computer Science II Lab 3 VPL Exercises
 * Mengyu Rao
 * 2020.4.16
 * HF.China
 */

import java.util.Scanner;

public class ValidAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.next();// input the age
			boolean checkValidAge = str.matches("[0-9]||[1-9][1-9]||1[01234][0-9]||150");
			System.out.println(str);//print the input age
			 if(checkValidAge) {
				System.out.println("Age is valid");
				System.exit(0);// terminate the program
			} else {
				System.out.println("Age is NOT valid");
			}
		}
	}
}
