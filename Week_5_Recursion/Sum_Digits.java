package Week_5_Recursion;
/*
 * rmy
 * 2020/3/6
 */
import java.util.Scanner;

public class Sum_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="";
		s=sc.next();
		recursiveSum(s,0,0);
	}
	public static int recursiveSum(String s,int index,int sum) {
		if(index==s.length()) {
			System.out.println("Res: "+sum);
			return 0;	
		}else {
		return recursiveSum(s,index+1,sum+s.charAt(index)-'0');
		}
	}
}
