
/*
 * rmy
 * 2020/3/4
 */

package Week_4_Regular_Expressions;

import java.util.Scanner;

public class StringAcceptance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="";
		s=sc.next();
		if(bool(s)) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
	public static boolean bool(String s) {
		boolean bool=s.matches("[0,1]+");
		if(bool) {
			return true;
		}else{
			return false;
		
		}
	}

}
