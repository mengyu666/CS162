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
			String s = "";
			s = sc.next();
			boolean bool = s.matches("[A-Z]{2,3}[0-9]{3,4}");
			if (bool) {
				System.out.println("Flight code is valid");
				System.exit(0);
			} else {
				System.out.println("Flight code is NOT valid");
			}
		}
	}

}
