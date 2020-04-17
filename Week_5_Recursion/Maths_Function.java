package Week_5_Recursion;
/*
 * rmy
 * 2020/3/6
 */
import java.util.Scanner;

public class Maths_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=0;
		n=sc.nextInt();
		System.out.println(q1Iterative(n));
		System.out.println(q2Iterative(n));
	}
	public static int q1Iterative(int n) {
		int num=1,temp=2;
		if(n==1) return 2;
		for (int i = 2; i <= n; i++) {
			num=4*temp-3*i;
			temp=num;
		}
		return num;
	}
	public static int q2Iterative(int n) {
		if(n==1) return 2;
		else {
			return 4*q2Iterative(n-1)-3*n;
		}
	}

}
