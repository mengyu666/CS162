/*
 * 2020/3/4
 * rmy
 */
package Week_4_Regular_Expressions;

import java.util.Scanner;

public class Flight_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.next(); ///user input
			boolean bool = s.matches("[A-Z]{2,3}[0-9]{3,4}"); //verify that the user enters a valid flight code
			if (bool) {
				System.out.println("Flight code is valid"); //Flight code is valid
				System.exit(0);
			} else {
				System.out.println("Flight code is NOT valid"); //Flight code is NOT valid
			}
		}
	}

}
