/*
 * rmy
 * 2020/3/4
 */

package Week_4_Regular_Expressions;

import java.util.Scanner;

public class Which_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="";
		s=sc.next();
		which(s);
	}
	public static void which(String s) {
		boolean a=s.matches("a(b|a)b");
		boolean b=s.matches("(ab)*b");
		boolean c=s.matches("a(b|a)*");
		boolean d=s.matches("((a|b) a)*");
		
		if(a) {
			System.out.println(1);
		}if(b) {
			System.out.println(2);
		}if(c) {
			System.out.println(3);
		}if(d) {
			System.out.println(4);
		}
		if(!a&&!b&&!c&&!d) {
			System.out.println("Not in the language");
		}
	}

}
