package Week_3_Methods_2;

/*
 * CS162-Introduction to Computer Science II Lab2
 * Mengyu Rao
 * 2020.3.19
 * HF.China
 */

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();// input a single integer
		m = sc.nextInt();// input a single integer
		
		if (n < 0 || m < 0) { // n<0 or m<0
			System.out.println("Not a valid entry!");
			System.exit(0);
		}
		getFactorial(n, m); // call the getFactorial() method
	}

	// getFactorial() method
	public static void getFactorial(int n, int m) {
		int mul = 1;
		for (int i = n; i <= m; i++) {
			mul *= i;
			System.out.println(mul);
		}
	}
}
