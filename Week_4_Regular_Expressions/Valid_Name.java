/*
 * 2020/3/4
 * rmy
 */
package Week_4_Regular_Expressions;

import java.util.Scanner;

public class Valid_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = "";
			s = sc.next();
			boolean bool = s.matches("[A-Z]{1}[a-z]+");
			if (bool&&s.length()>=2&&s.length()<=25) {
				System.out.println("Name is valid");
			} else {
				System.out.println("Name is NOT valid");
			}
		}
	}

}
