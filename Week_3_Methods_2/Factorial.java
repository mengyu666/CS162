package Week_3_Methods_2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		getFactorial(n,m);
	}
	private static void getFactorial(int n,int m) {
		int mul=1;
		for(int i=n;i<=m;i++) {
			mul*=i;
			System.out.println(mul);
		}
	}
}
