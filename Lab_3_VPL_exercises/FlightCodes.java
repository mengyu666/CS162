package Lab_3_VPL_exercises;
/*
 * CS162-Introduction to Computer Science II Lab 3 VPL Exercises
 * Mengyu Rao
 * 2020.4.16
 * HF.China
 */

import java.util.Scanner;

public class FlightCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String flightCode = sc.next(); // user input
			boolean bool = flightCode.matches("[A-Z]{2,3}[0-9]{3,4}"); // verify that the user enters a valid flight code
			if (bool) {
				System.out.println("Flight code is valid"); // Flight code is valid
				System.exit(0);
			} else {
				System.out.println("Flight code is NOT valid"); // Flight code is NOT valid
			}
		}
	}

}
