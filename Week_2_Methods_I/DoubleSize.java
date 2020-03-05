package Week_2_Methods_I;

import java.util.Scanner;

public class DoubleSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		determineSize(a,b);
	}
	private static void determineSize(double a,double b) {
		if(a<b) {
			System.out.println(b+" is the biggest number");
			System.out.println(a+" is the smallest number");
		}else if(a>b) {
			System.out.println(a+" is the biggest number");
			System.out.println(b+" is the smallest number");
		}else {
			System.out.println(a +" and "+b+ " are the same");
		}
	}
}
