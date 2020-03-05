package Week_2_Methods_I;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner sc=new Scanner(System.in);
		
		try{
			num=sc.nextInt();
			if(num<0) {
			System.out.println("Not a valid entry!");
			System.exit(0);
		}
			boolean isEven= isEven(num);
			if(isEven) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
		
	}
	catch(InputMismatchException e) {
		System.out.println("Not a valid entry!");
		System.exit(0);
	}
	}
	public static boolean isEven(int n) {
		if((n&1)==1) {
			return false; 
		}else {
			return true;
		}
	}
}
