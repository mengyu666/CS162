package Week_5_Recursion;
/*
 * rmy
 * 2020/3/6
 */
import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="";
		s=sc.next();
		reverseRecursive(s,s.length()-1);	
	}
	
	public static char reverseRecursive(String s,int index) {
		if(index==-1) return 0;	
		else {
		System.out.print(s.charAt(index));
		return reverseRecursive(s,index-1);
		}
	}
}
