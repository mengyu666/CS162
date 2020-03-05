
/*
 * rmy
 * 2020/3/4
 */
package Week_4_Regular_Expressions;

import java.util.Scanner;

public class Valid_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = "";
			s = sc.next();
			boolean bool = s.matches("[0-9]||[1-9][1-9]||1[01234][0-9]||150");
			if (bool) {
				System.out.println("Age is valid");
			} else {
				System.out.println("Age is NOT valid");
			}
		}
	}
}
